/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class RSSocket {
	public String aString9;
	public int anInt10;
	public int anInt11;
	public int anInt12;
	boolean aBool13 = true;
	boolean aBool14 = false;
	static Class250 aClass250_15;

	public boolean method495(RSSocket class1_0_) {
		if (class1_0_ == null)
			return false;
		return (-1126141351 * anInt10 == -1126141351 * class1_0_.anInt10 && aString9.equals(class1_0_.aString9) && class1_0_.anInt11 * -590643463 == anInt11 * -590643463 && class1_0_.anInt12 * 686690163 == anInt12 * 686690163);
	}

	public boolean method496(RSSocket class1_1_) {
		if (class1_1_ == null)
			return false;
		return (-1126141351 * anInt10 == -1126141351 * class1_1_.anInt10 && aString9.equals(class1_1_.aString9) && class1_1_.anInt11 * -590643463 == anInt11 * -590643463 && class1_1_.anInt12 * 686690163 == anInt12 * 686690163);
	}

	public void method497(byte i) {
		if (!aBool13) {
			aBool13 = true;
			aBool14 = true;
		} else if (aBool14)
			aBool14 = false;
		else
			aBool13 = false;
	}

	public void method498() {
		if (!aBool13) {
			aBool13 = true;
			aBool14 = true;
		} else if (aBool14)
			aBool14 = false;
		else
			aBool13 = false;
	}

	public Socket method499() throws IOException {
		if (!aBool14)
			return new Socket(InetAddress.getByName(aString9), (aBool13 ? anInt12 * 686690163 : -590643463 * anInt11));
		return Class577.method9650(aString9, aBool13 ? anInt12 * 686690163 : anInt11 * -590643463, (byte) 4).method914((byte) -48);
	}

	public Socket method500() throws IOException {
		if (!aBool14)
			return new Socket(InetAddress.getByName(aString9), (aBool13 ? anInt12 * 686690163 : -590643463 * anInt11));
		return Class577.method9650(aString9, aBool13 ? anInt12 * 686690163 : anInt11 * -590643463, (byte) 4).method914((byte) -17);
	}

	public void method501() {
		if (!aBool13) {
			aBool13 = true;
			aBool14 = true;
		} else if (aBool14)
			aBool14 = false;
		else
			aBool13 = false;
	}

	public Socket method502(int i) throws IOException {
		if (!aBool14)
			return new Socket(RS3Applet.Host, 43594);
		return Class577.method9650(aString9, aBool13 ? anInt12 * 686690163 : anInt11 * -590643463, (byte) 4).method914((byte) -1);
	}

	public boolean method503(RSSocket class1_2_) {
		if (class1_2_ == null)
			return false;
		return (-1126141351 * anInt10 == -1126141351 * class1_2_.anInt10 && aString9.equals(class1_2_.aString9) && class1_2_.anInt11 * -590643463 == anInt11 * -590643463 && class1_2_.anInt12 * 686690163 == anInt12 * 686690163);
	}

	public boolean method504(RSSocket class1_3_) {
		if (class1_3_ == null)
			return false;
		return (-1126141351 * anInt10 == -1126141351 * class1_3_.anInt10 && aString9.equals(class1_3_.aString9) && class1_3_.anInt11 * -590643463 == anInt11 * -590643463 && class1_3_.anInt12 * 686690163 == anInt12 * 686690163);
	}

	public boolean method505(RSSocket class1_4_, short i) {
		if (class1_4_ == null)
			return false;
		return (-1126141351 * anInt10 == -1126141351 * class1_4_.anInt10 && aString9.equals(class1_4_.aString9) && class1_4_.anInt11 * -590643463 == anInt11 * -590643463 && class1_4_.anInt12 * 686690163 == anInt12 * 686690163);
	}

	static final void method506(int i, int i_5_, int i_6_, int i_7_) {
		String string = new StringBuilder().append("tele ").append(i).append(Class31.aString300).append(i_5_ >> 6).append(Class31.aString300).append(i_6_ >> 6).append(Class31.aString300).append(i_5_ & 0x3f).append(Class31.aString300).append(i_6_ & 0x3f).toString();
		System.out.println(string);
		Class264.method4746(string, true, false, 558218765);
	}

	static final void method507(Class669 class669, int i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_8_, -532856404);
		Class242 class242 = Class31.aClass242Array302[i_8_ >> 16];
		Class661.method10907(class250, class242, class669, 1309845691);
	}
}
