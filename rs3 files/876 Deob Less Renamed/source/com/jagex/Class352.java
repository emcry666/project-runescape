/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class352 {
	static final int anInt3651 = 4;
	long aLong3652 = 989308006965030609L;
	static final int anInt3653 = 1;
	static final int anInt3654 = 3;
	Class708 aClass708_3655 = new Class708();
	long aLong3656;
	static final int anInt3657 = 2;
	static final int anInt3658 = 5;
	static int anInt3659;

	public Class352(Class523_Sub34 class523_sub34) {
		method6180(class523_sub34, 928976498);
	}

	void method6180(Class523_Sub34 class523_sub34, int i) {
		aLong3656 = class523_sub34.readLong((byte) -89) * 8621998854163959039L;
		aLong3652 = class523_sub34.readLong((byte) -125) * -989308006965030609L;
		for (int i_0_ = class523_sub34.readUnsignedByte(-1129601284); 0 != i_0_; i_0_ = class523_sub34.readUnsignedByte(1141130126)) {
			Class523_Sub14 class523_sub14;
			if (i_0_ == 1)
				class523_sub14 = new Class523_Sub14_Sub3(this);
			else if (4 == i_0_)
				class523_sub14 = new Class523_Sub14_Sub1(this);
			else if (3 == i_0_)
				class523_sub14 = new Class523_Sub14_Sub4(this);
			else if (i_0_ == 2)
				class523_sub14 = new Class523_Sub14_Sub2(this);
			else if (i_0_ == 5)
				class523_sub14 = new Class523_Sub14_Sub5(this);
			else
				throw new RuntimeException("");
			class523_sub14.method15986(class523_sub34, (byte) 5);
			aClass708_3655.method14236(class523_sub14, -1594745660);
		}
	}

	public void method6181(Class523_Sub19 class523_sub19, int i) {
		if ((1055205983951172633L * class523_sub19.aLong7065 != 9014599667690926847L * aLong3656) || (class523_sub19.aLong10483 * 1952221173255112045L != 4441831901488780751L * aLong3652))
			throw new RuntimeException("");
		for (Class523_Sub14 class523_sub14 = (Class523_Sub14) aClass708_3655.method14240(872813364); class523_sub14 != null; class523_sub14 = (Class523_Sub14) aClass708_3655.method14244((byte) 19))
			class523_sub14.method15987(class523_sub19, (byte) 0);
		class523_sub19.aLong10483 += 542502792796425317L;
	}

	public void method6182(Class523_Sub19 class523_sub19) {
		if ((1055205983951172633L * class523_sub19.aLong7065 != 9014599667690926847L * aLong3656) || (class523_sub19.aLong10483 * 1952221173255112045L != 4441831901488780751L * aLong3652))
			throw new RuntimeException("");
		for (Class523_Sub14 class523_sub14 = (Class523_Sub14) aClass708_3655.method14240(1294009360); class523_sub14 != null; class523_sub14 = (Class523_Sub14) aClass708_3655.method14244((byte) -25))
			class523_sub14.method15987(class523_sub19, (byte) 0);
		class523_sub19.aLong10483 += 542502792796425317L;
	}

	public void method6183(Class523_Sub19 class523_sub19) {
		if ((1055205983951172633L * class523_sub19.aLong7065 != 9014599667690926847L * aLong3656) || (class523_sub19.aLong10483 * 1952221173255112045L != 4441831901488780751L * aLong3652))
			throw new RuntimeException("");
		for (Class523_Sub14 class523_sub14 = (Class523_Sub14) aClass708_3655.method14240(2029339049); class523_sub14 != null; class523_sub14 = (Class523_Sub14) aClass708_3655.method14244((byte) 60))
			class523_sub14.method15987(class523_sub19, (byte) 0);
		class523_sub19.aLong10483 += 542502792796425317L;
	}

	public void method6184(Class523_Sub19 class523_sub19) {
		if ((1055205983951172633L * class523_sub19.aLong7065 != 9014599667690926847L * aLong3656) || (class523_sub19.aLong10483 * 1952221173255112045L != 4441831901488780751L * aLong3652))
			throw new RuntimeException("");
		for (Class523_Sub14 class523_sub14 = (Class523_Sub14) aClass708_3655.method14240(1288882741); class523_sub14 != null; class523_sub14 = (Class523_Sub14) aClass708_3655.method14244((byte) 17))
			class523_sub14.method15987(class523_sub19, (byte) 0);
		class523_sub19.aLong10483 += 542502792796425317L;
	}

	void method6185(Class523_Sub34 class523_sub34) {
		aLong3656 = class523_sub34.readLong((byte) -75) * 8621998854163959039L;
		aLong3652 = class523_sub34.readLong((byte) -85) * -989308006965030609L;
		for (int i = class523_sub34.readUnsignedByte(-1477706087); 0 != i; i = class523_sub34.readUnsignedByte(-376627528)) {
			Class523_Sub14 class523_sub14;
			if (i == 1)
				class523_sub14 = new Class523_Sub14_Sub3(this);
			else if (4 == i)
				class523_sub14 = new Class523_Sub14_Sub1(this);
			else if (3 == i)
				class523_sub14 = new Class523_Sub14_Sub4(this);
			else if (i == 2)
				class523_sub14 = new Class523_Sub14_Sub2(this);
			else if (i == 5)
				class523_sub14 = new Class523_Sub14_Sub5(this);
			else
				throw new RuntimeException("");
			class523_sub14.method15986(class523_sub34, (byte) -70);
			aClass708_3655.method14236(class523_sub14, 91711185);
		}
	}

	static final void method6186(Class669 class669, byte i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_1_, -1594895325);
		int i_2_ = -1;
		int i_3_ = -1;
		Class236 class236 = class250.method4440(Class31.aClass178_303, (byte) -31);
		if (null != class236) {
			i_2_ = 937050569 * class236.anInt2388;
			i_3_ = class236.anInt2389 * 177817075;
		}
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_2_;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_3_;
	}

	static final void method6187(Class669 class669, byte i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_4_ >= 1 && i_4_ <= 2)
			Class82.method1585(i_4_, -1, -1, false, -1011984276);
	}

	static final void method6188(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
	}

	static final void method6189(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		for (Class522_Sub4 class522_sub4 = ((Class522_Sub4) client.aClass701_11132.method14087(1706431677)); null != class522_sub4; class522_sub4 = (Class522_Sub4) client.aClass701_11132.method14088(1568614346)) {
			if (client.anInt11011 >= class522_sub4.anInt10334 * -1325737257)
				class522_sub4.method8652((byte) -11);
			else {
				Class28.method872(class522_sub4.anInt10337 * 782500891, 256 + (315368857 * class522_sub4.anInt10338 << 9), 256 + (class522_sub4.anInt10335 * -1325458763 << 9), 0, class522_sub4.anInt10336 * 517550858, false, false, (byte) -29);
				Class34.aClass164_319.method2624(class522_sub4.aString10340, (int) (client.aFloatArray11297[0] + (float) i), (int) (client.aFloatArray11297[1] + (float) i_5_), ~0xffffff | -1551812089 * class522_sub4.anInt10339, 0, -1246269241);
			}
		}
	}

	static void method6190(String string, int i) {
		client.aString10983 = string;
		if (Class53.method1308((byte) 60) != Class513.aClass513_5764) {
			try {
				String string_11_ = Class305.anApplet3346.getParameter(Class420.aClass420_4732.aString4777);
				String string_12_ = Class305.anApplet3346.getParameter(Class420.aClass420_4750.aString4777);
				String string_13_ = new StringBuilder().append(string_11_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_12_).toString();
				if (string.length() == 0)
					string_13_ = new StringBuilder().append(string_13_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
				else
					string_13_ = new StringBuilder().append(string_13_).append("; Expires=").append(GraphicsDefinitions.method13712(Class248.method4401(1516375036) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
				Class35.method951(Class305.anApplet3346, new StringBuilder().append("document.cookie=\"").append(string_13_).append("\"").toString(), (byte) -28);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method6191(Class669 class669, byte i) {
		int i_14_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_14_ == 0)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class534_Sub1.aBool10778 ? 1 : 0;
		else if (i_14_ == 1)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class534_Sub1.aBool10771 ? 1 : 0;
		else if (2 == i_14_)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class534_Sub1.aBool10797 ? 1 : 0;
		else
			throw new RuntimeException();
	}

	static void method6192(int i, int i_15_, int i_16_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17963(772472779);
		class523_sub27_sub7.anInt11653 = -1217347391 * i;
		class523_sub27_sub7.anInt11649 = -254643469 * i_15_;
	}

	static final void method6193(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2578 * 533045263;
	}
}
