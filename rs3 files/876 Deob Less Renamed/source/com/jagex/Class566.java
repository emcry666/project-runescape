/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;
import java.io.IOException;
import java.io.OutputStream;

public class Class566 implements Runnable {
	OutputStream anOutputStream7598;
	Thread aThread7599;
	int anInt7600;
	byte[] aByteArray7601;
	int anInt7602 = 0;
	int anInt7603 = 0;
	IOException anIOException7604;
	boolean aBool7605;
	static Class148[] aClass148Array7606;

	Class566(OutputStream outputstream, int i) {
		anOutputStream7598 = outputstream;
		anInt7600 = 1928180967 * (1 + i);
		aByteArray7601 = new byte[-1740235049 * anInt7600];
		aThread7599 = new Thread(this);
		aThread7599.setDaemon(true);
		aThread7599.start();
	}

	boolean method9487(int i) {
		if (aBool7605) {
			try {
				anOutputStream7598.close();
				if (null == anIOException7604)
					anIOException7604 = new IOException("");
			} catch (IOException ioexception) {
				if (anIOException7604 == null)
					anIOException7604 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	void method9488(byte[] is, int i, int i_0_) throws IOException {
		if (i_0_ < 0 || i < 0 || i + i_0_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (null != anIOException7604)
				throw new IOException(anIOException7604.toString());
			int i_1_;
			if (anInt7602 * -1470091901 <= 1005095779 * anInt7603)
				i_1_ = (anInt7600 * -1740235049 - anInt7603 * 1005095779 + anInt7602 * -1470091901 - 1);
			else
				i_1_ = -1470091901 * anInt7602 - 1005095779 * anInt7603 - 1;
			if (i_1_ < i_0_)
				throw new IOException("");
			if (i_0_ + anInt7603 * 1005095779 <= -1740235049 * anInt7600)
				System.arraycopy(is, i, aByteArray7601, anInt7603 * 1005095779, i_0_);
			else {
				int i_2_ = anInt7600 * -1740235049 - anInt7603 * 1005095779;
				System.arraycopy(is, i, aByteArray7601, anInt7603 * 1005095779, i_2_);
				System.arraycopy(is, i_2_ + i, aByteArray7601, 0, i_0_ - i_2_);
			}
			anInt7603 = ((anInt7603 * 1005095779 + i_0_) % (anInt7600 * -1740235049) * 137186891);
			this.notifyAll();
		}
	}

	void method9489() {
		synchronized (this) {
			aBool7605 = true;
			this.notifyAll();
		}
		try {
			aThread7599.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method9490(int i) {
		synchronized (this) {
			aBool7605 = true;
			this.notifyAll();
		}
		try {
			aThread7599.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method9491(int i) {
		anOutputStream7598 = new OutputStream_Sub1();
	}

	public void method9492() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7604 != null)
						return;
					if (-1470091901 * anInt7602 <= 1005095779 * anInt7603)
						i = 1005095779 * anInt7603 - anInt7602 * -1470091901;
					else
						i = (1005095779 * anInt7603 + (-1740235049 * anInt7600 - -1470091901 * anInt7602));
					if (i > 0)
						break;
					try {
						anOutputStream7598.flush();
					} catch (IOException ioexception) {
						anIOException7604 = ioexception;
						return;
					}
					if (method9487(-2077804207))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (-1470091901 * anInt7602 + i <= -1740235049 * anInt7600)
					anOutputStream7598.write(aByteArray7601, -1470091901 * anInt7602, i);
				else {
					int i_3_ = anInt7600 * -1740235049 - -1470091901 * anInt7602;
					anOutputStream7598.write(aByteArray7601, anInt7602 * -1470091901, i_3_);
					anOutputStream7598.write(aByteArray7601, 0, i - i_3_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7604 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7602 = ((anInt7602 * -1470091901 + i) % (-1740235049 * anInt7600) * -515225301);
			}
		} while (!method9487(-2099358880));
	}

	public void method9493() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7604 != null)
						return;
					if (-1470091901 * anInt7602 <= 1005095779 * anInt7603)
						i = 1005095779 * anInt7603 - anInt7602 * -1470091901;
					else
						i = (1005095779 * anInt7603 + (-1740235049 * anInt7600 - -1470091901 * anInt7602));
					if (i > 0)
						break;
					try {
						anOutputStream7598.flush();
					} catch (IOException ioexception) {
						anIOException7604 = ioexception;
						return;
					}
					if (method9487(-2123796325))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (-1470091901 * anInt7602 + i <= -1740235049 * anInt7600)
					anOutputStream7598.write(aByteArray7601, -1470091901 * anInt7602, i);
				else {
					int i_4_ = anInt7600 * -1740235049 - -1470091901 * anInt7602;
					anOutputStream7598.write(aByteArray7601, anInt7602 * -1470091901, i_4_);
					anOutputStream7598.write(aByteArray7601, 0, i - i_4_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7604 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7602 = ((anInt7602 * -1470091901 + i) % (-1740235049 * anInt7600) * -515225301);
			}
		} while (!method9487(-2085872565));
	}

	void method9494() {
		anOutputStream7598 = new OutputStream_Sub1();
	}

	void method9495(byte[] is, int i, int i_5_) throws IOException {
		if (i_5_ < 0 || i < 0 || i + i_5_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (null != anIOException7604)
				throw new IOException(anIOException7604.toString());
			int i_6_;
			if (anInt7602 * -1470091901 <= 1005095779 * anInt7603)
				i_6_ = (anInt7600 * -1740235049 - anInt7603 * 1005095779 + anInt7602 * -1470091901 - 1);
			else
				i_6_ = -1470091901 * anInt7602 - 1005095779 * anInt7603 - 1;
			if (i_6_ < i_5_)
				throw new IOException("");
			if (i_5_ + anInt7603 * 1005095779 <= -1740235049 * anInt7600)
				System.arraycopy(is, i, aByteArray7601, anInt7603 * 1005095779, i_5_);
			else {
				int i_7_ = anInt7600 * -1740235049 - anInt7603 * 1005095779;
				System.arraycopy(is, i, aByteArray7601, anInt7603 * 1005095779, i_7_);
				System.arraycopy(is, i_7_ + i, aByteArray7601, 0, i_5_ - i_7_);
			}
			anInt7603 = ((anInt7603 * 1005095779 + i_5_) % (anInt7600 * -1740235049) * 137186891);
			this.notifyAll();
		}
	}

	void method9496(byte[] is, int i, int i_8_, byte i_9_) throws IOException {
		if (i_8_ < 0 || i < 0 || i + i_8_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (null != anIOException7604)
				throw new IOException(anIOException7604.toString());
			int i_10_;
			if (anInt7602 * -1470091901 <= 1005095779 * anInt7603)
				i_10_ = (anInt7600 * -1740235049 - anInt7603 * 1005095779 + anInt7602 * -1470091901 - 1);
			else
				i_10_ = -1470091901 * anInt7602 - 1005095779 * anInt7603 - 1;
			if (i_10_ < i_8_)
				throw new IOException("");
			if (i_8_ + anInt7603 * 1005095779 <= -1740235049 * anInt7600)
				System.arraycopy(is, i, aByteArray7601, anInt7603 * 1005095779, i_8_);
			else {
				int i_11_ = anInt7600 * -1740235049 - anInt7603 * 1005095779;
				System.arraycopy(is, i, aByteArray7601, anInt7603 * 1005095779, i_11_);
				System.arraycopy(is, i_11_ + i, aByteArray7601, 0, i_8_ - i_11_);
			}
			anInt7603 = ((anInt7603 * 1005095779 + i_8_) % (anInt7600 * -1740235049) * 137186891);
			this.notifyAll();
		}
	}

	public void run() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7604 != null)
						return;
					if (-1470091901 * anInt7602 <= 1005095779 * anInt7603)
						i = 1005095779 * anInt7603 - anInt7602 * -1470091901;
					else
						i = (1005095779 * anInt7603 + (-1740235049 * anInt7600 - -1470091901 * anInt7602));
					if (i > 0)
						break;
					try {
						anOutputStream7598.flush();
					} catch (IOException ioexception) {
						anIOException7604 = ioexception;
						return;
					}
					if (method9487(-2096239784))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (-1470091901 * anInt7602 + i <= -1740235049 * anInt7600)
					anOutputStream7598.write(aByteArray7601, -1470091901 * anInt7602, i);
				else {
					int i_12_ = anInt7600 * -1740235049 - -1470091901 * anInt7602;
					anOutputStream7598.write(aByteArray7601, anInt7602 * -1470091901, i_12_);
					anOutputStream7598.write(aByteArray7601, 0, i - i_12_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7604 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7602 = ((anInt7602 * -1470091901 + i) % (-1740235049 * anInt7600) * -515225301);
			}
		} while (!method9487(-2140736416));
	}

	boolean method9497() {
		if (aBool7605) {
			try {
				anOutputStream7598.close();
				if (null == anIOException7604)
					anIOException7604 = new IOException("");
			} catch (IOException ioexception) {
				if (anIOException7604 == null)
					anIOException7604 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	void method9498() {
		anOutputStream7598 = new OutputStream_Sub1();
	}

	void method9499() {
		anOutputStream7598 = new OutputStream_Sub1();
	}

	void method9500() {
		anOutputStream7598 = new OutputStream_Sub1();
	}

	static void method9501(int i) {
		synchronized (Class644.aQueue8346) {
			Point point;
			if (Class523_Sub18_Sub8.aCanvas11689.isShowing())
				point = Class523_Sub18_Sub8.aCanvas11689.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) Class644.aQueue8346.poll();
				if (class523_sub39_sub2 == null)
					break;
				if (null == point || !Class523_Sub18_Sub8.aCanvas11689.isShowing() || !Class341.aBool3608)
					class523_sub39_sub2.method16523((byte) 64);
				else {
					class523_sub39_sub2.method18167(point, (byte) 11);
					if (!class523_sub39_sub2.method18180(1876783201) && (class523_sub39_sub2.method16519(-1823905751) < 2141365743 * Class170.anInt1833) && (class523_sub39_sub2.method16520((byte) 127) < Class254.anInt2742 * -495986435) && class523_sub39_sub2.method16519(142432689) >= 0 && class523_sub39_sub2.method16520((byte) 127) >= 0) {
						int i_13_ = class523_sub39_sub2.method16518(-1905499279);
						if (class523_sub39_sub2.method16518(-1905499279) == -1)
							Class644.aClass637_Sub1_8343.method10455(class523_sub39_sub2, -2143173068);
						else if (Class597.method9848(i_13_, -1059611399))
							Class644.aClass637_Sub1_8343.method16689(class523_sub39_sub2, (byte) -18);
					}
				}
			}
		}
	}

	static final void method9502(Class669 class669, int i) {
		if (-1746920271 * client.rights >= 2)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1746920271 * client.rights;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static String method9503(Class523_Sub34 class523_sub34, int i, int i_14_) {
		String string;
		try {
			int i_15_ = class523_sub34.readUnsignedSmart(368514876);
			if (i_15_ > i)
				i_15_ = i;
			byte[] is = new byte[i_15_];
			class523_sub34.anInt10661 += (Class260.aClass262_2837.method4731((class523_sub34.aByteArray10658), (class523_sub34.anInt10661) * 2349011, is, 0, i_15_, (short) 5921) * 189765723);
			String string_16_ = Class651.method10636(is, 0, i_15_, -1210151419);
			string = string_16_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}
}
