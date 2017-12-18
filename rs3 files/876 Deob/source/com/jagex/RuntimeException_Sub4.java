/* RuntimeException_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class RuntimeException_Sub4 extends RuntimeException {
	String aString12098;
	public static String aString12099;
	static long aLong12100;
	public static Applet anApplet12101;
	public static int anInt12102;
	static Interface60 anInterface60_12103 = null;
	Throwable aThrowable12104;
	public static int anInt12105;

	public static RuntimeException_Sub4 method18561(Throwable throwable, String string) {
		RuntimeException_Sub4 runtimeexception_sub4;
		if (throwable instanceof RuntimeException_Sub4) {
			runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub4 runtimeexception_sub4_0_ = runtimeexception_sub4;
			runtimeexception_sub4_0_.aString12098 = stringbuilder.append(runtimeexception_sub4_0_.aString12098).append(' ').append(string).toString();
		} else
			runtimeexception_sub4 = new RuntimeException_Sub4(throwable, string);
		return runtimeexception_sub4;
	}

	public static void method18562(String string, Throwable throwable) {
		try {
			String string_1_ = "";
			if (null != throwable)
				string_1_ = Class659.method10810(throwable, 128962130);
			if (null != string) {
				if (throwable != null)
					string_1_ = new StringBuilder().append(string_1_).append(" | ").toString();
				string_1_ = new StringBuilder().append(string_1_).append(string).toString();
			}
			Class262.method4738(string_1_, (byte) 1);
			string_1_ = Class406.method6615(string_1_, -874928544);
			URL url = null;
			if (anApplet12101 != null)
				url = anApplet12101.getCodeBase();
			else if (anInterface60_12103 != null)
				url = anInterface60_12103.method388((byte) 6);
			if (url != null) {
				String string_2_ = "Unknown";
				String string_3_ = "1.1";
				try {
					string_2_ = System.getProperty("java.vendor");
					string_3_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_4_ = new URL(url, new StringBuilder().append("clienterror.ws?c=").append(-439196935 * Class234_Sub1.anInt10003).append("&cs=").append(anInt12102 * 1272173421).append("&u=").append(null != aString12099 ? Class406.method6615(aString12099, -490038221) : new StringBuilder().append("").append(4368769567586571753L * aLong12100).toString()).append("&v1=").append(Class406.method6615(string_2_, 1391540240)).append("&v2=").append(Class406.method6615(string_3_, -790163411)).append("&e=").append(string_1_).toString());
				DataInputStream datainputstream = new DataInputStream(url_4_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void method18563(String string, Throwable throwable) {
		try {
			String string_5_ = "";
			if (null != throwable)
				string_5_ = Class659.method10810(throwable, -1989273615);
			if (null != string) {
				if (throwable != null)
					string_5_ = new StringBuilder().append(string_5_).append(" | ").toString();
				string_5_ = new StringBuilder().append(string_5_).append(string).toString();
			}
			Class262.method4738(string_5_, (byte) 0);
			string_5_ = Class406.method6615(string_5_, -236217313);
			URL url = null;
			if (anApplet12101 != null)
				url = anApplet12101.getCodeBase();
			else if (anInterface60_12103 != null)
				url = anInterface60_12103.method388((byte) 69);
			if (url != null) {
				String string_6_ = "Unknown";
				String string_7_ = "1.1";
				try {
					string_6_ = System.getProperty("java.vendor");
					string_7_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_8_ = new URL(url, new StringBuilder().append("clienterror.ws?c=").append(-439196935 * Class234_Sub1.anInt10003).append("&cs=").append(anInt12102 * 1272173421).append("&u=").append(null != aString12099 ? Class406.method6615(aString12099, -1112313271) : new StringBuilder().append("").append(4368769567586571753L * aLong12100).toString()).append("&v1=").append(Class406.method6615(string_6_, -1191256063)).append("&v2=").append(Class406.method6615(string_7_, -687882870)).append("&e=").append(string_5_).toString());
				DataInputStream datainputstream = new DataInputStream(url_8_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void method18564(String string, Throwable throwable) {
		try {
			String string_9_ = "";
			if (null != throwable)
				string_9_ = Class659.method10810(throwable, -552861413);
			if (null != string) {
				if (throwable != null)
					string_9_ = new StringBuilder().append(string_9_).append(" | ").toString();
				string_9_ = new StringBuilder().append(string_9_).append(string).toString();
			}
			Class262.method4738(string_9_, (byte) -92);
			string_9_ = Class406.method6615(string_9_, -1382738947);
			URL url = null;
			if (anApplet12101 != null)
				url = anApplet12101.getCodeBase();
			else if (anInterface60_12103 != null)
				url = anInterface60_12103.method388((byte) 46);
			if (url != null) {
				String string_10_ = "Unknown";
				String string_11_ = "1.1";
				try {
					string_10_ = System.getProperty("java.vendor");
					string_11_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_12_ = new URL(url, new StringBuilder().append("clienterror.ws?c=").append(-439196935 * Class234_Sub1.anInt10003).append("&cs=").append(anInt12102 * 1272173421).append("&u=").append(null != aString12099 ? Class406.method6615(aString12099, -1192400817) : new StringBuilder().append("").append(4368769567586571753L * aLong12100).toString()).append("&v1=").append(Class406.method6615(string_10_, -365591680)).append("&v2=").append(Class406.method6615(string_11_, -20275929)).append("&e=").append(string_9_).toString());
				DataInputStream datainputstream = new DataInputStream(url_12_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static RuntimeException_Sub4 method18565(Throwable throwable, String string) {
		RuntimeException_Sub4 runtimeexception_sub4;
		if (throwable instanceof RuntimeException_Sub4) {
			runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub4 runtimeexception_sub4_13_ = runtimeexception_sub4;
			runtimeexception_sub4_13_.aString12098 = stringbuilder.append(runtimeexception_sub4_13_.aString12098).append(' ').append(string).toString();
		} else
			runtimeexception_sub4 = new RuntimeException_Sub4(throwable, string);
		return runtimeexception_sub4;
	}

	RuntimeException_Sub4(Throwable throwable, String string) {
		aString12098 = string;
		aThrowable12104 = throwable;
		initCause(throwable);
	}

	static String method18566(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub4) {
			RuntimeException_Sub4 runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			string = new StringBuilder().append(runtimeexception_sub4.aString12098).append(" | ").toString();
			throwable = runtimeexception_sub4.aThrowable12104;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_14_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_14_));
		String string_15_ = bufferedreader.readLine();
		for (;;) {
			String string_16_ = bufferedreader.readLine();
			if (string_16_ == null)
				break;
			int i = string_16_.indexOf('(');
			int i_17_ = string_16_.indexOf(')', 1 + i);
			String string_18_;
			if (-1 != i)
				string_18_ = string_16_.substring(0, i);
			else
				string_18_ = string_16_;
			string_18_ = string_18_.trim();
			string_18_ = string_18_.substring(string_18_.lastIndexOf(' ') + 1);
			string_18_ = string_18_.substring(string_18_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_18_).toString();
			if (-1 != i && i_17_ != -1) {
				int i_19_ = string_16_.indexOf(".java:", i);
				if (i_19_ >= 0)
					string = new StringBuilder().append(string).append(string_16_.substring(i_19_ + 5, i_17_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_15_).toString();
		return string;
	}

	static String method18567(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub4) {
			RuntimeException_Sub4 runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			string = new StringBuilder().append(runtimeexception_sub4.aString12098).append(" | ").toString();
			throwable = runtimeexception_sub4.aThrowable12104;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_20_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_20_));
		String string_21_ = bufferedreader.readLine();
		for (;;) {
			String string_22_ = bufferedreader.readLine();
			if (string_22_ == null)
				break;
			int i = string_22_.indexOf('(');
			int i_23_ = string_22_.indexOf(')', 1 + i);
			String string_24_;
			if (-1 != i)
				string_24_ = string_22_.substring(0, i);
			else
				string_24_ = string_22_;
			string_24_ = string_24_.trim();
			string_24_ = string_24_.substring(string_24_.lastIndexOf(' ') + 1);
			string_24_ = string_24_.substring(string_24_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_24_).toString();
			if (-1 != i && i_23_ != -1) {
				int i_25_ = string_22_.indexOf(".java:", i);
				if (i_25_ >= 0)
					string = new StringBuilder().append(string).append(string_22_.substring(i_25_ + 5, i_23_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_21_).toString();
		return string;
	}

	static final String method18568(String string, String string_26_, String string_27_) {
		for (int i = string.indexOf(string_26_); i != -1; i = string.indexOf(string_26_, i + string_27_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_27_).append(string.substring(i + string_26_.length())).toString();
		return string;
	}

	static final void method18569(String string) {
		System.out.println(new StringBuilder().append("Error: ").append(Class425.method6743(string, "%0a", "\n", (byte) 60)).toString());
	}

	static final void method18570(String string) {
		System.out.println(new StringBuilder().append("Error: ").append(Class425.method6743(string, "%0a", "\n", (byte) 79)).toString());
	}

	static String method18571(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub4) {
			RuntimeException_Sub4 runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			string = new StringBuilder().append(runtimeexception_sub4.aString12098).append(" | ").toString();
			throwable = runtimeexception_sub4.aThrowable12104;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_28_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_28_));
		String string_29_ = bufferedreader.readLine();
		for (;;) {
			String string_30_ = bufferedreader.readLine();
			if (string_30_ == null)
				break;
			int i = string_30_.indexOf('(');
			int i_31_ = string_30_.indexOf(')', 1 + i);
			String string_32_;
			if (-1 != i)
				string_32_ = string_30_.substring(0, i);
			else
				string_32_ = string_30_;
			string_32_ = string_32_.trim();
			string_32_ = string_32_.substring(string_32_.lastIndexOf(' ') + 1);
			string_32_ = string_32_.substring(string_32_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_32_).toString();
			if (-1 != i && i_31_ != -1) {
				int i_33_ = string_30_.indexOf(".java:", i);
				if (i_33_ >= 0)
					string = new StringBuilder().append(string).append(string_30_.substring(i_33_ + 5, i_31_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_29_).toString();
		return string;
	}

	static final String method18572(String string, String string_34_, String string_35_) {
		for (int i = string.indexOf(string_34_); i != -1; i = string.indexOf(string_34_, i + string_35_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_35_).append(string.substring(i + string_34_.length())).toString();
		return string;
	}
}
