/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class Class516 {
	int anInt7046;
	int anInt7047;
	int anInt7048 = 0;
	OutputStream anOutputStream7049;
	byte[] aByteArray7050;
	static Class545 aClass545_7051;

	public byte method8595(int i) {
		int i_0_ = anInt7047 * 795792175 - i - 1;
		if (i_0_ < 0)
			i_0_ += 1243272293 * anInt7048;
		return aByteArray7050[i_0_];
	}

	public void method8596() throws IOException {
		method8600(-413808287);
		anOutputStream7049 = null;
	}

	public void method8597(byte i) throws IOException {
		aByteArray7050[(anInt7047 += 419779535) * 795792175 - 1] = i;
		if (anInt7047 * 795792175 >= anInt7048 * 1243272293)
			method8600(-1054759494);
	}

	public void method8598(byte i) throws IOException {
		aByteArray7050[(anInt7047 += 419779535) * 795792175 - 1] = i;
		if (anInt7047 * 795792175 >= anInt7048 * 1243272293)
			method8600(-587752896);
	}

	public void method8599(boolean bool, int i) {
		if (!bool) {
			anInt7046 = 0;
			anInt7047 = 0;
		}
	}

	public void method8600(int i) throws IOException {
		int i_1_ = anInt7047 * 795792175 - -484306319 * anInt7046;
		if (0 != i_1_) {
			anOutputStream7049.write(aByteArray7050, -484306319 * anInt7046, i_1_);
			if (795792175 * anInt7047 >= 1243272293 * anInt7048)
				anInt7047 = 0;
			anInt7046 = anInt7047 * 1276956575;
		}
	}

	public void method8601(int i, int i_2_, byte i_3_) throws IOException {
		int i_4_ = anInt7047 * 795792175 - i - 1;
		if (i_4_ < 0)
			i_4_ += anInt7048 * 1243272293;
		for (/**/; i_2_ != 0; i_2_--) {
			if (i_4_ >= 1243272293 * anInt7048)
				i_4_ = 0;
			aByteArray7050[(anInt7047 += 419779535) * 795792175 - 1] = aByteArray7050[i_4_++];
			if (795792175 * anInt7047 >= anInt7048 * 1243272293)
				method8600(-1975527320);
		}
	}

	public void method8602(byte i, int i_5_) throws IOException {
		aByteArray7050[(anInt7047 += 419779535) * 795792175 - 1] = i;
		if (anInt7047 * 795792175 >= anInt7048 * 1243272293)
			method8600(-1676179451);
	}

	public byte method8603(int i, byte i_6_) {
		int i_7_ = anInt7047 * 795792175 - i - 1;
		if (i_7_ < 0)
			i_7_ += 1243272293 * anInt7048;
		return aByteArray7050[i_7_];
	}

	public void method8604(int i) {
		if (aByteArray7050 == null || i != 1243272293 * anInt7048)
			aByteArray7050 = new byte[i];
		anInt7048 = i * 736214381;
		anInt7047 = 0;
		anInt7046 = 0;
	}

	public void method8605(int i) {
		if (aByteArray7050 == null || i != 1243272293 * anInt7048)
			aByteArray7050 = new byte[i];
		anInt7048 = i * 736214381;
		anInt7047 = 0;
		anInt7046 = 0;
	}

	public void method8606(int i) {
		if (aByteArray7050 == null || i != 1243272293 * anInt7048)
			aByteArray7050 = new byte[i];
		anInt7048 = i * 736214381;
		anInt7047 = 0;
		anInt7046 = 0;
	}

	public void method8607(int i) {
		if (aByteArray7050 == null || i != 1243272293 * anInt7048)
			aByteArray7050 = new byte[i];
		anInt7048 = i * 736214381;
		anInt7047 = 0;
		anInt7046 = 0;
	}

	public void method8608(OutputStream outputstream) throws IOException {
		method8615(2118763658);
		anOutputStream7049 = outputstream;
	}

	public void method8609(OutputStream outputstream) throws IOException {
		method8615(2135649930);
		anOutputStream7049 = outputstream;
	}

	public void method8610(OutputStream outputstream, int i) throws IOException {
		method8615(2113641890);
		anOutputStream7049 = outputstream;
	}

	public void method8611(OutputStream outputstream) throws IOException {
		method8615(2104904615);
		anOutputStream7049 = outputstream;
	}

	public void method8612() throws IOException {
		method8600(-1828992679);
		anOutputStream7049 = null;
	}

	public void method8613(boolean bool) {
		if (!bool) {
			anInt7046 = 0;
			anInt7047 = 0;
		}
	}

	public void method8614(boolean bool) {
		if (!bool) {
			anInt7046 = 0;
			anInt7047 = 0;
		}
	}

	public void method8615(int i) throws IOException {
		method8600(-829459142);
		anOutputStream7049 = null;
	}

	public void method8616() throws IOException {
		int i = anInt7047 * 795792175 - -484306319 * anInt7046;
		if (0 != i) {
			anOutputStream7049.write(aByteArray7050, -484306319 * anInt7046, i);
			if (795792175 * anInt7047 >= 1243272293 * anInt7048)
				anInt7047 = 0;
			anInt7046 = anInt7047 * 1276956575;
		}
	}

	public void method8617() throws IOException {
		int i = anInt7047 * 795792175 - -484306319 * anInt7046;
		if (0 != i) {
			anOutputStream7049.write(aByteArray7050, -484306319 * anInt7046, i);
			if (795792175 * anInt7047 >= 1243272293 * anInt7048)
				anInt7047 = 0;
			anInt7046 = anInt7047 * 1276956575;
		}
	}

	public void method8618(int i, byte i_8_) {
		if (aByteArray7050 == null || i != 1243272293 * anInt7048)
			aByteArray7050 = new byte[i];
		anInt7048 = i * 736214381;
		anInt7047 = 0;
		anInt7046 = 0;
	}

	public static boolean method8619(CharSequence charsequence, int i) {
		return Class287.method5158(charsequence, 10, true, 686124855);
	}

	static final void method8620(Class669 class669, short i) {
		class669.anInt8558 -= -17422498;
	}

	static final void method8621(byte i) {
		int i_9_ = -1591408128 * Class548.anInt7322 + 256;
		int i_10_ = Class144.anInt1695 * 1329803776 + 256;
		int i_11_ = (Class53_Sub17.method17220(i_9_, i_10_, -860310981 * Class222.anInt2334, 967987830) - -1707405435 * Class700.anInt8780);
		if (Class170.anInt1834 * -1774497623 >= 100) {
			Class77.anInt858 = 522204416 + Class548.anInt7322 * 871043584;
			Class497.anInt5563 = -1673411328 + Class144.anInt1695 * -2040038912;
			Class285.anInt3085 = (Class53_Sub17.method17220(Class77.anInt858 * 760427037, Class497.anInt5563 * -1221225203, -860310981 * Class222.anInt2334, 543431489) - -1707405435 * Class700.anInt8780) * 1059489463;
		} else {
			if (760427037 * Class77.anInt858 < i_9_) {
				Class77.anInt858 += -568385483 * ((Class170.anInt1834 * -1774497623 * (i_9_ - 760427037 * Class77.anInt858) / 1000) + Class382.anInt3963 * 706340843);
				if (760427037 * Class77.anInt858 > i_9_)
					Class77.anInt858 = -568385483 * i_9_;
			}
			if (760427037 * Class77.anInt858 > i_9_) {
				Class77.anInt858 -= -568385483 * (((Class77.anInt858 * 760427037 - i_9_) * (Class170.anInt1834 * -1774497623) / 1000) + 706340843 * Class382.anInt3963);
				if (Class77.anInt858 * 760427037 < i_9_)
					Class77.anInt858 = i_9_ * -568385483;
			}
			if (805779207 * Class285.anInt3085 < i_11_) {
				Class285.anInt3085 += (1059489463 * ((-1774497623 * Class170.anInt1834 * (i_11_ - Class285.anInt3085 * 805779207) / 1000) + Class382.anInt3963 * 706340843));
				if (805779207 * Class285.anInt3085 > i_11_)
					Class285.anInt3085 = i_11_ * 1059489463;
			}
			if (Class285.anInt3085 * 805779207 > i_11_) {
				Class285.anInt3085 -= 1059489463 * (706340843 * Class382.anInt3963 + (-1774497623 * Class170.anInt1834 * (805779207 * Class285.anInt3085 - i_11_) / 1000));
				if (Class285.anInt3085 * 805779207 < i_11_)
					Class285.anInt3085 = 1059489463 * i_11_;
			}
			if (Class497.anInt5563 * -1221225203 < i_10_) {
				Class497.anInt5563 += ((Class170.anInt1834 * -1774497623 * (i_10_ - Class497.anInt5563 * -1221225203) / 1000) + 706340843 * Class382.anInt3963) * -1449377339;
				if (Class497.anInt5563 * -1221225203 > i_10_)
					Class497.anInt5563 = -1449377339 * i_10_;
			}
			if (Class497.anInt5563 * -1221225203 > i_10_) {
				Class497.anInt5563 -= (((Class497.anInt5563 * -1221225203 - i_10_) * (Class170.anInt1834 * -1774497623) / 1000) + Class382.anInt3963 * 706340843) * -1449377339;
				if (-1221225203 * Class497.anInt5563 < i_10_)
					Class497.anInt5563 = -1449377339 * i_10_;
			}
		}
		i_9_ = Class602.anInt7934 * 84135424 + 256;
		i_10_ = 256 + Class42.anInt564 * -697898496;
		i_11_ = (Class53_Sub17.method17220(i_9_, i_10_, -860310981 * Class222.anInt2334, -57075073) - Class290.anInt3146 * 1734327845);
		int i_12_ = i_9_ - Class77.anInt858 * 760427037;
		int i_13_ = i_11_ - 805779207 * Class285.anInt3085;
		int i_14_ = i_10_ - Class497.anInt5563 * -1221225203;
		int i_15_ = (int) Math.sqrt((double) (i_12_ * i_12_ + i_14_ * i_14_));
		int i_16_ = ((int) (Math.atan2((double) i_13_, (double) i_15_) * 2607.5945876176133) & 0x3fff);
		int i_17_ = ((int) (Math.atan2((double) i_12_, (double) i_14_) * -2607.5945876176133) & 0x3fff);
		if (i_16_ < 1024)
			i_16_ = 1024;
		if (i_16_ > 3072)
			i_16_ = 3072;
		if (1555328683 * Class678.anInt8639 < i_16_) {
			Class678.anInt8639 += ((((i_16_ - 1555328683 * Class678.anInt8639 >> 3) * (-103936137 * Class277.anInt3030) / 1000) + 31188739 * Class168.anInt1801) << 3) * 1767382019;
			if (Class678.anInt8639 * 1555328683 > i_16_)
				Class678.anInt8639 = i_16_ * 1767382019;
		}
		if (Class678.anInt8639 * 1555328683 > i_16_) {
			Class678.anInt8639 -= ((Class168.anInt1801 * 31188739 + (Class277.anInt3030 * -103936137 * (Class678.anInt8639 * 1555328683 - i_16_ >> 3) / 1000)) << 3) * 1767382019;
			if (Class678.anInt8639 * 1555328683 < i_16_)
				Class678.anInt8639 = 1767382019 * i_16_;
		}
		int i_18_ = i_17_ - 325333285 * Class424.anInt4817;
		if (i_18_ > 8192)
			i_18_ -= 16384;
		if (i_18_ < -8192)
			i_18_ += 16384;
		i_18_ >>= 3;
		if (i_18_ > 0) {
			Class424.anInt4817 += -1709276499 * ((i_18_ * (Class277.anInt3030 * -103936137) / 1000) + Class168.anInt1801 * 31188739 << 3);
			Class424.anInt4817 = -1709276499 * (325333285 * Class424.anInt4817 & 0x3fff);
		}
		if (i_18_ < 0) {
			Class424.anInt4817 -= (-1709276499 * ((Class168.anInt1801 * 31188739 + -103936137 * Class277.anInt3030 * -i_18_ / 1000) << 3));
			Class424.anInt4817 = (325333285 * Class424.anInt4817 & 0x3fff) * -1709276499;
		}
		int i_19_ = i_17_ - 325333285 * Class424.anInt4817;
		if (i_19_ > 8192)
			i_19_ -= 16384;
		if (i_19_ < -8192)
			i_19_ += 16384;
		if (i_19_ < 0 && i_18_ > 0 || i_19_ > 0 && i_18_ < 0)
			Class424.anInt4817 = -1709276499 * i_17_;
		Class248.anInt2491 = 0;
	}

	static final void method8622(Class669 class669, int i) throws Exception_Sub7 {
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5321((byte) 97);
	}
}
