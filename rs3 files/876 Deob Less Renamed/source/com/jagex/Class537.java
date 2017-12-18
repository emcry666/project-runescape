/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class537 {
	int anInt7209;
	int anInt7210;
	Class526[] aClass526Array7211;
	int anInt7212;
	Class525 this$0;

	Class526 method8931(int i, byte i_0_) {
		return (aClass526Array7211[(((i & -2132246537 * anInt7212) << anInt7209 * 1164947919) + ((i_0_ & 0xff) >>> 8 - anInt7209 * 1164947919))]);
	}

	void method8932(int i, int i_1_, int i_2_) {
		if (aClass526Array7211 == null || 1164947919 * anInt7209 != i_1_ || i != anInt7210 * 1735378893) {
			anInt7210 = 961182981 * i;
			anInt7212 = ((1 << i) - 1) * -2107903545;
			anInt7209 = -527846097 * i_1_;
			int i_3_ = 1 << anInt7209 * 1164947919 + anInt7210 * 1735378893;
			aClass526Array7211 = new Class526[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				aClass526Array7211[i_4_] = new Class526(this);
		}
	}

	void method8933(byte i) {
		int i_5_ = 1 << 1164947919 * anInt7209 + anInt7210 * 1735378893;
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			aClass526Array7211[i_6_].method8714(-1846386947);
	}

	Class526 method8934(int i, byte i_7_, byte i_8_) {
		return (aClass526Array7211[(((i & -2132246537 * anInt7212) << anInt7209 * 1164947919) + ((i_7_ & 0xff) >>> 8 - anInt7209 * 1164947919))]);
	}

	void method8935(int i, int i_9_) {
		if (aClass526Array7211 == null || 1164947919 * anInt7209 != i_9_ || i != anInt7210 * 1735378893) {
			anInt7210 = 961182981 * i;
			anInt7212 = ((1 << i) - 1) * -2107903545;
			anInt7209 = -527846097 * i_9_;
			int i_10_ = 1 << anInt7209 * 1164947919 + anInt7210 * 1735378893;
			aClass526Array7211 = new Class526[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				aClass526Array7211[i_11_] = new Class526(this);
		}
	}

	Class537(Class525 class525) {
		this$0 = class525;
	}

	void method8936(int i, int i_12_) {
		if (aClass526Array7211 == null || 1164947919 * anInt7209 != i_12_ || i != anInt7210 * 1735378893) {
			anInt7210 = 961182981 * i;
			anInt7212 = ((1 << i) - 1) * -2107903545;
			anInt7209 = -527846097 * i_12_;
			int i_13_ = 1 << anInt7209 * 1164947919 + anInt7210 * 1735378893;
			aClass526Array7211 = new Class526[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
				aClass526Array7211[i_14_] = new Class526(this);
		}
	}

	void method8937() {
		int i = 1 << 1164947919 * anInt7209 + anInt7210 * 1735378893;
		for (int i_15_ = 0; i_15_ < i; i_15_++)
			aClass526Array7211[i_15_].method8714(-1846386947);
	}

	void method8938() {
		int i = 1 << 1164947919 * anInt7209 + anInt7210 * 1735378893;
		for (int i_16_ = 0; i_16_ < i; i_16_++)
			aClass526Array7211[i_16_].method8714(-1846386947);
	}

	void method8939(int i, int i_17_) {
		if (aClass526Array7211 == null || 1164947919 * anInt7209 != i_17_ || i != anInt7210 * 1735378893) {
			anInt7210 = 961182981 * i;
			anInt7212 = ((1 << i) - 1) * -2107903545;
			anInt7209 = -527846097 * i_17_;
			int i_18_ = 1 << anInt7209 * 1164947919 + anInt7210 * 1735378893;
			aClass526Array7211 = new Class526[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
				aClass526Array7211[i_19_] = new Class526(this);
		}
	}

	static final void method8940(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (string.startsWith(Class328_Sub3.method15694(0, -173837047)) || string.startsWith(Class328_Sub3.method15694(1, -1864461665)))
			string = string.substring(7);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class97.method1773(string, (byte) 0) ? 1 : 0;
	}

	public static Class116 method8941(int i) {
		if (Class691.method13965(-2020118759 * client.anInt11136, (byte) -74) || 11 == -2020118759 * client.anInt11136)
			return client.aClass116_11057;
		return client.aClass116_11058;
	}

	static final void method8942(Class250 class250, Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
		int i_20_ = class669.anIntArray8557[1357652815 * class669.anInt8558] - 1;
		if (i_20_ < 0 || i_20_ > 9)
			throw new RuntimeException();
		Class495.method8098(class250, i_20_, class669, -1042131671);
	}
}
