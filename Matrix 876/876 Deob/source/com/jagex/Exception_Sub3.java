/* Exception_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Exception_Sub3 extends Exception {
	public Exception_Sub3(String string) {
		super(string);
	}

	static void method17760(byte i) {
		if (Class95.aFileOutputStream1169 != null) {
			try {
				Class95.aFileOutputStream1169.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class95.aFileOutputStream1169 = null;
	}
}
