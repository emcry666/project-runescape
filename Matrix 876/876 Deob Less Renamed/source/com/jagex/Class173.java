/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class173 {
	public static final int anInt1839 = 32;
	public static int[] anIntArray1840 = { 3, 7, 15 };
	public static int[] anIntArray1841 = { 2047, 16383, 65535 };
	public static final int anInt1842 = 16;
	public static final int anInt1843 = 2;
	public static final int anInt1844 = 8191;
	public static final int anInt1845 = 64;
	public static final int anInt1846 = 16;
	public static final int anInt1847 = 0;
	public static final int anInt1848 = 1;
	public static final int anInt1849 = 0;
	public static final int anInt1850 = 2;
	public static final int anInt1851 = 8;
	public static final int anInt1852 = 1023;

	Class173() throws Throwable {
		throw new Error();
	}

	public static Class412[] method2901(byte i) {
		return (new Class412[] { Class412.PROJECTILE, Class412.SEND_GROUND_ITEM, Class412.aClass412_4544, Class412.aClass412_4552, Class412.aClass412_4541, Class412.aClass412_4546, Class412.REMOVE_GROUND_ITEM, Class412.aClass412_4554, Class412.aClass412_4549, Class412.REMOVE_OBJECT, Class412.aClass412_4551, Class412.aClass412_4555, Class412.aClass412_4553, Class412.ADJUSTED_PROJECTILE, Class412.SEND_OBJECT });
	}

	public static final void method2902(int i) {
		if (1 != Class43.anInt601 * -1905499279) {
			Class43.aClass116_568.method1980((short) -17057);
			Class428.method6758(-1586779262);
			Class450.method7275((byte) 0);
		}
	}

	public static final int method2903(long l, String string, byte i) {
		Random random = new Random();
		Class523_Sub34 class523_sub34 = new Class523_Sub34(128);
		Class523_Sub34 class523_sub34_0_ = new Class523_Sub34(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class523_sub34.writeByte(10, -204527786);
		for (int i_1_ = 0; i_1_ < 4; i_1_++)
			class523_sub34.writeInt(random.nextInt(), -849238196);
		class523_sub34.writeInt(is[0], -1388983536);
		class523_sub34.writeInt(is[1], -2072546818);
		class523_sub34.method16441(l);
		class523_sub34.method16441(0L);
		for (int i_2_ = 0; i_2_ < 4; i_2_++)
			class523_sub34.writeInt(random.nextInt(), -1484591913);
		class523_sub34.method16311(Class48.aBigInteger698, Class48.aBigInteger699, 737146878);
		class523_sub34_0_.writeByte(10, 8010341);
		for (int i_3_ = 0; i_3_ < 3; i_3_++)
			class523_sub34_0_.writeInt(random.nextInt(), -1727848490);
		class523_sub34_0_.method16441(random.nextLong());
		class523_sub34_0_.method16462(random.nextLong());
		Class289.method5204(class523_sub34_0_, -276541507);
		class523_sub34_0_.method16441(random.nextLong());
		class523_sub34_0_.method16311(Class48.aBigInteger698, Class48.aBigInteger699, 737146878);
		int i_4_ = Class6.method555(string, (byte) 9);
		if (i_4_ % 8 != 0)
			i_4_ += 8 - i_4_ % 8;
		Class523_Sub34 class523_sub34_5_ = new Class523_Sub34(i_4_);
		class523_sub34_5_.method16270(string, (byte) -74);
		class523_sub34_5_.anInt10661 = 189765723 * i_4_;
		class523_sub34_5_.method16307(is, 245278669);
		Class523_Sub34 class523_sub34_6_ = new Class523_Sub34(class523_sub34_5_.anInt10661 * 2349011 + (2349011 * class523_sub34_0_.anInt10661 + (class523_sub34.anInt10661 * 2349011 + 5)));
		class523_sub34_6_.writeByte(2, -1418159936);
		class523_sub34_6_.writeByte(class523_sub34.anInt10661 * 2349011, 297541489);
		class523_sub34_6_.readBytes(class523_sub34.aByteArray10658, 0, 2349011 * class523_sub34.anInt10661, (short) -5216);
		class523_sub34_6_.writeByte(2349011 * class523_sub34_0_.anInt10661, 1304343400);
		class523_sub34_6_.readBytes(class523_sub34_0_.aByteArray10658, 0, 2349011 * class523_sub34_0_.anInt10661, (short) -14847);
		class523_sub34_6_.writeShort(2349011 * class523_sub34_5_.anInt10661, (byte) -91);
		class523_sub34_6_.readBytes(class523_sub34_5_.aByteArray10658, 0, 2349011 * class523_sub34_5_.anInt10661, (short) -1181);
		String string_7_ = Class221.method4138(class523_sub34_6_.aByteArray10658, 1983767396);
		int i_8_;
		try {
			URL url = new URL(new StringBuilder().append(Class465.method7558("services", false, (byte) 0)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class406.method6615(string_7_, 1419772413)).append("&dest=").append(Class406.method6615("passwordchoice.ws", 2140714514)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class523_sub34_6_ = new Class523_Sub34(new byte[1000]);
			for (;;) {
				int i_9_ = inputstream.read(class523_sub34_6_.aByteArray10658, class523_sub34_6_.anInt10661 * 2349011, 1000 - (class523_sub34_6_.anInt10661 * 2349011));
				if (i_9_ == -1)
					break;
				class523_sub34_6_.anInt10661 += i_9_ * 189765723;
				if (class523_sub34_6_.anInt10661 * 2349011 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_10_ = new String(class523_sub34_6_.aByteArray10658);
			if (string_10_.startsWith("OFFLINE"))
				return 4;
			if (string_10_.startsWith("WRONG"))
				return 7;
			if (string_10_.startsWith("RELOAD"))
				return 3;
			if (string_10_.startsWith("Not permitted for social network accounts."))
				return 6;
			class523_sub34_6_.method16308(is, (byte) -121);
			for (/**/; (2349011 * class523_sub34_6_.anInt10661 > 0 && 0 == (class523_sub34_6_.aByteArray10658[2349011 * class523_sub34_6_.anInt10661 - 1])); class523_sub34_6_.anInt10661 -= 189765723) {
				/* empty */
			}
			string_10_ = new String(class523_sub34_6_.aByteArray10658, 0, 2349011 * class523_sub34_6_.anInt10661);
			if (Class63.method1429(string_10_, -1482945203)) {
				Class331.method5825(string_10_, true, client.aBool10996, 520150437);
				return 2;
			}
			i_8_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_8_;
	}

	public static int method2904(byte i) {
		Class292.aTwitchEventLiveStreams3159 = null;
		int i_11_ = Class323.aTwitchTV3452.RequestLiveStreams(client.aClass681_11284.aString8647);
		return i_11_;
	}

	static void method2905(Class669 class669, int i) {
		class669.anIntArray8557[1357652815 * class669.anInt8558 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[((1357652815 * class669.anInt8558) - 1)]), (byte) -25)).method5069(Class98_Sub1_Sub2.playerVarsProvider, (short) 16886)) ? 1 : 0;
	}

	static final void method2906(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class69.method1463((byte) 30).method82();
	}

	static final void method2907(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static boolean method2908(int i, int i_12_, int i_13_, int i_14_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -88);
		boolean bool = true;
		Interface61 interface61 = (Interface61) class560.method9280(i, i_12_, i_13_, -1442004708);
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 112);
		interface61 = (Interface61) class560.method9295(i, i_12_, i_13_, client.anInterface63_11296, (byte) -26);
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 78);
		interface61 = (Interface61) class560.method9398(i, i_12_, i_13_, -1230368601);
		if (interface61 != null)
			bool &= Class226.method4164(interface61, (byte) 12);
		return bool;
	}

	static Class148 method2909(byte[] is, byte i) {
		if (null == is)
			throw new RuntimeException("");
		Class148 class148;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				java.awt.Container container = Class458.method7486(-2031548384);
				MediaTracker mediatracker = new MediaTracker(container);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i_15_ = image.getWidth(container);
				int i_16_ = image.getHeight(container);
				if (mediatracker.isErrorAny() || i_15_ < 0 || i_16_ < 0)
					throw new RuntimeException("");
				int[] is_17_ = new int[i_16_ * i_15_];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_15_, i_16_, is_17_, 0, i_15_);
				pixelgrabber.grabPixels();
				class148 = Class31.aClass178_303.method3103(is_17_, 0, i_15_, i_15_, i_16_, -2053473314);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class148;
	}
}
