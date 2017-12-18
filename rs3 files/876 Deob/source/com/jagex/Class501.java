/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

public class Class501 {
	static String aString5578;
	public static final int anInt5579 = 1;
	static final int anInt5580 = 0;
	static final int anInt5581 = 2;
	static Applet anApplet5582 = null;
	static final int anInt5583 = 3;
	static Class148[] aClass148Array5584;

	static boolean method8123(String string, int i) {
		return Class571.method9619(string, i, "openjs", 641216135);
	}

	public static boolean method8124(String string, int i, String string_0_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString5578.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_1_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
					if (string_1_.indexOf(string.charAt(i_2_)) == -1)
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
				Object object = Class35.method954(anApplet5582, string_0_, (new Object[] { new URL(anApplet5582.getCodeBase(), string).toString() }), -1173753970);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet5582.getAppletContext().showDocument(new URL(anApplet5582.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class35.method952(anApplet5582, "loggedout", (byte) 64);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet5582.getAppletContext().showDocument(new URL(anApplet5582.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	public static void method8125(Applet applet, String string) {
		anApplet5582 = applet;
		aString5578 = string;
	}

	public static void method8126(Applet applet, String string) {
		anApplet5582 = applet;
		aString5578 = string;
	}

	public static void method8127(String string, boolean bool, boolean bool_3_) {
		Class388.method6470(string, bool, "openjs", bool_3_, -494472837);
	}

	public static void method8128(String string, boolean bool, boolean bool_4_) {
		Class388.method6470(string, bool, "openjs", bool_4_, -494472837);
	}

	public static void method8129(String string, boolean bool, String string_5_, boolean bool_6_) {
		if (bool) {
			do {
				if (!bool_6_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (aString5578.startsWith("win") && !bool_6_)
				Class333.method5847(string, 0, 679970375);
			else if (aString5578.startsWith("mac"))
				Class571.method9619(string, 1, string_5_, -154295372);
			else
				Class333.method5847(string, 2, 776473783);
		} else
			Class333.method5847(string, 3, 1647767894);
	}

	public static void method8130(String string, boolean bool, String string_7_, boolean bool_8_) {
		if (bool) {
			do {
				if (!bool_8_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (aString5578.startsWith("win") && !bool_8_)
				Class333.method5847(string, 0, 8154006);
			else if (aString5578.startsWith("mac"))
				Class571.method9619(string, 1, string_7_, -820795189);
			else
				Class333.method5847(string, 2, 1485340969);
		} else
			Class333.method5847(string, 3, 642054590);
	}

	Class501() throws Throwable {
		throw new Error();
	}

	static {
		aString5578 = null;
	}

	static boolean method8131(String string, int i) {
		return Class571.method9619(string, i, "openjs", 309481575);
	}

	public static boolean method8132(String string, int i, String string_9_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString5578.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_10_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_11_ = 0; i_11_ < string.length(); i_11_++) {
					if (string_10_.indexOf(string.charAt(i_11_)) == -1)
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
				Object object = Class35.method954(anApplet5582, string_9_, (new Object[] { new URL(anApplet5582.getCodeBase(), string).toString() }), -2131747273);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet5582.getAppletContext().showDocument(new URL(anApplet5582.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class35.method952(anApplet5582, "loggedout", (byte) 27);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet5582.getAppletContext().showDocument(new URL(anApplet5582.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	public static boolean method8133(String string, int i, String string_12_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!aString5578.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_13_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_14_ = 0; i_14_ < string.length(); i_14_++) {
					if (string_13_.indexOf(string.charAt(i_14_)) == -1)
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
				Object object = Class35.method954(anApplet5582, string_12_, (new Object[] { new URL(anApplet5582.getCodeBase(), string).toString() }), -1313832458);
				bool = null != object;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				anApplet5582.getAppletContext().showDocument(new URL(anApplet5582.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (3 == i) {
			try {
				Class35.method952(anApplet5582, "loggedout", (byte) -81);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				anApplet5582.getAppletContext().showDocument(new URL(anApplet5582.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static boolean method8134(String string, int i) {
		return Class571.method9619(string, i, "openjs", 2005220989);
	}

	static final void method8135(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		GraphicsDefinitions.method13714(class250, class242, class669, 1788010734);
	}

	static final void method8136(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
		int i_15_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		Class254.aClass217_2743.method3861(i_15_, (byte) -36);
	}

	static final void method8137(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		int i_16_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_17_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_18_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		int i_19_ = Class436.method6873(i_17_, -1310203839);
		int i_20_ = Class164_Sub2.method15389(i_17_, -773280917);
		Class17 class17 = (Class17) Class546.aClass53_7303.getDefinition(i_16_, (byte) 14);
		Class84 class84 = (Class84) Class647_Sub1_Sub1_Sub2.aClass53_12014.getDefinition(i_19_, (byte) 49);
		Class464[] class464s = class84.aClass464ArrayArray875[i_20_];
		Object[] objects = class17.method773(i_20_, (byte) 3);
		if (null == objects && class84.anObjectArrayArray874 != null)
			objects = class84.anObjectArrayArray874[i_20_];
		if (objects == null) {
			for (int i_21_ = 0; i_21_ < class464s.length; i_21_++) {
				Class464 class464 = class464s[i_21_];
				if (Class464.aClass464_5165 == class464)
					class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
				else if (Class464.aClass464_5247 == class464 || Class464.aClass464_5267 == class464)
					class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
				else
					class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			}
		} else {
			int i_22_ = objects.length / class464s.length;
			if (i_18_ < 0 || i_18_ >= i_22_)
				throw new RuntimeException();
			for (int i_23_ = 0; i_23_ < class464s.length; i_23_++) {
				int i_24_ = i_23_ + i_18_ * class464s.length;
				if (class464s[i_23_] == Class464.aClass464_5165)
					class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = objects[i_24_];
				else
					class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = ((Integer) objects[i_24_]).intValue();
			}
		}
	}

	public static void method8138(int i) {
		if (Class6.aBool41) {
			if (-106794481 * Class6.anInt45 < Class687_Sub25.anInt10886 * -2074972287)
				Class6.anInt45 = Class687_Sub25.anInt10886 * 750540143;
			while (Class6.anInt45 * -106794481 < Class595.anInt7824 * 615132109) {
				Class611_Sub1 class611_sub1 = Class417.method6657(Class6.anInt45 * -106794481, 1292936657);
				if (class611_sub1 == null || -1 != -1614476621 * class611_sub1.anInt10585)
					Class6.anInt45 += 1671707887;
				else {
					if (null == Class6.aClass640_46)
						Class6.aClass640_46 = (client.aClass648_11303.method10606(class611_sub1.aString10586, (short) -99));
					int i_25_ = Class6.aClass640_46.anInt8314 * 167852121;
					if (i_25_ == -1)
						break;
					class611_sub1.anInt10585 = -889539461 * i_25_;
					Class6.anInt45 += 1671707887;
					Class6.aClass640_46 = null;
				}
			}
		}
	}

	static final void method8139(Class669 class669, byte i) {
		int i_26_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class677 class677;
		if (class669.aBool8570)
			class677 = class669.aClass677_8566;
		else
			class677 = class669.aClass677_8574;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class677.method13770(i_26_, -1, (short) -13685) ? 1 : 0;
	}

	static final int method8140(int i, int i_27_, int i_28_, int i_29_, int i_30_) {
		int i_31_ = 65536 - Class433.anIntArray4881[8192 * i_28_ / i_29_] >> 1;
		return (i_27_ * i_31_ >> 16) + (i * (65536 - i_31_) >> 16);
	}
}
