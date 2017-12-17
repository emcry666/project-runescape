/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.io.DataInputStream;
import java.net.URL;

final class Class305 implements Interface19 {
	public static Applet anApplet3346;
	static Class10 aClass10_3347;

	public Class159 method110(Class470 class470, int i, int i_0_) {
		return (Class159) ((Interface12) Class388_Sub1.aMap10261.get(class470)).getDefinition(i, (byte) 5);
	}

	public Class159 method105(Class470 class470, int i) {
		return (Class159) ((Interface12) Class388_Sub1.aMap10261.get(class470)).getDefinition(i, (byte) 67);
	}

	public Class309 method109(int i) {
		return (Class309) Class539.aClass53_Sub3_7213.getDefinition(i, (byte) -28);
	}

	public Class309 method108(int i) {
		return (Class309) Class539.aClass53_Sub3_7213.getDefinition(i, (byte) -1);
	}

	public Class309 method106(int i, int i_1_) {
		return (Class309) Class539.aClass53_Sub3_7213.getDefinition(i, (byte) -74);
	}

	public Class309 method107(int i) {
		return (Class309) Class539.aClass53_Sub3_7213.getDefinition(i, (byte) 9);
	}

	public static Class287 method5548(int i, int i_2_) {
		Class287[] class287s = Class239.method4335((byte) 114);
		for (int i_3_ = 0; i_3_ < class287s.length; i_3_++) {
			Class287 class287 = class287s[i_3_];
			if (class287.anInt3100 * -104129777 == i)
				return class287;
		}
		return null;
	}

	static final void method5549(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_4_, -1826498912);
		Class242 class242 = Class31.aClass242Array302[i_4_ >> 16];
		Class267.method4896(class250, class242, class669, -2021622054);
	}

	static final void method5550(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_5_, -1972235758);
		Class242 class242 = Class31.aClass242Array302[i_5_ >> 16];
		Class526.method8727(class250, class242, class669, -185833564);
	}

	static final void method5551(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_6_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_6_ % i_7_;
	}

	public static void method5552(boolean bool, boolean bool_8_, byte i) {
		if (bool) {
			Class638.anInt8309 -= 1410281817;
			if (0 == -157022487 * Class638.anInt8309)
				Class638.anIntArray8306 = null;
		}
		if (bool_8_) {
			Class638.anInt8308 -= -636711061;
			if (0 == Class638.anInt8308 * 1156851011)
				Class710.anIntArray8839 = null;
		}
	}

	public static void method5553(String string, Throwable throwable, byte i) {
		try {
			String string_9_ = "";
			if (null != throwable)
				string_9_ = Class659.method10810(throwable, 1982051130);
			if (null != string) {
				if (throwable != null)
					string_9_ = new StringBuilder().append(string_9_).append(" | ").toString();
				string_9_ = new StringBuilder().append(string_9_).append(string).toString();
			}
			Class262.method4738(string_9_, (byte) 32);
			string_9_ = Class406.method6615(string_9_, 314733476);
			URL url = null;
			if (RuntimeException_Sub4.anApplet12101 != null)
				url = RuntimeException_Sub4.anApplet12101.getCodeBase();
			else if (RuntimeException_Sub4.anInterface60_12103 != null)
				url = RuntimeException_Sub4.anInterface60_12103.method388((byte) 107);
			if (url != null) {
				String string_10_ = "Unknown";
				String string_11_ = "1.1";
				try {
					string_10_ = System.getProperty("java.vendor");
					string_11_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_12_ = new URL(url, new StringBuilder().append("clienterror.ws?c=").append(-439196935 * Class234_Sub1.anInt10003).append("&cs=").append(RuntimeException_Sub4.anInt12102 * 1272173421).append("&u=").append(null != RuntimeException_Sub4.aString12099 ? Class406.method6615((RuntimeException_Sub4.aString12099), 1124159882) : new StringBuilder().append("").append(4368769567586571753L * RuntimeException_Sub4.aLong12100).toString()).append("&v1=").append(Class406.method6615(string_10_, 1408862501)).append("&v2=").append(Class406.method6615(string_11_, -1641329947)).append("&e=").append(string_9_).toString());
				DataInputStream datainputstream = new DataInputStream(url_12_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
