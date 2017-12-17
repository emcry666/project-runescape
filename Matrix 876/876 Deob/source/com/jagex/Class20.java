/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;

public class Class20 {
	int anInt200;
	Class19 aClass19_201;
	byte[] aByteArray202;
	static final int anInt203 = 200000000;
	long aLong204;
	byte[] aByteArray205;
	long aLong206;
	long aLong207;
	long aLong208;
	long aLong209 = 2583443298694633741L;
	int anInt210;
	long aLong211;
	static Iterator anIterator212;

	void method797() throws IOException {
		anInt210 = 0;
		if (-5346161823662357463L * aLong208 != -2374020556457901911L * aLong207) {
			aClass19_201.method785(-5346161823662357463L * aLong208);
			aLong207 = aLong208 * -8813041329063438463L;
		}
		aLong209 = aLong208 * 963542481578133739L;
		int i;
		for (/**/; 412479013 * anInt210 < aByteArray202.length; anInt210 += i * 2079227309) {
			int i_0_ = aByteArray202.length - 412479013 * anInt210;
			if (i_0_ > 200000000)
				i_0_ = 200000000;
			i = aClass19_201.method784(aByteArray202, anInt210 * 412479013, i_0_, (byte) 16);
			if (-1 == i)
				break;
			aLong207 += -2550420812163538023L * (long) i;
		}
	}

	public void method798(byte i) throws IOException {
		method800(-2046937025);
		aClass19_201.method786(1561392680);
	}

	public void method799(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong208 = 7342927810909444121L * l;
	}

