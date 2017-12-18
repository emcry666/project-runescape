/* Class523_Sub27_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub2 extends Class523_Sub27 implements Interface13, Interface6 {
	Class14 aClass14_11333;
	static Class700 aClass700_11334;

	public void method79() {
		/* empty */
	}

	public void method52(int i, byte i_0_) {
		/* empty */
	}

	public String method17732(int i, String string) {
		if (aClass14_11333 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_11333.getFromIndex((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public int method17733(int i, int i_1_, int i_2_) {
		if (aClass14_11333 == null)
			return i_1_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_11333.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_1_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public String method17734(int i, String string, byte i_3_) {
		if (aClass14_11333 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_11333.getFromIndex((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	void method17735(RSBuffer class523_sub34, int i, byte i_4_) {
		if (i == 249) {
			int i_5_ = class523_sub34.readUnsignedByte(345296388);
			if (null == aClass14_11333) {
				int i_6_ = Class628.method10313(i_5_, -975595982);
				aClass14_11333 = new Class14(i_6_);
			}
			for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
				boolean bool = class523_sub34.readUnsignedByte(947587336) == 1;
				int i_8_ = class523_sub34.read24BitInt(1716192297);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(-1881948695));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -26));
				aClass14_11333.method738(class523, (long) i_8_);
			}
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1521571512);
			if (i == 0)
				break;
			method17735(class523_sub34, i, (byte) -30);
		}
	}

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-611949695);
			if (i == 0)
				break;
			method17735(class523_sub34, i, (byte) -116);
		}
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1913680266);
			if (i == 0)
				break;
			method17735(class523_sub34, i, (byte) -23);
		}
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_9_ = class523_sub34.readUnsignedByte(582478391);
			if (i_9_ == 0)
				break;
			method17735(class523_sub34, i_9_, (byte) -79);
		}
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1510510346);
			if (i == 0)
				break;
			method17735(class523_sub34, i, (byte) -40);
		}
	}

	public void method73() {
		/* empty */
	}

	public void method78() {
		/* empty */
	}

	Class523_Sub27_Sub2() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(9549454);
			if (i == 0)
				break;
			method17735(class523_sub34, i, (byte) -67);
		}
	}

	public void method51(int i) {
		/* empty */
	}

	void method17736(RSBuffer class523_sub34, int i) {
		if (i == 249) {
			int i_10_ = class523_sub34.readUnsignedByte(560463975);
			if (null == aClass14_11333) {
				int i_11_ = Class628.method10313(i_10_, 2140485705);
				aClass14_11333 = new Class14(i_11_);
			}
			for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
				boolean bool = class523_sub34.readUnsignedByte(450679853) == 1;
				int i_13_ = class523_sub34.read24BitInt(-2079223752);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(-1123288282));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -54));
				aClass14_11333.method738(class523, (long) i_13_);
			}
		}
	}

	void method17737(RSBuffer class523_sub34, int i) {
		if (i == 249) {
			int i_14_ = class523_sub34.readUnsignedByte(-2122617311);
			if (null == aClass14_11333) {
				int i_15_ = Class628.method10313(i_14_, -183522847);
				aClass14_11333 = new Class14(i_15_);
			}
			for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
				boolean bool = class523_sub34.readUnsignedByte(-255241689) == 1;
				int i_17_ = class523_sub34.read24BitInt(-1504193819);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(-1351694433));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -106));
				aClass14_11333.method738(class523, (long) i_17_);
			}
		}
	}

	public int method17738(int i, int i_18_) {
		if (aClass14_11333 == null)
			return i_18_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_11333.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_18_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public void readValues(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-102379720);
			if (i == 0)
				break;
			method17735(class523_sub34, i, (byte) -86);
		}
	}

	public String method17739(int i, String string) {
		if (aClass14_11333 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_11333.getFromIndex((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public static Class435 method17740(int i) {
		Class435 class435 = new Class435();
		class435.method6855(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class435.method6819(f - 128.0F, 0.0F, 0.0F);
		class435.method6814(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class435;
	}
}
