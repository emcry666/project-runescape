/* Class523_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class Class523_Sub34 extends Class523 {
	static final int anInt10656 = -306674912;
	public static final int anInt10657 = 5000;
	public byte[] aByteArray10658;
	public static final int anInt10659 = 100;
	static int[] anIntArray10660 = new int[256];
	public int anInt10661;
	public static long[] aLongArray10662;
	static final long aLong10663 = -3932672073523589310L;

	public int method16257() {
		if (aByteArray10658[anInt10661 * 2349011] < 0)
			return readUnsignedInt((byte) -127) & 0x7fffffff;
		int i = readUnsignedShort(-159212153);
		if (i == 32767)
			return -1;
		return i;
	}

	public void method16258(BigInteger biginteger, BigInteger biginteger_0_) {
		int i = 2349011 * anInt10661;
		anInt10661 = 0;
		byte[] is = new byte[i];
		method16298(is, 0, i, (byte) 10);
		BigInteger biginteger_1_ = new BigInteger(is);
		BigInteger biginteger_2_ = biginteger_1_.modPow(biginteger, biginteger_0_);
		byte[] is_3_ = biginteger_2_.toByteArray();
		anInt10661 = 0;
		writeShort(is_3_.length, (byte) -34);
		readBytes(is_3_, 0, is_3_.length, (short) -13971);
	}

	public Class523_Sub34(byte[] is) {
		aByteArray10658 = is;
		anInt10661 = 0;
	}

	public int method16259() {
		return (128 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public void writeByte(int i, int i_4_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void writeShort(int i, byte i_5_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16262(int i, int i_6_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void method16263(int[] is, int i, int i_7_, byte i_8_) {
		int i_9_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_10_ = (i_7_ - i) / 8;
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			int i_12_ = readUnsignedInt((byte) -42);
			int i_13_ = readUnsignedInt((byte) 0);
			int i_14_ = 0;
			int i_15_ = -1640531527;
			int i_16_ = 32;
			while (i_16_-- > 0) {
				i_12_ += (i_13_ + (i_13_ << 4 ^ i_13_ >>> 5) ^ is[i_14_ & 0x3] + i_14_);
				i_14_ += i_15_;
				i_13_ += (i_12_ + (i_12_ << 4 ^ i_12_ >>> 5) ^ i_14_ + is[i_14_ >>> 11 & 0x3]);
			}
			anInt10661 -= 1518125784;
			writeInt(i_12_, -798548499);
			writeInt(i_13_, -776304083);
		}
		anInt10661 = 189765723 * i_9_;
	}

	public void method16264(CharSequence charsequence) {
		int i = Class526.method8726(charsequence, (byte) -76);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		method16280(i, 1375394696);
		anInt10661 += Class225.method4158(aByteArray10658, anInt10661 * 2349011, charsequence, (byte) 120) * 189765723;
	}

	public void method16265(int i, short i_17_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	public void method16266(String string, int i) {
		int i_18_ = string.indexOf('\0');
		if (i_18_ >= 0)
			throw new IllegalArgumentException("");
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		anInt10661 += Class506.method8500(string, 0, string.length(), aByteArray10658, anInt10661 * 2349011, 1385450825) * 189765723;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
	}

	public long method16267(int i, int i_19_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_20_ = 8 * i;
		long l = 0L;
		for (/**/; i_20_ >= 0; i_20_ -= 8)
			l |= ((long) (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]) & 0xffL) << i_20_;
		return l;
	}

	public int method16268(int i) {
		anInt10661 += 379531446;
		int i_21_ = (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 1] - 128 & 0xff));
		if (i_21_ > 32767)
			i_21_ -= 65536;
		return i_21_;
	}

	public void method16269(long l, int i, byte i_22_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_23_ = i * 8; i_23_ >= 0; i_23_ -= 8)
			aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> i_23_);
	}

	public void method16270(String string, byte i) {
		int i_24_ = string.indexOf('\0');
		if (i_24_ >= 0)
			throw new IllegalArgumentException("");
		anInt10661 += Class506.method8500(string, 0, string.length(), aByteArray10658, 2349011 * anInt10661, 1329667709) * 189765723;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
	}

	public int method16271() {
		anInt10661 += 379531446;
		int i = (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 1] - 128 & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public void method16272(CharSequence charsequence, int i) {
		int i_25_ = Class526.method8726(charsequence, (byte) -42);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		method16280(i_25_, -1562321700);
		anInt10661 += Class225.method4158(aByteArray10658, anInt10661 * 2349011, charsequence, (byte) 3) * 189765723;
	}

	public boolean method16273() {
		anInt10661 -= 759062892;
		int i = Class393.method6497(aByteArray10658, 0, anInt10661 * 2349011, 1600921405);
		int i_26_ = readUnsignedInt((byte) -99);
		if (i == i_26_)
			return true;
		return false;
	}

	public byte method16274() {
		return (byte) (0 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public void method16275(int i, int i_27_) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		aByteArray10658[anInt10661 * 2349011 - i - 2] = (byte) (i >> 8);
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public void method16276(int i, int i_28_) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public void method16277(int i, byte i_29_) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, -325592920);
		else if (i < 16384 && i >= -16384)
			writeShort(49152 + i, (byte) -38);
		else
			throw new IllegalArgumentException();
	}

	public void method16278(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void readBytes(byte[] is, int i, int i_30_, short i_31_) {
		for (int i_32_ = i; i_32_ < i + i_30_; i_32_++)
			aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = is[i_32_];
	}

	void method16280(int i, int i_33_) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if (0 != (i & ~0x1fffff)) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, -525884490);
					writeByte(i >>> 21 | 0x80, 1894681897);
				}
				writeByte(i >>> 14 | 0x80, 2024638334);
			}
			writeByte(i >>> 7 | 0x80, -53179359);
		}
		writeByte(i & 0x7f, 321060201);
	}

	public int readUnsignedByte(int i) {
		return aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff;
	}

	public byte readByte(short i) {
		return aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public int readUnsignedShort(int i) {
		anInt10661 += 379531446;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8));
	}

	public int readShort(int i) {
		anInt10661 += 379531446;
		int i_34_ = (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 1] & 0xff));
		if (i_34_ > 32767)
			i_34_ -= 65536;
		return i_34_;
	}

	public int method16285() {
		anInt10661 += 379531446;
		return ((aByteArray10658[anInt10661 * 2349011 - 2] - 128 & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 8));
	}

	public int method16286(int i) {
		anInt10661 += 569297169;
		int i_35_ = ((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) << 8)));
		if (i_35_ > 8388607)
			i_35_ -= 16777216;
		return i_35_;
	}

	public int readUnsignedInt(byte i) {
		anInt10661 += 759062892;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 4] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8)));
	}

	public int method16288(int i) {
		anInt10661 += 759062892;
		return ((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 8) + (((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 16))));
	}

	public long method16289(byte i) {
		long l = (long) readUnsignedByte(924766167) & 0xffffffffL;
		long l_36_ = (long) readUnsignedInt((byte) -104) & 0xffffffffL;
		return l_36_ + (l << 32);
	}

	public void method16290(Class523_Sub34 class523_sub34_37_, int i) {
		readBytes(class523_sub34_37_.aByteArray10658, 0, 2349011 * class523_sub34_37_.anInt10661, (short) -10582);
	}

	public long method16291(short i) {
		long l = (long) readUnsignedShort(-731089421) & 0xffffffffL;
		long l_38_ = (long) readUnsignedInt((byte) -38) & 0xffffffffL;
		return l_38_ + (l << 32);
	}

	public void method16292(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public float method16293(int i) {
		return Float.intBitsToFloat(readUnsignedInt((byte) -69));
	}

	public void method16294(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public String readString(int i) {
		int i_39_ = anInt10661 * 2349011;
		while (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] != 0) {
			/* empty */
		}
		int i_40_ = anInt10661 * 2349011 - i_39_ - 1;
		if (i_40_ == 0)
			return "";
		return Class651.method10636(aByteArray10658, i_39_, i_40_, -1210151419);
	}

	public int readUnsignedByte128(int i) {
		return (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - 128 & 0xff);
	}

	public String method16297(short i) {
		byte i_41_ = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
		if (0 != i_41_)
			throw new IllegalStateException("");
		int i_42_ = method16410(-1400658994);
		if (i_42_ + 2349011 * anInt10661 > aByteArray10658.length)
			throw new IllegalStateException("");
		String string = Class254.method4549(aByteArray10658, anInt10661 * 2349011, i_42_, 1489636786);
		anInt10661 += i_42_ * 189765723;
		return string;
	}

	public void method16298(byte[] is, int i, int i_43_, byte i_44_) {
		for (int i_45_ = i; i_45_ < i_43_ + i; i_45_++)
			is[i_45_] = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public byte readByte128(int i) {
		return (byte) (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - 128);
	}

	public byte method16300() {
		return (byte) (128 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public int method16301(short i) {
		int i_46_ = aByteArray10658[anInt10661 * 2349011] & 0xff;
		if (i_46_ < 128)
			return readUnsignedByte(-84404577) - 1;
		return readUnsignedShort(-750446994) - 32769;
	}

	public void method16302(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 56);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 48);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 40);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public int method16303(int i) {
		if (aByteArray10658[anInt10661 * 2349011] < 0)
			return readUnsignedInt((byte) -62) & 0x7fffffff;
		return readUnsignedShort(-1719715723);
	}

	public int readBigSmart(byte i) {
		if (aByteArray10658[anInt10661 * 2349011] < 0)
			return readUnsignedInt((byte) -29) & 0x7fffffff;
		int i_47_ = readUnsignedShort(-1571459195);
		if (i_47_ == 32767)
			return -1;
		return i_47_;
	}

	public long method16305(int i) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_48_ = 8 * i;
		long l = 0L;
		for (/**/; i_48_ >= 0; i_48_ -= 8)
			l |= ((long) (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]) & 0xffL) << i_48_;
		return l;
	}

	public int method16306(byte i) {
		int i_49_ = 0;
		int i_50_ = 0;
		int i_51_;
		do {
			i_51_ = readUnsignedByte(175328830);
			i_49_ |= (i_51_ & 0x7f) << i_50_;
			i_50_ += 7;
		} while (i_51_ > 127);
		return i_49_;
	}

	public void method16307(int[] is, int i) {
		int i_52_ = anInt10661 * 2349011 / 8;
		anInt10661 = 0;
		for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
			int i_54_ = readUnsignedInt((byte) -8);
			int i_55_ = readUnsignedInt((byte) -77);
			int i_56_ = 0;
			int i_57_ = -1640531527;
			int i_58_ = 32;
			while (i_58_-- > 0) {
				i_54_ += (i_55_ + (i_55_ << 4 ^ i_55_ >>> 5) ^ is[i_56_ & 0x3] + i_56_);
				i_56_ += i_57_;
				i_55_ += ((i_54_ << 4 ^ i_54_ >>> 5) + i_54_ ^ is[i_56_ >>> 11 & 0x3] + i_56_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_54_, -925510416);
			writeInt(i_55_, -1225493996);
		}
	}

	public void method16308(int[] is, byte i) {
		int i_59_ = 2349011 * anInt10661 / 8;
		anInt10661 = 0;
		for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
			int i_61_ = readUnsignedInt((byte) -61);
			int i_62_ = readUnsignedInt((byte) -68);
			int i_63_ = -957401312;
			int i_64_ = -1640531527;
			int i_65_ = 32;
			while (i_65_-- > 0) {
				i_62_ -= (i_61_ + (i_61_ << 4 ^ i_61_ >>> 5) ^ i_63_ + is[i_63_ >>> 11 & 0x3]);
				i_63_ -= i_64_;
				i_61_ -= ((i_62_ << 4 ^ i_62_ >>> 5) + i_62_ ^ is[i_63_ & 0x3] + i_63_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_61_, -1437270575);
			writeInt(i_62_, -1009327414);
		}
	}

	public byte method16309() {
		return (byte) (0 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public void method16310(int[] is, int i, int i_66_, int i_67_) {
		int i_68_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_69_ = (i_66_ - i) / 8;
		for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
			int i_71_ = readUnsignedInt((byte) -56);
			int i_72_ = readUnsignedInt((byte) -124);
			int i_73_ = -957401312;
			int i_74_ = -1640531527;
			int i_75_ = 32;
			while (i_75_-- > 0) {
				i_72_ -= (i_71_ + (i_71_ << 4 ^ i_71_ >>> 5) ^ i_73_ + is[i_73_ >>> 11 & 0x3]);
				i_73_ -= i_74_;
				i_71_ -= (i_72_ + (i_72_ << 4 ^ i_72_ >>> 5) ^ is[i_73_ & 0x3] + i_73_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_71_, -1710559439);
			writeInt(i_72_, -1999229222);
		}
		anInt10661 = i_68_ * 189765723;
	}

	public void method16311(BigInteger biginteger, BigInteger biginteger_76_, int i) {
		int i_77_ = 2349011 * anInt10661;
		anInt10661 = 0;
		byte[] is = new byte[i_77_];
		method16298(is, 0, i_77_, (byte) 105);
		BigInteger biginteger_78_ = new BigInteger(is);
		BigInteger biginteger_79_ = biginteger_78_.modPow(biginteger, biginteger_76_);
		byte[] is_80_ = biginteger_79_.toByteArray();
		anInt10661 = 0;
		writeShort(is_80_.length, (byte) -78);
		readBytes(is_80_, 0, is_80_.length, (short) -27854);
	}

	public int method16312(int i, int i_81_) {
		int i_82_ = Class393.method6497(aByteArray10658, i, 2349011 * anInt10661, 1553767654);
		writeInt(i_82_, -2038497116);
		return i_82_;
	}

	public boolean method16313(int i) {
		anInt10661 -= 759062892;
		int i_83_ = Class393.method6497(aByteArray10658, 0, anInt10661 * 2349011, 1458049569);
		int i_84_ = readUnsignedInt((byte) -32);
		if (i_83_ == i_84_)
			return true;
		return false;
	}

	public void method16314(int i, byte i_85_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (128 + i);
	}

	public int method16315() {
		return (0 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public void write128Byte(int i, int i_86_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (128 - i);
	}

	public void method16317(int i, short i_87_) {
		if (i >= 0 && i < 128)
			writeByte(i, 1629510919);
		else if (i >= 0 && i < 32768)
			writeShort(32768 + i, (byte) -94);
		else
			throw new IllegalArgumentException();
	}

	public int method16318() {
		anInt10661 += 759062892;
		return ((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 8) + (((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 16))));
	}

	public void method16319(byte[] is, int i, int i_88_) {
		for (int i_89_ = i; i_89_ < i_88_ + i; i_89_++)
			is[i_89_] = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public void method16320(String string) {
		int i = string.indexOf('\0');
		if (i >= 0)
			throw new IllegalArgumentException("");
		anInt10661 += Class506.method8500(string, 0, string.length(), aByteArray10658, 2349011 * anInt10661, 2106524053) * 189765723;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
	}

	public byte readByteC(int i) {
		return (byte) (0 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public byte read128Byte(int i) {
		return (byte) (128 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public void writeShortLE(int i, byte i_90_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void writeIntLE(int i, int i_91_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	public int method16325() {
		anInt10661 += 379531446;
		return ((aByteArray10658[2349011 * anInt10661 - 1] - 128 & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8));
	}

	public int readUnsignedShortLE(byte i) {
		anInt10661 += 379531446;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 2] & 0xff));
	}

	public int readUnsignedShort128(short i) {
		anInt10661 += 379531446;
		return ((aByteArray10658[2349011 * anInt10661 - 1] - 128 & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8));
	}

	public int readUnsignedShortLE128(int i) {
		anInt10661 += 379531446;
		return ((aByteArray10658[anInt10661 * 2349011 - 2] - 128 & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 8));
	}

	public int readUnsignedShortLE(int i) {
		anInt10661 += 379531446;
		int i_92_ = ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 8));
		if (i_92_ > 32767)
			i_92_ -= 65536;
		return i_92_;
	}

	public void method16330(int i, byte i_93_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public long method16331() {
		long l = (long) readUnsignedInt((byte) -78) & 0xffffffffL;
		long l_94_ = (long) readUnsignedInt((byte) -88) & 0xffffffffL;
		return (l << 32) + l_94_;
	}

	public void method16332(int i, byte i_95_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void method16333(int i, byte i_96_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public int method16334(byte i) {
		anInt10661 += 569297169;
		return (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 16) + (aByteArray10658[2349011 * anInt10661 - 3] & 0xff));
	}

	public void method16335(long l, int i) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_97_ = i * 8; i_97_ >= 0; i_97_ -= 8)
			aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> i_97_);
	}

	public void writeIntV1(int i, byte i_98_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
	}

	public void writeIntV2(int i, int i_99_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public int readUnsignedIntLE(short i) {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 4] & 0xff));
	}

	public static int method16339(String string) {
		return string.length() + 1;
	}

	public int readUnsignedIntV2(short i) {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 24)) + (aByteArray10658[anInt10661 * 2349011 - 2] & 0xff));
	}

	public void readBytesReversed(byte[] is, int i, int i_100_, int i_101_) {
		for (int i_102_ = i_100_ + i - 1; i_102_ >= i; i_102_--)
			is[i_102_] = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_103_ = i;
			for (int i_104_ = 0; i_104_ < 8; i_104_++) {
				if (1 == (i_103_ & 0x1))
					i_103_ = i_103_ >>> 1 ^ ~0x12477cdf;
				else
					i_103_ >>>= 1;
			}
			anIntArray10660[i] = i_103_;
		}
		aLongArray10662 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_105_ = 0; i_105_ < 8; i_105_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray10662[i] = l;
		}
	}

	static int method16342(byte[] is, int i, int i_106_) {
		int i_107_ = -1;
		for (int i_108_ = i; i_108_ < i_106_; i_108_++)
			i_107_ = i_107_ >>> 8 ^ anIntArray10660[(i_107_ ^ is[i_108_]) & 0xff];
		i_107_ ^= 0xffffffff;
		return i_107_;
	}

	public void writeInt(int i, int i_109_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public static int method16344(byte[] is, int i) {
		return Class393.method6497(is, 0, i, 1804019664);
	}

	public static int method16345(byte[] is, int i) {
		return Class393.method6497(is, 0, i, 1536476934);
	}

	public void method16346() {
		if (null != aByteArray10658)
			Class689.method13938(aByteArray10658, (byte) 23);
		aByteArray10658 = null;
	}

	public void method16347(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public int method16348() {
		anInt10661 += 759062892;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 4] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8)));
	}

	public void method16349(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	public int method16350() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 4] & 0xff));
	}

	public void method16351(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void method16352(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16353(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16354(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16355(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16356(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16357(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16358(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16359(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16360(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public void method16361(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	public void method16362(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	public String method16363(byte i) {
		if (aByteArray10658[anInt10661 * 2349011] == 0) {
			anInt10661 += 189765723;
			return null;
		}
		return readString(413032718);
	}

	public void method16364(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public void method16365(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public int method16366() {
		anInt10661 += 759062892;
		return ((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 8) + (((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 16))));
	}

	public void method16367(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 40);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public void method16368(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 40);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public void method16369(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public int readUnsignedByteC(int i) {
		return (0 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public int readUnsignedIntV1(int i) {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 8) + (((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 24)) + (aByteArray10658[2349011 * anInt10661 - 3] & 0xff));
	}

	public void method16372(long l, int i) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_110_ = i * 8; i_110_ >= 0; i_110_ -= 8)
			aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> i_110_);
	}

	public void writeShort128(int i, int i_111_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + 128);
	}

	public static int method16374(String string) {
		return string.length() + 1;
	}

	public byte method16375() {
		return (byte) (128 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public int method16376() {
		return (0 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public void method16377(String string) {
		int i = string.indexOf('\0');
		if (i >= 0)
			throw new IllegalArgumentException("");
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		anInt10661 += Class506.method8500(string, 0, string.length(), aByteArray10658, anInt10661 * 2349011, 1912721214) * 189765723;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
	}

	public void writeByteC(int i, byte i_112_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (0 - i);
	}

	public void method16379(CharSequence charsequence) {
		int i = Class526.method8726(charsequence, (byte) -78);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		method16280(i, 1818470416);
		anInt10661 += Class225.method4158(aByteArray10658, anInt10661 * 2349011, charsequence, (byte) 127) * 189765723;
	}

	public void method16380(CharSequence charsequence) {
		int i = Class526.method8726(charsequence, (byte) -91);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		method16280(i, -422938710);
		anInt10661 += Class225.method4158(aByteArray10658, anInt10661 * 2349011, charsequence, (byte) 92) * 189765723;
	}

	public int method16381() {
		anInt10661 += 759062892;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 4] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8)));
	}

	public void method16382(Class523_Sub34 class523_sub34_113_) {
		readBytes(class523_sub34_113_.aByteArray10658, 0, 2349011 * class523_sub34_113_.anInt10661, (short) -21317);
	}

	public void method16383(int i) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		aByteArray10658[anInt10661 * 2349011 - i - 2] = (byte) (i >> 8);
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public void method16384(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public void method16385(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public String readVersionedString(int i) {
		byte i_114_ = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
		if (i_114_ != 0)
			throw new IllegalStateException("");
		int i_115_ = 2349011 * anInt10661;
		while (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] != 0) {
			/* empty */
		}
		int i_116_ = 2349011 * anInt10661 - i_115_ - 1;
		if (0 == i_116_)
			return "";
		return Class651.method10636(aByteArray10658, i_115_, i_116_, -1210151419);
	}

	public void method16387(byte[] is, int i, int i_117_) {
		for (int i_118_ = i; i_118_ < i_117_ + i; i_118_++)
			is[i_118_] = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public void method16388(int i) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, -368492378);
		else if (i < 16384 && i >= -16384)
			writeShort(49152 + i, (byte) -20);
		else
			throw new IllegalArgumentException();
	}

	public void method16389(int i) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, 1856361057);
		else if (i < 16384 && i >= -16384)
			writeShort(49152 + i, (byte) -113);
		else
			throw new IllegalArgumentException();
	}

	public void method16390(int i) {
		if (i >= 0 && i < 128)
			writeByte(i, -62071974);
		else if (i >= 0 && i < 32768)
			writeShort(32768 + i, (byte) -23);
		else
			throw new IllegalArgumentException();
	}

	public void method16391(int i) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (-1 == i)
			writeShort(32767, (byte) -35);
		else if (i < 32767)
			writeShort(i, (byte) -88);
		else {
			writeInt(i, -1229599534);
			aByteArray10658[2349011 * anInt10661 - 4] |= 0x80;
		}
	}

	public void method16392(int i) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (-1 == i)
			writeShort(32767, (byte) -75);
		else if (i < 32767)
			writeShort(i, (byte) -87);
		else {
			writeInt(i, -686490843);
			aByteArray10658[2349011 * anInt10661 - 4] |= 0x80;
		}
	}

	void method16393(int i) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if (0 != (i & ~0x1fffff)) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, 2019966436);
					writeByte(i >>> 21 | 0x80, -1275663275);
				}
				writeByte(i >>> 14 | 0x80, 1120229898);
			}
			writeByte(i >>> 7 | 0x80, -341425733);
		}
		writeByte(i & 0x7f, 1193872547);
	}

	void method16394(int i) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if (0 != (i & ~0x1fffff)) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, -985260218);
					writeByte(i >>> 21 | 0x80, -414486213);
				}
				writeByte(i >>> 14 | 0x80, -742039845);
			}
			writeByte(i >>> 7 | 0x80, 647812148);
		}
		writeByte(i & 0x7f, 1578437145);
	}

	void method16395(int i) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if (0 != (i & ~0x1fffff)) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, -323989813);
					writeByte(i >>> 21 | 0x80, -1580401435);
				}
				writeByte(i >>> 14 | 0x80, -14937039);
			}
			writeByte(i >>> 7 | 0x80, 959324415);
		}
		writeByte(i & 0x7f, -2068349029);
	}

	public int method16396() {
		if (aByteArray10658[anInt10661 * 2349011] < 0)
			return readUnsignedInt((byte) -69) & 0x7fffffff;
		return readUnsignedShort(-1791191740);
	}

	public byte method16397() {
		return aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public byte method16398() {
		return aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public void method16399(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public int method16400() {
		anInt10661 += 379531446;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8));
	}

	public void writeShortLE128(int i, int i_119_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + 128);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public int method16402() {
		anInt10661 += 569297169;
		return ((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) + (((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) << 8)));
	}

	public int method16403() {
		anInt10661 += 569297169;
		return ((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) + (((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) << 8)));
	}

	public int readUnsignedSmart(int i) {
		int i_120_ = aByteArray10658[anInt10661 * 2349011] & 0xff;
		if (i_120_ < 128)
			return readUnsignedByte(1685223132);
		return readUnsignedShort(-760567243) - 32768;
	}

	public int method16405() {
		anInt10661 += 569297169;
		int i = ((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) << 8)));
		if (i > 8388607)
			i -= 16777216;
		return i;
	}

	public int method16406() {
		anInt10661 += 569297169;
		return ((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) + (((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) << 8)));
	}

	public int method16407() {
		anInt10661 += 759062892;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 4] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8)));
	}

	public void method16408(int i) {
		if (null != aByteArray10658)
			Class689.method13938(aByteArray10658, (byte) -75);
		aByteArray10658 = null;
	}

	public Class523_Sub34(int i, boolean bool) {
		aByteArray10658 = Class689.method13936(i, bool, 1905847317);
	}

	public void method16409(int i, int i_121_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
	}

	int method16410(int i) {
		int i_122_ = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
		int i_123_ = 0;
		for (/**/; i_122_ < 0; i_122_ = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1])
			i_123_ = (i_123_ | i_122_ & 0x7f) << 7;
		return i_123_ | i_122_;
	}

	public long method16411() {
		long l = (long) readUnsignedShort(-1236634100) & 0xffffffffL;
		long l_124_ = (long) readUnsignedInt((byte) -79) & 0xffffffffL;
		return l_124_ + (l << 32);
	}

	public long method16412() {
		long l = (long) readUnsignedShort(-2117979229) & 0xffffffffL;
		long l_125_ = (long) readUnsignedInt((byte) -76) & 0xffffffffL;
		return l_125_ + (l << 32);
	}

	public long method16413() {
		long l = (long) readUnsignedShort(-1028100043) & 0xffffffffL;
		long l_126_ = (long) readUnsignedInt((byte) -88) & 0xffffffffL;
		return l_126_ + (l << 32);
	}

	public int readUnsigned128Byte(int i) {
		return (128 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public String method16415() {
		int i = anInt10661 * 2349011;
		while (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] != 0) {
			/* empty */
		}
		int i_127_ = anInt10661 * 2349011 - i - 1;
		if (i_127_ == 0)
			return "";
		return Class651.method10636(aByteArray10658, i, i_127_, -1210151419);
	}

	public int method16416() {
		anInt10661 += 569297169;
		return (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 16) + (aByteArray10658[2349011 * anInt10661 - 3] & 0xff));
	}

	public long method16417() {
		long l = (long) readUnsignedInt((byte) -15) & 0xffffffffL;
		long l_128_ = (long) readUnsignedInt((byte) -21) & 0xffffffffL;
		return (l << 32) + l_128_;
	}

	public void method16418(int[] is) {
		int i = 2349011 * anInt10661 / 8;
		anInt10661 = 0;
		for (int i_129_ = 0; i_129_ < i; i_129_++) {
			int i_130_ = readUnsignedInt((byte) -115);
			int i_131_ = readUnsignedInt((byte) -93);
			int i_132_ = -957401312;
			int i_133_ = -1640531527;
			int i_134_ = 32;
			while (i_134_-- > 0) {
				i_131_ -= (i_130_ + (i_130_ << 4 ^ i_130_ >>> 5) ^ i_132_ + is[i_132_ >>> 11 & 0x3]);
				i_132_ -= i_133_;
				i_130_ -= ((i_131_ << 4 ^ i_131_ >>> 5) + i_131_ ^ is[i_132_ & 0x3] + i_132_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_130_, -1647266222);
			writeInt(i_131_, -1403271322);
		}
	}

	public void method16419(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (0 - i);
	}

	public float method16420() {
		return Float.intBitsToFloat(readUnsignedInt((byte) -77));
	}

	public String method16421() {
		if (aByteArray10658[anInt10661 * 2349011] == 0) {
			anInt10661 += 189765723;
			return null;
		}
		return readString(-706383967);
	}

	public String method16422() {
		if (aByteArray10658[anInt10661 * 2349011] == 0) {
			anInt10661 += 189765723;
			return null;
		}
		return readString(-1300174180);
	}

	public int method16423() {
		anInt10661 += 379531446;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8));
	}

	public String method16424() {
		int i = anInt10661 * 2349011;
		while (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] != 0) {
			/* empty */
		}
		int i_135_ = anInt10661 * 2349011 - i - 1;
		if (i_135_ == 0)
			return "";
		return Class651.method10636(aByteArray10658, i, i_135_, -1210151419);
	}

	public void method16425(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public String method16426() {
		byte i = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
		if (0 != i)
			throw new IllegalStateException("");
		int i_136_ = method16410(-1288386120);
		if (i_136_ + 2349011 * anInt10661 > aByteArray10658.length)
			throw new IllegalStateException("");
		String string = Class254.method4549(aByteArray10658, anInt10661 * 2349011, i_136_, 1975348658);
		anInt10661 += i_136_ * 189765723;
		return string;
	}

	public String method16427() {
		byte i = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
		if (0 != i)
			throw new IllegalStateException("");
		int i_137_ = method16410(-1813884311);
		if (i_137_ + 2349011 * anInt10661 > aByteArray10658.length)
			throw new IllegalStateException("");
		String string = Class254.method4549(aByteArray10658, anInt10661 * 2349011, i_137_, 1042039501);
		anInt10661 += i_137_ * 189765723;
		return string;
	}

	public void method16428(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 56);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 48);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 40);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public int method16429() {
		return (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - 128 & 0xff);
	}

	public void method16430(byte[] is, int i, int i_138_) {
		for (int i_139_ = i; i_139_ < i_138_ + i; i_139_++)
			is[i_139_] = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	public int method16431() {
		int i = aByteArray10658[2349011 * anInt10661] & 0xff;
		if (i < 128)
			return readUnsignedByte(-2111648948) - 64;
		return readUnsignedShort(-2059622501) - 49152;
	}

	public int method16432() {
		int i = aByteArray10658[anInt10661 * 2349011] & 0xff;
		if (i < 128)
			return readUnsignedByte(1316250677);
		return readUnsignedShort(-2115922038) - 32768;
	}

	public int method16433() {
		int i = aByteArray10658[anInt10661 * 2349011] & 0xff;
		if (i < 128)
			return readUnsignedByte(-1793857030);
		return readUnsignedShort(-2102348561) - 32768;
	}

	public int method16434() {
		int i = aByteArray10658[anInt10661 * 2349011] & 0xff;
		if (i < 128)
			return readUnsignedByte(-1092559158) - 1;
		return readUnsignedShort(-1518991560) - 32769;
	}

	public int method16435() {
		int i = aByteArray10658[anInt10661 * 2349011] & 0xff;
		if (i < 128)
			return readUnsignedByte(-636989548) - 1;
		return readUnsignedShort(-551954481) - 32769;
	}

	public void method16436(String string) {
		int i = string.indexOf('\0');
		if (i >= 0)
			throw new IllegalArgumentException("");
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		anInt10661 += Class506.method8500(string, 0, string.length(), aByteArray10658, anInt10661 * 2349011, 1375860329) * 189765723;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
	}

	public void method16437(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
	}

	int method16438() {
		int i = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
		int i_140_ = 0;
		for (/**/; i < 0; i = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1])
			i_140_ = (i_140_ | i & 0x7f) << 7;
		return i_140_ | i;
	}

	public int method16439() {
		int i = 0;
		int i_141_ = 0;
		int i_142_;
		do {
			i_142_ = readUnsignedByte(936283040);
			i |= (i_142_ & 0x7f) << i_141_;
			i_141_ += 7;
		} while (i_142_ > 127);
		return i;
	}

	public int method16440() {
		int i = 0;
		int i_143_ = 0;
		int i_144_;
		do {
			i_144_ = readUnsignedByte(-1146635670);
			i |= (i_144_ & 0x7f) << i_143_;
			i_143_ += 7;
		} while (i_144_ > 127);
		return i;
	}

	public void method16441(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 56);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 48);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 40);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public void method16442(int[] is) {
		int i = anInt10661 * 2349011 / 8;
		anInt10661 = 0;
		for (int i_145_ = 0; i_145_ < i; i_145_++) {
			int i_146_ = readUnsignedInt((byte) -71);
			int i_147_ = readUnsignedInt((byte) -126);
			int i_148_ = 0;
			int i_149_ = -1640531527;
			int i_150_ = 32;
			while (i_150_-- > 0) {
				i_146_ += (i_147_ + (i_147_ << 4 ^ i_147_ >>> 5) ^ is[i_148_ & 0x3] + i_148_);
				i_148_ += i_149_;
				i_147_ += ((i_146_ << 4 ^ i_146_ >>> 5) + i_146_ ^ is[i_148_ >>> 11 & 0x3] + i_148_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_146_, -1540964396);
			writeInt(i_147_, -831507267);
		}
	}

	public void method16443(int[] is) {
		int i = 2349011 * anInt10661 / 8;
		anInt10661 = 0;
		for (int i_151_ = 0; i_151_ < i; i_151_++) {
			int i_152_ = readUnsignedInt((byte) -113);
			int i_153_ = readUnsignedInt((byte) -33);
			int i_154_ = -957401312;
			int i_155_ = -1640531527;
			int i_156_ = 32;
			while (i_156_-- > 0) {
				i_153_ -= (i_152_ + (i_152_ << 4 ^ i_152_ >>> 5) ^ i_154_ + is[i_154_ >>> 11 & 0x3]);
				i_154_ -= i_155_;
				i_152_ -= ((i_153_ << 4 ^ i_153_ >>> 5) + i_153_ ^ is[i_154_ & 0x3] + i_154_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_152_, -674319427);
			writeInt(i_153_, -1103139870);
		}
	}

	public long method16444() {
		long l = (long) readUnsignedShort(-693539405) & 0xffffffffL;
		long l_157_ = (long) readUnsignedInt((byte) -117) & 0xffffffffL;
		return l_157_ + (l << 32);
	}

	public void method16445(int[] is) {
		int i = 2349011 * anInt10661 / 8;
		anInt10661 = 0;
		for (int i_158_ = 0; i_158_ < i; i_158_++) {
			int i_159_ = readUnsignedInt((byte) -23);
			int i_160_ = readUnsignedInt((byte) -89);
			int i_161_ = -957401312;
			int i_162_ = -1640531527;
			int i_163_ = 32;
			while (i_163_-- > 0) {
				i_160_ -= (i_159_ + (i_159_ << 4 ^ i_159_ >>> 5) ^ i_161_ + is[i_161_ >>> 11 & 0x3]);
				i_161_ -= i_162_;
				i_159_ -= ((i_160_ << 4 ^ i_160_ >>> 5) + i_160_ ^ is[i_161_ & 0x3] + i_161_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_159_, -1367196780);
			writeInt(i_160_, -1469664026);
		}
	}

	public int method16446() {
		return aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff;
	}

	public void method16447(int[] is, int i, int i_164_) {
		int i_165_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_166_ = (i_164_ - i) / 8;
		for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
			int i_168_ = readUnsignedInt((byte) -126);
			int i_169_ = readUnsignedInt((byte) -122);
			int i_170_ = 0;
			int i_171_ = -1640531527;
			int i_172_ = 32;
			while (i_172_-- > 0) {
				i_168_ += (i_169_ + (i_169_ << 4 ^ i_169_ >>> 5) ^ is[i_170_ & 0x3] + i_170_);
				i_170_ += i_171_;
				i_169_ += (i_168_ + (i_168_ << 4 ^ i_168_ >>> 5) ^ i_170_ + is[i_170_ >>> 11 & 0x3]);
			}
			anInt10661 -= 1518125784;
			writeInt(i_168_, -2052916765);
			writeInt(i_169_, -1501060523);
		}
		anInt10661 = 189765723 * i_165_;
	}

	public int method16448() {
		return (128 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public void method16449(int[] is) {
		int i = anInt10661 * 2349011 / 8;
		anInt10661 = 0;
		for (int i_173_ = 0; i_173_ < i; i_173_++) {
			int i_174_ = readUnsignedInt((byte) -91);
			int i_175_ = readUnsignedInt((byte) -114);
			int i_176_ = 0;
			int i_177_ = -1640531527;
			int i_178_ = 32;
			while (i_178_-- > 0) {
				i_174_ += (i_175_ + (i_175_ << 4 ^ i_175_ >>> 5) ^ is[i_176_ & 0x3] + i_176_);
				i_176_ += i_177_;
				i_175_ += ((i_174_ << 4 ^ i_174_ >>> 5) + i_174_ ^ is[i_176_ >>> 11 & 0x3] + i_176_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_174_, -1003726314);
			writeInt(i_175_, -1555472553);
		}
	}

	public void method16450(int[] is, int i, int i_179_) {
		int i_180_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_181_ = (i_179_ - i) / 8;
		for (int i_182_ = 0; i_182_ < i_181_; i_182_++) {
			int i_183_ = readUnsignedInt((byte) -35);
			int i_184_ = readUnsignedInt((byte) -84);
			int i_185_ = -957401312;
			int i_186_ = -1640531527;
			int i_187_ = 32;
			while (i_187_-- > 0) {
				i_184_ -= (i_183_ + (i_183_ << 4 ^ i_183_ >>> 5) ^ i_185_ + is[i_185_ >>> 11 & 0x3]);
				i_185_ -= i_186_;
				i_183_ -= (i_184_ + (i_184_ << 4 ^ i_184_ >>> 5) ^ is[i_185_ & 0x3] + i_185_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_183_, -1266045560);
			writeInt(i_184_, -2113554642);
		}
		anInt10661 = i_180_ * 189765723;
	}

	public void method16451(int[] is, int i, int i_188_) {
		int i_189_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_190_ = (i_188_ - i) / 8;
		for (int i_191_ = 0; i_191_ < i_190_; i_191_++) {
			int i_192_ = readUnsignedInt((byte) -11);
			int i_193_ = readUnsignedInt((byte) -52);
			int i_194_ = -957401312;
			int i_195_ = -1640531527;
			int i_196_ = 32;
			while (i_196_-- > 0) {
				i_193_ -= (i_192_ + (i_192_ << 4 ^ i_192_ >>> 5) ^ i_194_ + is[i_194_ >>> 11 & 0x3]);
				i_194_ -= i_195_;
				i_192_ -= (i_193_ + (i_193_ << 4 ^ i_193_ >>> 5) ^ is[i_194_ & 0x3] + i_194_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_192_, -1000552732);
			writeInt(i_193_, -1429355953);
		}
		anInt10661 = i_189_ * 189765723;
	}

	public void method16452(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		aByteArray10658[2349011 * anInt10661 - i - 1] = (byte) i;
	}

	public void method16453(BigInteger biginteger, BigInteger biginteger_197_) {
		int i = 2349011 * anInt10661;
		anInt10661 = 0;
		byte[] is = new byte[i];
		method16298(is, 0, i, (byte) -79);
		BigInteger biginteger_198_ = new BigInteger(is);
		BigInteger biginteger_199_ = biginteger_198_.modPow(biginteger, biginteger_197_);
		byte[] is_200_ = biginteger_199_.toByteArray();
		anInt10661 = 0;
		writeShort(is_200_.length, (byte) -67);
		readBytes(is_200_, 0, is_200_.length, (short) -27493);
	}

	public void method16454(int[] is, int i, int i_201_) {
		int i_202_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_203_ = (i_201_ - i) / 8;
		for (int i_204_ = 0; i_204_ < i_203_; i_204_++) {
			int i_205_ = readUnsignedInt((byte) -18);
			int i_206_ = readUnsignedInt((byte) -4);
			int i_207_ = -957401312;
			int i_208_ = -1640531527;
			int i_209_ = 32;
			while (i_209_-- > 0) {
				i_206_ -= (i_205_ + (i_205_ << 4 ^ i_205_ >>> 5) ^ i_207_ + is[i_207_ >>> 11 & 0x3]);
				i_207_ -= i_208_;
				i_205_ -= (i_206_ + (i_206_ << 4 ^ i_206_ >>> 5) ^ is[i_207_ & 0x3] + i_207_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_205_, -1248630118);
			writeInt(i_206_, -858312208);
		}
		anInt10661 = i_202_ * 189765723;
	}

	public boolean method16455() {
		anInt10661 -= 759062892;
		int i = Class393.method6497(aByteArray10658, 0, anInt10661 * 2349011, 1906859295);
		int i_210_ = readUnsignedInt((byte) -96);
		if (i == i_210_)
			return true;
		return false;
	}

	public byte method16456() {
		return (byte) (0 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public void method16457(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (0 - i);
	}

	public void method16458(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (0 - i);
	}

	public void method16459(int i, byte i_211_) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (-1 == i)
			writeShort(32767, (byte) -78);
		else if (i < 32767)
			writeShort(i, (byte) -48);
		else {
			writeInt(i, -2046875824);
			aByteArray10658[2349011 * anInt10661 - 4] |= 0x80;
		}
	}

	public void method16460(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (128 - i);
	}

	public Class523_Sub34(int i) {
		aByteArray10658 = Class689.method13937(i, 1357652815);
		anInt10661 = 0;
	}

	public long readLong(byte i) {
		long l = (long) readUnsignedInt((byte) -1) & 0xffffffffL;
		long l_212_ = (long) readUnsignedInt((byte) -9) & 0xffffffffL;
		return (l << 32) + l_212_;
	}

	public void method16462(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 40);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public int method16463() {
		anInt10661 += 379531446;
		int i = (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 1] - 128 & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public int method16464() {
		return (0 - aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] & 0xff);
	}

	public byte method16465() {
		return (byte) (0 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public long method16466() {
		long l = (long) readUnsignedInt((byte) -121) & 0xffffffffL;
		long l_213_ = (long) readUnsignedInt((byte) -29) & 0xffffffffL;
		return (l << 32) + l_213_;
	}

	public int method16467() {
		anInt10661 += 379531446;
		int i = (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 1] & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public long method16468() {
		long l = (long) readUnsignedInt((byte) -121) & 0xffffffffL;
		long l_214_ = (long) readUnsignedInt((byte) -109) & 0xffffffffL;
		return (l << 32) + l_214_;
	}

	public int method16469() {
		anInt10661 += 379531446;
		int i = ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 8));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public byte method16470() {
		return (byte) (0 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	public int method16471() {
		return (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - 128 & 0xff);
	}

	public byte method16472() {
		return (byte) (128 - (aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]));
	}

	static int method16473(byte[] is, int i, int i_215_) {
		int i_216_ = -1;
		for (int i_217_ = i; i_217_ < i_215_; i_217_++)
			i_216_ = i_216_ >>> 8 ^ anIntArray10660[(i_216_ ^ is[i_217_]) & 0xff];
		i_216_ ^= 0xffffffff;
		return i_216_;
	}

	public int read24BitInt(int i) {
		anInt10661 += 569297169;
		return ((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) + (((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) << 8)));
	}

	public void method16475(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void method16476(int[] is, int i, int i_218_) {
		int i_219_ = 2349011 * anInt10661;
		anInt10661 = i * 189765723;
		int i_220_ = (i_218_ - i) / 8;
		for (int i_221_ = 0; i_221_ < i_220_; i_221_++) {
			int i_222_ = readUnsignedInt((byte) -74);
			int i_223_ = readUnsignedInt((byte) -84);
			int i_224_ = 0;
			int i_225_ = -1640531527;
			int i_226_ = 32;
			while (i_226_-- > 0) {
				i_222_ += (i_223_ + (i_223_ << 4 ^ i_223_ >>> 5) ^ is[i_224_ & 0x3] + i_224_);
				i_224_ += i_225_;
				i_223_ += (i_222_ + (i_222_ << 4 ^ i_222_ >>> 5) ^ i_224_ + is[i_224_ >>> 11 & 0x3]);
			}
			anInt10661 -= 1518125784;
			writeInt(i_222_, -2049485173);
			writeInt(i_223_, -1551944391);
		}
		anInt10661 = 189765723 * i_219_;
	}

	public void method16477(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + 128);
	}

	public void method16478(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + 128);
	}

	public int method16479() {
		anInt10661 += 379531446;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 2] & 0xff));
	}

	public void method16480(int[] is) {
		int i = 2349011 * anInt10661 / 8;
		anInt10661 = 0;
		for (int i_227_ = 0; i_227_ < i; i_227_++) {
			int i_228_ = readUnsignedInt((byte) -86);
			int i_229_ = readUnsignedInt((byte) -61);
			int i_230_ = -957401312;
			int i_231_ = -1640531527;
			int i_232_ = 32;
			while (i_232_-- > 0) {
				i_229_ -= (i_228_ + (i_228_ << 4 ^ i_228_ >>> 5) ^ i_230_ + is[i_230_ >>> 11 & 0x3]);
				i_230_ -= i_231_;
				i_228_ -= ((i_229_ << 4 ^ i_229_ >>> 5) + i_229_ ^ is[i_230_ & 0x3] + i_230_);
			}
			anInt10661 -= 1518125784;
			writeInt(i_228_, -1681882372);
			writeInt(i_229_, -2113306460);
		}
	}

	public void method16481(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
	}

	public int method16482() {
		anInt10661 += 759062892;
		return ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) + (((aByteArray10658[2349011 * anInt10661 - 4] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 3] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8)));
	}

	public int method16483() {
		anInt10661 += 379531446;
		int i = ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 8));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public void method16484(String string) {
		int i = string.indexOf('\0');
		if (i >= 0)
			throw new IllegalArgumentException("");
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
		anInt10661 += Class506.method8500(string, 0, string.length(), aByteArray10658, anInt10661 * 2349011, 1333892956) * 189765723;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) 0;
	}

	public int method16485() {
		anInt10661 += 379531446;
		int i = (((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 1] - 128 & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public String method16486() {
		if (aByteArray10658[anInt10661 * 2349011] == 0) {
			anInt10661 += 189765723;
			return null;
		}
		return readString(-226890294);
	}

	public int method16487(byte i) {
		int i_233_ = aByteArray10658[2349011 * anInt10661] & 0xff;
		if (i_233_ < 128)
			return readUnsignedByte(1980150814) - 64;
		return readUnsignedShort(-2118315200) - 49152;
	}

	public void method16488(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
	}

	public void method16489(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
	}

	public void method16490(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
	}

	public int method16491() {
		anInt10661 += 379531446;
		int i = ((aByteArray10658[anInt10661 * 2349011 - 2] & 0xff) + ((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 8));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public void method16492(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	public void method16493(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) i;
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i >> 16);
	}

	public void method16494(long l) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 32);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 24);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 16);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) (l >> 8);
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (int) l;
	}

	public int method16495(int i) {
		int i_234_ = 0;
		int i_235_;
		for (i_235_ = readUnsignedSmart(368514876); 32767 == i_235_; i_235_ = readUnsignedSmart(368514876))
			i_234_ += 32767;
		i_234_ += i_235_;
		return i_234_;
	}

	public boolean method16496() {
		anInt10661 -= 759062892;
		int i = Class393.method6497(aByteArray10658, 0, anInt10661 * 2349011, 1199070380);
		int i_236_ = readUnsignedInt((byte) -126);
		if (i == i_236_)
			return true;
		return false;
	}

	public int method16497() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 24) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 8) + (aByteArray10658[2349011 * anInt10661 - 4] & 0xff));
	}

	public int method16498() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 8) + (((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 24)) + (aByteArray10658[2349011 * anInt10661 - 3] & 0xff));
	}

	public int method16499() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 8) + (((aByteArray10658[2349011 * anInt10661 - 1] & 0xff) << 16) + ((aByteArray10658[2349011 * anInt10661 - 2] & 0xff) << 24)) + (aByteArray10658[2349011 * anInt10661 - 3] & 0xff));
	}

	public int method16500() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 24)) + (aByteArray10658[anInt10661 * 2349011 - 2] & 0xff));
	}

	public int method16501() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 24)) + (aByteArray10658[anInt10661 * 2349011 - 2] & 0xff));
	}

	public int method16502() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 24)) + (aByteArray10658[anInt10661 * 2349011 - 2] & 0xff));
	}

	public int method16503() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 24)) + (aByteArray10658[anInt10661 * 2349011 - 2] & 0xff));
	}

	public int method16504() {
		anInt10661 += 759062892;
		return (((aByteArray10658[anInt10661 * 2349011 - 1] & 0xff) << 8) + (((aByteArray10658[anInt10661 * 2349011 - 4] & 0xff) << 16) + ((aByteArray10658[anInt10661 * 2349011 - 3] & 0xff) << 24)) + (aByteArray10658[anInt10661 * 2349011 - 2] & 0xff));
	}

	public void method16505(byte[] is, int i, int i_237_) {
		for (int i_238_ = i_237_ + i - 1; i_238_ >= i; i_238_--)
			is[i_238_] = aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1];
	}

	static final void method16506(Class669 class669, byte i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub39_10605, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), 1475100333);
		Class211.method3824(890007552);
	}

	static final void method16507(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_239_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		boolean bool = (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815] == 1);
		Class275.method5041(i_239_, bool, (short) -32768);
	}
}
