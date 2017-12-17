/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class555 implements Runnable {
	int anInt7470;
	InputStream anInputStream7471;
	Thread aThread7472;
	byte[] aByteArray7473;
	int anInt7474 = 0;
	int anInt7475 = 0;
	IOException anIOException7476;
	public static Class472 aClass472_7477;
	static int anInt7478;

	boolean method9173(int i, byte i_0_) throws IOException {
		if (i <= 0 || i >= -1408937379 * anInt7470)
			throw new IOException();
		synchronized (this) {
			int i_1_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_1_ = -110610055 * anInt7475 - 480196599 * anInt7474;
			else
				i_1_ = -110610055 * anInt7475 + (-1408937379 * anInt7470 - anInt7474 * 480196599);
			if (i_1_ < i) {
				if (null != anIOException7476)
					throw new IOException(anIOException7476.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	public void run() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7476 != null)
						return;
					if (anInt7474 * 480196599 == 0)
						i = (anInt7470 * -1408937379 - -110610055 * anInt7475 - 1);
					else if (480196599 * anInt7474 <= -110610055 * anInt7475)
						i = anInt7470 * -1408937379 - -110610055 * anInt7475;
					else
						i = 480196599 * anInt7474 - anInt7475 * -110610055 - 1;
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_2_;
			try {
				i_2_ = anInputStream7471.read(aByteArray7473, -110610055 * anInt7475, i);
				if (-1 == i_2_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7476 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7475 = ((anInt7475 * -110610055 + i_2_) % (-1408937379 * anInt7470) * -626401079);
			}
		}
	}

	int method9174(byte i) throws IOException {
		synchronized (this) {
			int i_3_;
			if (480196599 * anInt7474 <= anInt7475 * -110610055)
				i_3_ = -110610055 * anInt7475 - anInt7474 * 480196599;
			else
				i_3_ = (anInt7470 * -1408937379 - anInt7474 * 480196599 + -110610055 * anInt7475);
			if (anIOException7476 != null)
				throw new IOException(anIOException7476.toString());
			this.notifyAll();
			int i_4_ = i_3_;
			return i_4_;
		}
	}

	void method9175() {
		synchronized (this) {
			if (anIOException7476 == null)
				anIOException7476 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7472.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	int method9176(byte[] is, int i, int i_5_, byte i_6_) throws IOException {
		if (i_5_ < 0 || i < 0 || i + i_5_ > is.length)
			throw new IOException();
		synchronized (this) {
			int i_7_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_7_ = anInt7475 * -110610055 - anInt7474 * 480196599;
			else
				i_7_ = anInt7475 * -110610055 + (-1408937379 * anInt7470 - 480196599 * anInt7474);
			if (i_5_ > i_7_)
				i_5_ = i_7_;
			if (0 == i_5_ && anIOException7476 != null)
				throw new IOException(anIOException7476.toString());
			if (anInt7474 * 480196599 + i_5_ <= anInt7470 * -1408937379)
				System.arraycopy(aByteArray7473, anInt7474 * 480196599, is, i, i_5_);
			else {
				int i_8_ = anInt7470 * -1408937379 - 480196599 * anInt7474;
				System.arraycopy(aByteArray7473, 480196599 * anInt7474, is, i, i_8_);
				System.arraycopy(aByteArray7473, 0, is, i_8_ + i, i_5_ - i_8_);
			}
			anInt7474 = 1728494023 * ((i_5_ + anInt7474 * 480196599) % (-1408937379 * anInt7470));
			this.notifyAll();
			int i_9_ = i_5_;
			return i_9_;
		}
	}

	int method9177(byte[] is, int i, int i_10_) throws IOException {
		if (i_10_ < 0 || i < 0 || i + i_10_ > is.length)
			throw new IOException();
		synchronized (this) {
			int i_11_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_11_ = anInt7475 * -110610055 - anInt7474 * 480196599;
			else
				i_11_ = anInt7475 * -110610055 + (-1408937379 * anInt7470 - 480196599 * anInt7474);
			if (i_10_ > i_11_)
				i_10_ = i_11_;
			if (0 == i_10_ && anIOException7476 != null)
				throw new IOException(anIOException7476.toString());
			if (anInt7474 * 480196599 + i_10_ <= anInt7470 * -1408937379)
				System.arraycopy(aByteArray7473, anInt7474 * 480196599, is, i, i_10_);
			else {
				int i_12_ = anInt7470 * -1408937379 - 480196599 * anInt7474;
				System.arraycopy(aByteArray7473, 480196599 * anInt7474, is, i, i_12_);
				System.arraycopy(aByteArray7473, 0, is, i_12_ + i, i_10_ - i_12_);
			}
			anInt7474 = 1728494023 * ((i_10_ + anInt7474 * 480196599) % (-1408937379 * anInt7470));
			this.notifyAll();
			int i_13_ = i_10_;
			return i_13_;
		}
	}

	void method9178(int i) {
		synchronized (this) {
			if (anIOException7476 == null)
				anIOException7476 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7472.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method9179() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7476 != null)
						return;
					if (anInt7474 * 480196599 == 0)
						i = (anInt7470 * -1408937379 - -110610055 * anInt7475 - 1);
					else if (480196599 * anInt7474 <= -110610055 * anInt7475)
						i = anInt7470 * -1408937379 - -110610055 * anInt7475;
					else
						i = 480196599 * anInt7474 - anInt7475 * -110610055 - 1;
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_14_;
			try {
				i_14_ = anInputStream7471.read(aByteArray7473, -110610055 * anInt7475, i);
				if (-1 == i_14_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7476 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7475 = ((anInt7475 * -110610055 + i_14_) % (-1408937379 * anInt7470) * -626401079);
			}
		}
	}

	public void method9180() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7476 != null)
						return;
					if (anInt7474 * 480196599 == 0)
						i = (anInt7470 * -1408937379 - -110610055 * anInt7475 - 1);
					else if (480196599 * anInt7474 <= -110610055 * anInt7475)
						i = anInt7470 * -1408937379 - -110610055 * anInt7475;
					else
						i = 480196599 * anInt7474 - anInt7475 * -110610055 - 1;
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_15_;
			try {
				i_15_ = anInputStream7471.read(aByteArray7473, -110610055 * anInt7475, i);
				if (-1 == i_15_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7476 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7475 = ((anInt7475 * -110610055 + i_15_) % (-1408937379 * anInt7470) * -626401079);
			}
		}
	}

	boolean method9181(int i) throws IOException {
		if (i <= 0 || i >= -1408937379 * anInt7470)
			throw new IOException();
		synchronized (this) {
			int i_16_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_16_ = -110610055 * anInt7475 - 480196599 * anInt7474;
			else
				i_16_ = -110610055 * anInt7475 + (-1408937379 * anInt7470 - anInt7474 * 480196599);
			if (i_16_ < i) {
				if (null != anIOException7476)
					throw new IOException(anIOException7476.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	boolean method9182(int i) throws IOException {
		if (i <= 0 || i >= -1408937379 * anInt7470)
			throw new IOException();
		synchronized (this) {
			int i_17_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_17_ = -110610055 * anInt7475 - 480196599 * anInt7474;
			else
				i_17_ = -110610055 * anInt7475 + (-1408937379 * anInt7470 - anInt7474 * 480196599);
			if (i_17_ < i) {
				if (null != anIOException7476)
					throw new IOException(anIOException7476.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	int method9183(byte[] is, int i, int i_18_) throws IOException {
		if (i_18_ < 0 || i < 0 || i + i_18_ > is.length)
			throw new IOException();
		synchronized (this) {
			int i_19_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_19_ = anInt7475 * -110610055 - anInt7474 * 480196599;
			else
				i_19_ = anInt7475 * -110610055 + (-1408937379 * anInt7470 - 480196599 * anInt7474);
			if (i_18_ > i_19_)
				i_18_ = i_19_;
			if (0 == i_18_ && anIOException7476 != null)
				throw new IOException(anIOException7476.toString());
			if (anInt7474 * 480196599 + i_18_ <= anInt7470 * -1408937379)
				System.arraycopy(aByteArray7473, anInt7474 * 480196599, is, i, i_18_);
			else {
				int i_20_ = anInt7470 * -1408937379 - 480196599 * anInt7474;
				System.arraycopy(aByteArray7473, 480196599 * anInt7474, is, i, i_20_);
				System.arraycopy(aByteArray7473, 0, is, i_20_ + i, i_18_ - i_20_);
			}
			anInt7474 = 1728494023 * ((i_18_ + anInt7474 * 480196599) % (-1408937379 * anInt7470));
			this.notifyAll();
			int i_21_ = i_18_;
			return i_21_;
		}
	}

	int method9184() throws IOException {
		synchronized (this) {
			int i;
			if (480196599 * anInt7474 <= anInt7475 * -110610055)
				i = -110610055 * anInt7475 - anInt7474 * 480196599;
			else
				i = (anInt7470 * -1408937379 - anInt7474 * 480196599 + -110610055 * anInt7475);
			if (anIOException7476 != null)
				throw new IOException(anIOException7476.toString());
			this.notifyAll();
			int i_22_ = i;
			return i_22_;
		}
	}

	int method9185() throws IOException {
		synchronized (this) {
			int i;
			if (480196599 * anInt7474 <= anInt7475 * -110610055)
				i = -110610055 * anInt7475 - anInt7474 * 480196599;
			else
				i = (anInt7470 * -1408937379 - anInt7474 * 480196599 + -110610055 * anInt7475);
			if (anIOException7476 != null)
				throw new IOException(anIOException7476.toString());
			this.notifyAll();
			int i_23_ = i;
			return i_23_;
		}
	}

	boolean method9186(int i) throws IOException {
		if (i <= 0 || i >= -1408937379 * anInt7470)
			throw new IOException();
		synchronized (this) {
			int i_24_;
			if (anInt7474 * 480196599 <= anInt7475 * -110610055)
				i_24_ = -110610055 * anInt7475 - 480196599 * anInt7474;
			else
				i_24_ = -110610055 * anInt7475 + (-1408937379 * anInt7470 - anInt7474 * 480196599);
			if (i_24_ < i) {
				if (null != anIOException7476)
					throw new IOException(anIOException7476.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	Class555(InputStream inputstream, int i) {
		anInputStream7471 = inputstream;
		anInt7470 = -1355804171 * (1 + i);
		aByteArray7473 = new byte[-1408937379 * anInt7470];
		aThread7472 = new Thread(this);
		aThread7472.setDaemon(true);
		aThread7472.start();
	}

	void method9187(int i) {
		anInputStream7471 = new InputStream_Sub1();
	}

	void method9188() {
		anInputStream7471 = new InputStream_Sub1();
	}

	static final void method9189(Class669 class669, int i) {
		int i_25_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_25_, (byte) 56));
		if (-60850717 * class12.anInt152 >= 0 && 1674718533 * class12.anInt151 >= 0)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1674718533 * class12.anInt151;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_25_;
	}

	public static Class384 method9190(RSBuffer class523_sub34, int i) {
		Class384 class384 = Class2.method514(class523_sub34, -1269178217);
		int i_26_ = class523_sub34.readBigSmart((byte) -112);
		int i_27_ = class523_sub34.readBigSmart((byte) -68);
		int i_28_ = class523_sub34.readBigSmart((byte) -81);
		int i_29_ = class523_sub34.readBigSmart((byte) -69);
		int i_30_ = class523_sub34.readBigSmart((byte) -59);
		int i_31_ = class523_sub34.readBigSmart((byte) -47);
		return new Class384_Sub2(class384.aClass380_3974, class384.aClass389_3968, class384.anInt3970 * 1653743623, -1732272073 * class384.anInt3969, 1773515723 * class384.anInt3971, -1825534571 * class384.anInt3972, class384.anInt3973 * -913347581, class384.anInt3967 * -2021763229, -495047775 * class384.anInt3975, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_);
	}

	public static int method9191(int i, boolean bool, int i_32_) {
		if (bool)
			return 0;
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1476736305);
		if (class523_sub1 == null)
			return ((((Class523_Sub27_Sub1) Class115.aClass53_Sub20_1412.getDefinition(i, (byte) -10)).anInt11327) * -380706733);
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < class523_sub1.itemIds.length; i_34_++) {
			if (-1 == class523_sub1.itemIds[i_34_])
				i_33_++;
		}
		i_33_ += ((((Class523_Sub27_Sub1) Class115.aClass53_Sub20_1412.getDefinition(i, (byte) -3)).anInt11327) * -380706733 - class523_sub1.itemIds.length);
		return i_33_;
	}

	static void method9192(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_35_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_36_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_36_, (byte) -17);
		if (class76.method1537((byte) -60)) {
			String string = class76.aString849;
			if (-1 == i_35_)
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
			else
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((Class280) Class655.aClass58_Sub1_8422.getDefinition(i_35_, (byte) -11)).method5066(i_36_, string, -531378095);
		} else {
			int i_37_ = class76.anInt850 * -1100663923;
			if (-1 == i_35_)
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_37_;
			else
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = ((Class280) Class655.aClass58_Sub1_8422.getDefinition(i_35_, (byte) 53)).method5078(i_36_, i_37_, (byte) 1);
		}
	}

	public static Class10 method9193(Class472 class472, int i, Interface4 interface4, int i_38_) {
		byte[] is = class472.method7721(i, -387132909);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}
}
