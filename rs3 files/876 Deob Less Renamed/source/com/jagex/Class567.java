/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class567 {
	int anInt7607;
	boolean aBool7608;
	SourceDataLine aSourceDataLine7609;
	byte[] aByteArray7610;
	List aList7611;
	int anInt7612;
	int anInt7613;
	float aFloat7614;
	int anInt7615;
	int anInt7616;
	byte[] aByteArray7617;
	Class375_Sub1 this$0;

	void method9504(int i) {
		synchronized (this) {
			int i_0_ = 2147483647;
			double d = (double) (anInt7616 * -1898124023 * (anInt7615 * 170510091 / 8));
			boolean bool = false;
			Iterator iterator = aList7611.iterator();
			while (iterator.hasNext()) {
				Class558 class558 = (Class558) iterator.next();
				int i_1_ = (class558.aByteArray7490.length - -354920245 * class558.anInt7485);
				if (class558.aFloat7487 != aFloat7614) {
					i_1_ *= aFloat7614 / class558.aFloat7487;
					i_1_ = (int) (d * Math.ceil((double) i_1_ / d));
				}
				class558.anInt7481 = 1449095979 * i_1_;
				if (i_1_ > 0 && i_1_ < i_0_) {
					bool = true;
					i_0_ = i_1_;
				}
			}
			if (i_0_ > -1012513567 * anInt7607)
				i_0_ = anInt7607 * -1012513567;
			if (0 == i_0_ || false == bool) {
				/* empty */
			} else {
				int i_2_ = 170510091 * anInt7615 / 8;
				Iterator iterator_3_ = aList7611.iterator();
				while (iterator_3_.hasNext()) {
					Class558 class558 = (Class558) iterator_3_.next();
					if (class558.anInt7481 * -1838959741 >= i_0_) {
						int i_4_ = 2088551143 * anInt7613;
						int i_5_ = 0;
						int i_6_ = -1338054849 * class558.anInt7488 / 8;
						double d_7_ = 0.0;
						int i_8_ = 0;
						double d_9_ = (double) aFloat7614;
						double d_10_ = (double) class558.aFloat7487;
						int i_11_ = 1688455543 * class558.anInt7486;
						for (/**/; (-1838959741 * class558.anInt7481 > 0 && i_5_ < i_0_); i_5_ += i_6_) {
							short i_12_ = 0;
							short i_13_ = 0;
							byte[] is = aByteArray7610;
							for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
								is[i_14_] = aByteArray7617[i_4_ + i_14_];
								i_12_ |= (is[i_14_] & 0xff) << 8 * i_14_;
							}
							if (class558.aFloat7487 != aFloat7614) {
								byte[] is_15_ = class558.aByteArray7482;
								float f = (float) (d_10_ * (d_7_ / d_9_));
								float f_16_ = (float) Math.floor((double) f);
								short i_17_ = 0;
								short i_18_ = 0;
								int i_19_ = (int) Math.floor((double) f);
								int i_20_ = (int) Math.ceil((double) f);
								i_19_ = (i_19_ * (is_15_.length * (192528193 * class558.anInt7489)) + is_15_.length * i_8_);
								i_20_ = (i_8_ * is_15_.length + (is_15_.length * (192528193 * class558.anInt7489) * i_20_));
								i_19_ += i_11_;
								i_20_ += i_11_;
								i_19_ %= class558.aByteArray7490.length;
								i_20_ %= class558.aByteArray7490.length;
								for (int i_21_ = 0; i_21_ < is_15_.length; i_21_++) {
									is_15_[i_21_] = (class558.aByteArray7490[i_21_ + i_19_]);
									i_17_ |= (is_15_[i_21_] & 0xff) << i_21_ * 8;
								}
								for (int i_22_ = 0; i_22_ < is_15_.length; i_22_++) {
									is_15_[i_22_] = (class558.aByteArray7490[i_22_ + i_20_]);
									i_18_ |= (is_15_[i_22_] & 0xff) << 8 * i_22_;
								}
								float f_23_ = f - f_16_;
								if (f_23_ < 0.0F || f_23_ > 1.0F)
									throw new RuntimeException("");
								float f_24_ = (float) (i_18_ - i_17_);
								i_13_ = (short) (int) ((float) i_17_ + f_24_ * f_23_);
								i_8_ = ++i_8_ % (class558.anInt7489 * 192528193);
								if (0 == i_8_)
									d_7_++;
							} else {
								byte[] is_25_ = class558.aByteArray7482;
								for (int i_26_ = 0; i_26_ < is_25_.length; i_26_++) {
									is_25_[i_26_] = (class558.aByteArray7490[i_26_ + (class558.anInt7486 * 1688455543)]);
									i_13_ |= (is_25_[i_26_] & 0xff) << i_26_ * 8;
								}
								class558.anInt7486 += -1630674873 * i_6_;
								Class558 class558_27_;
								(class558_27_ = class558).anInt7486 = (-1630674873 * (1688455543 * class558_27_.anInt7486 % class558.aByteArray7490.length));
								class558.anInt7485 += 1187466467 * i_6_;
							}
							i_13_ += i_12_;
							if (i_13_ > 32767)
								i_13_ = (short) 32767;
							if (i_13_ < -32768)
								i_13_ = (short) -32768;
							aByteArray7617[i_4_] = (byte) i_13_;
							aByteArray7617[1 + i_4_] = (byte) (i_13_ >> 8);
							i_4_ += i_2_;
							i_4_ %= aByteArray7617.length;
						}
						if (class558.aFloat7487 != aFloat7614) {
							double d_28_ = d_10_ / d_9_ * (double) i_0_;
							int i_29_ = (int) (d * Math.ceil(d_28_ / d));
							class558.anInt7486 += i_29_ * -1630674873;
							Class558 class558_30_;
							(class558_30_ = class558).anInt7486 = (-1630674873 * (class558_30_.anInt7486 * 1688455543 % class558.aByteArray7490.length));
							class558.anInt7485 += i_29_ * 1187466467;
						}
					}
				}
				anInt7612 = i_0_ * -1369856755;
			}
		}
	}

	void method9505(byte i) {
		if (aBool7608) {
			if (null != aSourceDataLine7609)
				anInt7607 = aSourceDataLine7609.available() * 1385561889;
		}
	}

	void method9506(byte i) {
		anInt7612 = 0;
		method9504(211762417);
		int i_31_;
		for (/**/; -1275153979 * anInt7612 > 0; anInt7612 -= -1369856755 * i_31_) {
			i_31_ = anInt7612 * -1275153979;
			if (i_31_ + anInt7613 * 2088551143 >= aByteArray7617.length)
				i_31_ = aByteArray7617.length - 2088551143 * anInt7613;
			aSourceDataLine7609.write(aByteArray7617, 2088551143 * anInt7613, i_31_);
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
				aByteArray7617[i_32_ + anInt7613 * 2088551143] = (byte) 0;
			anInt7613 += i_31_ * -1018482473;
			anInt7613 = -1018482473 * (2088551143 * anInt7613 % aByteArray7617.length);
		}
	}

	void method9507(Class558 class558) {
		aList7611.add(class558);
	}

	void method9508(Class558 class558, byte i) {
		aList7611.add(class558);
	}

	Class567(Class375_Sub1 class375_sub1, float f, int i) {
		this$0 = class375_sub1;
		anInt7615 = 1691666992;
		anInt7616 = -1592171918;
		aList7611 = new ArrayList();
		if (!aBool7608) {
			aFloat7614 = f;
			if (anInt7615 * 170510091 > 16)
				throw new RuntimeException("");
			try {
				AudioFormat audioformat = new AudioFormat(aFloat7614, 170510091 * anInt7615, anInt7616 * -1898124023, true, false);
				try {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, audioformat, i));
					aSourceDataLine7609 = (SourceDataLine) AudioSystem.getLine(info);
				} catch (IllegalArgumentException illegalargumentexception) {
					return;
				}
				aSourceDataLine7609.open(audioformat, i);
				aSourceDataLine7609.start();
			} catch (LineUnavailableException lineunavailableexception) {
				return;
			}
			aByteArray7617 = new byte[i];
			aByteArray7610 = new byte[anInt7615 * 170510091 / 8];
			anInt7613 = 0;
			aBool7608 = true;
		}
	}

	void method9509(Class558 class558, int i) {
		aList7611.remove(class558);
	}

	void method9510() {
		if (aBool7608) {
			if (null != aSourceDataLine7609)
				anInt7607 = aSourceDataLine7609.available() * 1385561889;
		}
	}

	void method9511() {
		anInt7612 = 0;
		method9504(1439319580);
		int i;
		for (/**/; -1275153979 * anInt7612 > 0; anInt7612 -= -1369856755 * i) {
			i = anInt7612 * -1275153979;
			if (i + anInt7613 * 2088551143 >= aByteArray7617.length)
				i = aByteArray7617.length - 2088551143 * anInt7613;
			aSourceDataLine7609.write(aByteArray7617, 2088551143 * anInt7613, i);
			for (int i_33_ = 0; i_33_ < i; i_33_++)
				aByteArray7617[i_33_ + anInt7613 * 2088551143] = (byte) 0;
			anInt7613 += i * -1018482473;
			anInt7613 = -1018482473 * (2088551143 * anInt7613 % aByteArray7617.length);
		}
	}

	void method9512() {
		anInt7612 = 0;
		method9504(1683743522);
		int i;
		for (/**/; -1275153979 * anInt7612 > 0; anInt7612 -= -1369856755 * i) {
			i = anInt7612 * -1275153979;
			if (i + anInt7613 * 2088551143 >= aByteArray7617.length)
				i = aByteArray7617.length - 2088551143 * anInt7613;
			aSourceDataLine7609.write(aByteArray7617, 2088551143 * anInt7613, i);
			for (int i_34_ = 0; i_34_ < i; i_34_++)
				aByteArray7617[i_34_ + anInt7613 * 2088551143] = (byte) 0;
			anInt7613 += i * -1018482473;
			anInt7613 = -1018482473 * (2088551143 * anInt7613 % aByteArray7617.length);
		}
	}

	void method9513() {
		if (aBool7608) {
			if (null != aSourceDataLine7609)
				anInt7607 = aSourceDataLine7609.available() * 1385561889;
		}
	}

	void method9514(Class558 class558) {
		aList7611.remove(class558);
	}

	void method9515(Class558 class558) {
		aList7611.remove(class558);
	}

	void method9516(Class558 class558) {
		aList7611.remove(class558);
	}

	void method9517(Class558 class558) {
		aList7611.remove(class558);
	}

	static int method9518(Iterable iterable, int i) {
		int i_35_ = -1;
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Interface75 interface75 = (Interface75) iterator.next();
			if (interface75.method82() > i_35_)
				i_35_ = interface75.method82();
		}
		return (8 + i_35_) / 8;
	}
}
