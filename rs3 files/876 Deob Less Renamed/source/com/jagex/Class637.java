/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class637 {
	Class708 aClass708_8301 = new Class708();
	long aLong8302 = -5397139194086129219L;
	int anInt8303;
	int anInt8304;
	long aLong8305 = 5853816964325434705L;

	abstract void method10449(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39);

	void method10450(byte i) {
		if (method10452((byte) 14)) {
			Class523_Sub22 class523_sub22 = null;
			int i_0_ = 0;
			int i_1_ = 0;
			int i_2_ = 0;
			Iterator iterator = aClass708_8301.iterator();
			while (iterator.hasNext()) {
				Class523_Sub39 class523_sub39 = (Class523_Sub39) iterator.next();
				if (class523_sub22 != null && (2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i_0_ >= 252 - (6 + method10454(608968025))))
					break;
				class523_sub39.method8661(607052656);
				int i_3_ = class523_sub39.method16520((byte) 127);
				if (i_3_ < -1)
					i_3_ = -1;
				else if (i_3_ > 65534)
					i_3_ = 65534;
				int i_4_ = class523_sub39.method16519(-1044028710);
				if (i_4_ < -1)
					i_4_ = -1;
				else if (i_4_ > 65534)
					i_4_ = 65534;
				if (anInt8304 * 704672467 == i_4_ && anInt8303 * -1686187423 == i_3_)
					class523_sub39.method16523((byte) -71);
				else {
					if (class523_sub22 == null) {
						class523_sub22 = method10460(2068983090);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, 300224085);
						i_0_ = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) * 2349011;
						class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 379531446;
						i_1_ = 0;
						i_2_ = 0;
					}
					int i_5_;
					int i_6_;
					int i_7_;
					if (-1L != aLong8305 * 5505102922195369039L) {
						i_5_ = i_4_ - anInt8304 * 704672467;
						i_6_ = i_3_ - anInt8303 * -1686187423;
						i_7_ = (int) ((class523_sub39.method16539((byte) 69) - 5505102922195369039L * aLong8305) / 20L);
						i_1_ += (class523_sub39.method16539((byte) -3) - 5505102922195369039L * aLong8305) % 20L;
					} else {
						i_5_ = i_4_;
						i_6_ = i_3_;
						i_7_ = 2147483647;
					}
					anInt8304 = i_4_ * 1136178523;
					anInt8303 = i_3_ * -1110617695;
					if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32 && i_6_ <= 31) {
						i_5_ += 32;
						i_6_ += 32;
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((i_7_ << 12) + (i_5_ << 6) + i_6_, (byte) -119);
					} else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127 && i_6_ >= -128 && i_6_ <= 127) {
						i_5_ += 128;
						i_6_ += 128;
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(128 + i_7_, -29140757);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((i_5_ << 8) + i_6_, (byte) -105);
					} else if (i_7_ < 32) {
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_7_ + 192, 2099945290);
						if (-1 == i_4_ || -1 == i_3_)
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(-2147483648, -1864621066);
						else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i_4_ | i_3_ << 16, -1136881791);
					} else {
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((i_7_ & 0x1fff) + 57344, (byte) -28);
						if (i_4_ == -1 || -1 == i_3_)
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(-2147483648, -2092361221);
						else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i_4_ | i_3_ << 16, -988993158);
					}
					i_2_++;
					method10457(class523_sub22.aClass523_Sub34_Sub2_10525, class523_sub39, 369865020);
					aLong8305 = (class523_sub39.method16539((byte) 21) * -5853816964325434705L);
					class523_sub39.method16523((byte) 21);
				}
			}
			if (class523_sub22 != null) {
				class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i_0_, 500354589);
				int i_8_ = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011);
				class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 = 189765723 * i_0_;
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_1_ / i_2_, 559178550);
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_1_ % i_2_, -1102823097);
				class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 = i_8_ * 189765723;
				client.aClass116_11058.method1974(class523_sub22, (byte) 37);
			}
		}
		method10456(-1045736666);
	}

	void method10451() {
		aClass708_8301.method14235((byte) -3);
		aLong8302 = -5397139194086129219L;
		aLong8305 = 5853816964325434705L;
		anInt8304 = -1136178523;
		anInt8303 = 1110617695;
	}

	abstract boolean method10452(byte i);

	int method10453(Class523_Sub39 class523_sub39, int i, int i_9_) {
		long l;
		if (-1L == aLong8302 * 1771889580293635691L)
			l = (long) i;
		else {
			l = (class523_sub39.method16539((byte) 33) - 1771889580293635691L * aLong8302);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8302 = class523_sub39.method16539((byte) -33) * 5397139194086129219L;
		return (int) l;
	}

	abstract int method10454(int i);

	void method10455(Class523_Sub39 class523_sub39, int i) {
		aClass708_8301.method14236(class523_sub39, -902854007);
	}

	abstract void method10456(int i);

	abstract void method10457(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39, int i);

	abstract boolean method10458();

	abstract void method10459();

	abstract Class523_Sub22 method10460(int i);

	abstract int method10461();

	void method10462(int i) {
		aClass708_8301.method14235((byte) -48);
		aLong8302 = -5397139194086129219L;
		aLong8305 = 5853816964325434705L;
		anInt8304 = -1136178523;
		anInt8303 = 1110617695;
	}

	abstract boolean method10463();

	abstract boolean method10464();

	abstract boolean method10465();

	abstract boolean method10466();

	abstract void method10467(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39);

	abstract Class523_Sub22 method10468();

	abstract int method10469();

	Class637() {
		anInt8304 = -1136178523;
		anInt8303 = 1110617695;
	}

	abstract int method10470();

	abstract int method10471();

	abstract void method10472();

	void method10473() {
		aClass708_8301.method14235((byte) -37);
		aLong8302 = -5397139194086129219L;
		aLong8305 = 5853816964325434705L;
		anInt8304 = -1136178523;
		anInt8303 = 1110617695;
	}

	void method10474() {
		if (method10452((byte) 34)) {
			Class523_Sub22 class523_sub22 = null;
			int i = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			Iterator iterator = aClass708_8301.iterator();
			while (iterator.hasNext()) {
				Class523_Sub39 class523_sub39 = (Class523_Sub39) iterator.next();
				if (class523_sub22 != null && (2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i >= 252 - (6 + method10454(608968025))))
					break;
				class523_sub39.method8661(607052656);
				int i_12_ = class523_sub39.method16520((byte) 127);
				if (i_12_ < -1)
					i_12_ = -1;
				else if (i_12_ > 65534)
					i_12_ = 65534;
				int i_13_ = class523_sub39.method16519(52725525);
				if (i_13_ < -1)
					i_13_ = -1;
				else if (i_13_ > 65534)
					i_13_ = 65534;
				if (anInt8304 * 704672467 == i_13_ && anInt8303 * -1686187423 == i_12_)
					class523_sub39.method16523((byte) 91);
				else {
					if (class523_sub22 == null) {
						class523_sub22 = method10460(2068983090);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -902488144);
						i = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) * 2349011;
						class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 379531446;
						i_10_ = 0;
						i_11_ = 0;
					}
					int i_14_;
					int i_15_;
					int i_16_;
					if (-1L != aLong8305 * 5505102922195369039L) {
						i_14_ = i_13_ - anInt8304 * 704672467;
						i_15_ = i_12_ - anInt8303 * -1686187423;
						i_16_ = (int) ((class523_sub39.method16539((byte) -6) - 5505102922195369039L * aLong8305) / 20L);
						i_10_ += (class523_sub39.method16539((byte) 32) - 5505102922195369039L * aLong8305) % 20L;
					} else {
						i_14_ = i_13_;
						i_15_ = i_12_;
						i_16_ = 2147483647;
					}
					anInt8304 = i_13_ * 1136178523;
					anInt8303 = i_12_ * -1110617695;
					if (i_16_ < 8 && i_14_ >= -32 && i_14_ <= 31 && i_15_ >= -32 && i_15_ <= 31) {
						i_14_ += 32;
						i_15_ += 32;
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((i_16_ << 12) + (i_14_ << 6) + i_15_, (byte) -80);
					} else if (i_16_ < 32 && i_14_ >= -128 && i_14_ <= 127 && i_15_ >= -128 && i_15_ <= 127) {
						i_14_ += 128;
						i_15_ += 128;
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(128 + i_16_, -391831899);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((i_14_ << 8) + i_15_, (byte) -21);
					} else if (i_16_ < 32) {
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_16_ + 192, 1057971477);
						if (-1 == i_13_ || -1 == i_12_)
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(-2147483648, -2111302000);
						else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i_13_ | i_12_ << 16, -760983390);
					} else {
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((i_16_ & 0x1fff) + 57344, (byte) -93);
						if (i_13_ == -1 || -1 == i_12_)
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(-2147483648, -1175571016);
						else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i_13_ | i_12_ << 16, -734636891);
					}
					i_11_++;
					method10457(class523_sub22.aClass523_Sub34_Sub2_10525, class523_sub39, -1370036594);
					aLong8305 = (class523_sub39.method16539((byte) -71) * -5853816964325434705L);
					class523_sub39.method16523((byte) 59);
				}
			}
			if (class523_sub22 != null) {
				class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i, 1028935971);
				int i_17_ = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011);
				class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 = 189765723 * i;
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_10_ / i_11_, -365136595);
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_10_ % i_11_, -99398275);
				class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 = i_17_ * 189765723;
				client.aClass116_11058.method1974(class523_sub22, (byte) 58);
			}
		}
		method10456(-1404771296);
	}

	abstract Class523_Sub22 method10475();

	abstract void method10476();

	void method10477(Class523_Sub39 class523_sub39) {
		aClass708_8301.method14236(class523_sub39, 819013309);
	}

	int method10478(Class523_Sub39 class523_sub39, int i) {
		long l;
		if (-1L == aLong8302 * 1771889580293635691L)
			l = (long) i;
		else {
			l = (class523_sub39.method16539((byte) 68) - 1771889580293635691L * aLong8302);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8302 = class523_sub39.method16539((byte) 64) * 5397139194086129219L;
		return (int) l;
	}

	int method10479(Class523_Sub39 class523_sub39, int i) {
		long l;
		if (-1L == aLong8302 * 1771889580293635691L)
			l = (long) i;
		else {
			l = (class523_sub39.method16539((byte) -67) - 1771889580293635691L * aLong8302);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8302 = class523_sub39.method16539((byte) -18) * 5397139194086129219L;
		return (int) l;
	}

	int method10480(Class523_Sub39 class523_sub39, int i) {
		long l;
		if (-1L == aLong8302 * 1771889580293635691L)
			l = (long) i;
		else {
			l = (class523_sub39.method16539((byte) 31) - 1771889580293635691L * aLong8302);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8302 = class523_sub39.method16539((byte) 56) * 5397139194086129219L;
		return (int) l;
	}

	int method10481(Class523_Sub39 class523_sub39, int i) {
		long l;
		if (-1L == aLong8302 * 1771889580293635691L)
			l = (long) i;
		else {
			l = (class523_sub39.method16539((byte) 35) - 1771889580293635691L * aLong8302);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8302 = class523_sub39.method16539((byte) -61) * 5397139194086129219L;
		return (int) l;
	}

	int method10482(Class523_Sub39 class523_sub39, int i) {
		long l;
		if (-1L == aLong8302 * 1771889580293635691L)
			l = (long) i;
		else {
			l = (class523_sub39.method16539((byte) 21) - 1771889580293635691L * aLong8302);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8302 = class523_sub39.method16539((byte) 60) * 5397139194086129219L;
		return (int) l;
	}
}