	void method800(int i) throws IOException {
		if (7114352031760711593L * aLong206 != -1L) {
			if (aLong206 * 7114352031760711593L != -2374020556457901911L * aLong207) {
				aClass19_201.method785(aLong206 * 7114352031760711593L);
				aLong207 = -8475301541862480127L * aLong206;
			}
			aClass19_201.method782(aByteArray205, 0, anInt200 * 514129087, 1357652815);
			aLong207 += (long) anInt200 * -4957031783807931609L;
			if (-2374020556457901911L * aLong207 > aLong211 * 4746354080516801925L)
				aLong211 = -7982152102866217515L * aLong207;
			long l = -1L;
			long l_1_ = -1L;
			if ((aLong206 * 7114352031760711593L >= -4413502923195342277L * aLong209) && (7114352031760711593L * aLong206 < aLong209 * -4413502923195342277L + (long) (anInt210 * 412479013)))
				l = 7114352031760711593L * aLong206;
			else if ((-4413502923195342277L * aLong209 >= aLong206 * 7114352031760711593L) && (-4413502923195342277L * aLong209 < (7114352031760711593L * aLong206 + (long) (514129087 * anInt200))))
				l = aLong209 * -4413502923195342277L;
			if ((((long) (514129087 * anInt200) + 7114352031760711593L * aLong206) > -4413502923195342277L * aLong209) && (((long) (anInt200 * 514129087) + 7114352031760711593L * aLong206) <= ((long) (412479013 * anInt210) + -4413502923195342277L * aLong209)))
				l_1_ = aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087);
			else if ((((long) (anInt210 * 412479013) + aLong209 * -4413502923195342277L) > 7114352031760711593L * aLong206) && (aLong209 * -4413502923195342277L + (long) (412479013 * anInt210) <= ((long) (anInt200 * 514129087) + 7114352031760711593L * aLong206)))
				l_1_ = -4413502923195342277L * aLong209 + (long) (412479013 * anInt210);
			if (l > -1L && l_1_ > l) {
				int i_2_ = (int) (l_1_ - l);
				System.arraycopy(aByteArray205, (int) (l - aLong206 * 7114352031760711593L), aByteArray202, (int) (l - aLong209 * -4413502923195342277L), i_2_);
			}
			aLong206 = -713404855637644441L;
			anInt200 = 0;
		}
	}

	public void method801(byte[] is, byte i) throws IOException {
		method802(is, 0, is.length, (byte) 0);
	}

	public void method802(byte[] is, int i, int i_3_, byte i_4_) throws IOException {
		try {
			if (i_3_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_3_ + i - is.length);
			if (-1L != aLong206 * 7114352031760711593L && (-5346161823662357463L * aLong208 >= 7114352031760711593L * aLong206) && (aLong208 * -5346161823662357463L + (long) i_3_ <= (aLong206 * 7114352031760711593L + (long) (514129087 * anInt200)))) {
				System.arraycopy(aByteArray205, (int) (aLong208 * -5346161823662357463L - 7114352031760711593L * aLong206), is, i, i_3_);
				aLong208 += 7342927810909444121L * (long) i_3_;
				return;
			}
			long l = -5346161823662357463L * aLong208;
			int i_5_ = i;
			int i_6_ = i_3_;
			if ((-5346161823662357463L * aLong208 >= -4413502923195342277L * aLong209) && (aLong208 * -5346161823662357463L < ((long) (anInt210 * 412479013) + -4413502923195342277L * aLong209))) {
				int i_7_ = (int) ((long) (412479013 * anInt210) - (aLong208 * -5346161823662357463L - -4413502923195342277L * aLong209));
				if (i_7_ > i_3_)
					i_7_ = i_3_;
				System.arraycopy(aByteArray202, (int) (-5346161823662357463L * aLong208 - -4413502923195342277L * aLong209), is, i, i_7_);
				aLong208 += 7342927810909444121L * (long) i_7_;
				i += i_7_;
				i_3_ -= i_7_;
			}
			if (i_3_ > aByteArray202.length) {
				aClass19_201.method785(aLong208 * -5346161823662357463L);
				aLong207 = aLong208 * -8813041329063438463L;
				int i_8_;
				for (/**/; i_3_ > 0; i_3_ -= i_8_) {
					i_8_ = aClass19_201.method784(is, i, i_3_, (byte) 16);
					if (i_8_ == -1)
						break;
					aLong207 += (long) i_8_ * -2550420812163538023L;
					aLong208 += (long) i_8_ * 7342927810909444121L;
					i += i_8_;
				}
			} else if (i_3_ > 0) {
				method803((short) 14533);
				int i_9_ = i_3_;
				if (i_9_ > anInt210 * 412479013)
					i_9_ = 412479013 * anInt210;
				System.arraycopy(aByteArray202, 0, is, i, i_9_);
				i += i_9_;
				i_3_ -= i_9_;
				aLong208 += 7342927810909444121L * (long) i_9_;
			}
			if (-1L != 7114352031760711593L * aLong206) {
				if ((7114352031760711593L * aLong206 > -5346161823662357463L * aLong208) && i_3_ > 0) {
					int i_10_ = ((int) (7114352031760711593L * aLong206 - -5346161823662357463L * aLong208) + i);
					if (i_10_ > i + i_3_)
						i_10_ = i + i_3_;
					while (i < i_10_) {
						is[i++] = (byte) 0;
						i_3_--;
						aLong208 += 7342927810909444121L;
					}
				}
				long l_11_ = -1L;
				long l_12_ = -1L;
				if (aLong206 * 7114352031760711593L >= l && aLong206 * 7114352031760711593L < l + (long) i_6_)
					l_11_ = aLong206 * 7114352031760711593L;
				else if (l >= aLong206 * 7114352031760711593L && l < ((long) (514129087 * anInt200) + 7114352031760711593L * aLong206))
					l_11_ = l;
				if (aLong206 * 7114352031760711593L + (long) (514129087 * anInt200) > l && (7114352031760711593L * aLong206 + (long) (anInt200 * 514129087) <= l + (long) i_6_))
					l_12_ = (aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087));
				else if (l + (long) i_6_ > aLong206 * 7114352031760711593L && l + (long) i_6_ <= (aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087)))
					l_12_ = (long) i_6_ + l;
				if (l_11_ > -1L && l_12_ > l_11_) {
					int i_13_ = (int) (l_12_ - l_11_);
					System.arraycopy(aByteArray205, (int) (l_11_ - aLong206 * 7114352031760711593L), is, (int) (l_11_ - l) + i_5_, i_13_);
					if (l_12_ > aLong208 * -5346161823662357463L) {
						i_3_ -= l_12_ - aLong208 * -5346161823662357463L;
						aLong208 = 7342927810909444121L * l_12_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong207 = 2550420812163538023L;
			throw ioexception;
		}
		if (i_3_ > 0)
			throw new EOFException();
	}

	void method803(short i) throws IOException {
		anInt210 = 0;
		if (-5346161823662357463L * aLong208 != -2374020556457901911L * aLong207) {
			aClass19_201.method785(-5346161823662357463L * aLong208);
			aLong207 = aLong208 * -8813041329063438463L;
		}
		aLong209 = aLong208 * 963542481578133739L;
		int i_14_;
		for (/**/; 412479013 * anInt210 < aByteArray202.length; anInt210 += i_14_ * 2079227309) {
			int i_15_ = aByteArray202.length - 412479013 * anInt210;
			if (i_15_ > 200000000)
				i_15_ = 200000000;
			i_14_ = aClass19_201.method784(aByteArray202, anInt210 * 412479013, i_15_, (byte) 16);
			if (-1 == i_14_)
				break;
			aLong207 += -2550420812163538023L * (long) i_14_;
		}
	}

	public void method804(byte[] is, int i, int i_16_, byte i_17_) throws IOException {
		do {
			try {
				if (aLong208 * -5346161823662357463L + (long) i_16_ > -6175775561911512793L * aLong204)
					aLong204 = (((long) i_16_ + aLong208 * -5346161823662357463L) * 7783203740295532183L);
				if (-1L != 7114352031760711593L * aLong206 && ((-5346161823662357463L * aLong208 < aLong206 * 7114352031760711593L) || (aLong208 * -5346161823662357463L > (aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087)))))
					method800(-105908519);
				if (aLong206 * 7114352031760711593L != -1L && (-5346161823662357463L * aLong208 + (long) i_16_ > (7114352031760711593L * aLong206 + (long) aByteArray205.length))) {
					int i_18_ = (int) ((long) aByteArray205.length - (aLong208 * -5346161823662357463L - 7114352031760711593L * aLong206));
					System.arraycopy(is, i, aByteArray205, (int) (aLong208 * -5346161823662357463L - aLong206 * 7114352031760711593L), i_18_);
					aLong208 += 7342927810909444121L * (long) i_18_;
					i += i_18_;
					i_16_ -= i_18_;
					anInt200 = aByteArray205.length * 1931768639;
					method800(-985170959);
				}
				if (i_16_ > aByteArray205.length) {
					if (-2374020556457901911L * aLong207 != aLong208 * -5346161823662357463L) {
						aClass19_201.method785(aLong208 * -5346161823662357463L);
						aLong207 = aLong208 * -8813041329063438463L;
					}
					aClass19_201.method782(is, i, i_16_, 1357652815);
					aLong207 += (long) i_16_ * -2550420812163538023L;
					if (-2374020556457901911L * aLong207 > 4746354080516801925L * aLong211)
						aLong211 = -7982152102866217515L * aLong207;
					long l = -1L;
					long l_19_ = -1L;
					if ((-5346161823662357463L * aLong208 >= -4413502923195342277L * aLong209) && (aLong208 * -5346161823662357463L < (-4413502923195342277L * aLong209 + (long) (anInt210 * 412479013))))
						l = -5346161823662357463L * aLong208;
					else if ((aLong209 * -4413502923195342277L >= -5346161823662357463L * aLong208) && (-4413502923195342277L * aLong209 < ((long) i_16_ + aLong208 * -5346161823662357463L)))
						l = aLong209 * -4413502923195342277L;
					if (((long) i_16_ + -5346161823662357463L * aLong208 > aLong209 * -4413502923195342277L) && (aLong208 * -5346161823662357463L + (long) i_16_ <= (-4413502923195342277L * aLong209 + (long) (anInt210 * 412479013))))
						l_19_ = -5346161823662357463L * aLong208 + (long) i_16_;
					else if ((((long) (anInt210 * 412479013) + aLong209 * -4413502923195342277L) > -5346161823662357463L * aLong208) && ((-4413502923195342277L * aLong209 + (long) (412479013 * anInt210)) <= ((long) i_16_ + -5346161823662357463L * aLong208)))
						l_19_ = ((long) (412479013 * anInt210) + -4413502923195342277L * aLong209);
					if (l > -1L && l_19_ > l) {
						int i_20_ = (int) (l_19_ - l);
						System.arraycopy(is, (int) ((long) i + l - (-5346161823662357463L * aLong208)), aByteArray202, (int) (l - (aLong209 * -4413502923195342277L)), i_20_);
					}
					aLong208 += 7342927810909444121L * (long) i_16_;
				} else {
					if (i_16_ <= 0)
						break;
					if (-1L == aLong206 * 7114352031760711593L)
						aLong206 = 7632139665924649089L * aLong208;
					System.arraycopy(is, i, aByteArray205, (int) (-5346161823662357463L * aLong208 - 7114352031760711593L * aLong206), i_16_);
					aLong208 += (long) i_16_ * 7342927810909444121L;
					if ((aLong208 * -5346161823662357463L - 7114352031760711593L * aLong206) > (long) (514129087 * anInt200))
						anInt200 = (1931768639 * (int) (-5346161823662357463L * aLong208 - aLong206 * 7114352031760711593L));
				}
			} catch (IOException ioexception) {
				aLong207 = 2550420812163538023L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	public void method805(byte[] is) throws IOException {
		method802(is, 0, is.length, (byte) 0);
	}

	public void method806() throws IOException {
		method800(-178738464);
		aClass19_201.method786(1550109632);
	}

	public void method807() throws IOException {
		method800(-925060842);
		aClass19_201.method786(1288886656);
	}

	public void method808(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong208 = 7342927810909444121L * l;
	}

	public void method809(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		aLong208 = 7342927810909444121L * l;
	}

	public long method810() {
		return -6175775561911512793L * aLong204;
	}

	public Class20(Class19 class19, int i, int i_21_) throws IOException {
		aLong206 = -713404855637644441L;
		anInt200 = 0;
		aClass19_201 = class19;
		aLong204 = ((aLong211 = class19.method795(1441280358) * -6616089575393645747L) * 3749173388115642227L);
		aByteArray202 = new byte[i];
		aByteArray205 = new byte[i_21_];
		aLong208 = 0L;
	}

	public long method811(byte i) {
		return -6175775561911512793L * aLong204;
	}

	public void method812(byte[] is, int i, int i_22_) throws IOException {
		do {
			try {
				if (aLong208 * -5346161823662357463L + (long) i_22_ > -6175775561911512793L * aLong204)
					aLong204 = (((long) i_22_ + aLong208 * -5346161823662357463L) * 7783203740295532183L);
				if (-1L != 7114352031760711593L * aLong206 && ((-5346161823662357463L * aLong208 < aLong206 * 7114352031760711593L) || (aLong208 * -5346161823662357463L > (aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087)))))
					method800(-932045169);
				if (aLong206 * 7114352031760711593L != -1L && (-5346161823662357463L * aLong208 + (long) i_22_ > (7114352031760711593L * aLong206 + (long) aByteArray205.length))) {
					int i_23_ = (int) ((long) aByteArray205.length - (aLong208 * -5346161823662357463L - 7114352031760711593L * aLong206));
					System.arraycopy(is, i, aByteArray205, (int) (aLong208 * -5346161823662357463L - aLong206 * 7114352031760711593L), i_23_);
					aLong208 += 7342927810909444121L * (long) i_23_;
					i += i_23_;
					i_22_ -= i_23_;
					anInt200 = aByteArray205.length * 1931768639;
					method800(133216346);
				}
				if (i_22_ > aByteArray205.length) {
					if (-2374020556457901911L * aLong207 != aLong208 * -5346161823662357463L) {
						aClass19_201.method785(aLong208 * -5346161823662357463L);
						aLong207 = aLong208 * -8813041329063438463L;
					}
					aClass19_201.method782(is, i, i_22_, 1357652815);
					aLong207 += (long) i_22_ * -2550420812163538023L;
					if (-2374020556457901911L * aLong207 > 4746354080516801925L * aLong211)
						aLong211 = -7982152102866217515L * aLong207;
					long l = -1L;
					long l_24_ = -1L;
					if ((-5346161823662357463L * aLong208 >= -4413502923195342277L * aLong209) && (aLong208 * -5346161823662357463L < (-4413502923195342277L * aLong209 + (long) (anInt210 * 412479013))))
						l = -5346161823662357463L * aLong208;
					else if ((aLong209 * -4413502923195342277L >= -5346161823662357463L * aLong208) && (-4413502923195342277L * aLong209 < ((long) i_22_ + aLong208 * -5346161823662357463L)))
						l = aLong209 * -4413502923195342277L;
					if (((long) i_22_ + -5346161823662357463L * aLong208 > aLong209 * -4413502923195342277L) && (aLong208 * -5346161823662357463L + (long) i_22_ <= (-4413502923195342277L * aLong209 + (long) (anInt210 * 412479013))))
						l_24_ = -5346161823662357463L * aLong208 + (long) i_22_;
					else if ((((long) (anInt210 * 412479013) + aLong209 * -4413502923195342277L) > -5346161823662357463L * aLong208) && ((-4413502923195342277L * aLong209 + (long) (412479013 * anInt210)) <= ((long) i_22_ + -5346161823662357463L * aLong208)))
						l_24_ = ((long) (412479013 * anInt210) + -4413502923195342277L * aLong209);
					if (l > -1L && l_24_ > l) {
						int i_25_ = (int) (l_24_ - l);
						System.arraycopy(is, (int) ((long) i + l - (-5346161823662357463L * aLong208)), aByteArray202, (int) (l - (aLong209 * -4413502923195342277L)), i_25_);
					}
					aLong208 += 7342927810909444121L * (long) i_22_;
				} else {
					if (i_22_ <= 0)
						break;
					if (-1L == aLong206 * 7114352031760711593L)
						aLong206 = 7632139665924649089L * aLong208;
					System.arraycopy(is, i, aByteArray205, (int) (-5346161823662357463L * aLong208 - 7114352031760711593L * aLong206), i_22_);
					aLong208 += (long) i_22_ * 7342927810909444121L;
					if ((aLong208 * -5346161823662357463L - 7114352031760711593L * aLong206) > (long) (514129087 * anInt200))
						anInt200 = (1931768639 * (int) (-5346161823662357463L * aLong208 - aLong206 * 7114352031760711593L));
				}
			} catch (IOException ioexception) {
				aLong207 = 2550420812163538023L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	void method813() throws IOException {
		anInt210 = 0;
		if (-5346161823662357463L * aLong208 != -2374020556457901911L * aLong207) {
			aClass19_201.method785(-5346161823662357463L * aLong208);
			aLong207 = aLong208 * -8813041329063438463L;
		}
		aLong209 = aLong208 * 963542481578133739L;
		int i;
		for (/**/; 412479013 * anInt210 < aByteArray202.length; anInt210 += i * 2079227309) {
			int i_26_ = aByteArray202.length - 412479013 * anInt210;
			if (i_26_ > 200000000)
				i_26_ = 200000000;
			i = aClass19_201.method784(aByteArray202, anInt210 * 412479013, i_26_, (byte) 16);
			if (-1 == i)
				break;
			aLong207 += -2550420812163538023L * (long) i;
		}
	}

	void method814() throws IOException {
		anInt210 = 0;
		if (-5346161823662357463L * aLong208 != -2374020556457901911L * aLong207) {
			aClass19_201.method785(-5346161823662357463L * aLong208);
			aLong207 = aLong208 * -8813041329063438463L;
		}
		aLong209 = aLong208 * 963542481578133739L;
		int i;
		for (/**/; 412479013 * anInt210 < aByteArray202.length; anInt210 += i * 2079227309) {
			int i_27_ = aByteArray202.length - 412479013 * anInt210;
			if (i_27_ > 200000000)
				i_27_ = 200000000;
			i = aClass19_201.method784(aByteArray202, anInt210 * 412479013, i_27_, (byte) 16);
			if (-1 == i)
				break;
			aLong207 += -2550420812163538023L * (long) i;
		}
	}

	public void method815(byte[] is) throws IOException {
		method802(is, 0, is.length, (byte) 0);
	}

	public void method816(byte[] is, int i, int i_28_) throws IOException {
		try {
			if (i_28_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_28_ + i - is.length);
			if (-1L != aLong206 * 7114352031760711593L && (-5346161823662357463L * aLong208 >= 7114352031760711593L * aLong206) && (aLong208 * -5346161823662357463L + (long) i_28_ <= (aLong206 * 7114352031760711593L + (long) (514129087 * anInt200)))) {
				System.arraycopy(aByteArray205, (int) (aLong208 * -5346161823662357463L - 7114352031760711593L * aLong206), is, i, i_28_);
				aLong208 += 7342927810909444121L * (long) i_28_;
				return;
			}
			long l = -5346161823662357463L * aLong208;
			int i_29_ = i;
			int i_30_ = i_28_;
			if ((-5346161823662357463L * aLong208 >= -4413502923195342277L * aLong209) && (aLong208 * -5346161823662357463L < ((long) (anInt210 * 412479013) + -4413502923195342277L * aLong209))) {
				int i_31_ = (int) ((long) (412479013 * anInt210) - (aLong208 * -5346161823662357463L - -4413502923195342277L * aLong209));
				if (i_31_ > i_28_)
					i_31_ = i_28_;
				System.arraycopy(aByteArray202, (int) (-5346161823662357463L * aLong208 - -4413502923195342277L * aLong209), is, i, i_31_);
				aLong208 += 7342927810909444121L * (long) i_31_;
				i += i_31_;
				i_28_ -= i_31_;
			}
			if (i_28_ > aByteArray202.length) {
				aClass19_201.method785(aLong208 * -5346161823662357463L);
				aLong207 = aLong208 * -8813041329063438463L;
				int i_32_;
				for (/**/; i_28_ > 0; i_28_ -= i_32_) {
					i_32_ = aClass19_201.method784(is, i, i_28_, (byte) 16);
					if (i_32_ == -1)
						break;
					aLong207 += (long) i_32_ * -2550420812163538023L;
					aLong208 += (long) i_32_ * 7342927810909444121L;
					i += i_32_;
				}
			} else if (i_28_ > 0) {
				method803((short) -6345);
				int i_33_ = i_28_;
				if (i_33_ > anInt210 * 412479013)
					i_33_ = 412479013 * anInt210;
				System.arraycopy(aByteArray202, 0, is, i, i_33_);
				i += i_33_;
				i_28_ -= i_33_;
				aLong208 += 7342927810909444121L * (long) i_33_;
			}
			if (-1L != 7114352031760711593L * aLong206) {
				if ((7114352031760711593L * aLong206 > -5346161823662357463L * aLong208) && i_28_ > 0) {
					int i_34_ = ((int) (7114352031760711593L * aLong206 - -5346161823662357463L * aLong208) + i);
					if (i_34_ > i + i_28_)
						i_34_ = i + i_28_;
					while (i < i_34_) {
						is[i++] = (byte) 0;
						i_28_--;
						aLong208 += 7342927810909444121L;
					}
				}
				long l_35_ = -1L;
				long l_36_ = -1L;
				if (aLong206 * 7114352031760711593L >= l && aLong206 * 7114352031760711593L < l + (long) i_30_)
					l_35_ = aLong206 * 7114352031760711593L;
				else if (l >= aLong206 * 7114352031760711593L && l < ((long) (514129087 * anInt200) + 7114352031760711593L * aLong206))
					l_35_ = l;
				if (aLong206 * 7114352031760711593L + (long) (514129087 * anInt200) > l && (7114352031760711593L * aLong206 + (long) (anInt200 * 514129087) <= l + (long) i_30_))
					l_36_ = (aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087));
				else if (l + (long) i_30_ > aLong206 * 7114352031760711593L && (l + (long) i_30_ <= (aLong206 * 7114352031760711593L + (long) (anInt200 * 514129087))))
					l_36_ = (long) i_30_ + l;
				if (l_35_ > -1L && l_36_ > l_35_) {
					int i_37_ = (int) (l_36_ - l_35_);
					System.arraycopy(aByteArray205, (int) (l_35_ - aLong206 * 7114352031760711593L), is, (int) (l_35_ - l) + i_29_, i_37_);
					if (l_36_ > aLong208 * -5346161823662357463L) {
						i_28_ -= l_36_ - aLong208 * -5346161823662357463L;
						aLong208 = 7342927810909444121L * l_36_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong207 = 2550420812163538023L;
			throw ioexception;
		}
		if (i_28_ > 0)
			throw new EOFException();
	}

	public static final void method817(String string, int i) {
		int i_38_ = client.aBool11156 ? 400 : 200;
		if (null != string) {
			if (1563815891 * client.anInt11287 >= i_38_)
				Class214.method3840(4, (client.aBool11156 ? Class39.aClass39_413.method1124((Class53_Sub20.aClass668_10979), (byte) -59) : Class39.aClass39_414.method1124((Class53_Sub20.aClass668_10979), (byte) -121)), 2017561212);
			else {
				String string_39_ = Class226.method4163(string, Class112.aClass73_1351, (byte) 126);
				if (string_39_ != null) {
					for (int i_40_ = 0; i_40_ < 1563815891 * client.anInt11287; i_40_++) {
						Class60 class60 = client.aClass60Array11182[i_40_];
						String string_41_ = Class226.method4163(class60.aString763, Class112.aClass73_1351, (byte) 116);
						if (null != string_41_ && string_41_.equals(string_39_)) {
							Class214.method3840(4, new StringBuilder().append(string).append(Class39.aClass39_523.method1124((Class53_Sub20.aClass668_10979), (byte) -83)).toString(), 1885312343);
							return;
						}
						if (null != class60.aString764) {
							String string_42_ = Class226.method4163(class60.aString764, Class112.aClass73_1351, (byte) 80);
							if (string_42_ != null && string_42_.equals(string_39_)) {
								Class214.method3840(4, new StringBuilder().append(string).append(Class39.aClass39_523.method1124((Class53_Sub20.aClass668_10979), (byte) -58)).toString(), 2117693367);
								return;
							}
						}
					}
					for (int i_43_ = 0; i_43_ < 54287651 * client.anInt11078; i_43_++) {
						Class51 class51 = client.aClass51Array11294[i_43_];
						String string_44_ = Class226.method4163(class51.aString714, Class112.aClass73_1351, (byte) 101);
						if (string_44_ != null && string_44_.equals(string_39_)) {
							Class214.method3840(4, new StringBuilder().append(Class39.aClass39_530.method1124(Class53_Sub20.aClass668_10979, (byte) -122)).append(string).append(Class39.aClass39_404.method1124(Class53_Sub20.aClass668_10979, (byte) -37)).toString(), 2025814603);
							return;
						}
						if (null != class51.aString712) {
							String string_45_ = Class226.method4163(class51.aString712, Class112.aClass73_1351, (byte) 54);
							if (string_45_ != null && string_45_.equals(string_39_)) {
								Class214.method3840(4, new StringBuilder().append(Class39.aClass39_530.method1124(Class53_Sub20.aClass668_10979, (byte) -78)).append(string).append(Class39.aClass39_404.method1124(Class53_Sub20.aClass668_10979, (byte) -69)).toString(), 1891140653);
								return;
							}
						}
					}
					if (Class226.method4163((Class241.player.username), Class112.aClass73_1351, (byte) 62).equals(string_39_))
						Class214.method3840(4, (Class39.aClass39_527.method1124(Class53_Sub20.aClass668_10979, (byte) -97)), 2127248874);
					else {
						RSStream class116 = Class537.method8941(-1384989808);
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4283), (class116.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) 30), 2092527272);
						class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 37);
						class116.method1974(class523_sub22, (byte) 64);
					}
				}
			}
		}
	}
}
