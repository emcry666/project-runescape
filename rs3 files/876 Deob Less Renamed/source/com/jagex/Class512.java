/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class512 {
	static Hashtable aHashtable5762;
	static boolean aBool5763 = false;

	public static File method8567(String string) {
		if (!aBool5763)
			throw new RuntimeException("");
		File file = (File) aHashtable5762.get(string);
		if (null != file)
			return file;
		File file_0_ = new File(Class626.aFile8179, string);
		RandomAccessFile randomaccessfile = null;
		File file_1_;
		try {
			File file_2_ = new File(file_0_.getParent());
			if (!file_2_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_0_, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			aHashtable5762.put(string, file_0_);
			file_1_ = file_0_;
		} catch (Exception exception) {
			try {
				if (randomaccessfile != null) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_3_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_1_;
	}

	Class512() throws Throwable {
		throw new Error();
	}

	static void method8568(File file) {
		Class626.aFile8179 = file;
		if (!Class626.aFile8179.exists())
			throw new RuntimeException("");
		aBool5763 = true;
	}

	static {
		aHashtable5762 = new Hashtable(16);
	}

	public static String method8569() {
		return Class626.aFile8179.getAbsolutePath();
	}

	public static String method8570() {
		return Class626.aFile8179.getAbsolutePath();
	}

	public static String method8571() {
		return Class626.aFile8179.getAbsolutePath();
	}

	public static String method8572() {
		return Class626.aFile8179.getAbsolutePath();
	}

	public static File method8573(String string) {
		if (!aBool5763)
			throw new RuntimeException("");
		File file = (File) aHashtable5762.get(string);
		if (null != file)
			return file;
		File file_4_ = new File(Class626.aFile8179, string);
		RandomAccessFile randomaccessfile = null;
		File file_5_;
		try {
			File file_6_ = new File(file_4_.getParent());
			if (!file_6_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_4_, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			aHashtable5762.put(string, file_4_);
			file_5_ = file_4_;
		} catch (Exception exception) {
			try {
				if (randomaccessfile != null) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_7_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_5_;
	}

	static void method8574(File file) {
		Class626.aFile8179 = file;
		if (!Class626.aFile8179.exists())
			throw new RuntimeException("");
		aBool5763 = true;
	}

	public static File method8575(String string) {
		if (!aBool5763)
			throw new RuntimeException("");
		File file = (File) aHashtable5762.get(string);
		if (null != file)
			return file;
		File file_8_ = new File(Class626.aFile8179, string);
		RandomAccessFile randomaccessfile = null;
		File file_9_;
		try {
			File file_10_ = new File(file_8_.getParent());
			if (!file_10_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_8_, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			aHashtable5762.put(string, file_8_);
			file_9_ = file_8_;
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
		return file_9_;
	}

	static String method8576(Class250 class250, int i, byte i_12_) {
		if (!client.method17252(class250).method15966(i, -1139615188) && class250.anObjectArray2661 == null)
			return null;
		if (class250.aStringArray2626 == null || class250.aStringArray2626.length <= i || null == class250.aStringArray2626[i] || class250.aStringArray2626[i].trim().length() == 0) {
			if (client.aBool11180)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class250.aStringArray2626[i];
	}

	static final void method8577(Class250 class250, Class242 class242, Class669 class669, int i) {
		class250.anInt2570 = -1096128618;
		class250.aClass302_2553 = null;
		class250.anInt2571 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 903474739;
		if (class250.anInt2709 * 234012635 == -1 && !class242.aBool2456)
			Class328_Sub3_Sub1.method17886(-1363815505 * class250.anInt2585, 1648921847);
	}

	static final void method8578(Class669 class669, int i) {
		if (Class665.aClass282_8527.method5120(112164229) > 0) {
			String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
			String string_13_ = Class665.aClass282_8527.method5104(string, 1582026293);
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string_13_;
		}
	}

	static final void method8579(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) ((Class248.method4401(1516375036) - Class461.aClass218_5122.method4023((byte) -64) - Class159_Sub1.aLong8869 * -8911810745974825803L) / 1000L);
	}
}
