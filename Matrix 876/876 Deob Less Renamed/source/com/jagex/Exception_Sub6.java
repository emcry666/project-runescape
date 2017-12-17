/* Exception_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub6 extends Exception {
	public String aString11383;
	public int anInt11384;

	public Exception_Sub6(int i, String string, Throwable throwable) {
		super(throwable);
		aString11383 = string;
		anInt11384 = -511607551 * i;
	}

	public Exception_Sub6(int i, String string) {
		this(i, string, null);
	}
}
