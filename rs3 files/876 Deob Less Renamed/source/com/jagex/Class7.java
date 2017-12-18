/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class7 implements Interface13, Interface6 {
	public int anInt49;
	public int anInt50;
	public int anInt51;
	public boolean aBool52;
	public boolean aBool53;
	public int anInt54;
	public int anInt55;
	public int anInt56;
	int anInt57 = 0;

	void method556(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_0_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_1_ = (double) (i & 0xff) / 256.0;
		double d_2_ = d;
		if (d_0_ < d_2_)
			d_2_ = d_0_;
		if (d_1_ < d_2_)
			d_2_ = d_1_;
		double d_3_ = d;
		if (d_0_ > d_3_)
			d_3_ = d_0_;
		if (d_1_ > d_3_)
			d_3_ = d_1_;
		double d_4_ = 0.0;
		double d_5_ = 0.0;
		double d_6_ = (d_2_ + d_3_) / 2.0;
		if (d_3_ != d_2_) {
			if (d_6_ < 0.5)
				d_5_ = (d_3_ - d_2_) / (d_2_ + d_3_);
			if (d_6_ >= 0.5)
				d_5_ = (d_3_ - d_2_) / (2.0 - d_3_ - d_2_);
			if (d == d_3_)
				d_4_ = (d_0_ - d_1_) / (d_3_ - d_2_);
			else if (d_0_ == d_3_)
				d_4_ = 2.0 + (d_1_ - d) / (d_3_ - d_2_);
			else if (d_3_ == d_1_)
				d_4_ = (d - d_0_) / (d_3_ - d_2_) + 4.0;
		}
		d_4_ /= 6.0;
		anInt55 = (int) (256.0 * d_5_) * 441282443;
		anInt50 = (int) (256.0 * d_6_) * -48952057;
		if (1400193059 * anInt55 < 0)
			anInt55 = 0;
		else if (1400193059 * anInt55 > 255)
			anInt55 = 857873269;
		if (271765687 * anInt50 < 0)
			anInt50 = 0;
		else if (anInt50 * 271765687 > 255)
			anInt50 = 402127353;
		if (d_6_ > 0.5)
			anInt51 = (int) (512.0 * ((1.0 - d_6_) * d_5_)) * -765725965;
		else
			anInt51 = (int) (d_5_ * d_6_ * 512.0) * -765725965;
		if (1218541115 * anInt51 < 1)
			anInt51 = -765725965;
		anInt54 = 395792913 * (int) (d_4_ * (double) (anInt51 * 1218541115));
	}

	public void method73() {
		/* empty */
	}

	void method557(Class523_Sub34 class523_sub34, int i, int i_7_) {
		if (i == 1) {
			anInt57 = class523_sub34.read24BitInt(1187250729) * 1262447213;
			method558(1653944165 * anInt57, (byte) -61);
		} else if (2 == i) {
			anInt56 = class523_sub34.readUnsignedShort(-996852446) * 860063899;
			if (65535 == -609411693 * anInt56)
				anInt56 = -860063899;
		} else if (i == 3)
			anInt49 = (class523_sub34.readUnsignedShort(-848298036) << 2) * -479019049;
		else if (4 == i)
			aBool52 = false;
		else if (5 == i)
			aBool53 = false;
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_8_ = class523_sub34.readUnsignedByte(-577914922);
			if (i_8_ == 0)
				break;
			method557(class523_sub34, i_8_, 1827999990);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-172910166);
			if (i == 0)
				break;
			method557(class523_sub34, i, 1977236599);
		}
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-728357302);
			if (i == 0)
				break;
			method557(class523_sub34, i, 1139568689);
		}
	}

	public void method79() {
		/* empty */
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1106478392);
			if (i == 0)
				break;
			method557(class523_sub34, i, 812533643);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(123569757);
			if (i == 0)
				break;
			method557(class523_sub34, i, 1366049713);
		}
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(2038692078);
			if (i == 0)
				break;
			method557(class523_sub34, i, 1377460653);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1342807529);
			if (i == 0)
				break;
			method557(class523_sub34, i, 1792435804);
		}
	}

	void method558(int i, byte i_9_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_10_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_11_ = (double) (i & 0xff) / 256.0;
		double d_12_ = d;
		if (d_10_ < d_12_)
			d_12_ = d_10_;
		if (d_11_ < d_12_)
			d_12_ = d_11_;
		double d_13_ = d;
		if (d_10_ > d_13_)
			d_13_ = d_10_;
		if (d_11_ > d_13_)
			d_13_ = d_11_;
		double d_14_ = 0.0;
		double d_15_ = 0.0;
		double d_16_ = (d_12_ + d_13_) / 2.0;
		if (d_13_ != d_12_) {
			if (d_16_ < 0.5)
				d_15_ = (d_13_ - d_12_) / (d_12_ + d_13_);
			if (d_16_ >= 0.5)
				d_15_ = (d_13_ - d_12_) / (2.0 - d_13_ - d_12_);
			if (d == d_13_)
				d_14_ = (d_10_ - d_11_) / (d_13_ - d_12_);
			else if (d_10_ == d_13_)
				d_14_ = 2.0 + (d_11_ - d) / (d_13_ - d_12_);
			else if (d_13_ == d_11_)
				d_14_ = (d - d_10_) / (d_13_ - d_12_) + 4.0;
		}
		d_14_ /= 6.0;
		anInt55 = (int) (256.0 * d_15_) * 441282443;
		anInt50 = (int) (256.0 * d_16_) * -48952057;
		if (1400193059 * anInt55 < 0)
			anInt55 = 0;
		else if (1400193059 * anInt55 > 255)
			anInt55 = 857873269;
		if (271765687 * anInt50 < 0)
			anInt50 = 0;
		else if (anInt50 * 271765687 > 255)
			anInt50 = 402127353;
		if (d_16_ > 0.5)
			anInt51 = (int) (512.0 * ((1.0 - d_16_) * d_15_)) * -765725965;
		else
			anInt51 = (int) (d_15_ * d_16_ * 512.0) * -765725965;
		if (1218541115 * anInt51 < 1)
			anInt51 = -765725965;
		anInt54 = 395792913 * (int) (d_14_ * (double) (anInt51 * 1218541115));
	}

	void method559(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_17_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_18_ = (double) (i & 0xff) / 256.0;
		double d_19_ = d;
		if (d_17_ < d_19_)
			d_19_ = d_17_;
		if (d_18_ < d_19_)
			d_19_ = d_18_;
		double d_20_ = d;
		if (d_17_ > d_20_)
			d_20_ = d_17_;
		if (d_18_ > d_20_)
			d_20_ = d_18_;
		double d_21_ = 0.0;
		double d_22_ = 0.0;
		double d_23_ = (d_19_ + d_20_) / 2.0;
		if (d_20_ != d_19_) {
			if (d_23_ < 0.5)
				d_22_ = (d_20_ - d_19_) / (d_19_ + d_20_);
			if (d_23_ >= 0.5)
				d_22_ = (d_20_ - d_19_) / (2.0 - d_20_ - d_19_);
			if (d == d_20_)
				d_21_ = (d_17_ - d_18_) / (d_20_ - d_19_);
			else if (d_17_ == d_20_)
				d_21_ = 2.0 + (d_18_ - d) / (d_20_ - d_19_);
			else if (d_20_ == d_18_)
				d_21_ = (d - d_17_) / (d_20_ - d_19_) + 4.0;
		}
		d_21_ /= 6.0;
		anInt55 = (int) (256.0 * d_22_) * 441282443;
		anInt50 = (int) (256.0 * d_23_) * -48952057;
		if (1400193059 * anInt55 < 0)
			anInt55 = 0;
		else if (1400193059 * anInt55 > 255)
			anInt55 = 857873269;
		if (271765687 * anInt50 < 0)
			anInt50 = 0;
		else if (anInt50 * 271765687 > 255)
			anInt50 = 402127353;
		if (d_23_ > 0.5)
			anInt51 = (int) (512.0 * ((1.0 - d_23_) * d_22_)) * -765725965;
		else
			anInt51 = (int) (d_22_ * d_23_ * 512.0) * -765725965;
		if (1218541115 * anInt51 < 1)
			anInt51 = -765725965;
		anInt54 = 395792913 * (int) (d_21_ * (double) (anInt51 * 1218541115));
	}

	public void method77() {
		/* empty */
	}

	Class7() {
		anInt56 = -860063899;
		anInt49 = -444617216;
		aBool52 = true;
		aBool53 = true;
	}

	public void method51(int i) {
		/* empty */
	}

	void method560(Class523_Sub34 class523_sub34, int i) {
		if (i == 1) {
			anInt57 = class523_sub34.read24BitInt(1582476065) * 1262447213;
			method558(1653944165 * anInt57, (byte) 102);
		} else if (2 == i) {
			anInt56 = class523_sub34.readUnsignedShort(-1441157647) * 860063899;
			if (65535 == -609411693 * anInt56)
				anInt56 = -860063899;
		} else if (i == 3)
			anInt49 = (class523_sub34.readUnsignedShort(-1120619056) << 2) * -479019049;
		else if (4 == i)
			aBool52 = false;
		else if (5 == i)
			aBool53 = false;
	}

	void method561(Class523_Sub34 class523_sub34, int i) {
		if (i == 1) {
			anInt57 = class523_sub34.read24BitInt(795246773) * 1262447213;
			method558(1653944165 * anInt57, (byte) 2);
		} else if (2 == i) {
			anInt56 = class523_sub34.readUnsignedShort(-43617896) * 860063899;
			if (65535 == -609411693 * anInt56)
				anInt56 = -860063899;
		} else if (i == 3)
			anInt49 = (class523_sub34.readUnsignedShort(-485701084) << 2) * -479019049;
		else if (4 == i)
			aBool52 = false;
		else if (5 == i)
			aBool53 = false;
	}

	public void method78() {
		/* empty */
	}

	public void method52(int i, byte i_24_) {
		/* empty */
	}

	static final void method562(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1_25_, int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, byte i_32_) {
		int i_33_ = class647_sub1_sub3_sub1_25_.method18342((byte) 27);
		if (i_33_ != -1) {
			Object object = null;
			Class148 class148 = (Class148) client.aClass209_11041.method3767((long) i_33_);
			if (null == class148) {
				Class175[] class175s = Class166.method2672(Class523_Sub8.aClass472_10406, i_33_, 0);
				if (class175s == null)
					return;
				class148 = Class31.aClass178_303.method3104(class175s[0], true);
				client.aClass209_11041.method3770(class148, (long) i_33_);
			}
			Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
			Class28.method872(class647_sub1_sub3_sub1.aByte10821, (int) class437.aFloat4903, (int) class437.aFloat4905, (class647_sub1_sub3_sub1.method18338(2143152636) * 256), 0, false, false, (byte) -101);
			int i_34_ = (int) ((float) i_26_ + client.aFloatArray11297[0] - 18.0F);
			int i_35_ = (int) (client.aFloatArray11297[1] + (float) i_27_ - 16.0F - 54.0F);
			i_34_ += 18 * (i / 4);
			i_35_ += 18 * (i % 4);
			class148.method2435(i_34_, i_35_);
			if (class647_sub1_sub3_sub1 == class647_sub1_sub3_sub1_25_)
				Class31.aClass178_303.method3077(i_34_ - 1, i_35_ - 1, 18, 18, -256, 1943921299);
			Class522_Sub3 class522_sub3 = Class688.method13933(-1295647257);
			class522_sub3.aClass647_Sub1_Sub3_Sub1_10329 = class647_sub1_sub3_sub1_25_;
			class522_sub3.anInt10330 = i_34_ * -1760551319;
			class522_sub3.anInt10327 = -1647706617 * i_35_;
			class522_sub3.anInt10332 = (i_34_ + 16) * -1670571867;
			class522_sub3.anInt10333 = (16 + i_35_) * 561014993;
			client.aClass701_11252.method14084(class522_sub3, -1780691776);
		}
	}

	static final void method563(Class250 class250, Class242 class242, Class669 class669, int i) {
		int i_36_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (-339807053 * class250.anInt2548 != i_36_) {
			if (i_36_ != -1) {
				if (class250.aClass707_2693 == null)
					class250.aClass707_2693 = new Class707_Sub3();
				class250.aClass707_2693.method14164(i_36_, (byte) 12);
			} else
				class250.aClass707_2693 = null;
			class250.anInt2548 = -1784620421 * i_36_;
			Class523_Sub14.method15991(class250, (byte) -103);
		}
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
			Class194_Sub14.method15515(-1363815505 * class250.anInt2585, -1335462253);
	}

	public static int method564(byte i) {
		return Class323.aTwitchTV3452.GetLoginState();
	}
}
