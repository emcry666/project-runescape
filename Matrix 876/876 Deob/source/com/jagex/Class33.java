/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public abstract class Class33 {
	int anInt308;
	String aString309;

	public static Class33 method913(String string, int i) {
		Class33_Sub1 class33_sub1 = new Class33_Sub1();
		class33_sub1.aString309 = string;
		class33_sub1.anInt308 = i * 1133567249;
		return class33_sub1;
	}

	public abstract Socket method914(byte i) throws IOException;

	Socket method915(byte i) throws IOException {
		return new Socket(RS3Applet.Host, 43594);
	}

	public abstract Socket method916() throws IOException;

	public abstract Socket method917() throws IOException;

	public abstract Socket method918() throws IOException;

	public static Class33 method919(String string, int i) {
		Class33_Sub1 class33_sub1 = new Class33_Sub1();
		class33_sub1.aString309 = string;
		class33_sub1.anInt308 = i * 1133567249;
		return class33_sub1;
	}

	Class33() {
		/* empty */
	}

	Socket method920() throws IOException {
		return new Socket(aString309, anInt308 * -1656900623);
	}

	public static Class33 method921(String string, int i) {
		Class33_Sub1 class33_sub1 = new Class33_Sub1();
		class33_sub1.aString309 = string;
		class33_sub1.anInt308 = i * 1133567249;
		return class33_sub1;
	}

	public static int[] method922(byte i) {
		return new int[] { Class34.anInt315 * -1386279717, Class34.anInt314 * -672958487, -2091202475 * Class61.anInt767 };
	}

	static boolean method923(int i) {
		if (-1 != Class43.anInt572 * 426956199)
			return Class594.method9806(1969751322);
		return Class423.method6715(Class43.aString603, Class43.aString594, 1204738509);
	}

	static void method924(InterfaceComponentDefinitions class250, int i, int i_0_, byte i_1_) {
		if (0 == class250.aByte2532)
			class250.anInt2540 = 1444104899 * class250.anInt2574;
		else if (class250.aByte2532 == 1)
			class250.anInt2540 = -1023129821 * ((i - 365308179 * class250.anInt2581) / 2 + -126158879 * class250.anInt2574);
		else if (2 == class250.aByte2532)
			class250.anInt2540 = (i - class250.anInt2581 * 365308179 - class250.anInt2574 * -126158879) * -1023129821;
		else if (class250.aByte2532 == 3)
			class250.anInt2540 = (i * (class250.anInt2574 * -126158879) >> 14) * -1023129821;
		else if (class250.aByte2532 == 4)
			class250.anInt2540 = ((i - 365308179 * class250.anInt2581) / 2 + (-126158879 * class250.anInt2574 * i >> 14)) * -1023129821;
		else
			class250.anInt2540 = -1023129821 * (i - class250.anInt2581 * 365308179 - (class250.anInt2574 * -126158879 * i >> 14));
		if (0 == class250.aByte2533)
			class250.anInt2541 = class250.anInt2507 * 266010423;
		else if (class250.aByte2533 == 1)
			class250.anInt2541 = ((class250.anInt2507 * 829301107 + (i_0_ - class250.anInt2543 * -1759297857) / 2) * -865801683);
		else if (2 == class250.aByte2533)
			class250.anInt2541 = (i_0_ - class250.anInt2543 * -1759297857 - class250.anInt2507 * 829301107) * -865801683;
		else if (3 == class250.aByte2533)
			class250.anInt2541 = (i_0_ * (829301107 * class250.anInt2507) >> 14) * -865801683;
		else if (4 == class250.aByte2533)
			class250.anInt2541 = (((class250.anInt2507 * 829301107 * i_0_ >> 14) + (i_0_ - class250.anInt2543 * -1759297857) / 2) * -865801683);
		else
			class250.anInt2541 = (i_0_ - -1759297857 * class250.anInt2543 - (i_0_ * (class250.anInt2507 * 829301107) >> 14)) * -865801683;
		if (client.aBool11180 && (client.method17252(class250).settings * 747608249 != 0 || 36473529 * class250.type == 0)) {
			if (1579360395 * class250.anInt2540 < 0)
				class250.anInt2540 = 0;
			else if ((1579360395 * class250.anInt2540 + class250.anInt2581 * 365308179) > i)
				class250.anInt2540 = -1023129821 * (i - class250.anInt2581 * 365308179);
			if (1765340581 * class250.anInt2541 < 0)
				class250.anInt2541 = 0;
			else if ((class250.anInt2543 * -1759297857 + 1765340581 * class250.anInt2541) > i_0_)
				class250.anInt2541 = (i_0_ - -1759297857 * class250.anInt2543) * -865801683;
		}
	}
}
