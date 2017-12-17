/* Class683 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class683 {
	public static short[] method13860(short[] is) {
		if (is == null)
			return null;
		short[] is_0_ = new short[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	public static byte[] method13861(byte[] is) {
		if (null == is)
			return null;
		byte[] is_1_ = new byte[is.length];
		System.arraycopy(is, 0, is_1_, 0, is.length);
		return is_1_;
	}

	public static byte[] method13862(byte[] is) {
		if (null == is)
			return null;
		byte[] is_2_ = new byte[is.length];
		System.arraycopy(is, 0, is_2_, 0, is.length);
		return is_2_;
	}

	public static short[] method13863(short[] is) {
		if (is == null)
			return null;
		short[] is_3_ = new short[is.length];
		System.arraycopy(is, 0, is_3_, 0, is.length);
		return is_3_;
	}

	Class683() throws Throwable {
		throw new Error();
	}

	public static void method13864(boolean bool, byte[] is, int i) {
		if (Class251.aClass523_Sub34_2717 == null)
			Class251.aClass523_Sub34_2717 = new RSBuffer(20000);
		Class251.aClass523_Sub34_2717.readBytes(is, 0, is.length, (short) -24242);
		if (bool) {
			Class77.method1544(Class251.aClass523_Sub34_2717.buffer, (byte) -56);
			Class6.aClass611_Sub1Array47 = new Class611_Sub1[2004567773 * Class595.anInt7827];
			int i_4_ = 0;
			for (int i_5_ = Class687_Sub25.anInt10886 * -2074972287; i_5_ <= 615132109 * Class595.anInt7824; i_5_++) {
				Class611_Sub1 class611_sub1 = Class417.method6657(i_5_, 1609461724);
				if (null != class611_sub1)
					Class6.aClass611_Sub1Array47[i_4_++] = class611_sub1;
			}
			Class6.aBool43 = false;
			Class228.aLong2349 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 1454622044886850051L;
			Class251.aClass523_Sub34_2717 = null;
		}
	}

	static void method13865(Class178 class178, int i, int i_6_, int i_7_, int i_8_, int i_9_, Class164 class164, Class10 class10, String string, int i_10_) {
		int i_11_ = (255 - Class529.anInt7121 * -1304274901 - 597769683 * Class36.anInt351);
		if (i_11_ < 0)
			i_11_ = 0;
		if (Class418.aClass148_4696 == null || null == Class687_Sub14.aClass148_10858) {
			if (Class523_Sub8.aClass472_10406.method7650(616625835 * Class53.anInt724, -1143613037) && Class523_Sub8.aClass472_10406.method7650((1112737405 * (Class184.anInt2126)), 1413944102)) {
				Class418.aClass148_4696 = (class178.method3104(Class166.method2658(Class523_Sub8.aClass472_10406, Class53.anInt724 * 616625835, 0), true));
				Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, Class184.anInt2126 * 1112737405, 0);
				Class687_Sub14.aClass148_10858 = class178.method3104(class175, true);
				class175.method2956();
				Class78.aClass148_863 = class178.method3104(class175, true);
			} else
				class178.method3193(i, i_6_, i_7_, i_9_, (i_11_ << 24 | 809657313 * Class381.anInt3952), 1);
		}
		if (null != Class418.aClass148_4696 && null != Class687_Sub14.aClass148_10858) {
			int i_12_ = ((i_7_ - Class687_Sub14.aClass148_10858.method2504() * 2) / Class418.aClass148_4696.method2504());
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				Class418.aClass148_4696.method2435((i + Class687_Sub14.aClass148_10858.method2504() + i_13_ * Class418.aClass148_4696.method2504()), i_6_);
			Class687_Sub14.aClass148_10858.method2435(i, i_6_);
			Class78.aClass148_863.method2435(i + i_7_ - Class78.aClass148_863.method2504(), i_6_);
		}
		class164.method2635(string, 3 + i, ((20 - -1669009881 * class10.anInt76) / 2 + (i_6_ + class10.anInt76 * -1669009881)), (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), -1, (byte) 62);
		class178.method3193(i, i_6_ + i_9_, i_7_, i_8_ - i_9_, i_11_ << 24 | Class381.anInt3952 * 809657313, 1);
	}

	public static Class574 method13866(RSBuffer class523_sub34, int i) {
		int i_14_ = class523_sub34.readUnsignedByte(1753243518);
		int[] is = new int[i_14_];
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
			is[i_15_] = class523_sub34.readUnsignedByte(559890960);
		return new Class574(is);
	}
}
