/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public class Class191 {
	static int anInt2155;
	static int anInt2156;
	public static Class192[] aClass192Array2157;
	static Class190[] aClass190Array2158;
	public static Class708 aClass708_2159 = new Class708();
	public static Class14 aClass14_2160 = new Class14(32);
	static int anInt2161;
	static int anInt2162;
	static int anInt2163;
	static boolean aBool2164;
	static short aShort2165;
	static Class206[] aClass206Array2166;
	static short aShort2167;
	static Class204[] aClass204Array2168;
	public static Interface17 anInterface17_2169;

	public static void method3615() {
		Class110.aShort1333 = client.aShort11143;
		aShort2167 = client.aShort11205;
		aShort2165 = client.aShort11278;
		Class618.aShort8062 = client.aShort11020;
		aBool2164 = true;
		anInt2161 = Class254.aClass217_2743.method3912(-596999086) * -403248807;
		if (-738440423 * anInt2163 != 0 && anInt2162 * -679794657 != 0) {
			client.aShort11278 = (short) 334;
			client.aShort11020 = (short) 334;
			client.aShort11205 = client.aShort11143 = (short) (anInt2163 * -124374528 / (anInt2162 * -679794657));
		}
	}

	static {
		anInt2156 = -1078043049;
		anInt2162 = 0;
		anInt2163 = 0;
		aBool2164 = false;
		anInt2161 = 403248807;
		anInt2155 = -1159354201;
		anInterface17_2169 = new Class202();
	}

	public static void method3616(boolean bool) {
		if (-1616721887 * client.anInt11071 != 2 && client.anInt11071 * -1616721887 != 3) {
			if (!bool) {
				if (Class174.aClass194Array1855 != null) {
					Class194[] class194s = Class174.aClass194Array1855;
					for (int i = 0; i < class194s.length; i++) {
						Class194 class194 = class194s[i];
						class194.method3652(-414885046);
					}
				}
				if (anInt2161 * 612421353 != -1)
					Class254.aClass217_2743.sendMusic(anInt2161 * 612421353, 255, (byte) 60);
			}
			client.anInt11071 = 872249282;
			Class145_Sub1.aClass523_Sub34_9522 = null;
			client.aBool11072 = false;
			if (-655720215 * anInt2155 > 0)
				Class486.method7941(Class572.aClass572_7679, -655720215 * anInt2155, -1, -886052652);
			Class112.method1945(452998539);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4223, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, 1524217148);
			client.aClass116_11058.method1974(class523_sub22, (byte) 92);
		}
	}

	public static void method3617() {
		Class110.aShort1333 = client.aShort11143;
		aShort2167 = client.aShort11205;
		aShort2165 = client.aShort11278;
		Class618.aShort8062 = client.aShort11020;
		aBool2164 = true;
		anInt2161 = Class254.aClass217_2743.method3912(-1593551838) * -403248807;
		if (-738440423 * anInt2163 != 0 && anInt2162 * -679794657 != 0) {
			client.aShort11278 = (short) 334;
			client.aShort11020 = (short) 334;
			client.aShort11205 = client.aShort11143 = (short) (anInt2163 * -124374528 / (anInt2162 * -679794657));
		}
	}

	Class191() throws Throwable {
		throw new Error();
	}

	public static void method3618(boolean bool) {
		if (-1616721887 * client.anInt11071 != 2 && client.anInt11071 * -1616721887 != 3) {
			if (!bool) {
				if (Class174.aClass194Array1855 != null) {
					Class194[] class194s = Class174.aClass194Array1855;
					for (int i = 0; i < class194s.length; i++) {
						Class194 class194 = class194s[i];
						class194.method3652(-354862130);
					}
				}
				if (anInt2161 * 612421353 != -1)
					Class254.aClass217_2743.sendMusic(anInt2161 * 612421353, 255, (byte) -31);
			}
			client.anInt11071 = 872249282;
			Class145_Sub1.aClass523_Sub34_9522 = null;
			client.aBool11072 = false;
			if (-655720215 * anInt2155 > 0)
				Class486.method7941(Class572.aClass572_7679, -655720215 * anInt2155, -1, -886052652);
			Class112.method1945(452998539);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4223, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -1241989162);
			client.aClass116_11058.method1974(class523_sub22, (byte) 29);
		}
	}

	public static void method3619() {
		aClass14_2160.method733(-1970858821);
		aClass708_2159.method14235((byte) -111);
		aClass204Array2168 = null;
		aClass192Array2157 = null;
		aClass190Array2158 = null;
		aClass206Array2166 = null;
		Class174.aClass194Array1855 = null;
		anInt2156 = -1078043049;
		anInt2162 = 0;
		anInt2163 = 0;
		Class481.aClass195_5474 = null;
		anInt2155 = -1159354201;
		anInt2161 = 403248807;
		if (aBool2164) {
			client.aShort11143 = Class110.aShort1333;
			client.aShort11205 = aShort2167;
			client.aShort11278 = aShort2165;
			client.aShort11020 = Class618.aShort8062;
			aBool2164 = false;
		}
	}

	public static void method3620(boolean bool) {
		if (-1616721887 * client.anInt11071 != 2 && client.anInt11071 * -1616721887 != 3) {
			if (!bool) {
				if (Class174.aClass194Array1855 != null) {
					Class194[] class194s = Class174.aClass194Array1855;
					for (int i = 0; i < class194s.length; i++) {
						Class194 class194 = class194s[i];
						class194.method3652(1667580571);
					}
				}
				if (anInt2161 * 612421353 != -1)
					Class254.aClass217_2743.sendMusic(anInt2161 * 612421353, 255, (byte) 7);
			}
			client.anInt11071 = 872249282;
			Class145_Sub1.aClass523_Sub34_9522 = null;
			client.aBool11072 = false;
			if (-655720215 * anInt2155 > 0)
				Class486.method7941(Class572.aClass572_7679, -655720215 * anInt2155, -1, -886052652);
			Class112.method1945(452998539);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4223, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -145714270);
			client.aClass116_11058.method1974(class523_sub22, (byte) 118);
		}
	}

	public static void method3621(boolean bool) {
		if (-1616721887 * client.anInt11071 != 2 && client.anInt11071 * -1616721887 != 3) {
			if (!bool) {
				if (Class174.aClass194Array1855 != null) {
					Class194[] class194s = Class174.aClass194Array1855;
					for (int i = 0; i < class194s.length; i++) {
						Class194 class194 = class194s[i];
						class194.method3652(444997972);
					}
				}
				if (anInt2161 * 612421353 != -1)
					Class254.aClass217_2743.sendMusic(anInt2161 * 612421353, 255, (byte) -46);
			}
			client.anInt11071 = 872249282;
			Class145_Sub1.aClass523_Sub34_9522 = null;
			client.aBool11072 = false;
			if (-655720215 * anInt2155 > 0)
				Class486.method7941(Class572.aClass572_7679, -655720215 * anInt2155, -1, -886052652);
			Class112.method1945(452998539);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4223, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -1029703277);
			client.aClass116_11058.method1974(class523_sub22, (byte) 39);
		}
	}

	static final void method3622(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -378323507);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class212.method3829(class250, class242, class669, (short) 16384);
	}

	static final void method3623(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = 10;
		byte[] is = { (byte) class669.anIntArray8557[1357652815 * class669.anInt8558] };
		byte[] is_2_ = { (byte) class669.anIntArray8557[1357652815 * class669.anInt8558 + 1] };
		Class600.method9880(class250, i_1_, is, is_2_, class669, -1581430539);
	}

	static final void method3624(Class669 class669, byte i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_3_, -660825378);
		Class650.method10623(class250, class669, 365525909);
	}

	static final void method3625(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub4_10625.method16774(-2032832407) == 2 ? 1 : 0;
	}

	public static void method3626(Class523_Sub34 class523_sub34, int i, int i_4_) {
		Class523_Sub30 class523_sub30 = new Class523_Sub30();
		class523_sub30.anInt10569 = class523_sub34.readUnsignedByte(-373003101) * 954280041;
		class523_sub30.anInt10570 = class523_sub34.readUnsignedInt((byte) -35) * -116260787;
		class523_sub30.anIntArray10565 = new int[-1434523687 * class523_sub30.anInt10569];
		class523_sub30.anIntArray10566 = new int[-1434523687 * class523_sub30.anInt10569];
		class523_sub30.aFieldArray10567 = new Field[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.anIntArray10568 = new int[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.aMethodArray10563 = new Method[class523_sub30.anInt10569 * -1434523687];
		class523_sub30.aByteArrayArrayArray10564 = new byte[-1434523687 * class523_sub30.anInt10569][][];
		for (int i_5_ = 0; i_5_ < -1434523687 * class523_sub30.anInt10569; i_5_++) {
			try {
				int i_6_ = class523_sub34.readUnsignedByte(-1244155324);
				if (i_6_ == 0 || 1 == i_6_ || i_6_ == 2) {
					String string = class523_sub34.readString(654428251);
					String string_7_ = class523_sub34.readString(36412813);
					int i_8_ = 0;
					if (i_6_ == 1)
						i_8_ = class523_sub34.readUnsignedInt((byte) -89);
					class523_sub30.anIntArray10565[i_5_] = i_6_;
					class523_sub30.anIntArray10568[i_5_] = i_8_;
					if (Class365.method6298(string, (byte) 86).getClassLoader() == null)
						throw new SecurityException();
					class523_sub30.aFieldArray10567[i_5_] = Class365.method6298(string, (byte) 83).getDeclaredField(string_7_);
				} else if (i_6_ == 3 || 4 == i_6_) {
					String string = class523_sub34.readString(-1633536718);
					String string_9_ = class523_sub34.readString(-621554935);
					int i_10_ = class523_sub34.readUnsignedByte(-1185243253);
					String[] strings = new String[i_10_];
					for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
						strings[i_11_] = class523_sub34.readString(362706688);
					String string_12_ = class523_sub34.readString(571435963);
					byte[][] is = new byte[i_10_][];
					if (i_6_ == 3) {
						for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
							int i_14_ = class523_sub34.readUnsignedInt((byte) -73);
							is[i_13_] = new byte[i_14_];
							class523_sub34.method16298(is[i_13_], 0, i_14_, (byte) -15);
						}
					}
					class523_sub30.anIntArray10565[i_5_] = i_6_;
					Class[] var_classes = new Class[i_10_];
					for (int i_15_ = 0; i_15_ < i_10_; i_15_++)
						var_classes[i_15_] = Class365.method6298(strings[i_15_], (byte) 99);
					Class var_class = Class365.method6298(string_12_, (byte) 77);
					if (Class365.method6298(string, (byte) 42).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class365.method6298(string, (byte) 64).getDeclaredMethods();
					Method[] methods_16_ = methods;
					for (int i_17_ = 0; i_17_ < methods_16_.length; i_17_++) {
						Method method = methods_16_[i_17_];
						if (method.getName().equals(string_9_)) {
							Class[] var_classes_18_ = method.getParameterTypes();
							if (var_classes_18_.length == var_classes.length) {
								boolean bool = true;
								for (int i_19_ = 0; i_19_ < var_classes.length; i_19_++) {
									if (var_classes[i_19_] != var_classes_18_[i_19_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									class523_sub30.aMethodArray10563[i_5_] = method;
							}
						}
					}
					class523_sub30.aByteArrayArrayArray10564[i_5_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class523_sub30.anIntArray10566[i_5_] = -1;
			} catch (SecurityException securityexception) {
				class523_sub30.anIntArray10566[i_5_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class523_sub30.anIntArray10566[i_5_] = -3;
			} catch (Exception exception) {
				class523_sub30.anIntArray10566[i_5_] = -4;
			} catch (Throwable throwable) {
				class523_sub30.anIntArray10566[i_5_] = -5;
			}
		}
		Class66.aClass708_791.method14236(class523_sub30, 240918901);
	}

	public static Class557 method3627(Socket socket, int i, byte i_20_) throws IOException {
		return new Class557_Sub1(socket, i);
	}
}
