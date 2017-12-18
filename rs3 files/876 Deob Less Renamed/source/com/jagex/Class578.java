/* Class578 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;

public class Class578 implements Interface68 {
	int anInt7700;
	int anInt7701;

	static Class578 method9651(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(-564647532);
		int i_0_ = class523_sub34.readUnsignedByte(1673650859);
		return new Class578(i, i_0_);
	}

	public boolean method435(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551, byte i_1_) {
		for (int i_2_ = 0; i_2_ < i && i_2_ < interface64s.length; i_2_++) {
			Interface64 interface64 = interface64s[i_2_];
			if (null != interface64 && interface64.method390(-1174060276) == anInt7700 * -783675753 && interface64.method426(1000123909) == 470575971 * anInt7701)
				return true;
		}
		return false;
	}

	public boolean method434(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551) {
		for (int i_3_ = 0; i_3_ < i && i_3_ < interface64s.length; i_3_++) {
			Interface64 interface64 = interface64s[i_3_];
			if (null != interface64 && interface64.method390(-1846857253) == anInt7700 * -783675753 && interface64.method426(9165224) == 470575971 * anInt7701)
				return true;
		}
		return false;
	}

	public boolean method433(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551) {
		for (int i_4_ = 0; i_4_ < i && i_4_ < interface64s.length; i_4_++) {
			Interface64 interface64 = interface64s[i_4_];
			if (null != interface64 && interface64.method390(-2136355349) == anInt7700 * -783675753 && interface64.method426(-773357364) == 470575971 * anInt7701)
				return true;
		}
		return false;
	}

	Class578(int i, int i_5_) {
		anInt7700 = i * -420064985;
		anInt7701 = -2039976373 * i_5_;
	}

	static final void method9652(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		boolean bool = 1 == class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_6_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class250 class250 = Class188.method3592(i_6_, -1404321335);
		Class242 class242 = Class31.aClass242Array302[i_6_ >> 16];
		Class170.method2892(class250, class242, class669, (bool ? PacketsDecoder.aClass233_2369 : PacketsDecoder.aClass233_2371), (byte) 0);
	}

	static final void method9653(Class669 class669, int i) {
		if (Class710.aBool8840 && null != Class310.aFrame3385)
			Class82.method1585(Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(1256799868), -1, -1, false, -1011984276);
		if (Class53.method1308((byte) 64) == Class513.aClass513_5764) {
			Class545.method9063(829526854);
			System.exit(0);
		} else
			Class292.method5240((byte) 66);
	}

	public static byte[] method9654(File file, short i) {
		return Class222.method4139(file, (int) file.length(), (byte) -81);
	}

	public static File method9655(String string, byte i) {
		if (!Class512.aBool5763)
			throw new RuntimeException("");
		File file = (File) Class512.aHashtable5762.get(string);
		if (null != file)
			return file;
		File file_7_ = new File(Class626.aFile8179, string);
		RandomAccessFile randomaccessfile = null;
		File file_8_;
		try {
			File file_9_ = new File(file_7_.getParent());
			if (!file_9_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_7_, "rw");
			int i_10_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_10_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			Class512.aHashtable5762.put(string, file_7_);
			file_8_ = file_7_;
		} catch (Exception exception) {
			try {
				if (randomaccessfile != null) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_11_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_8_;
	}
}
