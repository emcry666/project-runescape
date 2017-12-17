/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class245 {
	public static Class245 method4380(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(-754528658);
		if (i == 0)
			return null;
		i--;
		class523_sub34.anInt10661 += 189765723;
		int i_0_ = class523_sub34.readUnsignedInt((byte) -52);
		Object[] objects = new Object[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			int i_2_ = class523_sub34.readUnsignedByte(-1791400773);
			if (i_2_ == 0)
				objects[i_1_] = Class474.method7745(java.lang.Integer.class, 1482870554).method65(class523_sub34, -721285210);
			else if (i_2_ == 1)
				objects[i_1_] = Class474.method7745(java.lang.String.class, 1569046205).method65(class523_sub34, -721285210);
			else
				throw new IllegalStateException(new StringBuilder().append("Unrecognised type ID in deserialise: ").append(i_2_).toString());
		}
		return new Class245(i_0_, objects);
	}

	public static Class245 method4381(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(2059831398);
		if (i == 0)
			return null;
		i--;
		class523_sub34.anInt10661 += 189765723;
		int i_3_ = class523_sub34.readUnsignedInt((byte) -90);
		Object[] objects = new Object[i];
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			int i_5_ = class523_sub34.readUnsignedByte(-1946540633);
			if (i_5_ == 0)
				objects[i_4_] = Class474.method7745(java.lang.Integer.class, 1569824985).method65(class523_sub34, -721285210);
			else if (i_5_ == 1)
				objects[i_4_] = Class474.method7745(java.lang.String.class, 1882296159).method65(class523_sub34, -721285210);
			else
				throw new IllegalStateException(new StringBuilder().append("Unrecognised type ID in deserialise: ").append(i_5_).toString());
		}
		return new Class245(i_3_, objects);
	}

	Class245(int i, Object[] objects) {
		/* empty */
	}

	static void method4382(byte i) {
		if (null != Class54.aClass62_729) {
			try {
				int i_6_;
				if (0 == Class54.anInt732 * 141292935)
					i_6_ = 250;
				else
					i_6_ = 2000;
				Class54.anInt731 += 1958688835;
				if (-1764436885 * Class54.anInt731 > i_6_)
					Class508.method8502(1825546770);
				if (Class62.aClass62_771 == Class54.aClass62_729) {
					client.aClass116_11057.method1976(Class191.method3627(Class6.aClass1_42.method502(-2146088526), 40000, (byte) 0), Class6.aClass1_42.aString9, 1161573605);
					client.aClass116_11057.method1998(2071852387);
					Class523_Sub22 class523_sub22 = Class493.method8087(935846464);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1752807475 * Class406.aClass406_4192.anInt4190, -1526052387);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -110);
					int i_7_ = 2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(876, (byte) -61);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(1, (byte) -20);
					Class54.anIntArray726 = Class51.method1284(class523_sub22, -463443429);
					int i_8_ = 2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16270(client.aString11001, (byte) 10);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt10984 * 1778108951, (byte) -74);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(503698129 * client.anInt10988, -1929573742);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(742099907 * client.anInt10987, -1492912650);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16270(Class312_Sub2_Sub1.aString11593, (byte) -10);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class53_Sub20.aClass668_10979.method82(), 604181936);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1884825957 * client.aClass681_11284.anInt8648, 456665981);
					Class289.method5204((class523_sub22.aClass523_Sub34_Sub2_10525), -276541507);
					String string = client.aString11112;
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string == null ? 0 : 1, -346887280);
					if (string != null)
						class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -34);
					Class218.aClass523_Sub41_2319.method16565(class523_sub22.aClass523_Sub34_Sub2_10525, 1599666378);
					class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 1328360061;
					class523_sub22.aClass523_Sub34_Sub2_10525.method16263(Class54.anIntArray726, i_8_, (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011), (byte) 107);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16275(2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i_7_, -256764084);
					client.aClass116_11057.method1974(class523_sub22, (byte) 111);
					client.aClass116_11057.method1973(1512049308);
					Class54.aClass62_729 = Class62.aClass62_770;
				}
				if (Class54.aClass62_729 == Class62.aClass62_770) {
					if (client.aClass116_11057.method1979(782493095) == null)
						Class508.method8502(1825546770);
					else if (client.aClass116_11057.method1979(782493095).method9199(1, 1509511606)) {
						client.aClass116_11057.method1979(782493095).method9201((client.aClass116_11057.aClass523_Sub34_Sub2_1431.aByteArray10658), 0, 1, (short) 26499);
						Class54.aClass711_730 = ((Class711) Class334.method5910(Class554.method9172(-598626950), ((client.aClass116_11057.aClass523_Sub34_Sub2_1431.aByteArray10658[0]) & 0xff), 2085061289));
						if (Class54.aClass711_730 == Class711.aClass711_8851) {
							client.aClass116_11057.aClass11_1413 = new Class11(Class54.anIntArray726);
							int[] is = new int[4];
							for (int i_9_ = 0; i_9_ < 4; i_9_++)
								is[i_9_] = 50 + Class54.anIntArray726[i_9_];
							client.aClass116_11057.aClass11_1420 = new Class11(is);
							new Class11(is);
							client.aClass116_11057.aClass523_Sub34_Sub2_1431.method18218(client.aClass116_11057.aClass11_1420, 380758988);
							Class657.method10791(11, (byte) -2);
							client.aClass116_11057.method1998(1681440368);
							client.aClass116_11057.aClass523_Sub34_Sub2_1431.anInt10661 = 0;
							client.aClass116_11057.aClass409_1417 = null;
							client.aClass116_11057.aClass409_1430 = null;
							client.aClass116_11057.aClass409_1426 = null;
							client.aClass116_11057.anInt1423 = 0;
							Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9755(1879915227);
							Class493.method8089(-1744823020);
						} else
							client.aClass116_11057.method1980((short) -17147);
						client.aClass116_11057.currentPacket = null;
						Class54.aClass62_729 = null;
					}
				}
			} catch (IOException ioexception) {
				Class508.method8502(1825546770);
			}
		}
	}

	public static float method4383(Class440 class440, int i) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
		class437.method6949();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (float) d;
	}
}
