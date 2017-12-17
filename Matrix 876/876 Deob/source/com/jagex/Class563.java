/* Class563 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class563 {
	Class544 aClass544_7565;
	static final int anInt7566 = 8;
	static final int anInt7567 = 38400;
	static final int anInt7568 = 1;
	static final int anInt7569 = 2;
	static final int anInt7570 = 2002;
	int anInt7571;
	int anInt7572 = 0;
	static final int anInt7573 = -2002;
	static final int anInt7574 = 12;

	final boolean method9467(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i > 2002 || i_0_ > 2002 || i_1_ > 2002 || i_2_ > 2002 || i_3_ > 2002 || i_4_ > 2002)
			return false;
		if (i < -2002 || i_0_ < -2002 || i_1_ < -2002 || i_2_ < -2002 || i_3_ < -2002 || i_4_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_8_ = i_2_ + i * aClass544_7565.anInt7255;
			if (i_8_ >= 0 && i_8_ < aClass544_7565.anIntArray7273.length && (i_5_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_8_])
				return false;
			i_8_ = i_3_ + i_0_ * aClass544_7565.anInt7255;
			if (i_8_ >= 0 && i_8_ < aClass544_7565.anIntArray7273.length && (i_6_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_8_])
				return false;
			i_8_ = i_4_ + i_1_ * aClass544_7565.anInt7255;
			if (i_8_ >= 0 && i_8_ < aClass544_7565.anIntArray7273.length && (i_7_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_8_])
				return false;
		}
		int i_9_ = i_3_ - i_2_;
		int i_10_ = i_0_ - i;
		int i_11_ = i_4_ - i_2_;
		int i_12_ = i_1_ - i;
		int i_13_ = i_6_ - i_5_;
		int i_14_ = i_7_ - i_5_;
		if (i < i_0_ && i < i_1_) {
			i--;
			if (i_0_ > i_1_)
				i_0_++;
			else
				i_1_++;
		} else if (i_0_ < i_1_) {
			i_0_--;
			if (i > i_1_)
				i++;
			else
				i_1_++;
		} else {
			i_1_--;
			if (i > i_0_)
				i++;
			else
				i_0_++;
		}
		int i_15_ = 0;
		if (i_0_ != i)
			i_15_ = (i_3_ - i_2_ << 12) / (i_0_ - i);
		int i_16_ = 0;
		if (i_1_ != i_0_)
			i_16_ = (i_4_ - i_3_ << 12) / (i_1_ - i_0_);
		int i_17_ = 0;
		if (i_1_ != i)
			i_17_ = (i_2_ - i_4_ << 12) / (i - i_1_);
		int i_18_ = i_9_ * i_12_ - i_11_ * i_10_;
		if (i_18_ == 0)
			return false;
		int i_19_ = (i_13_ * i_12_ - i_14_ * i_10_ << 8) / i_18_;
		int i_20_ = (i_14_ * i_9_ - i_13_ * i_11_ << 8) / i_18_;
		if (i <= i_0_ && i <= i_1_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_0_ > aClass544_7565.anInt7278)
				i_0_ = aClass544_7565.anInt7278;
			if (i_1_ > aClass544_7565.anInt7278)
				i_1_ = aClass544_7565.anInt7278;
			i_5_ = (i_5_ << 8) - i_19_ * i_2_ + i_19_;
			if (i_0_ < i_1_) {
				i_4_ = i_2_ <<= 12;
				if (i < 0) {
					i_4_ -= i_17_ * i;
					i_2_ -= i_15_ * i;
					i_5_ -= i_20_ * i;
					i = 0;
				}
				i_3_ <<= 12;
				if (i_0_ < 0) {
					i_3_ -= i_16_ * i_0_;
					i_0_ = 0;
				}
				if (i != i_0_ && i_17_ < i_15_ || i == i_0_ && i_17_ > i_16_) {
					i_1_ -= i_0_;
					i_0_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_0_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
							return false;
						i_4_ += i_17_;
						i_2_ += i_15_;
						i_5_ += i_20_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_1_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
							return false;
						i_4_ += i_17_;
						i_3_ += i_16_;
						i_5_ += i_20_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_1_ -= i_0_;
				i_0_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_0_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_4_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_1_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_4_ += i_17_;
					i_3_ += i_16_;
					i_5_ += i_20_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_3_ = i_2_ <<= 12;
			if (i < 0) {
				i_3_ -= i_17_ * i;
				i_2_ -= i_15_ * i;
				i_5_ -= i_20_ * i;
				i = 0;
			}
			i_4_ <<= 12;
			if (i_1_ < 0) {
				i_4_ -= i_16_ * i_1_;
				i_1_ = 0;
			}
			if (i != i_1_ && i_17_ < i_15_ || i == i_1_ && i_16_ > i_15_) {
				i_0_ -= i_1_;
				i_1_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_1_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_3_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_0_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_4_ += i_16_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_0_ -= i_1_;
			i_1_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_1_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_3_ += i_17_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_0_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_4_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_0_ <= i_1_) {
			if (i_0_ >= aClass544_7565.anInt7278)
				return true;
			if (i_1_ > aClass544_7565.anInt7278)
				i_1_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_6_ = (i_6_ << 8) - i_19_ * i_3_ + i_19_;
			if (i_1_ < i) {
				i_2_ = i_3_ <<= 12;
				if (i_0_ < 0) {
					i_2_ -= i_15_ * i_0_;
					i_3_ -= i_16_ * i_0_;
					i_6_ -= i_20_ * i_0_;
					i_0_ = 0;
				}
				i_4_ <<= 12;
				if (i_1_ < 0) {
					i_4_ -= i_17_ * i_1_;
					i_1_ = 0;
				}
				if (i_0_ != i_1_ && i_15_ < i_16_ || i_0_ == i_1_ && i_15_ > i_17_) {
					i -= i_1_;
					i_1_ -= i_0_;
					i_0_ *= aClass544_7565.anInt7255;
					while (--i_1_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
							return false;
						i_2_ += i_15_;
						i_3_ += i_16_;
						i_6_ += i_20_;
						i_0_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
							return false;
						i_2_ += i_15_;
						i_4_ += i_17_;
						i_6_ += i_20_;
						i_0_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_1_;
				i_1_ -= i_0_;
				i_0_ *= aClass544_7565.anInt7255;
				while (--i_1_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_2_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_2_ += i_15_;
					i_4_ += i_17_;
					i_6_ += i_20_;
					i_0_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_4_ = i_3_ <<= 12;
			if (i_0_ < 0) {
				i_4_ -= i_15_ * i_0_;
				i_3_ -= i_16_ * i_0_;
				i_6_ -= i_20_ * i_0_;
				i_0_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_17_ * i;
				i = 0;
			}
			if (i_15_ < i_16_) {
				i_1_ -= i;
				i -= i_0_;
				i_0_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_4_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += aClass544_7565.anInt7255;
				}
				while (--i_1_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_2_ += i_17_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_1_ -= i;
			i -= i_0_;
			i_0_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_4_ += i_15_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += aClass544_7565.anInt7255;
			}
			while (--i_1_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_2_ += i_17_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_1_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_0_ > aClass544_7565.anInt7278)
			i_0_ = aClass544_7565.anInt7278;
		i_7_ = (i_7_ << 8) - i_19_ * i_4_ + i_19_;
		if (i < i_0_) {
			i_3_ = i_4_ <<= 12;
			if (i_1_ < 0) {
				i_3_ -= i_16_ * i_1_;
				i_4_ -= i_17_ * i_1_;
				i_7_ -= i_20_ * i_1_;
				i_1_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_15_ * i;
				i = 0;
			}
			if (i_16_ < i_17_) {
				i_0_ -= i;
				i -= i_1_;
				i_1_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_3_ += i_16_;
					i_4_ += i_17_;
					i_7_ += i_20_;
					i_1_ += aClass544_7565.anInt7255;
				}
				while (--i_0_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
						return false;
					i_3_ += i_16_;
					i_2_ += i_15_;
					i_7_ += i_20_;
					i_1_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_0_ -= i;
			i -= i_1_;
			i_1_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_3_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += aClass544_7565.anInt7255;
			}
			while (--i_0_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_3_ += i_16_;
				i_2_ += i_15_;
				i_7_ += i_20_;
				i_1_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_2_ = i_4_ <<= 12;
		if (i_1_ < 0) {
			i_2_ -= i_16_ * i_1_;
			i_4_ -= i_17_ * i_1_;
			i_7_ -= i_20_ * i_1_;
			i_1_ = 0;
		}
		i_3_ <<= 12;
		if (i_0_ < 0) {
			i_3_ -= i_15_ * i_0_;
			i_0_ = 0;
		}
		if (i_16_ < i_17_) {
			i -= i_0_;
			i_0_ -= i_1_;
			i_1_ *= aClass544_7565.anInt7255;
			while (--i_0_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_2_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
					return false;
				i_3_ += i_15_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_0_;
		i_0_ -= i_1_;
		i_1_ *= aClass544_7565.anInt7255;
		while (--i_0_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
				return false;
			i_2_ += i_16_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, aClass544_7565.anInt7255))
				return false;
			i_3_ += i_15_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	final boolean method9468(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		if (i > 2002 || i_21_ > 2002 || i_22_ > 2002 || i_23_ > 2002 || i_24_ > 2002 || i_25_ > 2002)
			return false;
		if (i < -2002 || i_21_ < -2002 || i_22_ < -2002 || i_23_ < -2002 || i_24_ < -2002 || i_25_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_29_ = i_23_ + i * aClass544_7565.anInt7255;
			if (i_29_ >= 0 && i_29_ < aClass544_7565.anIntArray7273.length && (i_26_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_29_])
				return false;
			i_29_ = i_24_ + i_21_ * aClass544_7565.anInt7255;
			if (i_29_ >= 0 && i_29_ < aClass544_7565.anIntArray7273.length && (i_27_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_29_])
				return false;
			i_29_ = i_25_ + i_22_ * aClass544_7565.anInt7255;
			if (i_29_ >= 0 && i_29_ < aClass544_7565.anIntArray7273.length && (i_28_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_29_])
				return false;
		}
		int i_30_ = i_24_ - i_23_;
		int i_31_ = i_21_ - i;
		int i_32_ = i_25_ - i_23_;
		int i_33_ = i_22_ - i;
		int i_34_ = i_27_ - i_26_;
		int i_35_ = i_28_ - i_26_;
		if (i < i_21_ && i < i_22_) {
			i--;
			if (i_21_ > i_22_)
				i_21_++;
			else
				i_22_++;
		} else if (i_21_ < i_22_) {
			i_21_--;
			if (i > i_22_)
				i++;
			else
				i_22_++;
		} else {
			i_22_--;
			if (i > i_21_)
				i++;
			else
				i_21_++;
		}
		int i_36_ = 0;
		if (i_21_ != i)
			i_36_ = (i_24_ - i_23_ << 12) / (i_21_ - i);
		int i_37_ = 0;
		if (i_22_ != i_21_)
			i_37_ = (i_25_ - i_24_ << 12) / (i_22_ - i_21_);
		int i_38_ = 0;
		if (i_22_ != i)
			i_38_ = (i_23_ - i_25_ << 12) / (i - i_22_);
		int i_39_ = i_30_ * i_33_ - i_32_ * i_31_;
		if (i_39_ == 0)
			return false;
		int i_40_ = (i_34_ * i_33_ - i_35_ * i_31_ << 8) / i_39_;
		int i_41_ = (i_35_ * i_30_ - i_34_ * i_32_ << 8) / i_39_;
		if (i <= i_21_ && i <= i_22_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_21_ > aClass544_7565.anInt7278)
				i_21_ = aClass544_7565.anInt7278;
			if (i_22_ > aClass544_7565.anInt7278)
				i_22_ = aClass544_7565.anInt7278;
			i_26_ = (i_26_ << 8) - i_40_ * i_23_ + i_40_;
			if (i_21_ < i_22_) {
				i_25_ = i_23_ <<= 12;
				if (i < 0) {
					i_25_ -= i_38_ * i;
					i_23_ -= i_36_ * i;
					i_26_ -= i_41_ * i;
					i = 0;
				}
				i_24_ <<= 12;
				if (i_21_ < 0) {
					i_24_ -= i_37_ * i_21_;
					i_21_ = 0;
				}
				if (i != i_21_ && i_38_ < i_36_ || i == i_21_ && i_38_ > i_37_) {
					i_22_ -= i_21_;
					i_21_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_21_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_25_ >> 12) - 1, (i_23_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
							return false;
						i_25_ += i_38_;
						i_23_ += i_36_;
						i_26_ += i_41_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_22_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_25_ >> 12) - 1, (i_24_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
							return false;
						i_25_ += i_38_;
						i_24_ += i_37_;
						i_26_ += i_41_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_22_ -= i_21_;
				i_21_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_21_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_23_ >> 12) - 1, (i_25_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_25_ += i_38_;
					i_23_ += i_36_;
					i_26_ += i_41_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_22_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_24_ >> 12) - 1, (i_25_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_25_ += i_38_;
					i_24_ += i_37_;
					i_26_ += i_41_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_24_ = i_23_ <<= 12;
			if (i < 0) {
				i_24_ -= i_38_ * i;
				i_23_ -= i_36_ * i;
				i_26_ -= i_41_ * i;
				i = 0;
			}
			i_25_ <<= 12;
			if (i_22_ < 0) {
				i_25_ -= i_37_ * i_22_;
				i_22_ = 0;
			}
			if (i != i_22_ && i_38_ < i_36_ || i == i_22_ && i_37_ > i_36_) {
				i_21_ -= i_22_;
				i_22_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_22_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_24_ >> 12) - 1, (i_23_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_24_ += i_38_;
					i_23_ += i_36_;
					i_26_ += i_41_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_21_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_25_ >> 12) - 1, (i_23_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_25_ += i_37_;
					i_23_ += i_36_;
					i_26_ += i_41_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_21_ -= i_22_;
			i_22_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_22_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_23_ >> 12) - 1, (i_24_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_24_ += i_38_;
				i_23_ += i_36_;
				i_26_ += i_41_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_21_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_23_ >> 12) - 1, (i_25_ >> 12) + 1, i_26_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_25_ += i_37_;
				i_23_ += i_36_;
				i_26_ += i_41_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_21_ <= i_22_) {
			if (i_21_ >= aClass544_7565.anInt7278)
				return true;
			if (i_22_ > aClass544_7565.anInt7278)
				i_22_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_27_ = (i_27_ << 8) - i_40_ * i_24_ + i_40_;
			if (i_22_ < i) {
				i_23_ = i_24_ <<= 12;
				if (i_21_ < 0) {
					i_23_ -= i_36_ * i_21_;
					i_24_ -= i_37_ * i_21_;
					i_27_ -= i_41_ * i_21_;
					i_21_ = 0;
				}
				i_25_ <<= 12;
				if (i_22_ < 0) {
					i_25_ -= i_38_ * i_22_;
					i_22_ = 0;
				}
				if (i_21_ != i_22_ && i_36_ < i_37_ || i_21_ == i_22_ && i_36_ > i_38_) {
					i -= i_22_;
					i_22_ -= i_21_;
					i_21_ *= aClass544_7565.anInt7255;
					while (--i_22_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_23_ >> 12) - 1, (i_24_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
							return false;
						i_23_ += i_36_;
						i_24_ += i_37_;
						i_27_ += i_41_;
						i_21_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_23_ >> 12) - 1, (i_25_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
							return false;
						i_23_ += i_36_;
						i_25_ += i_38_;
						i_27_ += i_41_;
						i_21_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_22_;
				i_22_ -= i_21_;
				i_21_ *= aClass544_7565.anInt7255;
				while (--i_22_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_24_ >> 12) - 1, (i_23_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_23_ += i_36_;
					i_24_ += i_37_;
					i_27_ += i_41_;
					i_21_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_25_ >> 12) - 1, (i_23_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_23_ += i_36_;
					i_25_ += i_38_;
					i_27_ += i_41_;
					i_21_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_25_ = i_24_ <<= 12;
			if (i_21_ < 0) {
				i_25_ -= i_36_ * i_21_;
				i_24_ -= i_37_ * i_21_;
				i_27_ -= i_41_ * i_21_;
				i_21_ = 0;
			}
			i_23_ <<= 12;
			if (i < 0) {
				i_23_ -= i_38_ * i;
				i = 0;
			}
			if (i_36_ < i_37_) {
				i_22_ -= i;
				i -= i_21_;
				i_21_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_25_ >> 12) - 1, (i_24_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_25_ += i_36_;
					i_24_ += i_37_;
					i_27_ += i_41_;
					i_21_ += aClass544_7565.anInt7255;
				}
				while (--i_22_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_23_ >> 12) - 1, (i_24_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_23_ += i_38_;
					i_24_ += i_37_;
					i_27_ += i_41_;
					i_21_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_22_ -= i;
			i -= i_21_;
			i_21_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_24_ >> 12) - 1, (i_25_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_25_ += i_36_;
				i_24_ += i_37_;
				i_27_ += i_41_;
				i_21_ += aClass544_7565.anInt7255;
			}
			while (--i_22_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_21_, 0, (i_24_ >> 12) - 1, (i_23_ >> 12) + 1, i_27_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_23_ += i_38_;
				i_24_ += i_37_;
				i_27_ += i_41_;
				i_21_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_22_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_21_ > aClass544_7565.anInt7278)
			i_21_ = aClass544_7565.anInt7278;
		i_28_ = (i_28_ << 8) - i_40_ * i_25_ + i_40_;
		if (i < i_21_) {
			i_24_ = i_25_ <<= 12;
			if (i_22_ < 0) {
				i_24_ -= i_37_ * i_22_;
				i_25_ -= i_38_ * i_22_;
				i_28_ -= i_41_ * i_22_;
				i_22_ = 0;
			}
			i_23_ <<= 12;
			if (i < 0) {
				i_23_ -= i_36_ * i;
				i = 0;
			}
			if (i_37_ < i_38_) {
				i_21_ -= i;
				i -= i_22_;
				i_22_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_24_ >> 12) - 1, (i_25_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_24_ += i_37_;
					i_25_ += i_38_;
					i_28_ += i_41_;
					i_22_ += aClass544_7565.anInt7255;
				}
				while (--i_21_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_24_ >> 12) - 1, (i_23_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
						return false;
					i_24_ += i_37_;
					i_23_ += i_36_;
					i_28_ += i_41_;
					i_22_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_21_ -= i;
			i -= i_22_;
			i_22_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_25_ >> 12) - 1, (i_24_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_24_ += i_37_;
				i_25_ += i_38_;
				i_28_ += i_41_;
				i_22_ += aClass544_7565.anInt7255;
			}
			while (--i_21_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_23_ >> 12) - 1, (i_24_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_24_ += i_37_;
				i_23_ += i_36_;
				i_28_ += i_41_;
				i_22_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_23_ = i_25_ <<= 12;
		if (i_22_ < 0) {
			i_23_ -= i_37_ * i_22_;
			i_25_ -= i_38_ * i_22_;
			i_28_ -= i_41_ * i_22_;
			i_22_ = 0;
		}
		i_24_ <<= 12;
		if (i_21_ < 0) {
			i_24_ -= i_36_ * i_21_;
			i_21_ = 0;
		}
		if (i_37_ < i_38_) {
			i -= i_21_;
			i_21_ -= i_22_;
			i_22_ *= aClass544_7565.anInt7255;
			while (--i_21_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_23_ >> 12) - 1, (i_25_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_23_ += i_37_;
				i_25_ += i_38_;
				i_28_ += i_41_;
				i_22_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_24_ >> 12) - 1, (i_25_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
					return false;
				i_24_ += i_36_;
				i_25_ += i_38_;
				i_28_ += i_41_;
				i_22_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_21_;
		i_21_ -= i_22_;
		i_22_ *= aClass544_7565.anInt7255;
		while (--i_21_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_25_ >> 12) - 1, (i_23_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
				return false;
			i_23_ += i_37_;
			i_25_ += i_38_;
			i_28_ += i_41_;
			i_22_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_22_, 0, (i_25_ >> 12) - 1, (i_24_ >> 12) + 1, i_28_, i_40_, aClass544_7565.anInt7255))
				return false;
			i_24_ += i_36_;
			i_25_ += i_38_;
			i_28_ += i_41_;
			i_22_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	final boolean method9469(int[] is, int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		if (i_44_ > i_47_)
			i_44_ = i_47_;
		if (i_43_ < 0)
			i_43_ = 0;
		if (i_43_ >= i_44_)
			return true;
		i += i_43_ - 1;
		i_42_ = i_44_ - i_43_ >> 2;
		i_45_ += i_46_ * i_43_;
		if (anInt7571 == 1) {
			anInt7572 += i_42_;
			while (--i_42_ >= 0) {
				if (i_45_ < is[++i])
					is[i] = i_45_;
				i_45_ += i_46_;
				if (i_45_ < is[++i])
					is[i] = i_45_;
				i_45_ += i_46_;
				if (i_45_ < is[++i])
					is[i] = i_45_;
				i_45_ += i_46_;
				if (i_45_ < is[++i])
					is[i] = i_45_;
				i_45_ += i_46_;
			}
			i_42_ = i_44_ - i_43_ & 0x3;
			while (--i_42_ >= 0) {
				if (i_45_ < is[++i])
					is[i] = i_45_;
				i_45_ += i_46_;
			}
		} else {
			i_45_ -= 38400;
			while (--i_42_ >= 0) {
				if (i_45_ < is[++i])
					return false;
				i_45_ += i_46_;
				if (i_45_ < is[++i])
					return false;
				i_45_ += i_46_;
				if (i_45_ < is[++i])
					return false;
				i_45_ += i_46_;
				if (i_45_ < is[++i])
					return false;
				i_45_ += i_46_;
			}
			i_42_ = i_44_ - i_43_ & 0x3;
			while (--i_42_ >= 0) {
				if (i_45_ < is[++i])
					return false;
				i_45_ += i_46_;
			}
		}
		return true;
	}

	final boolean method9470(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (i > 2002 || i_48_ > 2002 || i_49_ > 2002 || i_50_ > 2002 || i_51_ > 2002 || i_52_ > 2002)
			return false;
		if (i < -2002 || i_48_ < -2002 || i_49_ < -2002 || i_50_ < -2002 || i_51_ < -2002 || i_52_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_56_ = i_50_ + i * aClass544_7565.anInt7255;
			if (i_56_ >= 0 && i_56_ < aClass544_7565.anIntArray7273.length && (i_53_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_56_])
				return false;
			i_56_ = i_51_ + i_48_ * aClass544_7565.anInt7255;
			if (i_56_ >= 0 && i_56_ < aClass544_7565.anIntArray7273.length && (i_54_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_56_])
				return false;
			i_56_ = i_52_ + i_49_ * aClass544_7565.anInt7255;
			if (i_56_ >= 0 && i_56_ < aClass544_7565.anIntArray7273.length && (i_55_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_56_])
				return false;
		}
		int i_57_ = i_51_ - i_50_;
		int i_58_ = i_48_ - i;
		int i_59_ = i_52_ - i_50_;
		int i_60_ = i_49_ - i;
		int i_61_ = i_54_ - i_53_;
		int i_62_ = i_55_ - i_53_;
		if (i < i_48_ && i < i_49_) {
			i--;
			if (i_48_ > i_49_)
				i_48_++;
			else
				i_49_++;
		} else if (i_48_ < i_49_) {
			i_48_--;
			if (i > i_49_)
				i++;
			else
				i_49_++;
		} else {
			i_49_--;
			if (i > i_48_)
				i++;
			else
				i_48_++;
		}
		int i_63_ = 0;
		if (i_48_ != i)
			i_63_ = (i_51_ - i_50_ << 12) / (i_48_ - i);
		int i_64_ = 0;
		if (i_49_ != i_48_)
			i_64_ = (i_52_ - i_51_ << 12) / (i_49_ - i_48_);
		int i_65_ = 0;
		if (i_49_ != i)
			i_65_ = (i_50_ - i_52_ << 12) / (i - i_49_);
		int i_66_ = i_57_ * i_60_ - i_59_ * i_58_;
		if (i_66_ == 0)
			return false;
		int i_67_ = (i_61_ * i_60_ - i_62_ * i_58_ << 8) / i_66_;
		int i_68_ = (i_62_ * i_57_ - i_61_ * i_59_ << 8) / i_66_;
		if (i <= i_48_ && i <= i_49_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_48_ > aClass544_7565.anInt7278)
				i_48_ = aClass544_7565.anInt7278;
			if (i_49_ > aClass544_7565.anInt7278)
				i_49_ = aClass544_7565.anInt7278;
			i_53_ = (i_53_ << 8) - i_67_ * i_50_ + i_67_;
			if (i_48_ < i_49_) {
				i_52_ = i_50_ <<= 12;
				if (i < 0) {
					i_52_ -= i_65_ * i;
					i_50_ -= i_63_ * i;
					i_53_ -= i_68_ * i;
					i = 0;
				}
				i_51_ <<= 12;
				if (i_48_ < 0) {
					i_51_ -= i_64_ * i_48_;
					i_48_ = 0;
				}
				if (i != i_48_ && i_65_ < i_63_ || i == i_48_ && i_65_ > i_64_) {
					i_49_ -= i_48_;
					i_48_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_48_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_52_ >> 12) - 1, (i_50_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
							return false;
						i_52_ += i_65_;
						i_50_ += i_63_;
						i_53_ += i_68_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_49_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_52_ >> 12) - 1, (i_51_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
							return false;
						i_52_ += i_65_;
						i_51_ += i_64_;
						i_53_ += i_68_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_49_ -= i_48_;
				i_48_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_48_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_50_ >> 12) - 1, (i_52_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_52_ += i_65_;
					i_50_ += i_63_;
					i_53_ += i_68_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_49_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_51_ >> 12) - 1, (i_52_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_52_ += i_65_;
					i_51_ += i_64_;
					i_53_ += i_68_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_51_ = i_50_ <<= 12;
			if (i < 0) {
				i_51_ -= i_65_ * i;
				i_50_ -= i_63_ * i;
				i_53_ -= i_68_ * i;
				i = 0;
			}
			i_52_ <<= 12;
			if (i_49_ < 0) {
				i_52_ -= i_64_ * i_49_;
				i_49_ = 0;
			}
			if (i != i_49_ && i_65_ < i_63_ || i == i_49_ && i_64_ > i_63_) {
				i_48_ -= i_49_;
				i_49_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_49_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_51_ >> 12) - 1, (i_50_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_51_ += i_65_;
					i_50_ += i_63_;
					i_53_ += i_68_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_48_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_52_ >> 12) - 1, (i_50_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_52_ += i_64_;
					i_50_ += i_63_;
					i_53_ += i_68_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_48_ -= i_49_;
			i_49_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_49_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_50_ >> 12) - 1, (i_51_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_51_ += i_65_;
				i_50_ += i_63_;
				i_53_ += i_68_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_48_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_50_ >> 12) - 1, (i_52_ >> 12) + 1, i_53_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_52_ += i_64_;
				i_50_ += i_63_;
				i_53_ += i_68_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_48_ <= i_49_) {
			if (i_48_ >= aClass544_7565.anInt7278)
				return true;
			if (i_49_ > aClass544_7565.anInt7278)
				i_49_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_54_ = (i_54_ << 8) - i_67_ * i_51_ + i_67_;
			if (i_49_ < i) {
				i_50_ = i_51_ <<= 12;
				if (i_48_ < 0) {
					i_50_ -= i_63_ * i_48_;
					i_51_ -= i_64_ * i_48_;
					i_54_ -= i_68_ * i_48_;
					i_48_ = 0;
				}
				i_52_ <<= 12;
				if (i_49_ < 0) {
					i_52_ -= i_65_ * i_49_;
					i_49_ = 0;
				}
				if (i_48_ != i_49_ && i_63_ < i_64_ || i_48_ == i_49_ && i_63_ > i_65_) {
					i -= i_49_;
					i_49_ -= i_48_;
					i_48_ *= aClass544_7565.anInt7255;
					while (--i_49_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_50_ >> 12) - 1, (i_51_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
							return false;
						i_50_ += i_63_;
						i_51_ += i_64_;
						i_54_ += i_68_;
						i_48_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_50_ >> 12) - 1, (i_52_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
							return false;
						i_50_ += i_63_;
						i_52_ += i_65_;
						i_54_ += i_68_;
						i_48_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_49_;
				i_49_ -= i_48_;
				i_48_ *= aClass544_7565.anInt7255;
				while (--i_49_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_51_ >> 12) - 1, (i_50_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_50_ += i_63_;
					i_51_ += i_64_;
					i_54_ += i_68_;
					i_48_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_52_ >> 12) - 1, (i_50_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_50_ += i_63_;
					i_52_ += i_65_;
					i_54_ += i_68_;
					i_48_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_52_ = i_51_ <<= 12;
			if (i_48_ < 0) {
				i_52_ -= i_63_ * i_48_;
				i_51_ -= i_64_ * i_48_;
				i_54_ -= i_68_ * i_48_;
				i_48_ = 0;
			}
			i_50_ <<= 12;
			if (i < 0) {
				i_50_ -= i_65_ * i;
				i = 0;
			}
			if (i_63_ < i_64_) {
				i_49_ -= i;
				i -= i_48_;
				i_48_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_52_ >> 12) - 1, (i_51_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_52_ += i_63_;
					i_51_ += i_64_;
					i_54_ += i_68_;
					i_48_ += aClass544_7565.anInt7255;
				}
				while (--i_49_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_50_ >> 12) - 1, (i_51_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_50_ += i_65_;
					i_51_ += i_64_;
					i_54_ += i_68_;
					i_48_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_49_ -= i;
			i -= i_48_;
			i_48_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_51_ >> 12) - 1, (i_52_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_52_ += i_63_;
				i_51_ += i_64_;
				i_54_ += i_68_;
				i_48_ += aClass544_7565.anInt7255;
			}
			while (--i_49_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_48_, 0, (i_51_ >> 12) - 1, (i_50_ >> 12) + 1, i_54_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_50_ += i_65_;
				i_51_ += i_64_;
				i_54_ += i_68_;
				i_48_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_49_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_48_ > aClass544_7565.anInt7278)
			i_48_ = aClass544_7565.anInt7278;
		i_55_ = (i_55_ << 8) - i_67_ * i_52_ + i_67_;
		if (i < i_48_) {
			i_51_ = i_52_ <<= 12;
			if (i_49_ < 0) {
				i_51_ -= i_64_ * i_49_;
				i_52_ -= i_65_ * i_49_;
				i_55_ -= i_68_ * i_49_;
				i_49_ = 0;
			}
			i_50_ <<= 12;
			if (i < 0) {
				i_50_ -= i_63_ * i;
				i = 0;
			}
			if (i_64_ < i_65_) {
				i_48_ -= i;
				i -= i_49_;
				i_49_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_51_ >> 12) - 1, (i_52_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_51_ += i_64_;
					i_52_ += i_65_;
					i_55_ += i_68_;
					i_49_ += aClass544_7565.anInt7255;
				}
				while (--i_48_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_51_ >> 12) - 1, (i_50_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
						return false;
					i_51_ += i_64_;
					i_50_ += i_63_;
					i_55_ += i_68_;
					i_49_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_48_ -= i;
			i -= i_49_;
			i_49_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_52_ >> 12) - 1, (i_51_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_51_ += i_64_;
				i_52_ += i_65_;
				i_55_ += i_68_;
				i_49_ += aClass544_7565.anInt7255;
			}
			while (--i_48_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_50_ >> 12) - 1, (i_51_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_51_ += i_64_;
				i_50_ += i_63_;
				i_55_ += i_68_;
				i_49_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_50_ = i_52_ <<= 12;
		if (i_49_ < 0) {
			i_50_ -= i_64_ * i_49_;
			i_52_ -= i_65_ * i_49_;
			i_55_ -= i_68_ * i_49_;
			i_49_ = 0;
		}
		i_51_ <<= 12;
		if (i_48_ < 0) {
			i_51_ -= i_63_ * i_48_;
			i_48_ = 0;
		}
		if (i_64_ < i_65_) {
			i -= i_48_;
			i_48_ -= i_49_;
			i_49_ *= aClass544_7565.anInt7255;
			while (--i_48_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_50_ >> 12) - 1, (i_52_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_50_ += i_64_;
				i_52_ += i_65_;
				i_55_ += i_68_;
				i_49_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_51_ >> 12) - 1, (i_52_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
					return false;
				i_51_ += i_63_;
				i_52_ += i_65_;
				i_55_ += i_68_;
				i_49_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_48_;
		i_48_ -= i_49_;
		i_49_ *= aClass544_7565.anInt7255;
		while (--i_48_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_52_ >> 12) - 1, (i_50_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
				return false;
			i_50_ += i_64_;
			i_52_ += i_65_;
			i_55_ += i_68_;
			i_49_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_49_, 0, (i_52_ >> 12) - 1, (i_51_ >> 12) + 1, i_55_, i_67_, aClass544_7565.anInt7255))
				return false;
			i_51_ += i_63_;
			i_52_ += i_65_;
			i_55_ += i_68_;
			i_49_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	final boolean method9471(int i, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_) {
		if (i > 2002 || i_69_ > 2002 || i_70_ > 2002 || i_71_ > 2002 || i_72_ > 2002 || i_73_ > 2002)
			return false;
		if (i < -2002 || i_69_ < -2002 || i_70_ < -2002 || i_71_ < -2002 || i_72_ < -2002 || i_73_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_77_ = i_71_ + i * aClass544_7565.anInt7255;
			if (i_77_ >= 0 && i_77_ < aClass544_7565.anIntArray7273.length && (i_74_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_77_])
				return false;
			i_77_ = i_72_ + i_69_ * aClass544_7565.anInt7255;
			if (i_77_ >= 0 && i_77_ < aClass544_7565.anIntArray7273.length && (i_75_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_77_])
				return false;
			i_77_ = i_73_ + i_70_ * aClass544_7565.anInt7255;
			if (i_77_ >= 0 && i_77_ < aClass544_7565.anIntArray7273.length && (i_76_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_77_])
				return false;
		}
		int i_78_ = i_72_ - i_71_;
		int i_79_ = i_69_ - i;
		int i_80_ = i_73_ - i_71_;
		int i_81_ = i_70_ - i;
		int i_82_ = i_75_ - i_74_;
		int i_83_ = i_76_ - i_74_;
		if (i < i_69_ && i < i_70_) {
			i--;
			if (i_69_ > i_70_)
				i_69_++;
			else
				i_70_++;
		} else if (i_69_ < i_70_) {
			i_69_--;
			if (i > i_70_)
				i++;
			else
				i_70_++;
		} else {
			i_70_--;
			if (i > i_69_)
				i++;
			else
				i_69_++;
		}
		int i_84_ = 0;
		if (i_69_ != i)
			i_84_ = (i_72_ - i_71_ << 12) / (i_69_ - i);
		int i_85_ = 0;
		if (i_70_ != i_69_)
			i_85_ = (i_73_ - i_72_ << 12) / (i_70_ - i_69_);
		int i_86_ = 0;
		if (i_70_ != i)
			i_86_ = (i_71_ - i_73_ << 12) / (i - i_70_);
		int i_87_ = i_78_ * i_81_ - i_80_ * i_79_;
		if (i_87_ == 0)
			return false;
		int i_88_ = (i_82_ * i_81_ - i_83_ * i_79_ << 8) / i_87_;
		int i_89_ = (i_83_ * i_78_ - i_82_ * i_80_ << 8) / i_87_;
		if (i <= i_69_ && i <= i_70_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_69_ > aClass544_7565.anInt7278)
				i_69_ = aClass544_7565.anInt7278;
			if (i_70_ > aClass544_7565.anInt7278)
				i_70_ = aClass544_7565.anInt7278;
			i_74_ = (i_74_ << 8) - i_88_ * i_71_ + i_88_;
			if (i_69_ < i_70_) {
				i_73_ = i_71_ <<= 12;
				if (i < 0) {
					i_73_ -= i_86_ * i;
					i_71_ -= i_84_ * i;
					i_74_ -= i_89_ * i;
					i = 0;
				}
				i_72_ <<= 12;
				if (i_69_ < 0) {
					i_72_ -= i_85_ * i_69_;
					i_69_ = 0;
				}
				if (i != i_69_ && i_86_ < i_84_ || i == i_69_ && i_86_ > i_85_) {
					i_70_ -= i_69_;
					i_69_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_69_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_73_ >> 12) - 1, (i_71_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
							return false;
						i_73_ += i_86_;
						i_71_ += i_84_;
						i_74_ += i_89_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_70_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_73_ >> 12) - 1, (i_72_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
							return false;
						i_73_ += i_86_;
						i_72_ += i_85_;
						i_74_ += i_89_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_70_ -= i_69_;
				i_69_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_69_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_71_ >> 12) - 1, (i_73_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_73_ += i_86_;
					i_71_ += i_84_;
					i_74_ += i_89_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_70_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_72_ >> 12) - 1, (i_73_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_73_ += i_86_;
					i_72_ += i_85_;
					i_74_ += i_89_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_72_ = i_71_ <<= 12;
			if (i < 0) {
				i_72_ -= i_86_ * i;
				i_71_ -= i_84_ * i;
				i_74_ -= i_89_ * i;
				i = 0;
			}
			i_73_ <<= 12;
			if (i_70_ < 0) {
				i_73_ -= i_85_ * i_70_;
				i_70_ = 0;
			}
			if (i != i_70_ && i_86_ < i_84_ || i == i_70_ && i_85_ > i_84_) {
				i_69_ -= i_70_;
				i_70_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_70_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_72_ >> 12) - 1, (i_71_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_72_ += i_86_;
					i_71_ += i_84_;
					i_74_ += i_89_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_69_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_73_ >> 12) - 1, (i_71_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_73_ += i_85_;
					i_71_ += i_84_;
					i_74_ += i_89_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_69_ -= i_70_;
			i_70_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_70_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_71_ >> 12) - 1, (i_72_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_72_ += i_86_;
				i_71_ += i_84_;
				i_74_ += i_89_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_69_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_71_ >> 12) - 1, (i_73_ >> 12) + 1, i_74_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_73_ += i_85_;
				i_71_ += i_84_;
				i_74_ += i_89_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_69_ <= i_70_) {
			if (i_69_ >= aClass544_7565.anInt7278)
				return true;
			if (i_70_ > aClass544_7565.anInt7278)
				i_70_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_75_ = (i_75_ << 8) - i_88_ * i_72_ + i_88_;
			if (i_70_ < i) {
				i_71_ = i_72_ <<= 12;
				if (i_69_ < 0) {
					i_71_ -= i_84_ * i_69_;
					i_72_ -= i_85_ * i_69_;
					i_75_ -= i_89_ * i_69_;
					i_69_ = 0;
				}
				i_73_ <<= 12;
				if (i_70_ < 0) {
					i_73_ -= i_86_ * i_70_;
					i_70_ = 0;
				}
				if (i_69_ != i_70_ && i_84_ < i_85_ || i_69_ == i_70_ && i_84_ > i_86_) {
					i -= i_70_;
					i_70_ -= i_69_;
					i_69_ *= aClass544_7565.anInt7255;
					while (--i_70_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_71_ >> 12) - 1, (i_72_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
							return false;
						i_71_ += i_84_;
						i_72_ += i_85_;
						i_75_ += i_89_;
						i_69_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_71_ >> 12) - 1, (i_73_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
							return false;
						i_71_ += i_84_;
						i_73_ += i_86_;
						i_75_ += i_89_;
						i_69_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_70_;
				i_70_ -= i_69_;
				i_69_ *= aClass544_7565.anInt7255;
				while (--i_70_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_72_ >> 12) - 1, (i_71_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_71_ += i_84_;
					i_72_ += i_85_;
					i_75_ += i_89_;
					i_69_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_73_ >> 12) - 1, (i_71_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_71_ += i_84_;
					i_73_ += i_86_;
					i_75_ += i_89_;
					i_69_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_73_ = i_72_ <<= 12;
			if (i_69_ < 0) {
				i_73_ -= i_84_ * i_69_;
				i_72_ -= i_85_ * i_69_;
				i_75_ -= i_89_ * i_69_;
				i_69_ = 0;
			}
			i_71_ <<= 12;
			if (i < 0) {
				i_71_ -= i_86_ * i;
				i = 0;
			}
			if (i_84_ < i_85_) {
				i_70_ -= i;
				i -= i_69_;
				i_69_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_73_ >> 12) - 1, (i_72_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_73_ += i_84_;
					i_72_ += i_85_;
					i_75_ += i_89_;
					i_69_ += aClass544_7565.anInt7255;
				}
				while (--i_70_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_71_ >> 12) - 1, (i_72_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_71_ += i_86_;
					i_72_ += i_85_;
					i_75_ += i_89_;
					i_69_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_70_ -= i;
			i -= i_69_;
			i_69_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_72_ >> 12) - 1, (i_73_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_73_ += i_84_;
				i_72_ += i_85_;
				i_75_ += i_89_;
				i_69_ += aClass544_7565.anInt7255;
			}
			while (--i_70_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_69_, 0, (i_72_ >> 12) - 1, (i_71_ >> 12) + 1, i_75_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_71_ += i_86_;
				i_72_ += i_85_;
				i_75_ += i_89_;
				i_69_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_70_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_69_ > aClass544_7565.anInt7278)
			i_69_ = aClass544_7565.anInt7278;
		i_76_ = (i_76_ << 8) - i_88_ * i_73_ + i_88_;
		if (i < i_69_) {
			i_72_ = i_73_ <<= 12;
			if (i_70_ < 0) {
				i_72_ -= i_85_ * i_70_;
				i_73_ -= i_86_ * i_70_;
				i_76_ -= i_89_ * i_70_;
				i_70_ = 0;
			}
			i_71_ <<= 12;
			if (i < 0) {
				i_71_ -= i_84_ * i;
				i = 0;
			}
			if (i_85_ < i_86_) {
				i_69_ -= i;
				i -= i_70_;
				i_70_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_72_ >> 12) - 1, (i_73_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_72_ += i_85_;
					i_73_ += i_86_;
					i_76_ += i_89_;
					i_70_ += aClass544_7565.anInt7255;
				}
				while (--i_69_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_72_ >> 12) - 1, (i_71_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
						return false;
					i_72_ += i_85_;
					i_71_ += i_84_;
					i_76_ += i_89_;
					i_70_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_69_ -= i;
			i -= i_70_;
			i_70_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_73_ >> 12) - 1, (i_72_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_72_ += i_85_;
				i_73_ += i_86_;
				i_76_ += i_89_;
				i_70_ += aClass544_7565.anInt7255;
			}
			while (--i_69_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_71_ >> 12) - 1, (i_72_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_72_ += i_85_;
				i_71_ += i_84_;
				i_76_ += i_89_;
				i_70_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_71_ = i_73_ <<= 12;
		if (i_70_ < 0) {
			i_71_ -= i_85_ * i_70_;
			i_73_ -= i_86_ * i_70_;
			i_76_ -= i_89_ * i_70_;
			i_70_ = 0;
		}
		i_72_ <<= 12;
		if (i_69_ < 0) {
			i_72_ -= i_84_ * i_69_;
			i_69_ = 0;
		}
		if (i_85_ < i_86_) {
			i -= i_69_;
			i_69_ -= i_70_;
			i_70_ *= aClass544_7565.anInt7255;
			while (--i_69_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_71_ >> 12) - 1, (i_73_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_71_ += i_85_;
				i_73_ += i_86_;
				i_76_ += i_89_;
				i_70_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_72_ >> 12) - 1, (i_73_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
					return false;
				i_72_ += i_84_;
				i_73_ += i_86_;
				i_76_ += i_89_;
				i_70_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_69_;
		i_69_ -= i_70_;
		i_70_ *= aClass544_7565.anInt7255;
		while (--i_69_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_73_ >> 12) - 1, (i_71_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
				return false;
			i_71_ += i_85_;
			i_73_ += i_86_;
			i_76_ += i_89_;
			i_70_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_70_, 0, (i_73_ >> 12) - 1, (i_72_ >> 12) + 1, i_76_, i_88_, aClass544_7565.anInt7255))
				return false;
			i_72_ += i_84_;
			i_73_ += i_86_;
			i_76_ += i_89_;
			i_70_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	Class563(Class544 class544) {
		aClass544_7565 = class544;
	}

	final boolean method9472(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_) {
		if (i > 2002 || i_90_ > 2002 || i_91_ > 2002 || i_92_ > 2002 || i_93_ > 2002 || i_94_ > 2002)
			return false;
		if (i < -2002 || i_90_ < -2002 || i_91_ < -2002 || i_92_ < -2002 || i_93_ < -2002 || i_94_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_98_ = i_92_ + i * aClass544_7565.anInt7255;
			if (i_98_ >= 0 && i_98_ < aClass544_7565.anIntArray7273.length && (i_95_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_98_])
				return false;
			i_98_ = i_93_ + i_90_ * aClass544_7565.anInt7255;
			if (i_98_ >= 0 && i_98_ < aClass544_7565.anIntArray7273.length && (i_96_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_98_])
				return false;
			i_98_ = i_94_ + i_91_ * aClass544_7565.anInt7255;
			if (i_98_ >= 0 && i_98_ < aClass544_7565.anIntArray7273.length && (i_97_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_98_])
				return false;
		}
		int i_99_ = i_93_ - i_92_;
		int i_100_ = i_90_ - i;
		int i_101_ = i_94_ - i_92_;
		int i_102_ = i_91_ - i;
		int i_103_ = i_96_ - i_95_;
		int i_104_ = i_97_ - i_95_;
		if (i < i_90_ && i < i_91_) {
			i--;
			if (i_90_ > i_91_)
				i_90_++;
			else
				i_91_++;
		} else if (i_90_ < i_91_) {
			i_90_--;
			if (i > i_91_)
				i++;
			else
				i_91_++;
		} else {
			i_91_--;
			if (i > i_90_)
				i++;
			else
				i_90_++;
		}
		int i_105_ = 0;
		if (i_90_ != i)
			i_105_ = (i_93_ - i_92_ << 12) / (i_90_ - i);
		int i_106_ = 0;
		if (i_91_ != i_90_)
			i_106_ = (i_94_ - i_93_ << 12) / (i_91_ - i_90_);
		int i_107_ = 0;
		if (i_91_ != i)
			i_107_ = (i_92_ - i_94_ << 12) / (i - i_91_);
		int i_108_ = i_99_ * i_102_ - i_101_ * i_100_;
		if (i_108_ == 0)
			return false;
		int i_109_ = (i_103_ * i_102_ - i_104_ * i_100_ << 8) / i_108_;
		int i_110_ = (i_104_ * i_99_ - i_103_ * i_101_ << 8) / i_108_;
		if (i <= i_90_ && i <= i_91_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_90_ > aClass544_7565.anInt7278)
				i_90_ = aClass544_7565.anInt7278;
			if (i_91_ > aClass544_7565.anInt7278)
				i_91_ = aClass544_7565.anInt7278;
			i_95_ = (i_95_ << 8) - i_109_ * i_92_ + i_109_;
			if (i_90_ < i_91_) {
				i_94_ = i_92_ <<= 12;
				if (i < 0) {
					i_94_ -= i_107_ * i;
					i_92_ -= i_105_ * i;
					i_95_ -= i_110_ * i;
					i = 0;
				}
				i_93_ <<= 12;
				if (i_90_ < 0) {
					i_93_ -= i_106_ * i_90_;
					i_90_ = 0;
				}
				if (i != i_90_ && i_107_ < i_105_ || i == i_90_ && i_107_ > i_106_) {
					i_91_ -= i_90_;
					i_90_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_90_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_94_ >> 12) - 1, (i_92_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
							return false;
						i_94_ += i_107_;
						i_92_ += i_105_;
						i_95_ += i_110_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_91_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_94_ >> 12) - 1, (i_93_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
							return false;
						i_94_ += i_107_;
						i_93_ += i_106_;
						i_95_ += i_110_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_91_ -= i_90_;
				i_90_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_90_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_92_ >> 12) - 1, (i_94_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_94_ += i_107_;
					i_92_ += i_105_;
					i_95_ += i_110_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_91_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_93_ >> 12) - 1, (i_94_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_94_ += i_107_;
					i_93_ += i_106_;
					i_95_ += i_110_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_93_ = i_92_ <<= 12;
			if (i < 0) {
				i_93_ -= i_107_ * i;
				i_92_ -= i_105_ * i;
				i_95_ -= i_110_ * i;
				i = 0;
			}
			i_94_ <<= 12;
			if (i_91_ < 0) {
				i_94_ -= i_106_ * i_91_;
				i_91_ = 0;
			}
			if (i != i_91_ && i_107_ < i_105_ || i == i_91_ && i_106_ > i_105_) {
				i_90_ -= i_91_;
				i_91_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_91_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_93_ >> 12) - 1, (i_92_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_93_ += i_107_;
					i_92_ += i_105_;
					i_95_ += i_110_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_90_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_94_ >> 12) - 1, (i_92_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_94_ += i_106_;
					i_92_ += i_105_;
					i_95_ += i_110_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_90_ -= i_91_;
			i_91_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_91_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_92_ >> 12) - 1, (i_93_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_93_ += i_107_;
				i_92_ += i_105_;
				i_95_ += i_110_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_90_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_92_ >> 12) - 1, (i_94_ >> 12) + 1, i_95_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_94_ += i_106_;
				i_92_ += i_105_;
				i_95_ += i_110_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_90_ <= i_91_) {
			if (i_90_ >= aClass544_7565.anInt7278)
				return true;
			if (i_91_ > aClass544_7565.anInt7278)
				i_91_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_96_ = (i_96_ << 8) - i_109_ * i_93_ + i_109_;
			if (i_91_ < i) {
				i_92_ = i_93_ <<= 12;
				if (i_90_ < 0) {
					i_92_ -= i_105_ * i_90_;
					i_93_ -= i_106_ * i_90_;
					i_96_ -= i_110_ * i_90_;
					i_90_ = 0;
				}
				i_94_ <<= 12;
				if (i_91_ < 0) {
					i_94_ -= i_107_ * i_91_;
					i_91_ = 0;
				}
				if (i_90_ != i_91_ && i_105_ < i_106_ || i_90_ == i_91_ && i_105_ > i_107_) {
					i -= i_91_;
					i_91_ -= i_90_;
					i_90_ *= aClass544_7565.anInt7255;
					while (--i_91_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_92_ >> 12) - 1, (i_93_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
							return false;
						i_92_ += i_105_;
						i_93_ += i_106_;
						i_96_ += i_110_;
						i_90_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_92_ >> 12) - 1, (i_94_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
							return false;
						i_92_ += i_105_;
						i_94_ += i_107_;
						i_96_ += i_110_;
						i_90_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_91_;
				i_91_ -= i_90_;
				i_90_ *= aClass544_7565.anInt7255;
				while (--i_91_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_93_ >> 12) - 1, (i_92_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_92_ += i_105_;
					i_93_ += i_106_;
					i_96_ += i_110_;
					i_90_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_94_ >> 12) - 1, (i_92_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_92_ += i_105_;
					i_94_ += i_107_;
					i_96_ += i_110_;
					i_90_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_94_ = i_93_ <<= 12;
			if (i_90_ < 0) {
				i_94_ -= i_105_ * i_90_;
				i_93_ -= i_106_ * i_90_;
				i_96_ -= i_110_ * i_90_;
				i_90_ = 0;
			}
			i_92_ <<= 12;
			if (i < 0) {
				i_92_ -= i_107_ * i;
				i = 0;
			}
			if (i_105_ < i_106_) {
				i_91_ -= i;
				i -= i_90_;
				i_90_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_94_ >> 12) - 1, (i_93_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_94_ += i_105_;
					i_93_ += i_106_;
					i_96_ += i_110_;
					i_90_ += aClass544_7565.anInt7255;
				}
				while (--i_91_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_92_ >> 12) - 1, (i_93_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_92_ += i_107_;
					i_93_ += i_106_;
					i_96_ += i_110_;
					i_90_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_91_ -= i;
			i -= i_90_;
			i_90_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_93_ >> 12) - 1, (i_94_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_94_ += i_105_;
				i_93_ += i_106_;
				i_96_ += i_110_;
				i_90_ += aClass544_7565.anInt7255;
			}
			while (--i_91_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_90_, 0, (i_93_ >> 12) - 1, (i_92_ >> 12) + 1, i_96_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_92_ += i_107_;
				i_93_ += i_106_;
				i_96_ += i_110_;
				i_90_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_91_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_90_ > aClass544_7565.anInt7278)
			i_90_ = aClass544_7565.anInt7278;
		i_97_ = (i_97_ << 8) - i_109_ * i_94_ + i_109_;
		if (i < i_90_) {
			i_93_ = i_94_ <<= 12;
			if (i_91_ < 0) {
				i_93_ -= i_106_ * i_91_;
				i_94_ -= i_107_ * i_91_;
				i_97_ -= i_110_ * i_91_;
				i_91_ = 0;
			}
			i_92_ <<= 12;
			if (i < 0) {
				i_92_ -= i_105_ * i;
				i = 0;
			}
			if (i_106_ < i_107_) {
				i_90_ -= i;
				i -= i_91_;
				i_91_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_93_ >> 12) - 1, (i_94_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_93_ += i_106_;
					i_94_ += i_107_;
					i_97_ += i_110_;
					i_91_ += aClass544_7565.anInt7255;
				}
				while (--i_90_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_93_ >> 12) - 1, (i_92_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
						return false;
					i_93_ += i_106_;
					i_92_ += i_105_;
					i_97_ += i_110_;
					i_91_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_90_ -= i;
			i -= i_91_;
			i_91_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_94_ >> 12) - 1, (i_93_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_93_ += i_106_;
				i_94_ += i_107_;
				i_97_ += i_110_;
				i_91_ += aClass544_7565.anInt7255;
			}
			while (--i_90_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_92_ >> 12) - 1, (i_93_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_93_ += i_106_;
				i_92_ += i_105_;
				i_97_ += i_110_;
				i_91_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_92_ = i_94_ <<= 12;
		if (i_91_ < 0) {
			i_92_ -= i_106_ * i_91_;
			i_94_ -= i_107_ * i_91_;
			i_97_ -= i_110_ * i_91_;
			i_91_ = 0;
		}
		i_93_ <<= 12;
		if (i_90_ < 0) {
			i_93_ -= i_105_ * i_90_;
			i_90_ = 0;
		}
		if (i_106_ < i_107_) {
			i -= i_90_;
			i_90_ -= i_91_;
			i_91_ *= aClass544_7565.anInt7255;
			while (--i_90_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_92_ >> 12) - 1, (i_94_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_92_ += i_106_;
				i_94_ += i_107_;
				i_97_ += i_110_;
				i_91_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_93_ >> 12) - 1, (i_94_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
					return false;
				i_93_ += i_105_;
				i_94_ += i_107_;
				i_97_ += i_110_;
				i_91_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_90_;
		i_90_ -= i_91_;
		i_91_ *= aClass544_7565.anInt7255;
		while (--i_90_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_94_ >> 12) - 1, (i_92_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
				return false;
			i_92_ += i_106_;
			i_94_ += i_107_;
			i_97_ += i_110_;
			i_91_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_91_, 0, (i_94_ >> 12) - 1, (i_93_ >> 12) + 1, i_97_, i_109_, aClass544_7565.anInt7255))
				return false;
			i_93_ += i_105_;
			i_94_ += i_107_;
			i_97_ += i_110_;
			i_91_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	final boolean method9473(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_) {
		if (i > 2002 || i_111_ > 2002 || i_112_ > 2002 || i_113_ > 2002 || i_114_ > 2002 || i_115_ > 2002)
			return false;
		if (i < -2002 || i_111_ < -2002 || i_112_ < -2002 || i_113_ < -2002 || i_114_ < -2002 || i_115_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_119_ = i_113_ + i * aClass544_7565.anInt7255;
			if (i_119_ >= 0 && i_119_ < aClass544_7565.anIntArray7273.length && ((i_116_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_119_]))
				return false;
			i_119_ = i_114_ + i_111_ * aClass544_7565.anInt7255;
			if (i_119_ >= 0 && i_119_ < aClass544_7565.anIntArray7273.length && ((i_117_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_119_]))
				return false;
			i_119_ = i_115_ + i_112_ * aClass544_7565.anInt7255;
			if (i_119_ >= 0 && i_119_ < aClass544_7565.anIntArray7273.length && ((i_118_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_119_]))
				return false;
		}
		int i_120_ = i_114_ - i_113_;
		int i_121_ = i_111_ - i;
		int i_122_ = i_115_ - i_113_;
		int i_123_ = i_112_ - i;
		int i_124_ = i_117_ - i_116_;
		int i_125_ = i_118_ - i_116_;
		if (i < i_111_ && i < i_112_) {
			i--;
			if (i_111_ > i_112_)
				i_111_++;
			else
				i_112_++;
		} else if (i_111_ < i_112_) {
			i_111_--;
			if (i > i_112_)
				i++;
			else
				i_112_++;
		} else {
			i_112_--;
			if (i > i_111_)
				i++;
			else
				i_111_++;
		}
		int i_126_ = 0;
		if (i_111_ != i)
			i_126_ = (i_114_ - i_113_ << 12) / (i_111_ - i);
		int i_127_ = 0;
		if (i_112_ != i_111_)
			i_127_ = (i_115_ - i_114_ << 12) / (i_112_ - i_111_);
		int i_128_ = 0;
		if (i_112_ != i)
			i_128_ = (i_113_ - i_115_ << 12) / (i - i_112_);
		int i_129_ = i_120_ * i_123_ - i_122_ * i_121_;
		if (i_129_ == 0)
			return false;
		int i_130_ = (i_124_ * i_123_ - i_125_ * i_121_ << 8) / i_129_;
		int i_131_ = (i_125_ * i_120_ - i_124_ * i_122_ << 8) / i_129_;
		if (i <= i_111_ && i <= i_112_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_111_ > aClass544_7565.anInt7278)
				i_111_ = aClass544_7565.anInt7278;
			if (i_112_ > aClass544_7565.anInt7278)
				i_112_ = aClass544_7565.anInt7278;
			i_116_ = (i_116_ << 8) - i_130_ * i_113_ + i_130_;
			if (i_111_ < i_112_) {
				i_115_ = i_113_ <<= 12;
				if (i < 0) {
					i_115_ -= i_128_ * i;
					i_113_ -= i_126_ * i;
					i_116_ -= i_131_ * i;
					i = 0;
				}
				i_114_ <<= 12;
				if (i_111_ < 0) {
					i_114_ -= i_127_ * i_111_;
					i_111_ = 0;
				}
				if (i != i_111_ && i_128_ < i_126_ || i == i_111_ && i_128_ > i_127_) {
					i_112_ -= i_111_;
					i_111_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_111_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_115_ >> 12) - 1, (i_113_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
							return false;
						i_115_ += i_128_;
						i_113_ += i_126_;
						i_116_ += i_131_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_112_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_115_ >> 12) - 1, (i_114_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
							return false;
						i_115_ += i_128_;
						i_114_ += i_127_;
						i_116_ += i_131_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_112_ -= i_111_;
				i_111_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_111_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_113_ >> 12) - 1, (i_115_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_115_ += i_128_;
					i_113_ += i_126_;
					i_116_ += i_131_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_112_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_114_ >> 12) - 1, (i_115_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_115_ += i_128_;
					i_114_ += i_127_;
					i_116_ += i_131_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_114_ = i_113_ <<= 12;
			if (i < 0) {
				i_114_ -= i_128_ * i;
				i_113_ -= i_126_ * i;
				i_116_ -= i_131_ * i;
				i = 0;
			}
			i_115_ <<= 12;
			if (i_112_ < 0) {
				i_115_ -= i_127_ * i_112_;
				i_112_ = 0;
			}
			if (i != i_112_ && i_128_ < i_126_ || i == i_112_ && i_127_ > i_126_) {
				i_111_ -= i_112_;
				i_112_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_112_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_114_ >> 12) - 1, (i_113_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_114_ += i_128_;
					i_113_ += i_126_;
					i_116_ += i_131_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_111_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_115_ >> 12) - 1, (i_113_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_115_ += i_127_;
					i_113_ += i_126_;
					i_116_ += i_131_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_111_ -= i_112_;
			i_112_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_112_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_113_ >> 12) - 1, (i_114_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_114_ += i_128_;
				i_113_ += i_126_;
				i_116_ += i_131_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_111_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_113_ >> 12) - 1, (i_115_ >> 12) + 1, i_116_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_115_ += i_127_;
				i_113_ += i_126_;
				i_116_ += i_131_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_111_ <= i_112_) {
			if (i_111_ >= aClass544_7565.anInt7278)
				return true;
			if (i_112_ > aClass544_7565.anInt7278)
				i_112_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_117_ = (i_117_ << 8) - i_130_ * i_114_ + i_130_;
			if (i_112_ < i) {
				i_113_ = i_114_ <<= 12;
				if (i_111_ < 0) {
					i_113_ -= i_126_ * i_111_;
					i_114_ -= i_127_ * i_111_;
					i_117_ -= i_131_ * i_111_;
					i_111_ = 0;
				}
				i_115_ <<= 12;
				if (i_112_ < 0) {
					i_115_ -= i_128_ * i_112_;
					i_112_ = 0;
				}
				if (i_111_ != i_112_ && i_126_ < i_127_ || i_111_ == i_112_ && i_126_ > i_128_) {
					i -= i_112_;
					i_112_ -= i_111_;
					i_111_ *= aClass544_7565.anInt7255;
					while (--i_112_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_113_ >> 12) - 1, (i_114_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
							return false;
						i_113_ += i_126_;
						i_114_ += i_127_;
						i_117_ += i_131_;
						i_111_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_113_ >> 12) - 1, (i_115_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
							return false;
						i_113_ += i_126_;
						i_115_ += i_128_;
						i_117_ += i_131_;
						i_111_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_112_;
				i_112_ -= i_111_;
				i_111_ *= aClass544_7565.anInt7255;
				while (--i_112_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_114_ >> 12) - 1, (i_113_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_113_ += i_126_;
					i_114_ += i_127_;
					i_117_ += i_131_;
					i_111_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_115_ >> 12) - 1, (i_113_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_113_ += i_126_;
					i_115_ += i_128_;
					i_117_ += i_131_;
					i_111_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_115_ = i_114_ <<= 12;
			if (i_111_ < 0) {
				i_115_ -= i_126_ * i_111_;
				i_114_ -= i_127_ * i_111_;
				i_117_ -= i_131_ * i_111_;
				i_111_ = 0;
			}
			i_113_ <<= 12;
			if (i < 0) {
				i_113_ -= i_128_ * i;
				i = 0;
			}
			if (i_126_ < i_127_) {
				i_112_ -= i;
				i -= i_111_;
				i_111_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_115_ >> 12) - 1, (i_114_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_115_ += i_126_;
					i_114_ += i_127_;
					i_117_ += i_131_;
					i_111_ += aClass544_7565.anInt7255;
				}
				while (--i_112_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_113_ >> 12) - 1, (i_114_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_113_ += i_128_;
					i_114_ += i_127_;
					i_117_ += i_131_;
					i_111_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_112_ -= i;
			i -= i_111_;
			i_111_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_114_ >> 12) - 1, (i_115_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_115_ += i_126_;
				i_114_ += i_127_;
				i_117_ += i_131_;
				i_111_ += aClass544_7565.anInt7255;
			}
			while (--i_112_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_111_, 0, (i_114_ >> 12) - 1, (i_113_ >> 12) + 1, i_117_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_113_ += i_128_;
				i_114_ += i_127_;
				i_117_ += i_131_;
				i_111_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_112_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_111_ > aClass544_7565.anInt7278)
			i_111_ = aClass544_7565.anInt7278;
		i_118_ = (i_118_ << 8) - i_130_ * i_115_ + i_130_;
		if (i < i_111_) {
			i_114_ = i_115_ <<= 12;
			if (i_112_ < 0) {
				i_114_ -= i_127_ * i_112_;
				i_115_ -= i_128_ * i_112_;
				i_118_ -= i_131_ * i_112_;
				i_112_ = 0;
			}
			i_113_ <<= 12;
			if (i < 0) {
				i_113_ -= i_126_ * i;
				i = 0;
			}
			if (i_127_ < i_128_) {
				i_111_ -= i;
				i -= i_112_;
				i_112_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_114_ >> 12) - 1, (i_115_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_114_ += i_127_;
					i_115_ += i_128_;
					i_118_ += i_131_;
					i_112_ += aClass544_7565.anInt7255;
				}
				while (--i_111_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_114_ >> 12) - 1, (i_113_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
						return false;
					i_114_ += i_127_;
					i_113_ += i_126_;
					i_118_ += i_131_;
					i_112_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_111_ -= i;
			i -= i_112_;
			i_112_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_115_ >> 12) - 1, (i_114_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_114_ += i_127_;
				i_115_ += i_128_;
				i_118_ += i_131_;
				i_112_ += aClass544_7565.anInt7255;
			}
			while (--i_111_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_113_ >> 12) - 1, (i_114_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_114_ += i_127_;
				i_113_ += i_126_;
				i_118_ += i_131_;
				i_112_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_113_ = i_115_ <<= 12;
		if (i_112_ < 0) {
			i_113_ -= i_127_ * i_112_;
			i_115_ -= i_128_ * i_112_;
			i_118_ -= i_131_ * i_112_;
			i_112_ = 0;
		}
		i_114_ <<= 12;
		if (i_111_ < 0) {
			i_114_ -= i_126_ * i_111_;
			i_111_ = 0;
		}
		if (i_127_ < i_128_) {
			i -= i_111_;
			i_111_ -= i_112_;
			i_112_ *= aClass544_7565.anInt7255;
			while (--i_111_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_113_ >> 12) - 1, (i_115_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_113_ += i_127_;
				i_115_ += i_128_;
				i_118_ += i_131_;
				i_112_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_114_ >> 12) - 1, (i_115_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
					return false;
				i_114_ += i_126_;
				i_115_ += i_128_;
				i_118_ += i_131_;
				i_112_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_111_;
		i_111_ -= i_112_;
		i_112_ *= aClass544_7565.anInt7255;
		while (--i_111_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_115_ >> 12) - 1, (i_113_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
				return false;
			i_113_ += i_127_;
			i_115_ += i_128_;
			i_118_ += i_131_;
			i_112_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_112_, 0, (i_115_ >> 12) - 1, (i_114_ >> 12) + 1, i_118_, i_130_, aClass544_7565.anInt7255))
				return false;
			i_114_ += i_126_;
			i_115_ += i_128_;
			i_118_ += i_131_;
			i_112_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	final boolean method9474(int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_) {
		if (i > 2002 || i_132_ > 2002 || i_133_ > 2002 || i_134_ > 2002 || i_135_ > 2002 || i_136_ > 2002)
			return false;
		if (i < -2002 || i_132_ < -2002 || i_133_ < -2002 || i_134_ < -2002 || i_135_ < -2002 || i_136_ < -2002)
			return false;
		if (anInt7571 == 2) {
			int i_140_ = i_134_ + i * aClass544_7565.anInt7255;
			if (i_140_ >= 0 && i_140_ < aClass544_7565.anIntArray7273.length && ((i_137_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_140_]))
				return false;
			i_140_ = i_135_ + i_132_ * aClass544_7565.anInt7255;
			if (i_140_ >= 0 && i_140_ < aClass544_7565.anIntArray7273.length && ((i_138_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_140_]))
				return false;
			i_140_ = i_136_ + i_133_ * aClass544_7565.anInt7255;
			if (i_140_ >= 0 && i_140_ < aClass544_7565.anIntArray7273.length && ((i_139_ << 8) - 38400 < aClass544_7565.anIntArray7273[i_140_]))
				return false;
		}
		int i_141_ = i_135_ - i_134_;
		int i_142_ = i_132_ - i;
		int i_143_ = i_136_ - i_134_;
		int i_144_ = i_133_ - i;
		int i_145_ = i_138_ - i_137_;
		int i_146_ = i_139_ - i_137_;
		if (i < i_132_ && i < i_133_) {
			i--;
			if (i_132_ > i_133_)
				i_132_++;
			else
				i_133_++;
		} else if (i_132_ < i_133_) {
			i_132_--;
			if (i > i_133_)
				i++;
			else
				i_133_++;
		} else {
			i_133_--;
			if (i > i_132_)
				i++;
			else
				i_132_++;
		}
		int i_147_ = 0;
		if (i_132_ != i)
			i_147_ = (i_135_ - i_134_ << 12) / (i_132_ - i);
		int i_148_ = 0;
		if (i_133_ != i_132_)
			i_148_ = (i_136_ - i_135_ << 12) / (i_133_ - i_132_);
		int i_149_ = 0;
		if (i_133_ != i)
			i_149_ = (i_134_ - i_136_ << 12) / (i - i_133_);
		int i_150_ = i_141_ * i_144_ - i_143_ * i_142_;
		if (i_150_ == 0)
			return false;
		int i_151_ = (i_145_ * i_144_ - i_146_ * i_142_ << 8) / i_150_;
		int i_152_ = (i_146_ * i_141_ - i_145_ * i_143_ << 8) / i_150_;
		if (i <= i_132_ && i <= i_133_) {
			if (i >= aClass544_7565.anInt7278)
				return true;
			if (i_132_ > aClass544_7565.anInt7278)
				i_132_ = aClass544_7565.anInt7278;
			if (i_133_ > aClass544_7565.anInt7278)
				i_133_ = aClass544_7565.anInt7278;
			i_137_ = (i_137_ << 8) - i_151_ * i_134_ + i_151_;
			if (i_132_ < i_133_) {
				i_136_ = i_134_ <<= 12;
				if (i < 0) {
					i_136_ -= i_149_ * i;
					i_134_ -= i_147_ * i;
					i_137_ -= i_152_ * i;
					i = 0;
				}
				i_135_ <<= 12;
				if (i_132_ < 0) {
					i_135_ -= i_148_ * i_132_;
					i_132_ = 0;
				}
				if (i != i_132_ && i_149_ < i_147_ || i == i_132_ && i_149_ > i_148_) {
					i_133_ -= i_132_;
					i_132_ -= i;
					i *= aClass544_7565.anInt7255;
					while (--i_132_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_136_ >> 12) - 1, (i_134_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
							return false;
						i_136_ += i_149_;
						i_134_ += i_147_;
						i_137_ += i_152_;
						i += aClass544_7565.anInt7255;
					}
					while (--i_133_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_136_ >> 12) - 1, (i_135_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
							return false;
						i_136_ += i_149_;
						i_135_ += i_148_;
						i_137_ += i_152_;
						i += aClass544_7565.anInt7255;
					}
					return true;
				}
				i_133_ -= i_132_;
				i_132_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_132_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_134_ >> 12) - 1, (i_136_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_136_ += i_149_;
					i_134_ += i_147_;
					i_137_ += i_152_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_133_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_135_ >> 12) - 1, (i_136_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_136_ += i_149_;
					i_135_ += i_148_;
					i_137_ += i_152_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_135_ = i_134_ <<= 12;
			if (i < 0) {
				i_135_ -= i_149_ * i;
				i_134_ -= i_147_ * i;
				i_137_ -= i_152_ * i;
				i = 0;
			}
			i_136_ <<= 12;
			if (i_133_ < 0) {
				i_136_ -= i_148_ * i_133_;
				i_133_ = 0;
			}
			if (i != i_133_ && i_149_ < i_147_ || i == i_133_ && i_148_ > i_147_) {
				i_132_ -= i_133_;
				i_133_ -= i;
				i *= aClass544_7565.anInt7255;
				while (--i_133_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_135_ >> 12) - 1, (i_134_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_135_ += i_149_;
					i_134_ += i_147_;
					i_137_ += i_152_;
					i += aClass544_7565.anInt7255;
				}
				while (--i_132_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_136_ >> 12) - 1, (i_134_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_136_ += i_148_;
					i_134_ += i_147_;
					i_137_ += i_152_;
					i += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_132_ -= i_133_;
			i_133_ -= i;
			i *= aClass544_7565.anInt7255;
			while (--i_133_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_134_ >> 12) - 1, (i_135_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_135_ += i_149_;
				i_134_ += i_147_;
				i_137_ += i_152_;
				i += aClass544_7565.anInt7255;
			}
			while (--i_132_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i, 0, (i_134_ >> 12) - 1, (i_136_ >> 12) + 1, i_137_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_136_ += i_148_;
				i_134_ += i_147_;
				i_137_ += i_152_;
				i += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_132_ <= i_133_) {
			if (i_132_ >= aClass544_7565.anInt7278)
				return true;
			if (i_133_ > aClass544_7565.anInt7278)
				i_133_ = aClass544_7565.anInt7278;
			if (i > aClass544_7565.anInt7278)
				i = aClass544_7565.anInt7278;
			i_138_ = (i_138_ << 8) - i_151_ * i_135_ + i_151_;
			if (i_133_ < i) {
				i_134_ = i_135_ <<= 12;
				if (i_132_ < 0) {
					i_134_ -= i_147_ * i_132_;
					i_135_ -= i_148_ * i_132_;
					i_138_ -= i_152_ * i_132_;
					i_132_ = 0;
				}
				i_136_ <<= 12;
				if (i_133_ < 0) {
					i_136_ -= i_149_ * i_133_;
					i_133_ = 0;
				}
				if (i_132_ != i_133_ && i_147_ < i_148_ || i_132_ == i_133_ && i_147_ > i_149_) {
					i -= i_133_;
					i_133_ -= i_132_;
					i_132_ *= aClass544_7565.anInt7255;
					while (--i_133_ >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_134_ >> 12) - 1, (i_135_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
							return false;
						i_134_ += i_147_;
						i_135_ += i_148_;
						i_138_ += i_152_;
						i_132_ += aClass544_7565.anInt7255;
					}
					while (--i >= 0) {
						if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_134_ >> 12) - 1, (i_136_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
							return false;
						i_134_ += i_147_;
						i_136_ += i_149_;
						i_138_ += i_152_;
						i_132_ += aClass544_7565.anInt7255;
					}
					return true;
				}
				i -= i_133_;
				i_133_ -= i_132_;
				i_132_ *= aClass544_7565.anInt7255;
				while (--i_133_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_135_ >> 12) - 1, (i_134_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_134_ += i_147_;
					i_135_ += i_148_;
					i_138_ += i_152_;
					i_132_ += aClass544_7565.anInt7255;
				}
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_136_ >> 12) - 1, (i_134_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_134_ += i_147_;
					i_136_ += i_149_;
					i_138_ += i_152_;
					i_132_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_136_ = i_135_ <<= 12;
			if (i_132_ < 0) {
				i_136_ -= i_147_ * i_132_;
				i_135_ -= i_148_ * i_132_;
				i_138_ -= i_152_ * i_132_;
				i_132_ = 0;
			}
			i_134_ <<= 12;
			if (i < 0) {
				i_134_ -= i_149_ * i;
				i = 0;
			}
			if (i_147_ < i_148_) {
				i_133_ -= i;
				i -= i_132_;
				i_132_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_136_ >> 12) - 1, (i_135_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_136_ += i_147_;
					i_135_ += i_148_;
					i_138_ += i_152_;
					i_132_ += aClass544_7565.anInt7255;
				}
				while (--i_133_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_134_ >> 12) - 1, (i_135_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_134_ += i_149_;
					i_135_ += i_148_;
					i_138_ += i_152_;
					i_132_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_133_ -= i;
			i -= i_132_;
			i_132_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_135_ >> 12) - 1, (i_136_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_136_ += i_147_;
				i_135_ += i_148_;
				i_138_ += i_152_;
				i_132_ += aClass544_7565.anInt7255;
			}
			while (--i_133_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_132_, 0, (i_135_ >> 12) - 1, (i_134_ >> 12) + 1, i_138_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_134_ += i_149_;
				i_135_ += i_148_;
				i_138_ += i_152_;
				i_132_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		if (i_133_ >= aClass544_7565.anInt7278)
			return true;
		if (i > aClass544_7565.anInt7278)
			i = aClass544_7565.anInt7278;
		if (i_132_ > aClass544_7565.anInt7278)
			i_132_ = aClass544_7565.anInt7278;
		i_139_ = (i_139_ << 8) - i_151_ * i_136_ + i_151_;
		if (i < i_132_) {
			i_135_ = i_136_ <<= 12;
			if (i_133_ < 0) {
				i_135_ -= i_148_ * i_133_;
				i_136_ -= i_149_ * i_133_;
				i_139_ -= i_152_ * i_133_;
				i_133_ = 0;
			}
			i_134_ <<= 12;
			if (i < 0) {
				i_134_ -= i_147_ * i;
				i = 0;
			}
			if (i_148_ < i_149_) {
				i_132_ -= i;
				i -= i_133_;
				i_133_ *= aClass544_7565.anInt7255;
				while (--i >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_135_ >> 12) - 1, (i_136_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_135_ += i_148_;
					i_136_ += i_149_;
					i_139_ += i_152_;
					i_133_ += aClass544_7565.anInt7255;
				}
				while (--i_132_ >= 0) {
					if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_135_ >> 12) - 1, (i_134_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
						return false;
					i_135_ += i_148_;
					i_134_ += i_147_;
					i_139_ += i_152_;
					i_133_ += aClass544_7565.anInt7255;
				}
				return true;
			}
			i_132_ -= i;
			i -= i_133_;
			i_133_ *= aClass544_7565.anInt7255;
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_136_ >> 12) - 1, (i_135_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_135_ += i_148_;
				i_136_ += i_149_;
				i_139_ += i_152_;
				i_133_ += aClass544_7565.anInt7255;
			}
			while (--i_132_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_134_ >> 12) - 1, (i_135_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_135_ += i_148_;
				i_134_ += i_147_;
				i_139_ += i_152_;
				i_133_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i_134_ = i_136_ <<= 12;
		if (i_133_ < 0) {
			i_134_ -= i_148_ * i_133_;
			i_136_ -= i_149_ * i_133_;
			i_139_ -= i_152_ * i_133_;
			i_133_ = 0;
		}
		i_135_ <<= 12;
		if (i_132_ < 0) {
			i_135_ -= i_147_ * i_132_;
			i_132_ = 0;
		}
		if (i_148_ < i_149_) {
			i -= i_132_;
			i_132_ -= i_133_;
			i_133_ *= aClass544_7565.anInt7255;
			while (--i_132_ >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_134_ >> 12) - 1, (i_136_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_134_ += i_148_;
				i_136_ += i_149_;
				i_139_ += i_152_;
				i_133_ += aClass544_7565.anInt7255;
			}
			while (--i >= 0) {
				if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_135_ >> 12) - 1, (i_136_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
					return false;
				i_135_ += i_147_;
				i_136_ += i_149_;
				i_139_ += i_152_;
				i_133_ += aClass544_7565.anInt7255;
			}
			return true;
		}
		i -= i_132_;
		i_132_ -= i_133_;
		i_133_ *= aClass544_7565.anInt7255;
		while (--i_132_ >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_136_ >> 12) - 1, (i_134_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
				return false;
			i_134_ += i_148_;
			i_136_ += i_149_;
			i_139_ += i_152_;
			i_133_ += aClass544_7565.anInt7255;
		}
		while (--i >= 0) {
			if (!method9469(aClass544_7565.anIntArray7273, i_133_, 0, (i_136_ >> 12) - 1, (i_135_ >> 12) + 1, i_139_, i_151_, aClass544_7565.anInt7255))
				return false;
			i_135_ += i_147_;
			i_136_ += i_149_;
			i_139_ += i_152_;
			i_133_ += aClass544_7565.anInt7255;
		}
		return true;
	}

	final boolean method9475(int[] is, int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_) {
		if (i_155_ > i_158_)
			i_155_ = i_158_;
		if (i_154_ < 0)
			i_154_ = 0;
		if (i_154_ >= i_155_)
			return true;
		i += i_154_ - 1;
		i_153_ = i_155_ - i_154_ >> 2;
		i_156_ += i_157_ * i_154_;
		if (anInt7571 == 1) {
			anInt7572 += i_153_;
			while (--i_153_ >= 0) {
				if (i_156_ < is[++i])
					is[i] = i_156_;
				i_156_ += i_157_;
				if (i_156_ < is[++i])
					is[i] = i_156_;
				i_156_ += i_157_;
				if (i_156_ < is[++i])
					is[i] = i_156_;
				i_156_ += i_157_;
				if (i_156_ < is[++i])
					is[i] = i_156_;
				i_156_ += i_157_;
			}
			i_153_ = i_155_ - i_154_ & 0x3;
			while (--i_153_ >= 0) {
				if (i_156_ < is[++i])
					is[i] = i_156_;
				i_156_ += i_157_;
			}
		} else {
			i_156_ -= 38400;
			while (--i_153_ >= 0) {
				if (i_156_ < is[++i])
					return false;
				i_156_ += i_157_;
				if (i_156_ < is[++i])
					return false;
				i_156_ += i_157_;
				if (i_156_ < is[++i])
					return false;
				i_156_ += i_157_;
				if (i_156_ < is[++i])
					return false;
				i_156_ += i_157_;
			}
			i_153_ = i_155_ - i_154_ & 0x3;
			while (--i_153_ >= 0) {
				if (i_156_ < is[++i])
					return false;
				i_156_ += i_157_;
			}
		}
		return true;
	}
}
