/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class319 implements Runnable {
	Thread aThread3432;
	Class318[] aClass318Array3433;
	volatile boolean aBool3434;
	public static String aString3435;

	Class318 method5695(int i, byte i_0_) {
		if (null == aClass318Array3433 || i < 0 || i >= aClass318Array3433.length)
			return null;
		return aClass318Array3433[i];
	}

	Class318 method5696(int i) {
		if (null == aClass318Array3433 || i < 0 || i >= aClass318Array3433.length)
			return null;
		return aClass318Array3433[i];
	}

	boolean method5697(int i) {
		if (aBool3434)
			return true;
		if (null == aThread3432) {
			aThread3432 = new Thread(this);
			aThread3432.start();
		}
		return aBool3434;
	}

	public void run() {
		try {
			int i = Class293.method5248(Class80.aClass674_865, Class670.aClass670_8584, (Class648.aClass1_8378.anInt10 * -1126141351), 1617610838);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class648.aClass1_8378.aString9).append(":").append(i).append("/news.ws?game=").append(client.aClass681_11284.anInt8648 * 1884825957).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (0 != strings.length % 3)
				return;
			aClass318Array3433 = new Class318[strings.length / 3];
			for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
				aClass318Array3433[i_1_ / 3] = new Class318(strings[i_1_], strings[1 + i_1_], strings[2 + i_1_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3434 = true;
	}

	public void method5698() {
		try {
			int i = Class293.method5248(Class80.aClass674_865, Class670.aClass670_8584, (Class648.aClass1_8378.anInt10 * -1126141351), 1617610838);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class648.aClass1_8378.aString9).append(":").append(i).append("/news.ws?game=").append(client.aClass681_11284.anInt8648 * 1884825957).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (0 != strings.length % 3)
				return;
			aClass318Array3433 = new Class318[strings.length / 3];
			for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
				aClass318Array3433[i_2_ / 3] = new Class318(strings[i_2_], strings[1 + i_2_], strings[2 + i_2_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3434 = true;
	}

	public void method5699() {
		try {
			int i = Class293.method5248(Class80.aClass674_865, Class670.aClass670_8584, (Class648.aClass1_8378.anInt10 * -1126141351), 1617610838);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class648.aClass1_8378.aString9).append(":").append(i).append("/news.ws?game=").append(client.aClass681_11284.anInt8648 * 1884825957).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (0 != strings.length % 3)
				return;
			aClass318Array3433 = new Class318[strings.length / 3];
			for (int i_3_ = 0; i_3_ < strings.length; i_3_ += 3)
				aClass318Array3433[i_3_ / 3] = new Class318(strings[i_3_], strings[1 + i_3_], strings[2 + i_3_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3434 = true;
	}

	Class318 method5700(int i) {
		if (null == aClass318Array3433 || i < 0 || i >= aClass318Array3433.length)
			return null;
		return aClass318Array3433[i];
	}

	Class318 method5701(int i) {
		if (null == aClass318Array3433 || i < 0 || i >= aClass318Array3433.length)
			return null;
		return aClass318Array3433[i];
	}

	Class319() {
		/* empty */
	}

	boolean method5702() {
		if (aBool3434)
			return true;
		if (null == aThread3432) {
			aThread3432 = new Thread(this);
			aThread3432.start();
		}
		return aBool3434;
	}

	static final void method5703(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class254.method4548(class250, class242, class669, 2054730978);
	}

	static final void method5704(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1374363817 * Class188.anInt2133;
	}

	static final void method5705(Class669 class669, byte i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (Class99.aClass115Array1232 != null && i_4_ < 797304521 * Class365.anInt3866 && (Class99.aClass115Array1232[i_4_].aString1407.equalsIgnoreCase(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.username)))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static Class284[] method5706(int i) {
		return (new Class284[] { Class284.aClass284_3077, Class284.aClass284_3072, Class284.aClass284_3074, Class284.aClass284_3078, Class284.aClass284_3073, Class284.aClass284_3076 });
	}
}
