/* Class608 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class608 {
	public static Class608 aClass608_7988;
	public static Class608 aClass608_7989 = new Class608(0);
	public static Class608 aClass608_7990;

	static {
		aClass608_7988 = new Class608(1);
		aClass608_7990 = new Class608(2);
	}

	Class608(int i) {
		/* empty */
	}

	static RSBuffer method9988(byte i) {
		RSBuffer class523_sub34 = new RSBuffer(518);
		Class43.anIntArray569 = new int[4];
		Class43.anIntArray569[0] = (int) (Math.random() * 9.9999999E7);
		Class43.anIntArray569[1] = (int) (Math.random() * 9.9999999E7);
		Class43.anIntArray569[2] = (int) (Math.random() * 9.9999999E7);
		Class43.anIntArray569[3] = (int) (Math.random() * 9.9999999E7);
		class523_sub34.writeByte(10, -197309059);
		class523_sub34.writeInt(Class43.anIntArray569[0], -1456963379);
		class523_sub34.writeInt(Class43.anIntArray569[1], -2085813165);
		class523_sub34.writeInt(Class43.anIntArray569[2], -829694719);
		class523_sub34.writeInt(Class43.anIntArray569[3], -1450040242);
		return class523_sub34;
	}

	public static String method9989(byte i) {
		return Class54.aString725;
	}
}
