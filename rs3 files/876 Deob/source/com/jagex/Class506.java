/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class506 implements Interface62, Runnable, FocusListener, WindowListener {
	public static int anInt5660;
	static long aLong5661 = -705403831754032896L;
	public static int anInt5662 = 0;
	public static int anInt5663 = 0;
	public static String aString5664;
	static final int anInt5665 = 32;
	public static Class503 aClass503_5666;
	protected static Class20 aClass20_5667;
	protected static int anInt5668;
	static final String aString5669 = "random.dat";
	public static int anInt5670;
	protected static String aString5671;
	protected static Frame aFrame5672;
	protected static volatile boolean aBool5673;
	static int anInt5674;
	static final String aString5675 = "rw";
	static volatile long aLong5676;
	static long[] aLongArray5677;
	static volatile boolean aBool5678;
	static final long aLong5679 = 3221225472L;
	static final int anInt5680 = 0;
	protected static boolean aBool5681;
	static final String aString5682 = "main_file_cache.dat2";
	static final String aString5683 = "main_file_cache.idx";
	static final String aString5684 = "main_file_cache.idx255";
	static Class20 aClass20_5685;
	static long[] aLongArray5686 = new long[32];
	protected static Class20 aClass20_5687;
	static final int anInt5688 = 1048576;
	protected static volatile boolean aBool5689;
	static int anInt5690;
	static Class513 aClass513_5691;
	static long aLong5692;
	static boolean aBool5693;
	boolean aBool5694 = false;
	public static int anInt5695;
	public static int anInt5696;
	boolean aBool5697 = false;
	static final int anInt5698 = 1;
	static String aString5699;

	void method8382() {
		if (Class523_Sub18_Sub8.aCanvas11689 != null) {
			Class523_Sub18_Sub8.aCanvas11689.removeFocusListener(this);
			Class523_Sub18_Sub8.aCanvas11689.getParent().setBackground(Color.black);
			Class523_Sub18_Sub8.aCanvas11689.getParent().remove(Class523_Sub18_Sub8.aCanvas11689);
		}
	}

	public void supplyApplet(Applet applet) {
		Class305.anApplet3346 = applet;
	}

	final void method8383(Class502 class502, String string, String string_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			method8412(Class513.aClass513_5765, bool, (byte) 103);
			anInt5668 = ((Class170.anInt1833 = class502.method8148(-1858671284) * -1033164529) * -1694583703);
			Class391.anInt4023 = ((Class254.anInt2742 = class502.method8143(2086875557) * -1322449835) * -2008528527);
			anInt5660 = 0;
			anInt5670 = 0;
			if (Class53.method1308((byte) 119) == Class513.aClass513_5766) {
				anInt5668 += -1284979122 * class502.method8149(1476384941);
				Class391.anInt4023 += -704230134 * class502.method8145(-837717765);
				method8477(class502.method8155(1935364981), -1498235061);
			}
			RuntimeException_Sub4.anApplet12101 = Class305.anApplet3346;
			method8384(string, string_0_, i, i_1_, i_2_, i_3_, -1660730315);
		} catch (Throwable throwable) {
			Class305.method5553(null, throwable, (byte) 1);
			method8409("crash", -672836602);
		}
	}

	final void method8384(String string, String string_5_, int i, int i_6_, int i_7_, int i_8_, int i_9_) throws Exception {
		Class155.anInt1736 = i_6_ * -2032626523;
		Class215.anInt2270 = 1708846585 * i;
		Class234_Sub1.anInt10003 = i_7_ * -1728397495;
		RuntimeException_Sub4.anInt12102 = i_8_ * 1160785509;
		Class236.aString2394 = "Unknown";
		Class472.aString5374 = "1.1";
		try {
			Class236.aString2394 = System.getProperty("java.vendor");
			Class472.aString5374 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class426.aString4823 = System.getProperty("os.name");
		} catch (Exception exception) {
			Class426.aString4823 = "Unknown";
		}
		Class611.aString8013 = Class426.aString4823.toLowerCase();
		try {
			Class319.aString3435 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class319.aString3435 = "";
		}
		try {
			aString5664 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			aString5664 = "";
		}
		try {
			aString5699 = System.getProperty("user.home");
			if (aString5699 != null)
				aString5699 = new StringBuilder().append(aString5699).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class611.aString8013.startsWith("win")) {
				if (null == aString5699)
					aString5699 = System.getenv("USERPROFILE");
			} else if (null == aString5699)
				aString5699 = System.getenv("HOME");
			if (aString5699 != null)
				aString5699 = new StringBuilder().append(aString5699).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == aString5699)
			aString5699 = "~/";
		try {
			Class379.anEventQueue3932 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class614.aStringArray8021 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString5699, "/tmp/", "" };
		Class192.aStringArray2178 = new String[] { new StringBuilder().append(".jagex_cache_").append(-12827575 * Class215.anInt2270).toString(), new StringBuilder().append(".file_store_").append(Class215.anInt2270 * -12827575).toString() };
		while_15_: for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			Class198.aFile2204 = method8385(string, string_5_, i_10_, 1960441079);
			if (!Class198.aFile2204.exists())
				Class198.aFile2204.mkdirs();
			File[] files = Class198.aFile2204.listFiles();
			if (files != null) {
				File[] files_11_ = files;
				for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
					File file = files_11_[i_12_];
					if (!method8387(file, false, (byte) 1))
						continue while_15_;
				}
			}
			break;
		}
		Class517.method8630(Class198.aFile2204, 1139952440);
		Class659.method10806(1228232654);
		aClass20_5687 = new Class20(new Class19((Class578.method9655("main_file_cache.dat2", (byte) 72)), "rw", 3221225472L), 5200, 0);
		aClass20_5667 = new Class20(new Class19((Class578.method9655("main_file_cache.idx255", (byte) 10)), "rw", 1048576L), 6000, 0);
		Class406.aClass20Array4198 = new Class20[Class155.anInt1736 * -549637331];
		for (int i_13_ = 0; i_13_ < -549637331 * Class155.anInt1736; i_13_++)
			Class406.aClass20Array4198[i_13_] = new Class20(new Class19((Class578.method9655(new StringBuilder().append("main_file_cache.idx").append(i_13_).toString(), (byte) 28)), "rw", 1048576L), 6000, 0);
		try {
			Class110.aClass693_1332 = new Class693();
		} catch (Exception exception) {
			Class710.aBool8840 = false;
		}
		Class384_Sub3.aClass507_10287 = new Class507();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_14_ = threadgroup.getParent(); threadgroup_14_ != null; threadgroup_14_ = threadgroup.getParent())
			threadgroup = threadgroup_14_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
			if (null != threads[i_15_] && threads[i_15_].getName().startsWith("AWT"))
				threads[i_15_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	File method8385(String string, String string_16_, int i, int i_17_) {
		String string_18_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class525.aFile7088 = new File(aString5699, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_16_).append(string_18_).append(".dat").toString());
		String string_19_ = null;
		String string_20_ = null;
		boolean bool = false;
		if (Class525.aFile7088.exists()) {
			try {
				Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
				int i_21_;
				RSBuffer class523_sub34;
				for (class523_sub34 = (new RSBuffer((int) class19.method795(-656058899))); (2349011 * class523_sub34.offset < class523_sub34.buffer.length); class523_sub34.offset += i_21_ * 189765723) {
					i_21_ = class19.method784(class523_sub34.buffer, (class523_sub34.offset * 2349011), ((class523_sub34.buffer).length - 2349011 * (class523_sub34.offset)), (byte) 16);
					if (i_21_ == -1)
						throw new IOException();
				}
				class523_sub34.offset = 0;
				i_21_ = class523_sub34.readUnsignedByte(-995995989);
				if (i_21_ < 1 || i_21_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_21_).toString());
				int i_22_ = 0;
				if (i_21_ > 1)
					i_22_ = class523_sub34.readUnsignedByte(561558109);
				if (i_21_ <= 2) {
					string_19_ = class523_sub34.readVersionedString(2028696654);
					if (1 == i_22_)
						string_20_ = class523_sub34.readVersionedString(2002096213);
				} else {
					string_19_ = class523_sub34.method16297((short) -31452);
					if (i_22_ == 1)
						string_20_ = class523_sub34.method16297((short) -16706);
				}
				class19.method786(1444579637);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_19_) {
				File file = new File(string_19_);
				if (!file.exists())
					string_19_ = null;
			}
			if (string_19_ != null) {
				File file = new File(string_19_, "test.dat");
				if (!method8387(file, true, (byte) 1))
					string_19_ = null;
			}
		}
		if (string_19_ == null && 0 == i) {
			while_16_: for (int i_23_ = 0; i_23_ < Class192.aStringArray2178.length; i_23_++) {
				for (int i_24_ = 0; i_24_ < Class614.aStringArray8021.length; i_24_++) {
					File file = new File(new StringBuilder().append(Class614.aStringArray8021[i_24_]).append(Class192.aStringArray2178[i_23_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8387(new File(file, "test.dat"), true, (byte) 1)) {
						string_19_ = file.toString();
						bool = true;
						break while_16_;
					}
				}
			}
		}
		if (string_19_ == null) {
			string_19_ = new StringBuilder().append(aString5699).append(File.separatorChar).append("jagexcache").append(string_18_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_16_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_20_) {
			File file = new File(string_20_);
			File file_25_ = new File(string_19_);
			try {
				File[] files = file.listFiles();
				File[] files_26_ = files;
				for (int i_27_ = 0; i_27_ < files_26_.length; i_27_++) {
					File file_28_ = files_26_[i_27_];
					File file_29_ = new File(file_25_, file_28_.getName());
					boolean bool_30_ = file_28_.renameTo(file_29_);
					if (!bool_30_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8489(new File(string_19_), null, (byte) 115);
		return new File(string_19_);
	}

	synchronized void method8386(int i) {
		method8465((byte) 115);
		Container container = JS5Protocol.method7486(-1844629897);
		Class523_Sub18_Sub8.aCanvas11689 = new Canvas_Sub1(container);
		method8390(container, 827488016);
	}

	boolean method8387(File file, boolean bool, byte i) {
		boolean bool_31_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_32_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_32_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_31_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_31_;
	}

	void method8388(byte i) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_33_ = aLongArray5686[Class204.anInt2213 * -1855642487 - 1 & 0x1f];
		long l_34_ = aLongArray5686[-1855642487 * Class204.anInt2213];
		aLongArray5686[-1855642487 * Class204.anInt2213] = l;
		Class204.anInt2213 = -759197255 * (1 + Class204.anInt2213 * -1855642487 & 0x1f);
		if (l_34_ != 0L && l > l_34_) {
			int i_35_ = (int) (l - l_34_);
			anInt5663 = (int) (l - l_33_) * 1845749395;
			anInt5662 = 1296208463 * ((32000 + (i_35_ >> 1)) / i_35_);
		}
		if ((anInt5674 += 1946205063) * -472638921 - 1 > 50) {
			anInt5674 -= -1473994658;
			aBool5673 = true;
			Class523_Sub18_Sub8.aCanvas11689.setSize((2141365743 * Class170.anInt1833), (Class254.anInt2742 * -495986435));
			Class523_Sub18_Sub8.aCanvas11689.setVisible(true);
			if (aFrame5672 != null && Class310.aFrame3385 == null) {
				Insets insets = aFrame5672.getInsets();
				Class523_Sub18_Sub8.aCanvas11689.setLocation(-1901078577 * anInt5660 + insets.left, insets.top + anInt5670 * -1734289153);
			} else
				Class523_Sub18_Sub8.aCanvas11689.setLocation((anInt5660 * -1901078577), (anInt5670 * -1734289153));
		}
		method8407(-1995320176);
	}

	final boolean method8389() {
		String string = Class305.anApplet3346.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8409("invalidhost", -1691636744);
		return false;
	}

	void method8390(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class523_Sub18_Sub8.aCanvas11689);
		Class523_Sub18_Sub8.aCanvas11689.setSize((Class170.anInt1833 * 2141365743), (Class254.anInt2742 * -495986435));
		Class523_Sub18_Sub8.aCanvas11689.setVisible(true);
		if (aFrame5672 == container) {
			Insets insets = aFrame5672.getInsets();
			Class523_Sub18_Sub8.aCanvas11689.setLocation(insets.left + anInt5660 * -1901078577, -1734289153 * anInt5670 + insets.top);
		} else
			Class523_Sub18_Sub8.aCanvas11689.setLocation(anInt5660 * -1901078577, -1734289153 * anInt5670);
		Class523_Sub18_Sub8.aCanvas11689.addFocusListener(this);
		Class523_Sub18_Sub8.aCanvas11689.requestFocus();
		Class341.aBool3608 = true;
		aBool5678 = true;
		Class523_Sub18_Sub8.aCanvas11689.setFocusTraversalKeysEnabled(false);
		aBool5673 = true;
		aBool5689 = false;
		aLong5676 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -3964063768119495443L;
	}

	void method8391(Container container) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class523_Sub18_Sub8.aCanvas11689);
		Class523_Sub18_Sub8.aCanvas11689.setSize((Class170.anInt1833 * 2141365743), (Class254.anInt2742 * -495986435));
		Class523_Sub18_Sub8.aCanvas11689.setVisible(true);
		if (aFrame5672 == container) {
			Insets insets = aFrame5672.getInsets();
			Class523_Sub18_Sub8.aCanvas11689.setLocation(insets.left + anInt5660 * -1901078577, -1734289153 * anInt5670 + insets.top);
		} else
			Class523_Sub18_Sub8.aCanvas11689.setLocation(anInt5660 * -1901078577, -1734289153 * anInt5670);
		Class523_Sub18_Sub8.aCanvas11689.addFocusListener(this);
		Class523_Sub18_Sub8.aCanvas11689.requestFocus();
		Class341.aBool3608 = true;
		aBool5678 = true;
		Class523_Sub18_Sub8.aCanvas11689.setFocusTraversalKeysEnabled(false);
		aBool5673 = true;
		aBool5689 = false;
		aLong5676 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -3964063768119495443L;
	}

	public final void method8392(WindowEvent windowevent) {
		/* empty */
	}

	void method8393() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_36_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_36_ != 0L && l <= l_36_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -63);
	}

	void method8394(int i) {
		if (Class236.aString2394 != null) {
			String string = Class236.aString2394.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_37_ = Class472.aString5374;
				if (string_37_.equals("1.1") || string_37_.startsWith("1.1.") || string_37_.equals("1.2") || string_37_.startsWith("1.2.") || string_37_.equals("1.3") || string_37_.startsWith("1.3.") || string_37_.equals("1.4") || string_37_.startsWith("1.4.") || string_37_.equals("1.5") || string_37_.startsWith("1.5.") || string_37_.equals("1.6.0")) {
					method8409("wrongjava", -1036257309);
					return;
				}
				if (string_37_.startsWith("1.6.0_")) {
					int i_38_;
					for (i_38_ = 6; (i_38_ < string_37_.length() && Class482.method7918(string_37_.charAt(i_38_), (byte) -59)); i_38_++) {
						/* empty */
					}
					String string_39_ = string_37_.substring(6, i_38_);
					if (Class516.method8619(string_39_, 1695842396) && (JS5Client.method15856(string_39_, (byte) 67) < 10)) {
						method8409("wrongjava", -11220187);
						return;
					}
				}
			}
		}
		JS5Protocol.method7486(-1736426379).setFocusCycleRoot(true);
		anInt5695 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -215857255);
		anInt5696 = Runtime.getRuntime().availableProcessors() * 2097775013;
		method8386(553350611);
		method8400(403007039);
		aClass503_5666 = Class628.method10315(-1790094770);
		while (aLong5692 * -4633992534932214651L == 0L || (TimeUtils.getCurrentTimeMilliseconds(1516375036) < -4633992534932214651L * aLong5692)) {
			anInt5690 = (aClass503_5666.method8166(aLong5661 * 4174308412259797L) * -1777029183);
			for (int i_40_ = 0; i_40_ < anInt5690 * 2023186497; i_40_++)
				method8395(-1438531475);
			method8388((byte) 48);
			Class214.method3837(Class523_Sub18_Sub8.aCanvas11689, -1988355905);
		}
	}

	void method8395(int i) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_41_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_41_ != 0L && l <= l_41_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -63);
	}

	public void method8396() {
		do {
			try {
				try {
					method8394(-8826796);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class305.method5553(method8397((byte) -54), throwable, (byte) 1);
					method8409("crash", -746889440);
					method8486(true, -1518779073);
					break;
				}
				method8486(true, -1518779073);
			} catch (Exception object) {
				method8486(true, -1518779073);
				throw object;
			}
		} while (false);
	}

	String method8397(byte i) {
		return null;
	}

	public static final void method8398() {
		Class268.anImage2868 = null;
		Class220.aFont2330 = null;
	}

	public void start() {
		if (!aBool5693)
			aLong5692 = 0L;
	}

	public void stop() {
		if (!aBool5693)
			aLong5692 = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) + 4000L) * -5945176783381894067L);
	}

	public void destroy() {
		if (!aBool5693) {
			aLong5692 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -5945176783381894067L;
			Class653.method10656(5000L);
			method8486(false, -1518779073);
		}
	}

	final void method8399(String string, String string_42_, int i, int i_43_, int i_44_, int i_45_) throws Exception {
		Class155.anInt1736 = i_43_ * -2032626523;
		Class215.anInt2270 = 1708846585 * i;
		Class234_Sub1.anInt10003 = i_44_ * -1728397495;
		RuntimeException_Sub4.anInt12102 = i_45_ * 1160785509;
		Class236.aString2394 = "Unknown";
		Class472.aString5374 = "1.1";
		try {
			Class236.aString2394 = System.getProperty("java.vendor");
			Class472.aString5374 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class426.aString4823 = System.getProperty("os.name");
		} catch (Exception exception) {
			Class426.aString4823 = "Unknown";
		}
		Class611.aString8013 = Class426.aString4823.toLowerCase();
		try {
			Class319.aString3435 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class319.aString3435 = "";
		}
		try {
			aString5664 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			aString5664 = "";
		}
		try {
			aString5699 = System.getProperty("user.home");
			if (aString5699 != null)
				aString5699 = new StringBuilder().append(aString5699).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class611.aString8013.startsWith("win")) {
				if (null == aString5699)
					aString5699 = System.getenv("USERPROFILE");
			} else if (null == aString5699)
				aString5699 = System.getenv("HOME");
			if (aString5699 != null)
				aString5699 = new StringBuilder().append(aString5699).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == aString5699)
			aString5699 = "~/";
		try {
			Class379.anEventQueue3932 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class614.aStringArray8021 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString5699, "/tmp/", "" };
		Class192.aStringArray2178 = new String[] { new StringBuilder().append(".jagex_cache_").append(-12827575 * Class215.anInt2270).toString(), new StringBuilder().append(".file_store_").append(Class215.anInt2270 * -12827575).toString() };
		while_18_: for (int i_46_ = 0; i_46_ < 4; i_46_++) {
			Class198.aFile2204 = method8385(string, string_42_, i_46_, 1378179531);
			if (!Class198.aFile2204.exists())
				Class198.aFile2204.mkdirs();
			File[] files = Class198.aFile2204.listFiles();
			if (files != null) {
				File[] files_47_ = files;
				for (int i_48_ = 0; i_48_ < files_47_.length; i_48_++) {
					File file = files_47_[i_48_];
					if (!method8387(file, false, (byte) 1))
						continue while_18_;
				}
			}
			break;
		}
		Class517.method8630(Class198.aFile2204, -18369241);
		Class659.method10806(1436934810);
		aClass20_5687 = new Class20(new Class19((Class578.method9655("main_file_cache.dat2", (byte) 34)), "rw", 3221225472L), 5200, 0);
		aClass20_5667 = new Class20(new Class19((Class578.method9655("main_file_cache.idx255", (byte) 105)), "rw", 1048576L), 6000, 0);
		Class406.aClass20Array4198 = new Class20[Class155.anInt1736 * -549637331];
		for (int i_49_ = 0; i_49_ < -549637331 * Class155.anInt1736; i_49_++)
			Class406.aClass20Array4198[i_49_] = new Class20(new Class19((Class578.method9655(new StringBuilder().append("main_file_cache.idx").append(i_49_).toString(), (byte) 126)), "rw", 1048576L), 6000, 0);
		try {
			Class110.aClass693_1332 = new Class693();
		} catch (Exception exception) {
			Class710.aBool8840 = false;
		}
		Class384_Sub3.aClass507_10287 = new Class507();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_50_ = threadgroup.getParent(); threadgroup_50_ != null; threadgroup_50_ = threadgroup.getParent())
			threadgroup = threadgroup_50_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_51_ = 0; i_51_ < threads.length; i_51_++) {
			if (null != threads[i_51_] && threads[i_51_].getName().startsWith("AWT"))
				threads[i_51_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	abstract void method8400(int i);

	public final void focusGained(FocusEvent focusevent) {
		aBool5678 = true;
		aBool5673 = true;
	}

	public void run() {
		do {
			try {
				try {
					method8394(-460240464);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class305.method5553(method8397((byte) -15), throwable, (byte) 1);
					method8409("crash", -2140633366);
					method8486(true, -1518779073);
					break;
				}
				method8486(true, -1518779073);
			} catch (Exception object) {
				method8486(true, -1518779073);
				throw object;
			}
		} while (false);
	}

	final void method8401(boolean bool) {
		synchronized (this) {
			if (aBool5693)
				return;
			aBool5693 = true;
		}
		try {
			method8485(-1871592451);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass20_5687.method798((byte) -1);
			for (int i = 0; i < -549637331 * Class155.anInt1736; i++)
				Class406.aClass20Array4198[i].method798((byte) -1);
			aClass20_5667.method798((byte) -1);
			aClass20_5685.method798((byte) -1);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool5697) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class662.method10912((byte) -116))
			Class523_Sub24.method16142(1424510266).method380(2078087903);
		if (null != Class523_Sub18_Sub8.aCanvas11689) {
			try {
				Class523_Sub18_Sub8.aCanvas11689.removeFocusListener(this);
				Class523_Sub18_Sub8.aCanvas11689.getParent().remove(Class523_Sub18_Sub8.aCanvas11689);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (aFrame5672 != null) {
			aFrame5672.setVisible(false);
			aFrame5672.dispose();
			aFrame5672 = null;
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public static void method8402(RSBuffer class523_sub34) {
		byte[] is = new byte[24];
		try {
			aClass20_5685.method799(0L);
			aClass20_5685.method801(is, (byte) -75);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class523_sub34.readBytes(is, 0, 24, (short) -1017);
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8403(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	void method8404(File file, File file_52_) {
		try {
			Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
			RSBuffer class523_sub34 = new RSBuffer(500);
			class523_sub34.writeByte(3, -980408108);
			class523_sub34.writeByte(file_52_ != null ? 1 : 0, -1081296691);
			class523_sub34.method16272(file.getPath(), 1685910119);
			if (null != file_52_)
				class523_sub34.method16272(file_52_.getPath(), 1685910119);
			class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
			class19.method786(1241815745);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public static Class19 method8405(String string, String string_53_, boolean bool) {
		File file = new File(Class198.aFile2204, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class19 class19;
				try {
					Class19 class19_54_ = new Class19(file, "rw", 10000L);
					class19 = class19_54_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		String string_55_ = "";
		if (33 == Class215.anInt2270 * -12827575)
			string_55_ = "_rc";
		else if (34 == Class215.anInt2270 * -12827575)
			string_55_ = "_wip";
		File file_56_ = new File(aString5699, new StringBuilder().append("jagex_").append(string_53_).append("_preferences").append(string).append(string_55_).append(".dat").toString());
		do {
			if (!bool && file_56_.exists()) {
				Class19 class19;
				try {
					Class19 class19_57_ = new Class19(file_56_, "rw", 10000L);
					class19 = class19_57_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		Class19 class19;
		try {
			Class19 class19_58_ = new Class19(file, "rw", 10000L);
			class19 = class19_58_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class19;
	}

	abstract void method8406(byte i);

	abstract void method8407(int i);

	public final void method8408(WindowEvent windowevent) {
		/* empty */
	}

	void method8409(String string, int i) {
		if (!aBool5694) {
			aBool5694 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class35.method952(Class305.anApplet3346, "loggedout", (byte) -13);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class305.anApplet3346.getAppletContext().showDocument(new URL(Class305.anApplet3346.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method8410(String string, String string_59_, int i) {
		if (!aBool5694) {
			aBool5694 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class35.method952(Class305.anApplet3346, "loggedout", (byte) 58);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class305.anApplet3346.getAppletContext().showDocument(new URL(Class305.anApplet3346.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws?").append(string_59_).toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void method8411(int i) throws Exception_Sub6 {
		if (!aBool5697) {
			Class523_Sub24.method16142(1958028029).method383("jaclib", 2106472487);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class611.aString8013.startsWith("win"))
					throw new Exception_Sub6(128, "jaclib");
			}
			aBool5697 = true;
		}
	}

	void method8412(Class513 class513, boolean bool, byte i) {
		if (class513 == null)
			throw new NullPointerException();
		if (Class513.aClass513_5765 != class513 && Class513.aClass513_5764 != class513)
			throw new IllegalStateException();
		aClass513_5691 = class513;
		if (Class513.aClass513_5764 != aClass513_5691) {
			if (bool)
				aClass513_5691 = Class513.aClass513_5766;
		}
	}

	static {
		aLongArray5677 = new long[32];
		anInt5660 = 0;
		anInt5670 = 0;
		aString5671 = null;
		aBool5673 = true;
		anInt5674 = -1855044692;
		aBool5689 = false;
		aLong5676 = 0L;
		aBool5681 = false;
		aBool5678 = true;
		aClass20_5685 = null;
		aClass20_5687 = null;
		aClass20_5667 = null;
		aClass513_5691 = null;
		aLong5692 = 0L;
		aBool5693 = false;
		anInt5695 = 215857255;
		anInt5696 = 2097775013;
	}

	String method8413() {
		return null;
	}

	public void method8414() {
		do {
			try {
				try {
					method8394(-906316000);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class305.method5553(method8397((byte) 20), throwable, (byte) 1);
					method8409("crash", -2092104036);
					method8486(true, -1518779073);
					break;
				}
				method8486(true, -1518779073);
			} catch (Exception object) {
				method8486(true, -1518779073);
				throw object;
			}
		} while (false);
	}

	abstract void method8415();

	abstract void method8416();

	abstract void method8417();

	abstract void method8418();

	public abstract void method420();

	abstract void method8419();

	abstract void method8420();

	abstract void method8421();

	public static void method8422(RSBuffer class523_sub34) {
		byte[] is = new byte[24];
		try {
			aClass20_5685.method799(0L);
			aClass20_5685.method801(is, (byte) 8);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class523_sub34.readBytes(is, 0, 24, (short) -24783);
	}

	String method8423() {
		return null;
	}

	public void method410(Applet applet) {
		Class305.anApplet3346 = applet;
	}

	final void method8424(Class502 class502, String string, String string_60_, int i, int i_61_, int i_62_, int i_63_, boolean bool) {
		try {
			method8412(Class513.aClass513_5765, bool, (byte) 96);
			anInt5668 = ((Class170.anInt1833 = class502.method8148(-1556682324) * -1033164529) * -1694583703);
			Class391.anInt4023 = ((Class254.anInt2742 = class502.method8143(1444089838) * -1322449835) * -2008528527);
			anInt5660 = 0;
			anInt5670 = 0;
			if (Class53.method1308((byte) 25) == Class513.aClass513_5766) {
				anInt5668 += -1284979122 * class502.method8149(-1737471546);
				Class391.anInt4023 += -704230134 * class502.method8145(-837717765);
				method8477(class502.method8155(1497194095), 1764181370);
			}
			RuntimeException_Sub4.anApplet12101 = Class305.anApplet3346;
			method8384(string, string_60_, i, i_61_, i_62_, i_63_, -1818892215);
		} catch (Throwable throwable) {
			Class305.method5553(null, throwable, (byte) 1);
			method8409("crash", -442145707);
		}
	}

	final void method8425(Class502 class502, String string, String string_64_, int i, int i_65_, int i_66_, int i_67_, boolean bool) {
		try {
			method8412(Class513.aClass513_5765, bool, (byte) 91);
			anInt5668 = ((Class170.anInt1833 = class502.method8148(-1800456759) * -1033164529) * -1694583703);
			Class391.anInt4023 = ((Class254.anInt2742 = class502.method8143(1796020014) * -1322449835) * -2008528527);
			anInt5660 = 0;
			anInt5670 = 0;
			if (Class53.method1308((byte) 60) == Class513.aClass513_5766) {
				anInt5668 += -1284979122 * class502.method8149(-479236550);
				Class391.anInt4023 += -704230134 * class502.method8145(-837717765);
				method8477(class502.method8155(1797311150), -612345063);
			}
			RuntimeException_Sub4.anApplet12101 = Class305.anApplet3346;
			method8384(string, string_64_, i, i_65_, i_66_, i_67_, -1770465483);
		} catch (Throwable throwable) {
			Class305.method5553(null, throwable, (byte) 1);
			method8409("crash", -605054213);
		}
	}

	public final void method8426(FocusEvent focusevent) {
		aBool5678 = false;
	}

	final void method8427(String string, String string_68_, int i, int i_69_, int i_70_, int i_71_) throws Exception {
		Class155.anInt1736 = i_69_ * -2032626523;
		Class215.anInt2270 = 1708846585 * i;
		Class234_Sub1.anInt10003 = i_70_ * -1728397495;
		RuntimeException_Sub4.anInt12102 = i_71_ * 1160785509;
		Class236.aString2394 = "Unknown";
		Class472.aString5374 = "1.1";
		try {
			Class236.aString2394 = System.getProperty("java.vendor");
			Class472.aString5374 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class426.aString4823 = System.getProperty("os.name");
		} catch (Exception exception) {
			Class426.aString4823 = "Unknown";
		}
		Class611.aString8013 = Class426.aString4823.toLowerCase();
		try {
			Class319.aString3435 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class319.aString3435 = "";
		}
		try {
			aString5664 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			aString5664 = "";
		}
		try {
			aString5699 = System.getProperty("user.home");
			if (aString5699 != null)
				aString5699 = new StringBuilder().append(aString5699).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class611.aString8013.startsWith("win")) {
				if (null == aString5699)
					aString5699 = System.getenv("USERPROFILE");
			} else if (null == aString5699)
				aString5699 = System.getenv("HOME");
			if (aString5699 != null)
				aString5699 = new StringBuilder().append(aString5699).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == aString5699)
			aString5699 = "~/";
		try {
			Class379.anEventQueue3932 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class614.aStringArray8021 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString5699, "/tmp/", "" };
		Class192.aStringArray2178 = new String[] { new StringBuilder().append(".jagex_cache_").append(-12827575 * Class215.anInt2270).toString(), new StringBuilder().append(".file_store_").append(Class215.anInt2270 * -12827575).toString() };
		while_20_: for (int i_72_ = 0; i_72_ < 4; i_72_++) {
			Class198.aFile2204 = method8385(string, string_68_, i_72_, 2098063439);
			if (!Class198.aFile2204.exists())
				Class198.aFile2204.mkdirs();
			File[] files = Class198.aFile2204.listFiles();
			if (files != null) {
				File[] files_73_ = files;
				for (int i_74_ = 0; i_74_ < files_73_.length; i_74_++) {
					File file = files_73_[i_74_];
					if (!method8387(file, false, (byte) 1))
						continue while_20_;
				}
			}
			break;
		}
		Class517.method8630(Class198.aFile2204, 1594093859);
		Class659.method10806(1432368331);
		aClass20_5687 = new Class20(new Class19((Class578.method9655("main_file_cache.dat2", (byte) 92)), "rw", 3221225472L), 5200, 0);
		aClass20_5667 = new Class20(new Class19((Class578.method9655("main_file_cache.idx255", (byte) 76)), "rw", 1048576L), 6000, 0);
		Class406.aClass20Array4198 = new Class20[Class155.anInt1736 * -549637331];
		for (int i_75_ = 0; i_75_ < -549637331 * Class155.anInt1736; i_75_++)
			Class406.aClass20Array4198[i_75_] = new Class20(new Class19((Class578.method9655(new StringBuilder().append("main_file_cache.idx").append(i_75_).toString(), (byte) 91)), "rw", 1048576L), 6000, 0);
		try {
			Class110.aClass693_1332 = new Class693();
		} catch (Exception exception) {
			Class710.aBool8840 = false;
		}
		Class384_Sub3.aClass507_10287 = new Class507();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_76_ = threadgroup.getParent(); threadgroup_76_ != null; threadgroup_76_ = threadgroup.getParent())
			threadgroup = threadgroup_76_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_77_ = 0; i_77_ < threads.length; i_77_++) {
			if (null != threads[i_77_] && threads[i_77_].getName().startsWith("AWT"))
				threads[i_77_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	void method8428() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_78_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_78_ != 0L && l <= l_78_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -17);
	}

	public abstract void init();

	Class506() {
		/* empty */
	}

	void method8429(File file, File file_79_) {
		try {
			Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
			RSBuffer class523_sub34 = new RSBuffer(500);
			class523_sub34.writeByte(3, 1037712522);
			class523_sub34.writeByte(file_79_ != null ? 1 : 0, 1386106567);
			class523_sub34.method16272(file.getPath(), 1685910119);
			if (null != file_79_)
				class523_sub34.method16272(file_79_.getPath(), 1685910119);
			class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
			class19.method786(1651469845);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public final synchronized void paint(Graphics graphics) {
		if (!aBool5693) {
			aBool5673 = true;
			if ((TimeUtils.getCurrentTimeMilliseconds(1516375036) - 2600757099466377445L * aLong5676) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= -1308828521 * anInt5668 && rectangle.height >= 60613197 * Class391.anInt4023))
					aBool5689 = true;
			}
		}
	}

	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	synchronized void method8430() {
		method8465((byte) 26);
		Container container = JS5Protocol.method7486(-1821176310);
		Class523_Sub18_Sub8.aCanvas11689 = new Canvas_Sub1(container);
		method8390(container, -892647201);
	}

	File method8431(String string, String string_80_, int i) {
		String string_81_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class525.aFile7088 = new File(aString5699, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_80_).append(string_81_).append(".dat").toString());
		String string_82_ = null;
		String string_83_ = null;
		boolean bool = false;
		if (Class525.aFile7088.exists()) {
			try {
				Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
				int i_84_;
				RSBuffer class523_sub34;
				for (class523_sub34 = (new RSBuffer((int) class19.method795(-1384644108))); (2349011 * class523_sub34.offset < class523_sub34.buffer.length); class523_sub34.offset += i_84_ * 189765723) {
					i_84_ = class19.method784(class523_sub34.buffer, (class523_sub34.offset * 2349011), ((class523_sub34.buffer).length - 2349011 * (class523_sub34.offset)), (byte) 16);
					if (i_84_ == -1)
						throw new IOException();
				}
				class523_sub34.offset = 0;
				i_84_ = class523_sub34.readUnsignedByte(1441399913);
				if (i_84_ < 1 || i_84_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_84_).toString());
				int i_85_ = 0;
				if (i_84_ > 1)
					i_85_ = class523_sub34.readUnsignedByte(-1747754083);
				if (i_84_ <= 2) {
					string_82_ = class523_sub34.readVersionedString(2099500606);
					if (1 == i_85_)
						string_83_ = class523_sub34.readVersionedString(2056273623);
				} else {
					string_82_ = class523_sub34.method16297((short) -7154);
					if (i_85_ == 1)
						string_83_ = class523_sub34.method16297((short) -10278);
				}
				class19.method786(1439828916);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_82_) {
				File file = new File(string_82_);
				if (!file.exists())
					string_82_ = null;
			}
			if (string_82_ != null) {
				File file = new File(string_82_, "test.dat");
				if (!method8387(file, true, (byte) 1))
					string_82_ = null;
			}
		}
		if (string_82_ == null && 0 == i) {
			while_21_: for (int i_86_ = 0; i_86_ < Class192.aStringArray2178.length; i_86_++) {
				for (int i_87_ = 0; i_87_ < Class614.aStringArray8021.length; i_87_++) {
					File file = new File(new StringBuilder().append(Class614.aStringArray8021[i_87_]).append(Class192.aStringArray2178[i_86_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8387(new File(file, "test.dat"), true, (byte) 1)) {
						string_82_ = file.toString();
						bool = true;
						break while_21_;
					}
				}
			}
		}
		if (string_82_ == null) {
			string_82_ = new StringBuilder().append(aString5699).append(File.separatorChar).append("jagexcache").append(string_81_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_80_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_83_) {
			File file = new File(string_83_);
			File file_88_ = new File(string_82_);
			try {
				File[] files = file.listFiles();
				File[] files_89_ = files;
				for (int i_90_ = 0; i_90_ < files_89_.length; i_90_++) {
					File file_91_ = files_89_[i_90_];
					File file_92_ = new File(file_88_, file_91_.getName());
					boolean bool_93_ = file_91_.renameTo(file_92_);
					if (!bool_93_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8489(new File(string_82_), null, (byte) 113);
		return new File(string_82_);
	}

	public static void method8432(RSBuffer class523_sub34) {
		byte[] is = new byte[24];
		try {
			aClass20_5685.method799(0L);
			aClass20_5685.method801(is, (byte) -40);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class523_sub34.readBytes(is, 0, 24, (short) -14955);
	}

	public final void method8433(FocusEvent focusevent) {
		aBool5678 = false;
	}

	final boolean method8434() {
		String string = Class305.anApplet3346.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8409("invalidhost", -1441727059);
		return false;
	}

	synchronized void method8435(String string) {
		aFrame5672 = new Frame();
		aFrame5672.setTitle(string);
		aFrame5672.setResizable(true);
		aFrame5672.addWindowListener(this);
		aFrame5672.setBackground(Color.black);
		aFrame5672.setVisible(true);
		aFrame5672.toFront();
		Insets insets = aFrame5672.getInsets();
		aFrame5672.setSize(insets.right + (anInt5668 * -1308828521 + insets.left), (insets.top + Class391.anInt4023 * 60613197 + insets.bottom));
	}

	synchronized void method8436(String string) {
		aFrame5672 = new Frame();
		aFrame5672.setTitle(string);
		aFrame5672.setResizable(true);
		aFrame5672.addWindowListener(this);
		aFrame5672.setBackground(Color.black);
		aFrame5672.setVisible(true);
		aFrame5672.toFront();
		Insets insets = aFrame5672.getInsets();
		aFrame5672.setSize(insets.right + (anInt5668 * -1308828521 + insets.left), (insets.top + Class391.anInt4023 * 60613197 + insets.bottom));
	}

	synchronized void method8437(String string) {
		aFrame5672 = new Frame();
		aFrame5672.setTitle(string);
		aFrame5672.setResizable(true);
		aFrame5672.addWindowListener(this);
		aFrame5672.setBackground(Color.black);
		aFrame5672.setVisible(true);
		aFrame5672.toFront();
		Insets insets = aFrame5672.getInsets();
		aFrame5672.setSize(insets.right + (anInt5668 * -1308828521 + insets.left), (insets.top + Class391.anInt4023 * 60613197 + insets.bottom));
	}

	final boolean method8438() {
		String string = Class305.anApplet3346.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8409("invalidhost", -1975450545);
		return false;
	}

	public static Container method8439() {
		if (Class310.aFrame3385 != null)
			return Class310.aFrame3385;
		if (null != aFrame5672)
			return aFrame5672;
		return Class305.anApplet3346;
	}

	final boolean method8440(byte i) {
		String string = Class305.anApplet3346.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8409("invalidhost", -1804051852);
		return false;
	}

	public static Container method8441() {
		if (Class310.aFrame3385 != null)
			return Class310.aFrame3385;
		if (null != aFrame5672)
			return aFrame5672;
		return Class305.anApplet3346;
	}

	public static final void method8442(int i, String string, Color color, Color color_94_, Color color_95_) {
		try {
			Graphics graphics = Class523_Sub18_Sub8.aCanvas11689.getGraphics();
			if (Class220.aFont2330 == null)
				Class220.aFont2330 = new Font("Helvetica", 1, 13);
			if (color == null)
				color = new Color(140, 17, 17);
			if (null == color_94_)
				color_94_ = new Color(140, 17, 17);
			if (null == color_95_)
				color_95_ = new Color(255, 255, 255);
			try {
				if (null == Class268.anImage2868)
					Class268.anImage2868 = (Class523_Sub18_Sub8.aCanvas11689.createImage(Class170.anInt1833 * 2141365743, Class254.anInt2742 * -495986435));
				Graphics graphics_96_ = Class268.anImage2868.getGraphics();
				graphics_96_.setColor(Color.black);
				graphics_96_.fillRect(0, 0, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435);
				int i_97_ = Class170.anInt1833 * 2141365743 / 2 - 152;
				int i_98_ = -495986435 * Class254.anInt2742 / 2 - 18;
				graphics_96_.setColor(color_94_);
				graphics_96_.drawRect(i_97_, i_98_, 303, 33);
				graphics_96_.setColor(color);
				graphics_96_.fillRect(i_97_ + 2, i_98_ + 2, 3 * i, 30);
				graphics_96_.setColor(Color.black);
				graphics_96_.drawRect(i_97_ + 1, i_98_ + 1, 301, 31);
				graphics_96_.fillRect(3 * i + (2 + i_97_), i_98_ + 2, 300 - i * 3, 30);
				graphics_96_.setFont(Class220.aFont2330);
				graphics_96_.setColor(color_95_);
				graphics_96_.drawString(string, (i_97_ + (304 - string.length() * 6) / 2), 22 + i_98_);
				if (null != aString5671) {
					graphics_96_.setFont(Class220.aFont2330);
					graphics_96_.setColor(color_95_);
					graphics_96_.drawString(aString5671, ((2141365743 * Class170.anInt1833 / 2) - aString5671.length() * 6 / 2), (Class254.anInt2742 * -495986435 / 2) - 26);
				}
				graphics.drawImage(Class268.anImage2868, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435);
				int i_99_ = 2141365743 * Class170.anInt1833 / 2 - 152;
				int i_100_ = Class254.anInt2742 * -495986435 / 2 - 18;
				graphics.setColor(color_94_);
				graphics.drawRect(i_99_, i_100_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(2 + i_99_, 2 + i_100_, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + i_99_, i_100_ + 1, 301, 31);
				graphics.fillRect(2 + i_99_ + 3 * i, i_100_ + 2, 300 - i * 3, 30);
				graphics.setFont(Class220.aFont2330);
				graphics.setColor(color_95_);
				if (aString5671 != null) {
					graphics.setFont(Class220.aFont2330);
					graphics.setColor(color_95_);
					graphics.drawString(aString5671, (Class170.anInt1833 * 2141365743 / 2 - aString5671.length() * 6 / 2), (-495986435 * Class254.anInt2742 / 2 - 26));
				}
				graphics.drawString(string, i_99_ + (304 - string.length() * 6) / 2, 22 + i_100_);
			}
		} catch (Exception exception) {
			Class523_Sub18_Sub8.aCanvas11689.repaint();
		}
	}

	static void method8443(Object object) {
		if (null != Class379.anEventQueue3932) {
			for (int i = 0; i < 50 && Class379.anEventQueue3932.peekEvent() != null; i++)
				Class653.method10656(1L);
			try {
				if (null != object)
					Class379.anEventQueue3932.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method8444() {
		if (Class523_Sub18_Sub8.aCanvas11689 != null) {
			Class523_Sub18_Sub8.aCanvas11689.removeFocusListener(this);
			Class523_Sub18_Sub8.aCanvas11689.getParent().setBackground(Color.black);
			Class523_Sub18_Sub8.aCanvas11689.getParent().remove(Class523_Sub18_Sub8.aCanvas11689);
		}
	}

	public final void method8445(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8446(FocusEvent focusevent) {
		aBool5678 = true;
		aBool5673 = true;
	}

	static long method8447() {
		return aClass503_5666.method8167(-1093561321);
	}

	void method8448() {
		if (Class236.aString2394 != null) {
			String string = Class236.aString2394.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_101_ = Class472.aString5374;
				if (string_101_.equals("1.1") || string_101_.startsWith("1.1.") || string_101_.equals("1.2") || string_101_.startsWith("1.2.") || string_101_.equals("1.3") || string_101_.startsWith("1.3.") || string_101_.equals("1.4") || string_101_.startsWith("1.4.") || string_101_.equals("1.5") || string_101_.startsWith("1.5.") || string_101_.equals("1.6.0")) {
					method8409("wrongjava", -825253698);
					return;
				}
				if (string_101_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_101_.length() && Class482.method7918(string_101_.charAt(i), (byte) -25)); i++) {
						/* empty */
					}
					String string_102_ = string_101_.substring(6, i);
					if (Class516.method8619(string_102_, 1695842396) && (JS5Client.method15856(string_102_, (byte) 59) < 10)) {
						method8409("wrongjava", -176047864);
						return;
					}
				}
			}
		}
		JS5Protocol.method7486(-1875603345).setFocusCycleRoot(true);
		anInt5695 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -215857255);
		anInt5696 = Runtime.getRuntime().availableProcessors() * 2097775013;
		method8386(-1491991121);
		method8400(-1115159379);
		aClass503_5666 = Class628.method10315(-2082477481);
		while (aLong5692 * -4633992534932214651L == 0L || (TimeUtils.getCurrentTimeMilliseconds(1516375036) < -4633992534932214651L * aLong5692)) {
			anInt5690 = (aClass503_5666.method8166(aLong5661 * 4174308412259797L) * -1777029183);
			for (int i = 0; i < anInt5690 * 2023186497; i++)
				method8395(-433546899);
			method8388((byte) -43);
			Class214.method3837(Class523_Sub18_Sub8.aCanvas11689, -1054400996);
		}
	}

	void method8449() {
		if (Class236.aString2394 != null) {
			String string = Class236.aString2394.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_103_ = Class472.aString5374;
				if (string_103_.equals("1.1") || string_103_.startsWith("1.1.") || string_103_.equals("1.2") || string_103_.startsWith("1.2.") || string_103_.equals("1.3") || string_103_.startsWith("1.3.") || string_103_.equals("1.4") || string_103_.startsWith("1.4.") || string_103_.equals("1.5") || string_103_.startsWith("1.5.") || string_103_.equals("1.6.0")) {
					method8409("wrongjava", -1747266329);
					return;
				}
				if (string_103_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_103_.length() && Class482.method7918(string_103_.charAt(i), (byte) 24)); i++) {
						/* empty */
					}
					String string_104_ = string_103_.substring(6, i);
					if (Class516.method8619(string_104_, 1695842396) && (JS5Client.method15856(string_104_, (byte) 101) < 10)) {
						method8409("wrongjava", -1657125940);
						return;
					}
				}
			}
		}
		JS5Protocol.method7486(-1795025820).setFocusCycleRoot(true);
		anInt5695 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -215857255);
		anInt5696 = Runtime.getRuntime().availableProcessors() * 2097775013;
		method8386(-1303736792);
		method8400(24749547);
		aClass503_5666 = Class628.method10315(-2007705923);
		while (aLong5692 * -4633992534932214651L == 0L || (TimeUtils.getCurrentTimeMilliseconds(1516375036) < -4633992534932214651L * aLong5692)) {
			anInt5690 = (aClass503_5666.method8166(aLong5661 * 4174308412259797L) * -1777029183);
			for (int i = 0; i < anInt5690 * 2023186497; i++)
				method8395(-548677671);
			method8388((byte) 76);
			Class214.method3837(Class523_Sub18_Sub8.aCanvas11689, 87572263);
		}
	}

	void method8450() {
		if (Class236.aString2394 != null) {
			String string = Class236.aString2394.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_105_ = Class472.aString5374;
				if (string_105_.equals("1.1") || string_105_.startsWith("1.1.") || string_105_.equals("1.2") || string_105_.startsWith("1.2.") || string_105_.equals("1.3") || string_105_.startsWith("1.3.") || string_105_.equals("1.4") || string_105_.startsWith("1.4.") || string_105_.equals("1.5") || string_105_.startsWith("1.5.") || string_105_.equals("1.6.0")) {
					method8409("wrongjava", -1874703596);
					return;
				}
				if (string_105_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_105_.length() && Class482.method7918(string_105_.charAt(i), (byte) -6)); i++) {
						/* empty */
					}
					String string_106_ = string_105_.substring(6, i);
					if (Class516.method8619(string_106_, 1695842396) && (JS5Client.method15856(string_106_, (byte) 125) < 10)) {
						method8409("wrongjava", -558538507);
						return;
					}
				}
			}
		}
		JS5Protocol.method7486(-2083860915).setFocusCycleRoot(true);
		anInt5695 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -215857255);
		anInt5696 = Runtime.getRuntime().availableProcessors() * 2097775013;
		method8386(2043211981);
		method8400(-235965049);
		aClass503_5666 = Class628.method10315(-1056122634);
		while (aLong5692 * -4633992534932214651L == 0L || (TimeUtils.getCurrentTimeMilliseconds(1516375036) < -4633992534932214651L * aLong5692)) {
			anInt5690 = (aClass503_5666.method8166(aLong5661 * 4174308412259797L) * -1777029183);
			for (int i = 0; i < anInt5690 * 2023186497; i++)
				method8395(114976620);
			method8388((byte) -93);
			Class214.method3837(Class523_Sub18_Sub8.aCanvas11689, 1695699946);
		}
	}

	static void method8451(Object object) {
		if (null != Class379.anEventQueue3932) {
			for (int i = 0; i < 50 && Class379.anEventQueue3932.peekEvent() != null; i++)
				Class653.method10656(1L);
			try {
				if (null != object)
					Class379.anEventQueue3932.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public static final void method8452() {
		Class268.anImage2868 = null;
		Class220.aFont2330 = null;
	}

	static void method8453() {
		try {
			File file = new File(aString5699, "random.dat");
			if (file.exists())
				aClass20_5685 = new Class20(new Class19(file, "rw", 25L), 24, 0);
			else {
				while_22_: for (int i = 0; i < Class192.aStringArray2178.length; i++) {
					for (int i_107_ = 0; i_107_ < Class614.aStringArray8021.length; i_107_++) {
						File file_108_ = new File(new StringBuilder().append(Class614.aStringArray8021[i_107_]).append(Class192.aStringArray2178[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_108_.exists()) {
							aClass20_5685 = new Class20(new Class19(file_108_, "rw", 25L), 24, 0);
							break while_22_;
						}
					}
				}
			}
			if (null == aClass20_5685) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass20_5685 = new Class20(new Class19(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	abstract void method8454();

	boolean method8455(File file, boolean bool) {
		boolean bool_109_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_109_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_109_;
	}

	public void method8456() throws Exception_Sub6 {
		if (!aBool5697) {
			Class523_Sub24.method16142(1304689542).method383("jaclib", 2106472487);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class611.aString8013.startsWith("win"))
					throw new Exception_Sub6(128, "jaclib");
			}
			aBool5697 = true;
		}
	}

	void method8457() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_110_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_110_ != 0L && l <= l_110_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -82);
	}

	void method8458() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_111_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_111_ != 0L && l <= l_111_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -11);
	}

	void method8459() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_112_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_112_ != 0L && l <= l_112_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -111);
	}

	void method8460() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_113_ = aLongArray5686[Class204.anInt2213 * -1855642487 - 1 & 0x1f];
		long l_114_ = aLongArray5686[-1855642487 * Class204.anInt2213];
		aLongArray5686[-1855642487 * Class204.anInt2213] = l;
		Class204.anInt2213 = -759197255 * (1 + Class204.anInt2213 * -1855642487 & 0x1f);
		if (l_114_ != 0L && l > l_114_) {
			int i = (int) (l - l_114_);
			anInt5663 = (int) (l - l_113_) * 1845749395;
			anInt5662 = 1296208463 * ((32000 + (i >> 1)) / i);
		}
		if ((anInt5674 += 1946205063) * -472638921 - 1 > 50) {
			anInt5674 -= -1473994658;
			aBool5673 = true;
			Class523_Sub18_Sub8.aCanvas11689.setSize((2141365743 * Class170.anInt1833), (Class254.anInt2742 * -495986435));
			Class523_Sub18_Sub8.aCanvas11689.setVisible(true);
			if (aFrame5672 != null && Class310.aFrame3385 == null) {
				Insets insets = aFrame5672.getInsets();
				Class523_Sub18_Sub8.aCanvas11689.setLocation(-1901078577 * anInt5660 + insets.left, insets.top + anInt5670 * -1734289153);
			} else
				Class523_Sub18_Sub8.aCanvas11689.setLocation((anInt5660 * -1901078577), (anInt5670 * -1734289153));
		}
		method8407(-1995320176);
	}

	void method8461() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_115_ = aLongArray5686[Class204.anInt2213 * -1855642487 - 1 & 0x1f];
		long l_116_ = aLongArray5686[-1855642487 * Class204.anInt2213];
		aLongArray5686[-1855642487 * Class204.anInt2213] = l;
		Class204.anInt2213 = -759197255 * (1 + Class204.anInt2213 * -1855642487 & 0x1f);
		if (l_116_ != 0L && l > l_116_) {
			int i = (int) (l - l_116_);
			anInt5663 = (int) (l - l_115_) * 1845749395;
			anInt5662 = 1296208463 * ((32000 + (i >> 1)) / i);
		}
		if ((anInt5674 += 1946205063) * -472638921 - 1 > 50) {
			anInt5674 -= -1473994658;
			aBool5673 = true;
			Class523_Sub18_Sub8.aCanvas11689.setSize((2141365743 * Class170.anInt1833), (Class254.anInt2742 * -495986435));
			Class523_Sub18_Sub8.aCanvas11689.setVisible(true);
			if (aFrame5672 != null && Class310.aFrame3385 == null) {
				Insets insets = aFrame5672.getInsets();
				Class523_Sub18_Sub8.aCanvas11689.setLocation(-1901078577 * anInt5660 + insets.left, insets.top + anInt5670 * -1734289153);
			} else
				Class523_Sub18_Sub8.aCanvas11689.setLocation((anInt5660 * -1901078577), (anInt5670 * -1734289153));
		}
		method8407(-1995320176);
	}

	void method8462() {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		long l_117_ = aLongArray5677[1193545283 * Class192.anInt2177];
		aLongArray5677[Class192.anInt2177 * 1193545283] = l;
		Class192.anInt2177 = (1 + 1193545283 * Class192.anInt2177 & 0x1f) * 239742571;
		if (l_117_ != 0L && l <= l_117_) {
			/* empty */
		}
		synchronized (this) {
			Class341.aBool3608 = aBool5678;
		}
		method8406((byte) -61);
	}

	final void method8463(boolean bool) {
		synchronized (this) {
			if (aBool5693)
				return;
			aBool5693 = true;
		}
		try {
			method8485(-337270456);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass20_5687.method798((byte) -1);
			for (int i = 0; i < -549637331 * Class155.anInt1736; i++)
				Class406.aClass20Array4198[i].method798((byte) -1);
			aClass20_5667.method798((byte) -1);
			aClass20_5685.method798((byte) -1);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool5697) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class662.method10912((byte) -9))
			Class523_Sub24.method16142(1266604878).method380(2038288007);
		if (null != Class523_Sub18_Sub8.aCanvas11689) {
			try {
				Class523_Sub18_Sub8.aCanvas11689.removeFocusListener(this);
				Class523_Sub18_Sub8.aCanvas11689.getParent().remove(Class523_Sub18_Sub8.aCanvas11689);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (aFrame5672 != null) {
			aFrame5672.setVisible(false);
			aFrame5672.dispose();
			aFrame5672 = null;
		}
	}

	public static final int method8464() {
		return (int) (1000000000L / (4174308412259797L * aLong5661));
	}

	void method8465(byte i) {
		if (Class523_Sub18_Sub8.aCanvas11689 != null) {
			Class523_Sub18_Sub8.aCanvas11689.removeFocusListener(this);
			Class523_Sub18_Sub8.aCanvas11689.getParent().setBackground(Color.black);
			Class523_Sub18_Sub8.aCanvas11689.getParent().remove(Class523_Sub18_Sub8.aCanvas11689);
		}
	}

	public static final int method8466() {
		return (int) (1000000000L / (4174308412259797L * aLong5661));
	}

	public static final int method8467() {
		return (int) (1000000000L / (4174308412259797L * aLong5661));
	}

	public static final int method8468() {
		return (int) (1000000000L / (4174308412259797L * aLong5661));
	}

	public static final void method8469() {
		aClass503_5666.method8165(-752220422);
		for (int i = 0; i < 32; i++)
			aLongArray5686[i] = 0L;
		for (int i = 0; i < 32; i++)
			aLongArray5677[i] = 0L;
		anInt5690 = 0;
	}

	public void method409() {
		if (!aBool5693)
			aLong5692 = 0L;
	}

	static long method8470() {
		return aClass503_5666.method8167(-1742992700);
	}

	static long method8471() {
		return aClass503_5666.method8167(-1355030915);
	}

	public void method412() {
		if (!aBool5693)
			aLong5692 = 0L;
	}

	public abstract void method419();

	public void method417() {
		if (!aBool5693)
			aLong5692 = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) + 4000L) * -5945176783381894067L);
	}

	public void method413() {
		if (!aBool5693)
			aLong5692 = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) + 4000L) * -5945176783381894067L);
	}

	public void method415() {
		if (!aBool5693)
			aLong5692 = ((TimeUtils.getCurrentTimeMilliseconds(1516375036) + 4000L) * -5945176783381894067L);
	}

	public static final int method8472() {
		return (int) (1000000000L / (4174308412259797L * aLong5661));
	}

	public void method411() {
		if (!aBool5693) {
			aLong5692 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -5945176783381894067L;
			Class653.method10656(5000L);
			method8486(false, -1518779073);
		}
	}

	public void method418() {
		if (!aBool5693) {
			aLong5692 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -5945176783381894067L;
			Class653.method10656(5000L);
			method8486(false, -1518779073);
		}
	}

	public final void method414(Graphics graphics) {
		paint(graphics);
	}

	void method8473(String string) {
		if (!aBool5694) {
			aBool5694 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class35.method952(Class305.anApplet3346, "loggedout", (byte) -80);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class305.anApplet3346.getAppletContext().showDocument(new URL(Class305.anApplet3346.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public final void method8474(FocusEvent focusevent) {
		aBool5678 = true;
		aBool5673 = true;
	}

	public final void update(Graphics graphics) {
		paint(graphics);
	}

	public final void method8475(FocusEvent focusevent) {
		aBool5678 = false;
	}

	public final void method8476(FocusEvent focusevent) {
		aBool5678 = false;
	}

	synchronized void method8477(String string, int i) {
		aFrame5672 = new Frame();
		aFrame5672.setTitle(string);
		aFrame5672.setResizable(true);
		aFrame5672.addWindowListener(this);
		aFrame5672.setBackground(Color.black);
		aFrame5672.setVisible(true);
		aFrame5672.toFront();
		Insets insets = aFrame5672.getInsets();
		aFrame5672.setSize(insets.right + (anInt5668 * -1308828521 + insets.left), (insets.top + Class391.anInt4023 * 60613197 + insets.bottom));
	}

	public abstract void method421();

	public final void method8478(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8479(WindowEvent windowevent) {
		aBool5681 = true;
		destroy();
	}

	public final void windowClosing(WindowEvent windowevent) {
		aBool5681 = true;
		destroy();
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void focusLost(FocusEvent focusevent) {
		aBool5678 = false;
	}

	public final void method8480(WindowEvent windowevent) {
		/* empty */
	}

	static void method8481(Object object) {
		if (null != Class379.anEventQueue3932) {
			for (int i = 0; i < 50 && Class379.anEventQueue3932.peekEvent() != null; i++)
				Class653.method10656(1L);
			try {
				if (null != object)
					Class379.anEventQueue3932.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public final void method8482(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8483(WindowEvent windowevent) {
		/* empty */
	}

	File method8484(String string, String string_118_, int i) {
		String string_119_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class525.aFile7088 = new File(aString5699, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_118_).append(string_119_).append(".dat").toString());
		String string_120_ = null;
		String string_121_ = null;
		boolean bool = false;
		if (Class525.aFile7088.exists()) {
			try {
				Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
				int i_122_;
				RSBuffer class523_sub34;
				for (class523_sub34 = (new RSBuffer((int) class19.method795(1250712656))); (2349011 * class523_sub34.offset < class523_sub34.buffer.length); class523_sub34.offset += i_122_ * 189765723) {
					i_122_ = class19.method784(class523_sub34.buffer, (class523_sub34.offset * 2349011), ((class523_sub34.buffer).length - 2349011 * (class523_sub34.offset)), (byte) 16);
					if (i_122_ == -1)
						throw new IOException();
				}
				class523_sub34.offset = 0;
				i_122_ = class523_sub34.readUnsignedByte(1162431151);
				if (i_122_ < 1 || i_122_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_122_).toString());
				int i_123_ = 0;
				if (i_122_ > 1)
					i_123_ = class523_sub34.readUnsignedByte(-2107844906);
				if (i_122_ <= 2) {
					string_120_ = class523_sub34.readVersionedString(2050128653);
					if (1 == i_123_)
						string_121_ = class523_sub34.readVersionedString(2088482566);
				} else {
					string_120_ = class523_sub34.method16297((short) 695);
					if (i_123_ == 1)
						string_121_ = class523_sub34.method16297((short) -12738);
				}
				class19.method786(1357163813);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_120_) {
				File file = new File(string_120_);
				if (!file.exists())
					string_120_ = null;
			}
			if (string_120_ != null) {
				File file = new File(string_120_, "test.dat");
				if (!method8387(file, true, (byte) 1))
					string_120_ = null;
			}
		}
		if (string_120_ == null && 0 == i) {
			while_23_: for (int i_124_ = 0; i_124_ < Class192.aStringArray2178.length; i_124_++) {
				for (int i_125_ = 0; i_125_ < Class614.aStringArray8021.length; i_125_++) {
					File file = new File(new StringBuilder().append(Class614.aStringArray8021[i_125_]).append(Class192.aStringArray2178[i_124_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8387(new File(file, "test.dat"), true, (byte) 1)) {
						string_120_ = file.toString();
						bool = true;
						break while_23_;
					}
				}
			}
		}
		if (string_120_ == null) {
			string_120_ = new StringBuilder().append(aString5699).append(File.separatorChar).append("jagexcache").append(string_119_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_118_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_121_) {
			File file = new File(string_121_);
			File file_126_ = new File(string_120_);
			try {
				File[] files = file.listFiles();
				File[] files_127_ = files;
				for (int i_128_ = 0; i_128_ < files_127_.length; i_128_++) {
					File file_129_ = files_127_[i_128_];
					File file_130_ = new File(file_126_, file_129_.getName());
					boolean bool_131_ = file_129_.renameTo(file_130_);
					if (!bool_131_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8489(new File(string_120_), null, (byte) 30);
		return new File(string_120_);
	}

	abstract void method8485(int i);

	final void method8486(boolean bool, int i) {
		synchronized (this) {
			if (aBool5693)
				return;
			aBool5693 = true;
		}
		try {
			method8485(-872308742);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass20_5687.method798((byte) -1);
			for (int i_132_ = 0; i_132_ < -549637331 * Class155.anInt1736; i_132_++)
				Class406.aClass20Array4198[i_132_].method798((byte) -1);
			aClass20_5667.method798((byte) -1);
			aClass20_5685.method798((byte) -1);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool5697) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class662.method10912((byte) -115))
			Class523_Sub24.method16142(1812633141).method380(1624838123);
		if (null != Class523_Sub18_Sub8.aCanvas11689) {
			try {
				Class523_Sub18_Sub8.aCanvas11689.removeFocusListener(this);
				Class523_Sub18_Sub8.aCanvas11689.getParent().remove(Class523_Sub18_Sub8.aCanvas11689);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (aFrame5672 != null) {
			aFrame5672.setVisible(false);
			aFrame5672.dispose();
			aFrame5672 = null;
		}
	}

	public static final void method8487(int i, String string, Color color, Color color_133_, Color color_134_) {
		try {
			Graphics graphics = Class523_Sub18_Sub8.aCanvas11689.getGraphics();
			if (Class220.aFont2330 == null)
				Class220.aFont2330 = new Font("Helvetica", 1, 13);
			if (color == null)
				color = new Color(140, 17, 17);
			if (null == color_133_)
				color_133_ = new Color(140, 17, 17);
			if (null == color_134_)
				color_134_ = new Color(255, 255, 255);
			try {
				if (null == Class268.anImage2868)
					Class268.anImage2868 = (Class523_Sub18_Sub8.aCanvas11689.createImage(Class170.anInt1833 * 2141365743, Class254.anInt2742 * -495986435));
				Graphics graphics_135_ = Class268.anImage2868.getGraphics();
				graphics_135_.setColor(Color.black);
				graphics_135_.fillRect(0, 0, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435);
				int i_136_ = Class170.anInt1833 * 2141365743 / 2 - 152;
				int i_137_ = -495986435 * Class254.anInt2742 / 2 - 18;
				graphics_135_.setColor(color_133_);
				graphics_135_.drawRect(i_136_, i_137_, 303, 33);
				graphics_135_.setColor(color);
				graphics_135_.fillRect(i_136_ + 2, i_137_ + 2, 3 * i, 30);
				graphics_135_.setColor(Color.black);
				graphics_135_.drawRect(i_136_ + 1, i_137_ + 1, 301, 31);
				graphics_135_.fillRect(3 * i + (2 + i_136_), i_137_ + 2, 300 - i * 3, 30);
				graphics_135_.setFont(Class220.aFont2330);
				graphics_135_.setColor(color_134_);
				graphics_135_.drawString(string, (i_136_ + (304 - string.length() * 6) / 2), 22 + i_137_);
				if (null != aString5671) {
					graphics_135_.setFont(Class220.aFont2330);
					graphics_135_.setColor(color_134_);
					graphics_135_.drawString(aString5671, ((2141365743 * Class170.anInt1833 / 2) - aString5671.length() * 6 / 2), (Class254.anInt2742 * -495986435 / 2) - 26);
				}
				graphics.drawImage(Class268.anImage2868, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435);
				int i_138_ = 2141365743 * Class170.anInt1833 / 2 - 152;
				int i_139_ = Class254.anInt2742 * -495986435 / 2 - 18;
				graphics.setColor(color_133_);
				graphics.drawRect(i_138_, i_139_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(2 + i_138_, 2 + i_139_, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + i_138_, i_139_ + 1, 301, 31);
				graphics.fillRect(2 + i_138_ + 3 * i, i_139_ + 2, 300 - i * 3, 30);
				graphics.setFont(Class220.aFont2330);
				graphics.setColor(color_134_);
				if (aString5671 != null) {
					graphics.setFont(Class220.aFont2330);
					graphics.setColor(color_134_);
					graphics.drawString(aString5671, (Class170.anInt1833 * 2141365743 / 2 - aString5671.length() * 6 / 2), (-495986435 * Class254.anInt2742 / 2 - 26));
				}
				graphics.drawString(string, i_138_ + (304 - string.length() * 6) / 2, 22 + i_139_);
			}
		} catch (Exception exception) {
			Class523_Sub18_Sub8.aCanvas11689.repaint();
		}
	}

	File method8488(String string, String string_140_, int i) {
		String string_141_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class525.aFile7088 = new File(aString5699, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_140_).append(string_141_).append(".dat").toString());
		String string_142_ = null;
		String string_143_ = null;
		boolean bool = false;
		if (Class525.aFile7088.exists()) {
			try {
				Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
				int i_144_;
				RSBuffer class523_sub34;
				for (class523_sub34 = (new RSBuffer((int) class19.method795(1128340289))); (2349011 * class523_sub34.offset < class523_sub34.buffer.length); class523_sub34.offset += i_144_ * 189765723) {
					i_144_ = class19.method784(class523_sub34.buffer, (class523_sub34.offset * 2349011), ((class523_sub34.buffer).length - 2349011 * (class523_sub34.offset)), (byte) 16);
					if (i_144_ == -1)
						throw new IOException();
				}
				class523_sub34.offset = 0;
				i_144_ = class523_sub34.readUnsignedByte(1549032138);
				if (i_144_ < 1 || i_144_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_144_).toString());
				int i_145_ = 0;
				if (i_144_ > 1)
					i_145_ = class523_sub34.readUnsignedByte(628375403);
				if (i_144_ <= 2) {
					string_142_ = class523_sub34.readVersionedString(2013897137);
					if (1 == i_145_)
						string_143_ = class523_sub34.readVersionedString(2099958347);
				} else {
					string_142_ = class523_sub34.method16297((short) -2631);
					if (i_145_ == 1)
						string_143_ = class523_sub34.method16297((short) -4125);
				}
				class19.method786(1793990936);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_142_) {
				File file = new File(string_142_);
				if (!file.exists())
					string_142_ = null;
			}
			if (string_142_ != null) {
				File file = new File(string_142_, "test.dat");
				if (!method8387(file, true, (byte) 1))
					string_142_ = null;
			}
		}
		if (string_142_ == null && 0 == i) {
			while_24_: for (int i_146_ = 0; i_146_ < Class192.aStringArray2178.length; i_146_++) {
				for (int i_147_ = 0; i_147_ < Class614.aStringArray8021.length; i_147_++) {
					File file = new File(new StringBuilder().append(Class614.aStringArray8021[i_147_]).append(Class192.aStringArray2178[i_146_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8387(new File(file, "test.dat"), true, (byte) 1)) {
						string_142_ = file.toString();
						bool = true;
						break while_24_;
					}
				}
			}
		}
		if (string_142_ == null) {
			string_142_ = new StringBuilder().append(aString5699).append(File.separatorChar).append("jagexcache").append(string_141_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_140_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_143_) {
			File file = new File(string_143_);
			File file_148_ = new File(string_142_);
			try {
				File[] files = file.listFiles();
				File[] files_149_ = files;
				for (int i_150_ = 0; i_150_ < files_149_.length; i_150_++) {
					File file_151_ = files_149_[i_150_];
					File file_152_ = new File(file_148_, file_151_.getName());
					boolean bool_153_ = file_151_.renameTo(file_152_);
					if (!bool_153_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8489(new File(string_142_), null, (byte) 83);
		return new File(string_142_);
	}

	void method8489(File file, File file_154_, byte i) {
		try {
			Class19 class19 = new Class19(Class525.aFile7088, "rw", 10000L);
			RSBuffer class523_sub34 = new RSBuffer(500);
			class523_sub34.writeByte(3, -896834430);
			class523_sub34.writeByte(file_154_ != null ? 1 : 0, -682676726);
			class523_sub34.method16272(file.getPath(), 1685910119);
			if (null != file_154_)
				class523_sub34.method16272(file_154_.getPath(), 1685910119);
			class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
			class19.method786(1914832083);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public final void method8490(WindowEvent windowevent) {
		/* empty */
	}

	public static final void method8491() {
		Class268.anImage2868 = null;
		Class220.aFont2330 = null;
	}

	public void method416() {
		if (!aBool5693) {
			aLong5692 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -5945176783381894067L;
			Class653.method10656(5000L);
			method8486(false, -1518779073);
		}
	}

	void method8492(String string) {
		if (!aBool5694) {
			aBool5694 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class35.method952(Class305.anApplet3346, "loggedout", (byte) -16);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class305.anApplet3346.getAppletContext().showDocument(new URL(Class305.anApplet3346.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method8493(String string) {
		if (!aBool5694) {
			aBool5694 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class35.method952(Class305.anApplet3346, "loggedout", (byte) 11);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class305.anApplet3346.getAppletContext().showDocument(new URL(Class305.anApplet3346.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public static Container method8494() {
		if (Class310.aFrame3385 != null)
			return Class310.aFrame3385;
		if (null != aFrame5672)
			return aFrame5672;
		return Class305.anApplet3346;
	}

	void method8495(Class513 class513, boolean bool) {
		if (class513 == null)
			throw new NullPointerException();
		if (Class513.aClass513_5765 != class513 && Class513.aClass513_5764 != class513)
			throw new IllegalStateException();
		aClass513_5691 = class513;
		if (Class513.aClass513_5764 != aClass513_5691) {
			if (bool)
				aClass513_5691 = Class513.aClass513_5766;
		}
	}

	void method8496(Class513 class513, boolean bool) {
		if (class513 == null)
			throw new NullPointerException();
		if (Class513.aClass513_5765 != class513 && Class513.aClass513_5764 != class513)
			throw new IllegalStateException();
		aClass513_5691 = class513;
		if (Class513.aClass513_5764 != aClass513_5691) {
			if (bool)
				aClass513_5691 = Class513.aClass513_5766;
		}
	}

	public static Class513 method8497() {
		return aClass513_5691;
	}

	public static Class513 method8498() {
		return aClass513_5691;
	}

	static final void method8499(Class669 class669, byte i) {
		Class227.method4168((byte) 125);
		Class526.method8725(515490987);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(939801912);
		client.aBool11012 = false;
	}

	public static int method8500(CharSequence charsequence, int i, int i_155_, byte[] is, int i_156_, int i_157_) {
		int i_158_ = i_155_ - i;
		for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
			char c = charsequence.charAt(i + i_159_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_156_ + i_159_] = (byte) c;
			else if (c == '\u20ac')
				is[i_156_ + i_159_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_156_ + i_159_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_159_ + i_156_] = (byte) -125;
			else if (c == '\u201e')
				is[i_159_ + i_156_] = (byte) -124;
			else if (c == '\u2026')
				is[i_156_ + i_159_] = (byte) -123;
			else if (c == '\u2020')
				is[i_159_ + i_156_] = (byte) -122;
			else if (c == '\u2021')
				is[i_159_ + i_156_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_159_ + i_156_] = (byte) -120;
			else if (c == '\u2030')
				is[i_159_ + i_156_] = (byte) -119;
			else if (c == '\u0160')
				is[i_156_ + i_159_] = (byte) -118;
			else if (c == '\u2039')
				is[i_156_ + i_159_] = (byte) -117;
			else if (c == '\u0152')
				is[i_159_ + i_156_] = (byte) -116;
			else if (c == '\u017d')
				is[i_159_ + i_156_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_156_ + i_159_] = (byte) -111;
			else if (c == '\u2019')
				is[i_156_ + i_159_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_156_ + i_159_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_156_ + i_159_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_156_ + i_159_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_159_ + i_156_] = (byte) -106;
			else if (c == '\u2014')
				is[i_159_ + i_156_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_159_ + i_156_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_159_ + i_156_] = (byte) -103;
			else if (c == '\u0161')
				is[i_156_ + i_159_] = (byte) -102;
			else if (c == '\u203a')
				is[i_156_ + i_159_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_159_ + i_156_] = (byte) -100;
			else if (c == '\u017e')
				is[i_159_ + i_156_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_156_ + i_159_] = (byte) -97;
			else
				is[i_159_ + i_156_] = (byte) 63;
		}
		return i_158_;
	}

	public static void method8501(int i, int i_160_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(12, (long) i);
		class523_sub27_sub7.method17962((byte) 93);
	}
}
