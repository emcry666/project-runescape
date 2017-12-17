/* Class557_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public class Class557_Sub1 extends Class557 {
	Class566 aClass566_10668;
	Socket aSocket10669;
	Class555 aClass555_10670;

	public boolean method9206(int i) throws IOException {
		return aClass555_10670.method9173(i, (byte) 107);
	}

	public void method9217() {
		aClass555_10670.method9187(-806996454);
		aClass566_10668.method9491(-1348573110);
	}

	public int method9202(int i) throws IOException {
		return aClass555_10670.method9174((byte) 83);
	}

	public int method9201(byte[] is, int i, int i_0_, short i_1_) throws IOException {
		return aClass555_10670.method9176(is, i, i_0_, (byte) 1);
	}

	public void method9214(byte[] is, int i, int i_2_, byte i_3_) throws IOException {
		aClass566_10668.method9496(is, i, i_2_, (byte) -15);
	}

	public void method9203(int i) {
		aClass566_10668.method9490(-27579018);
		try {
			aSocket10669.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass555_10670.method9178(2122635550);
	}

	public void method9204(int i) {
		aClass555_10670.method9187(-806996454);
		aClass566_10668.method9491(-510093374);
	}

	public void method9213() {
		aClass566_10668.method9490(1874624588);
		try {
			aSocket10669.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass555_10670.method9178(1176693055);
	}

	void method16513() {
		method9203(1781159247);
	}

	public boolean method9205(int i) throws IOException {
		return aClass555_10670.method9173(i, (byte) 20);
	}

	public boolean method9199(int i, int i_4_) throws IOException {
		return aClass555_10670.method9173(i, (byte) 87);
	}

	public void finalize() {
		method9203(1930651852);
	}

	public int method9215(byte[] is, int i, int i_5_) throws IOException {
		return aClass555_10670.method9176(is, i, i_5_, (byte) 1);
	}

	public void method9211(byte[] is, int i, int i_6_) throws IOException {
		aClass566_10668.method9496(is, i, i_6_, (byte) 20);
	}

	public void method9198(byte[] is, int i, int i_7_) throws IOException {
		aClass566_10668.method9496(is, i, i_7_, (byte) 47);
	}

	public boolean method9207(int i) throws IOException {
		return aClass555_10670.method9173(i, (byte) 62);
	}

	public void method9200(byte[] is, int i, int i_8_) throws IOException {
		aClass566_10668.method9496(is, i, i_8_, (byte) -43);
	}

	public void method9212(byte[] is, int i, int i_9_) throws IOException {
		aClass566_10668.method9496(is, i, i_9_, (byte) -96);
	}

	public int method9221(byte[] is, int i, int i_10_) throws IOException {
		return aClass555_10670.method9176(is, i, i_10_, (byte) 1);
	}

	public void method9209() {
		aClass566_10668.method9490(-1907648212);
		try {
			aSocket10669.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass555_10670.method9178(-873267260);
	}

	Class557_Sub1(Socket socket, int i) throws IOException {
		aSocket10669 = socket;
		aSocket10669.setSoTimeout(30000);
		aSocket10669.setTcpNoDelay(true);
		aSocket10669.setReceiveBufferSize(65536);
		aSocket10669.setSendBufferSize(65536);
		aClass555_10670 = new Class555(aSocket10669.getInputStream(), i);
		aClass566_10668 = new Class566(aSocket10669.getOutputStream(), i);
	}

	public void method9216() {
		aClass555_10670.method9187(-806996454);
		aClass566_10668.method9491(-925863677);
	}

	public void method9208() {
		aClass555_10670.method9187(-806996454);
		aClass566_10668.method9491(-405448389);
	}

	public void method9218() {
		aClass555_10670.method9187(-806996454);
		aClass566_10668.method9491(-687828597);
	}

	public int method9220() throws IOException {
		return aClass555_10670.method9174((byte) 49);
	}

	public int method9210() throws IOException {
		return aClass555_10670.method9174((byte) 87);
	}

	public int method9222() throws IOException {
		return aClass555_10670.method9174((byte) 13);
	}

	public static Class523_Sub39_Sub2 method16514(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		synchronized (Class523_Sub39_Sub2.aClass523_Sub39_Sub2Array11799) {
			Class523_Sub39_Sub2 class523_sub39_sub2;
			if (1461112827 * Class687_Sub33.anInt10909 == 0)
				class523_sub39_sub2 = new Class523_Sub39_Sub2();
			else
				class523_sub39_sub2 = (Class523_Sub39_Sub2.aClass523_Sub39_Sub2Array11799[((Class687_Sub33.anInt10909 -= -2134121677) * 1461112827)]);
			class523_sub39_sub2.anInt11803 = i * 668965623;
			class523_sub39_sub2.anInt11804 = i_11_ * 1509770205;
			class523_sub39_sub2.anInt11800 = 1810136807 * i_12_;
			class523_sub39_sub2.anInt11801 = i_13_ * 658253069;
			class523_sub39_sub2.aLong11784 = Class248.method4401(1516375036) * -6103870009502704515L;
			Class523_Sub39_Sub2 class523_sub39_sub2_15_ = class523_sub39_sub2;
			return class523_sub39_sub2_15_;
		}
	}
}
