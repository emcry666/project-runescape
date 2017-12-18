/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class13 {
	static int anInt173;

	static byte[] method723(File file, int i) {
		byte[] is;
		try {
			byte[] is_0_ = new byte[i];
			Class170.method2888(file, is_0_, i, -1557693442);
			is = is_0_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	static void method724(File file, byte[] is, int i) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	static void method725(File file, byte[] is, int i) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	Class13() throws Throwable {
		throw new Error();
	}

	static byte[] method726(File file, int i) {
		byte[] is;
		try {
			byte[] is_1_ = new byte[i];
			Class170.method2888(file, is_1_, i, 223169705);
			is = is_1_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	static byte[] method727(File file, int i) {
		byte[] is;
		try {
			byte[] is_2_ = new byte[i];
			Class170.method2888(file, is_2_, i, -517615619);
			is = is_2_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	static byte[] method728(File file, int i) {
		byte[] is;
		try {
			byte[] is_3_ = new byte[i];
			Class170.method2888(file, is_3_, i, 1327880210);
			is = is_3_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	static byte[] method729(File file, int i) {
		byte[] is;
		try {
			byte[] is_4_ = new byte[i];
			Class170.method2888(file, is_4_, i, 221365400);
			is = is_4_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	public static byte[] method730(File file) {
		return Class222.method4139(file, (int) file.length(), (byte) -95);
	}

	static final int method731(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int i) {
		if (0 == class647_sub1_sub3_sub1.anInt11922 * -1196321099)
			return 0;
		if (class647_sub1_sub3_sub1.faceEntityId * -344760681 != -1) {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1_5_ = null;
			if (-344760681 * class647_sub1_sub3_sub1.faceEntityId < 32768) {
				Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.getFromIndex((long) (-344760681 * class647_sub1_sub3_sub1.faceEntityId))));
				if (null != class523_sub28)
					class647_sub1_sub3_sub1_5_ = ((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554);
			} else if (class647_sub1_sub3_sub1.faceEntityId * -344760681 >= 32768)
				class647_sub1_sub3_sub1_5_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[(-344760681 * class647_sub1_sub3_sub1.faceEntityId - 32768)]);
			if (null != class647_sub1_sub3_sub1_5_) {
				Class437 class437 = Class437.method6932((class647_sub1_sub3_sub1.method10569().aClass437_4862), class647_sub1_sub3_sub1_5_.method10569().aClass437_4862);
				int i_6_ = (int) class437.aFloat4903;
				int i_7_ = (int) class437.aFloat4905;
				if (i_6_ != 0 || 0 != i_7_)
					class647_sub1_sub3_sub1.method18331((int) (Math.atan2((double) i_6_, (double) i_7_) * 2607.5945876176133) & 0x3fff, 556915536);
			}
		}
		if (class647_sub1_sub3_sub1 instanceof Player) {
			Player class647_sub1_sub3_sub1_sub2 = (Player) class647_sub1_sub3_sub1;
			if (-1 != -1693078911 * class647_sub1_sub3_sub1_sub2.direction && (0 == class647_sub1_sub3_sub1_sub2.stepsCount * 703205765 || (-1371134239 * class647_sub1_sub3_sub1_sub2.anInt11945 > 0))) {
				class647_sub1_sub3_sub1_sub2.method18331(-1693078911 * class647_sub1_sub3_sub1_sub2.direction, 2133596640);
				class647_sub1_sub3_sub1_sub2.direction = 505899647;
			}
		} else if (class647_sub1_sub3_sub1 instanceof NPC) {
			NPC class647_sub1_sub3_sub1_sub1 = (NPC) class647_sub1_sub3_sub1;
			if (-1 != -801767035 * class647_sub1_sub3_sub1_sub1.anInt12161 && (0 == 703205765 * class647_sub1_sub3_sub1_sub1.stepsCount || (class647_sub1_sub3_sub1_sub1.anInt11945 * -1371134239 > 0))) {
				Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_8_ = ((int) class437.aFloat4903 - (class647_sub1_sub3_sub1_sub1.anInt12161 * 906069248 - class592.localX * 146429696 - class592.localX * 146429696));
				int i_9_ = ((int) class437.aFloat4905 - (1787952384 * class647_sub1_sub3_sub1_sub1.anInt12162 - class592.localY * -1848699648 - class592.localY * -1848699648));
				if (i_8_ != 0 || 0 != i_9_)
					class647_sub1_sub3_sub1_sub1.method18331((int) (Math.atan2((double) i_8_, (double) i_9_) * 2607.5945876176133) & 0x3fff, 1659094571);
				class647_sub1_sub3_sub1_sub1.anInt12161 = -1973145421;
			}
		}
		return class647_sub1_sub3_sub1.method18333(653631135);
	}

	static final void method732(Class669 class669, int i) {
		Class385.method6449((byte) -94);
	}
}
