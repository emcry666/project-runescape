/* Class659 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;

public class Class659 {
	static Class207 aClass207_8504 = new Class207(128);
	static Class164 aClass164_8505;

	static Class523_Sub27_Sub19 method10796(byte[] is) {
		return new Class523_Sub27_Sub19(new RSBuffer(is), Class570.anInterface19_7657);
	}

	static Class523_Sub27_Sub19 method10797(byte[] is) {
		return new Class523_Sub27_Sub19(new RSBuffer(is), Class570.anInterface19_7657);
	}

	public static void method10798() {
		aClass207_8504.method3740(-825138294);
	}

	public static void method10799() {
		aClass207_8504.method3740(655198486);
	}

	static Class523_Sub27_Sub19 method10800(int i) {
		Class523_Sub27_Sub19 class523_sub27_sub19 = (Class523_Sub27_Sub19) aClass207_8504.method3739((long) i);
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = Class515.aClass472_7045.method7688(i, 0, -1982547704);
		if (null == is || is.length <= 1)
			return null;
		try {
			class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass207_8504.method3741(class523_sub27_sub19, (long) i);
		return class523_sub27_sub19;
	}

	static Class523_Sub27_Sub19 method10801(int i) {
		Class523_Sub27_Sub19 class523_sub27_sub19 = (Class523_Sub27_Sub19) aClass207_8504.method3739((long) i);
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = Class515.aClass472_7045.method7688(i, 0, -187752038);
		if (null == is || is.length <= 1)
			return null;
		try {
			class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass207_8504.method3741(class523_sub27_sub19, (long) i);
		return class523_sub27_sub19;
	}

	static Class523_Sub27_Sub19 method10802(Class572 class572, int i, int i_0_) {
		int i_1_ = -313548161 * class572.anInt7672 | i << 10;
		Class523_Sub27_Sub19 class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_1_ << 16));
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_1_, 2014234091), -387132909));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_1_ << 16);
			return class523_sub27_sub19;
		}
		i_1_ = -313548161 * class572.anInt7672 | i_0_ + 65536 << 10;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_1_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_1_, 39024601), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_1_ << 16);
			return class523_sub27_sub19;
		}
		i_1_ = -313548161 * class572.anInt7672 | 0x3fffc00;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_1_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_1_, 766254000), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_1_ << 16);
			return class523_sub27_sub19;
		}
		return null;
	}

	static Class523_Sub27_Sub19 method10803(Class572 class572, int i, int i_2_) {
		int i_3_ = -313548161 * class572.anInt7672 | i << 10;
		Class523_Sub27_Sub19 class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_3_ << 16));
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_3_, 208427814), -387132909));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_3_ << 16);
			return class523_sub27_sub19;
		}
		i_3_ = -313548161 * class572.anInt7672 | i_2_ + 65536 << 10;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_3_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_3_, 104631493), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_3_ << 16);
			return class523_sub27_sub19;
		}
		i_3_ = -313548161 * class572.anInt7672 | 0x3fffc00;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_3_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_3_, 1862166876), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_3_ << 16);
			return class523_sub27_sub19;
		}
		return null;
	}

	static Class523_Sub27_Sub19 method10804(Class572 class572, int i, int i_4_) {
		int i_5_ = -313548161 * class572.anInt7672 | i << 10;
		Class523_Sub27_Sub19 class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_5_ << 16));
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_5_, -622753577), -387132909));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_5_ << 16);
			return class523_sub27_sub19;
		}
		i_5_ = -313548161 * class572.anInt7672 | i_4_ + 65536 << 10;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_5_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_5_, 1146828208), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_5_ << 16);
			return class523_sub27_sub19;
		}
		i_5_ = -313548161 * class572.anInt7672 | 0x3fffc00;
		class523_sub27_sub19 = ((Class523_Sub27_Sub19) aClass207_8504.method3739((long) i_5_ << 16));
		if (null != class523_sub27_sub19)
			return class523_sub27_sub19;
		is = (Class515.aClass472_7045.method7721(Class515.aClass472_7045.method7664(i_5_, -1321301225), -387132909));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class523_sub27_sub19.aClass572_11850 = class572;
			aClass207_8504.method3741(class523_sub27_sub19, (long) i_5_ << 16);
			return class523_sub27_sub19;
		}
		return null;
	}

	Class659() throws Throwable {
		throw new Error();
	}

	static Class523_Sub27_Sub19 method10805(byte[] is) {
		return new Class523_Sub27_Sub19(new RSBuffer(is), Class570.anInterface19_7657);
	}

	static void method10806(int i) {
		try {
			File file = new File(Class506.aString5699, "random.dat");
			if (file.exists())
				Class506.aClass20_5685 = new Class20(new Class19(file, "rw", 25L), 24, 0);
			else {
				while_153_: for (int i_6_ = 0; i_6_ < Class192.aStringArray2178.length; i_6_++) {
					for (int i_7_ = 0; i_7_ < Class614.aStringArray8021.length; i_7_++) {
						File file_8_ = new File(new StringBuilder().append(Class614.aStringArray8021[i_7_]).append(Class192.aStringArray2178[i_6_]).append(File.separatorChar).append("random.dat").toString());
						if (file_8_.exists()) {
							Class506.aClass20_5685 = new Class20(new Class19(file_8_, "rw", 25L), 24, 0);
							break while_153_;
						}
					}
				}
			}
			if (null == Class506.aClass20_5685) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_9_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_9_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class506.aClass20_5685 = new Class20(new Class19(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	public static String method10807(long l, int i, boolean bool, byte i_10_) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = Class91.aCalendar894;
		} else {
			Class17.method776(l);
			calendar = Class91.aCalendar893;
		}
		int i_11_ = calendar.get(5);
		int i_12_ = calendar.get(2);
		int i_13_ = calendar.get(1);
		int i_14_ = calendar.get(11);
		int i_15_ = calendar.get(12);
		if (i == 3)
			return Class61.method1416(l, i, bool, -565692191);
		return new StringBuilder().append(Integer.toString(i_11_ / 10)).append(i_11_ % 10).append("-").append(Class91.aStringArrayArray892[i][i_12_]).append("-").append(i_13_).append(" ").append(i_14_ / 10).append(i_14_ % 10).append(":").append(i_15_ / 10).append(i_15_ % 10).toString();
	}

	public static Class388 method10808(RSBuffer class523_sub34, int i) {
		int i_16_ = class523_sub34.readBigSmart((byte) -41);
		Class380 class380 = (Class228.method4175(134249413)[class523_sub34.readUnsignedByte(-515004444)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(-846152461)]);
		int i_17_ = class523_sub34.readShort(7808501);
		int i_18_ = class523_sub34.readShort(1457288558);
		return new Class388(i_16_, class380, class389, i_17_, i_18_);
	}

	public static void method10809(int i) {
		Class447.anInt4935 = 0;
		Class447.anInt4936 = 0;
	}

	static String method10810(Throwable throwable, int i) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub4) {
			RuntimeException_Sub4 runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
			string = new StringBuilder().append(runtimeexception_sub4.aString12098).append(" | ").toString();
			throwable = runtimeexception_sub4.aThrowable12104;
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_19_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_19_));
		String string_20_ = bufferedreader.readLine();
		for (;;) {
			String string_21_ = bufferedreader.readLine();
			if (string_21_ == null)
				break;
			int i_22_ = string_21_.indexOf('(');
			int i_23_ = string_21_.indexOf(')', 1 + i_22_);
			String string_24_;
			if (-1 != i_22_)
				string_24_ = string_21_.substring(0, i_22_);
			else
				string_24_ = string_21_;
			string_24_ = string_24_.trim();
			string_24_ = string_24_.substring(string_24_.lastIndexOf(' ') + 1);
			string_24_ = string_24_.substring(string_24_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_24_).toString();
			if (-1 != i_22_ && i_23_ != -1) {
				int i_25_ = string_21_.indexOf(".java:", i_22_);
				if (i_25_ >= 0)
					string = new StringBuilder().append(string).append(string_21_.substring(i_25_ + 5, i_23_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_20_).toString();
		return string;
	}
}
