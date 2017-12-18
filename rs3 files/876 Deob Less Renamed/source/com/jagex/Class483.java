/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

final class Class483 implements Interface11 {
	public Object method65(Class523_Sub34 class523_sub34, int i) {
		return Integer.valueOf(class523_sub34.readUnsignedInt((byte) -88));
	}

	public Object method64(Class523_Sub34 class523_sub34) {
		return Integer.valueOf(class523_sub34.readUnsignedInt((byte) -18));
	}

	public Object method66(Class523_Sub34 class523_sub34) {
		return Integer.valueOf(class523_sub34.readUnsignedInt((byte) -14));
	}

	public Object method67(Class523_Sub34 class523_sub34) {
		return Integer.valueOf(class523_sub34.readUnsignedInt((byte) -92));
	}

	static final void method7921(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1517429224);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class280.method5095(class250, class242, class669, (byte) 6);
	}

	static final void method7922(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_1_ = 0; i_1_ < string.length(); i_1_++) {
			char c = string.charAt(i_1_);
			if ('<' == c)
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = stringbuilder.toString();
	}

	static final void method7923(Class250 class250, Class242 class242, Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2531 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static byte[] method7924(InputStream inputstream, int i, int i_2_) throws IOException {
		byte[] is = new byte[5];
		if (inputstream.read(is, 0, 5) != 5)
			throw new IOException("2");
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
		synchronized (Class536.aClass525_7208) {
			if (!Class536.aClass525_7208.method8703(is, -872904168))
				throw new IOException("3");
			Class536.aClass525_7208.method8690(inputstream, bytearrayoutputstream, (long) i);
		}
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}
}
