/* Exception_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub5 extends Exception {
	public String aString11360;
	public int anInt11361;

	Exception_Sub5(int i, String string) {
		this(i, string, null);
	}

	Exception_Sub5(int i, String string, Throwable throwable) {
		super(throwable);
		aString11360 = string;
		anInt11361 = -16143431 * i;
	}
}
