/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class49 implements Runnable {
	InetAddress anInetAddress707;
	volatile long aLong708 = -45631637718910745L;
	String aString709;
	volatile boolean aBool710 = true;

	void method1261(byte i) {
		if (null != anInetAddress707) {
			try {
				byte[] is = anInetAddress707.getAddress();
				aLong708 = (long) Ping.method639(is[0], is[1], is[2], is[3], 10000L) * 45631637718910745L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class653.method10656(1000L);
	}

	void method1262(String string, byte i) {
		aString709 = string;
		anInetAddress707 = null;
		aLong708 = -45631637718910745L;
		if (null != aString709) {
			try {
				anInetAddress707 = InetAddress.getByName(aString709);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	long method1263(short i) {
		return -6068676134981262039L * aLong708;
	}

	void method1264(short i) {
		aBool710 = false;
	}

	public void run() {
		while (aBool710)
			method1261((byte) 53);
	}

	void method1265(String string) {
		aString709 = string;
		anInetAddress707 = null;
		aLong708 = -45631637718910745L;
		if (null != aString709) {
			try {
				anInetAddress707 = InetAddress.getByName(aString709);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	void method1266() {
		if (null != anInetAddress707) {
			try {
				byte[] is = anInetAddress707.getAddress();
				aLong708 = (long) Ping.method639(is[0], is[1], is[2], is[3], 10000L) * 45631637718910745L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class653.method10656(1000L);
	}

	void method1267(String string) {
		aString709 = string;
		anInetAddress707 = null;
		aLong708 = -45631637718910745L;
		if (null != aString709) {
			try {
				anInetAddress707 = InetAddress.getByName(aString709);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	long method1268() {
		return -6068676134981262039L * aLong708;
	}

	void method1269() {
		aBool710 = false;
	}

	void method1270() {
		aBool710 = false;
	}

	public void method1271() {
		while (aBool710)
			method1261((byte) -76);
	}

	Class49() {
		/* empty */
	}

	public void method1272() {
		while (aBool710)
			method1261((byte) -81);
	}

	void method1273() {
		if (null != anInetAddress707) {
			try {
				byte[] is = anInetAddress707.getAddress();
				aLong708 = (long) Ping.method639(is[0], is[1], is[2], is[3], 10000L) * 45631637718910745L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class653.method10656(1000L);
	}

	void method1274() {
		if (null != anInetAddress707) {
			try {
				byte[] is = anInetAddress707.getAddress();
				aLong708 = (long) Ping.method639(is[0], is[1], is[2], is[3], 10000L) * 45631637718910745L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class653.method10656(1000L);
	}

	public static void method1275(String string, int i) {
		if (11 == client.anInt11136 * -2020118759) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4226, (client.aClass116_11057.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -10);
			int i_0_ = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 5);
			class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 1328360061;
			class523_sub22.aClass523_Sub34_Sub2_10525.method16263(Class54.anIntArray726, i_0_, (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011), (byte) 49);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16275(2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i_0_, 113938161);
			client.aClass116_11057.method1974(class523_sub22, (byte) 127);
			Class194_Sub4.aClass699_9895 = Class699.aClass699_8766;
		}
	}

	public static final int method1276(int i, int i_1_, byte i_2_) {
		if (i == -1)
			return 12345678;
		i_1_ = (i & 0x7f) * i_1_ >> 7;
		if (i_1_ < 2)
			i_1_ = 2;
		else if (i_1_ > 126)
			i_1_ = 126;
		return (i & 0xff80) + i_1_;
	}

	static final void method1277(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2678 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method1278(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (Class461.aLong5121 * 2688366688243830291L / 60000L);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) ((2688366688243830291L * Class461.aLong5121 - Class248.method4401(1516375036) - -8911810745974825803L * Class159_Sub1.aLong8869) / 60000L);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class411.aBool4540 ? 1 : 0;
	}

	static String method1279(int i, int i_3_, boolean bool, int i_4_) {
		if (i_3_ < 2 || i_3_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_3_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_3_);
		int i_5_ = 2;
		int i_6_ = i / i_3_;
		while (0 != i_6_) {
			i_6_ /= i_3_;
			i_5_++;
		}
		char[] cs = new char[i_5_];
		cs[0] = '+';
		for (int i_7_ = i_5_ - 1; i_7_ > 0; i_7_--) {
			int i_8_ = i;
			i /= i_3_;
			int i_9_ = i_8_ - i_3_ * i;
			if (i_9_ >= 10)
				cs[i_7_] = (char) (87 + i_9_);
			else
				cs[i_7_] = (char) (48 + i_9_);
		}
		return new String(cs);
	}
}
