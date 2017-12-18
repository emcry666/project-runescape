/* Class570 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class570 implements Interface68 {
	int anInt7654;
	int anInt7655;
	int[] anIntArray7656;
	public static Interface19 anInterface19_7657;
	static int anInt7658;

	Class570(int i, int i_0_, int[] is) {
		anInt7654 = 469443021 * i;
		anInt7655 = i_0_ * 839042631;
		anIntArray7656 = is;
	}

	public boolean method435(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551, byte i_1_) {
		if (null == class523_sub39) {
			if (-1 != -884034811 * anInt7654)
				return false;
		} else {
			if (-884034811 * anInt7654 != class523_sub39.method16518(-1905499279))
				return false;
			if (anInt7655 * -553319561 > class523_sub39.method16521(1196432790))
				return false;
			int[] is = anIntArray7656;
			for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
				int i_3_ = is[i_2_];
				if (!class551.method9127(i_3_, (byte) 77))
					return false;
			}
		}
		return true;
	}

	static Class570 method9605(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(1870081527);
		int i_4_ = class523_sub34.readUnsignedByte(-1240674064);
		int i_5_ = class523_sub34.readUnsignedByte(-1518180747);
		int[] is = new int[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			is[i_6_] = class523_sub34.readUnsignedByte(1792530680);
		return new Class570(i, i_4_, is);
	}

	public boolean method433(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551) {
		if (null == class523_sub39) {
			if (-1 != -884034811 * anInt7654)
				return false;
		} else {
			if (-884034811 * anInt7654 != class523_sub39.method16518(-1905499279))
				return false;
			if (anInt7655 * -553319561 > class523_sub39.method16521(1196432790))
				return false;
			int[] is = anIntArray7656;
			for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
				int i_8_ = is[i_7_];
				if (!class551.method9127(i_8_, (byte) -67))
					return false;
			}
		}
		return true;
	}

	public boolean method434(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551) {
		if (null == class523_sub39) {
			if (-1 != -884034811 * anInt7654)
				return false;
		} else {
			if (-884034811 * anInt7654 != class523_sub39.method16518(-1905499279))
				return false;
			if (anInt7655 * -553319561 > class523_sub39.method16521(1196432790))
				return false;
			int[] is = anIntArray7656;
			for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
				int i_10_ = is[i_9_];
				if (!class551.method9127(i_10_, (byte) -42))
					return false;
			}
		}
		return true;
	}

	public static long method9606(int i) {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class465.method7558("services", false, (byte) -25)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			Class523_Sub34 class523_sub34 = new Class523_Sub34(new byte[1000]);
			for (;;) {
				int i_11_ = inputstream.read(class523_sub34.aByteArray10658, 2349011 * class523_sub34.anInt10661, 1000 - (2349011 * class523_sub34.anInt10661));
				if (-1 == i_11_)
					break;
				class523_sub34.anInt10661 += i_11_ * 189765723;
				if (2349011 * class523_sub34.anInt10661 >= 1000)
					return 0L;
			}
			class523_sub34.anInt10661 = 0;
			long l_12_ = class523_sub34.readLong((byte) -54);
			l = l_12_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	static final void method9607(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int i) {
		int i_13_ = (class647_sub1_sub3_sub1.anInt11954 * 219018885 - client.anInt11011);
		int i_14_ = (class647_sub1_sub3_sub1.anInt11915 * -870567424 + class647_sub1_sub3_sub1.method18338(2143203312) * 256);
		int i_15_ = (class647_sub1_sub3_sub1.anInt11917 * -285027840 + class647_sub1_sub3_sub1.method18338(2147039210) * 256);
		int i_16_ = Class53_Sub17.method17220(i_14_, i_15_, (275370787 * class647_sub1_sub3_sub1.anInt11940), -866245333);
		Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
		class647_sub1_sub3_sub1.method10574((float) ((i_14_ - (int) class437.aFloat4903) / i_13_ + (int) class437.aFloat4903), (float) ((int) class437.aFloat4904 + (i_16_ - (int) class437.aFloat4904) / i_13_), (float) ((i_15_ - (int) class437.aFloat4905) / i_13_ + (int) class437.aFloat4905));
		class647_sub1_sub3_sub1.anInt11945 = 0;
		class647_sub1_sub3_sub1.method18331((class647_sub1_sub3_sub1.anInt11923 * -220629939), 221461376);
	}

	static final void method9608(int i, int i_17_, int i_18_, int i_19_, Class591 class591, int i_20_) {
		if (i_18_ >= 1 && i_19_ >= 1 && i_18_ <= client.aClass505_11019.method8292((byte) 68) - 2 && i_19_ <= client.aClass505_11019.method8235(2109921988) - 2) {
			if (client.aClass505_11019.method8241((byte) -13) != null) {
				Interface61 interface61 = client.aClass505_11019.method8249(212551110).method15802(i, i_17_, i_18_, i_19_, 1773042982);
				if (null != interface61) {
					if (interface61 instanceof Class647_Sub1_Sub3_Sub2)
						((Class647_Sub1_Sub3_Sub2) interface61).method18427(class591, -1559525107);
					else if (interface61 instanceof Class647_Sub1_Sub2_Sub1)
						((Class647_Sub1_Sub2_Sub1) interface61).method18433(class591, 1357652815);
					else if (interface61 instanceof Class647_Sub1_Sub4_Sub2)
						((Class647_Sub1_Sub4_Sub2) interface61).method18470(class591, (short) -10445);
					else if (interface61 instanceof Class647_Sub1_Sub1_Sub2)
						((Class647_Sub1_Sub1_Sub2) interface61).method18460(class591, 2136654850);
				}
			}
		}
	}

	public static TwitchWebcamDevice method9609(String string, int i) {
		if (Class569.aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i_21_ = 0; i_21_ < Class569.aTwitchWebcamDeviceArray7648.length; i_21_++) {
			if (Class569.aTwitchWebcamDeviceArray7648[i_21_].aString1134.equals(string))
				return Class569.aTwitchWebcamDeviceArray7648[i_21_];
		}
		return null;
	}
}
