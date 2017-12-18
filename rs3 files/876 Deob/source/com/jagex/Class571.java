/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.URL;

public abstract class Class571 {
	Class472 aClass472_7659;
	Class209 aClass209_7660 = new Class209(20);

	Class571(Class472 class472) {
		aClass472_7659 = class472;
	}

	void method9610(byte i) {
		synchronized (aClass209_7660) {
			aClass209_7660.method3773(-1888920495);
		}
	}

	void method9611(int i, short i_0_) {
		synchronized (aClass209_7660) {
			aClass209_7660.method3772(i, (byte) 0);
		}
	}

	void method9612(int i) {
		synchronized (aClass209_7660) {
			aClass209_7660.method3776(1797537255);
		}
	}

	void method9613() {
		synchronized (aClass209_7660) {
			aClass209_7660.method3773(-2099032124);
		}
	}

	void method9614(int i) {
		synchronized (aClass209_7660) {
			aClass209_7660.method3772(i, (byte) -125);
		}
	}

	void method9615() {
		synchronized (aClass209_7660) {
			aClass209_7660.method3776(529071662);
		}
	}

	static final void method9616(Class669 class669, byte i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_1_, -1522442808);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class170.method2892(class250, class242, class669, PacketsDecoder.aClass233_2373, (byte) 0);
	}

	static final void method9617(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class464.method7542(class250, class242, class669, -1574702099);
	}

	static final void method9618(Class669 class669, int i) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1);
		Class540.method8987(bool, 451623664);
	}

	public static boolean method9619(String string, int i, String string_2_, int i_3_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!Class501.aString5578.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_4_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_5_ = 0; i_5_ < string.length(); i_5_++) {
					if (string_4_.indexOf(string.charAt(i_5_)) == -1)
						throw new Exception();
				}
				Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
				bool = true;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 1) {
			boolean bool;
			try {
				Object object = Class35.method954(Class501.anApplet5582, string_2_, (new Object[] { new URL(Class501.anApplet5582.getCodeBase(), string).toString() }), -1229604564);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				Class501.anApplet5582.getAppletContext().showDocument(new URL(Class501.anApplet5582.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class35.method952(Class501.anApplet5582, "loggedout", (byte) 57);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				Class501.anApplet5582.getAppletContext().showDocument(new URL(Class501.anApplet5582.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static void method9620(byte i) {
		if (null != Class31.aClass178_303) {
			client.aClass505_11019.method8252(1840698129);
			Class321.method5720((byte) 63);
			Class522_Sub1.method15784(979555851);
			Class459.method7492(240723773);
			Class199.method3687(401433487);
			client.aClass505_11019.method8327(true, -649972167);
			Class301.method5527((byte) 16);
			Class691.method13966(-35099229);
			Class679.method13827(false, (byte) -73);
			Class11.method651(2101710045);
			Class662.method10913(-1162375511);
			Class528.method8733(-353077433);
			for (int i_6_ = 0; i_6_ < client.aClass540Array11018.length; i_6_++) {
				if (client.aClass540Array11018[i_6_] != null)
					client.aClass540Array11018[i_6_].aClass167_7218 = null;
			}
			for (int i_7_ = 0; i_7_ < 2048; i_7_++) {
				Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_7_];
				if (class647_sub1_sub3_sub1_sub2 != null) {
					for (int i_8_ = 0; i_8_ < (class647_sub1_sub3_sub1_sub2.aClass167Array11928).length; i_8_++)
						class647_sub1_sub3_sub1_sub2.aClass167Array11928[i_8_] = null;
				}
			}
			for (int i_9_ = 0; i_9_ < client.anInt11049 * -1359865227; i_9_++) {
				NPC class647_sub1_sub3_sub1_sub1 = ((NPC) client.aClass523_Sub28Array11195[i_9_].anObject10554);
				if (class647_sub1_sub3_sub1_sub1 != null) {
					for (int i_10_ = 0; i_10_ < (class647_sub1_sub3_sub1_sub1.aClass167Array11928).length; i_10_++)
						class647_sub1_sub3_sub1_sub1.aClass167Array11928[i_10_] = null;
				}
			}
			client.aClass14_11174.method733(-1231971733);
			Class31.aClass178_303.method3024(11564041);
			Class31.aClass178_303 = null;
		}
	}

	static final void method9621(Class669 class669, byte i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub13_10613, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1 ? 1 : 0, 1845999093);
		Class211.method3824(1477265859);
		client.aBool11012 = false;
	}
}
