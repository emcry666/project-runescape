/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class48 {
	static final String aString694 = "services";
	static final int anInt695 = 6;
	static final String aString696 = "passwordchoice.ws";
	static final int anInt697 = 1000;
	static BigInteger aBigInteger698 = (new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
	static BigInteger aBigInteger699 = (new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
	static final int anInt700 = 4;
	static final int anInt701 = 2;
	static final int anInt702 = 3;
	public static final int anInt703 = 5;
	static final String aString704 = "m=accountappeal/login.ws";
	static final int anInt705 = 7;
	static final int anInt706 = 2;

	static boolean method1253(String string) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	public static final int method1254(long l, String string) {
		Random random = new Random();
		RSBuffer class523_sub34 = new RSBuffer(128);
		RSBuffer class523_sub34_0_ = new RSBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class523_sub34.writeByte(10, -1357231636);
		for (int i = 0; i < 4; i++)
			class523_sub34.writeInt(random.nextInt(), -1453258225);
		class523_sub34.writeInt(is[0], -1609282167);
		class523_sub34.writeInt(is[1], -1890635232);
		class523_sub34.method16441(l);
		class523_sub34.method16441(0L);
		for (int i = 0; i < 4; i++)
			class523_sub34.writeInt(random.nextInt(), -1567206650);
		class523_sub34.encryptRSA(aBigInteger698, aBigInteger699, 737146878);
		class523_sub34_0_.writeByte(10, -156696010);
		for (int i = 0; i < 3; i++)
			class523_sub34_0_.writeInt(random.nextInt(), -1128877914);
		class523_sub34_0_.method16441(random.nextLong());
		class523_sub34_0_.method16462(random.nextLong());
		Class289.method5204(class523_sub34_0_, -276541507);
		class523_sub34_0_.method16441(random.nextLong());
		class523_sub34_0_.encryptRSA(aBigInteger698, aBigInteger699, 737146878);
		int i = Class6.method555(string, (byte) 25);
		if (i % 8 != 0)
			i += 8 - i % 8;
		RSBuffer class523_sub34_1_ = new RSBuffer(i);
		class523_sub34_1_.method16270(string, (byte) 3);
		class523_sub34_1_.offset = 189765723 * i;
		class523_sub34_1_.method16307(is, -287102756);
		RSBuffer class523_sub34_2_ = new RSBuffer(class523_sub34_1_.offset * 2349011 + (2349011 * class523_sub34_0_.offset + (class523_sub34.offset * 2349011 + 5)));
		class523_sub34_2_.writeByte(2, 2090839763);
		class523_sub34_2_.writeByte(class523_sub34.offset * 2349011, -801251743);
		class523_sub34_2_.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -13453);
		class523_sub34_2_.writeByte(2349011 * class523_sub34_0_.offset, 575212635);
		class523_sub34_2_.readBytes(class523_sub34_0_.buffer, 0, 2349011 * class523_sub34_0_.offset, (short) -1872);
		class523_sub34_2_.writeShort(2349011 * class523_sub34_1_.offset, (byte) -113);
		class523_sub34_2_.readBytes(class523_sub34_1_.buffer, 0, 2349011 * class523_sub34_1_.offset, (short) -8881);
		String string_3_ = Class221.method4138(class523_sub34_2_.buffer, 2028734787);
		int i_4_;
		try {
			URL url = new URL(new StringBuilder().append(Class465.method7558("services", false, (byte) -16)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class406.method6615(string_3_, -150755002)).append("&dest=").append(Class406.method6615("passwordchoice.ws", 1232790921)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class523_sub34_2_ = new RSBuffer(new byte[1000]);
			for (;;) {
				int i_5_ = inputstream.read(class523_sub34_2_.buffer, class523_sub34_2_.offset * 2349011, 1000 - (class523_sub34_2_.offset * 2349011));
				if (i_5_ == -1)
					break;
				class523_sub34_2_.offset += i_5_ * 189765723;
				if (class523_sub34_2_.offset * 2349011 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_6_ = new String(class523_sub34_2_.buffer);
			if (string_6_.startsWith("OFFLINE"))
				return 4;
			if (string_6_.startsWith("WRONG"))
				return 7;
			if (string_6_.startsWith("RELOAD"))
				return 3;
			if (string_6_.startsWith("Not permitted for social network accounts."))
				return 6;
			class523_sub34_2_.method16308(is, (byte) -40);
			for (/**/; (2349011 * class523_sub34_2_.offset > 0 && 0 == (class523_sub34_2_.buffer[2349011 * class523_sub34_2_.offset - 1])); class523_sub34_2_.offset -= 189765723) {
				/* empty */
			}
			string_6_ = new String(class523_sub34_2_.buffer, 0, 2349011 * class523_sub34_2_.offset);
			if (Class63.method1429(string_6_, 1051781555)) {
				Class331.method5825(string_6_, true, client.aBool10996, -416290855);
				return 2;
			}
			i_4_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_4_;
	}

	public static final int method1255(long l, String string) {
		Random random = new Random();
		RSBuffer class523_sub34 = new RSBuffer(128);
		RSBuffer class523_sub34_7_ = new RSBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class523_sub34.writeByte(10, -1645517952);
		for (int i = 0; i < 4; i++)
			class523_sub34.writeInt(random.nextInt(), -866864255);
		class523_sub34.writeInt(is[0], -1660733022);
		class523_sub34.writeInt(is[1], -1420349643);
		class523_sub34.method16441(l);
		class523_sub34.method16441(0L);
		for (int i = 0; i < 4; i++)
			class523_sub34.writeInt(random.nextInt(), -1395888366);
		class523_sub34.encryptRSA(aBigInteger698, aBigInteger699, 737146878);
		class523_sub34_7_.writeByte(10, 1503241348);
		for (int i = 0; i < 3; i++)
			class523_sub34_7_.writeInt(random.nextInt(), -1701793362);
		class523_sub34_7_.method16441(random.nextLong());
		class523_sub34_7_.method16462(random.nextLong());
		Class289.method5204(class523_sub34_7_, -276541507);
		class523_sub34_7_.method16441(random.nextLong());
		class523_sub34_7_.encryptRSA(aBigInteger698, aBigInteger699, 737146878);
		int i = Class6.method555(string, (byte) -14);
		if (i % 8 != 0)
			i += 8 - i % 8;
		RSBuffer class523_sub34_8_ = new RSBuffer(i);
		class523_sub34_8_.method16270(string, (byte) -55);
		class523_sub34_8_.offset = 189765723 * i;
		class523_sub34_8_.method16307(is, -710885323);
		RSBuffer class523_sub34_9_ = new RSBuffer(class523_sub34_8_.offset * 2349011 + (2349011 * class523_sub34_7_.offset + (class523_sub34.offset * 2349011 + 5)));
		class523_sub34_9_.writeByte(2, 1406243997);
		class523_sub34_9_.writeByte(class523_sub34.offset * 2349011, 108466339);
		class523_sub34_9_.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -14648);
		class523_sub34_9_.writeByte(2349011 * class523_sub34_7_.offset, 1966064194);
		class523_sub34_9_.readBytes(class523_sub34_7_.buffer, 0, 2349011 * class523_sub34_7_.offset, (short) -21161);
		class523_sub34_9_.writeShort(2349011 * class523_sub34_8_.offset, (byte) -69);
		class523_sub34_9_.readBytes(class523_sub34_8_.buffer, 0, 2349011 * class523_sub34_8_.offset, (short) -26488);
		String string_10_ = Class221.method4138(class523_sub34_9_.buffer, 2109406155);
		int i_11_;
		try {
			URL url = new URL(new StringBuilder().append(Class465.method7558("services", false, (byte) -110)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class406.method6615(string_10_, 671003610)).append("&dest=").append(Class406.method6615("passwordchoice.ws", -160192006)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class523_sub34_9_ = new RSBuffer(new byte[1000]);
			for (;;) {
				int i_12_ = inputstream.read(class523_sub34_9_.buffer, class523_sub34_9_.offset * 2349011, 1000 - (class523_sub34_9_.offset * 2349011));
				if (i_12_ == -1)
					break;
				class523_sub34_9_.offset += i_12_ * 189765723;
				if (class523_sub34_9_.offset * 2349011 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_13_ = new String(class523_sub34_9_.buffer);
			if (string_13_.startsWith("OFFLINE"))
				return 4;
			if (string_13_.startsWith("WRONG"))
				return 7;
			if (string_13_.startsWith("RELOAD"))
				return 3;
			if (string_13_.startsWith("Not permitted for social network accounts."))
				return 6;
			class523_sub34_9_.method16308(is, (byte) -118);
			for (/**/; (2349011 * class523_sub34_9_.offset > 0 && 0 == (class523_sub34_9_.buffer[2349011 * class523_sub34_9_.offset - 1])); class523_sub34_9_.offset -= 189765723) {
				/* empty */
			}
			string_13_ = new String(class523_sub34_9_.buffer, 0, 2349011 * class523_sub34_9_.offset);
			if (Class63.method1429(string_13_, -482753605)) {
				Class331.method5825(string_13_, true, client.aBool10996, 70062718);
				return 2;
			}
			i_11_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_11_;
	}

	static boolean method1256(String string) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	Class48() throws Throwable {
		throw new Error();
	}

	static String method1257(Class523_Sub27_Sub6 class523_sub27_sub6, int i) {
		if (null == class523_sub27_sub6.aString11633 || class523_sub27_sub6.aString11633.length() == 0) {
			if (class523_sub27_sub6.aString11637 != null && class523_sub27_sub6.aString11637.length() > 0)
				return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -85)).append(class523_sub27_sub6.aString11637).toString();
			return class523_sub27_sub6.aString11629;
		}
		if (class523_sub27_sub6.aString11637 != null && class523_sub27_sub6.aString11637.length() > 0)
			return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -89)).append(class523_sub27_sub6.aString11637).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -32)).append(class523_sub27_sub6.aString11633).toString();
		return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124(Class53_Sub20.aClass668_10979, (byte) -52)).append(class523_sub27_sub6.aString11633).toString();
	}

	public static boolean method1258(int i, int i_14_) {
		return i == 1 || 3 == i || 5 == i;
	}

	static final void method1259(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -34844996;
		class250.anInt2502 = -374402151 * (class669.anIntArray8557[1357652815 * class669.anInt8558]);
		class250.anInt2686 = (155747443 * class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]);
		class250.anInt2583 = 0;
		class250.anInt2503 = 0;
		int i_15_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		if (i_15_ < 0)
			i_15_ = 0;
		else if (i_15_ > 4)
			i_15_ = 4;
		int i_16_ = class669.anIntArray8557[3 + class669.anInt8558 * 1357652815];
		if (i_16_ < 0)
			i_16_ = 0;
		else if (i_16_ > 4)
			i_16_ = 4;
		class250.aByte2591 = (byte) i_15_;
		class250.aByte2610 = (byte) i_16_;
		Login.method15991(class250, (byte) -104);
		Class79.method1563(class242, class250, -2034006180);
		if (36473529 * class250.type == 0)
			Class644.method10553(class242, class250, false, (byte) -23);
	}

	static final void method1260(Class669 class669, int i) {
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -939761716);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2680 * -1878986101;
	}
}
