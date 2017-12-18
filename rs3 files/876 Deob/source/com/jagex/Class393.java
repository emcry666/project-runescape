/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class393 {
	public static Class393 aClass393_4038;
	public static Class393 aClass393_4039 = new Class393(8);
	public static Class393 aClass393_4040;
	static Class393 aClass393_4041;
	public static Class393 aClass393_4042 = new Class393(16);
	public int anInt4043;

	Class393(int i) {
		anInt4043 = 1288800795 * i;
	}

	static {
		aClass393_4040 = new Class393(8);
		aClass393_4038 = new Class393(16);
		aClass393_4041 = new Class393(32);
	}

	public static Class382 method6493(RSBuffer class523_sub34, int i) {
		Class380 class380 = (Class228.method4175(-1065267348)[class523_sub34.readUnsignedByte(1277521723)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(-1511623329)]);
		int i_0_ = class523_sub34.readShort(887138201);
		int i_1_ = class523_sub34.readShort(751645071);
		int i_2_ = class523_sub34.readBigSmart((byte) -109);
		int i_3_ = class523_sub34.readUnsignedInt((byte) -120);
		int i_4_ = class523_sub34.readUnsignedByte(-333102893);
		return new Class382(class380, class389, i_0_, i_1_, i_2_, i_3_, i_4_);
	}

	static final void method6494(Class669 class669, byte i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_5_, -1487075135);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2577 * 1376491541;
	}

	static final void method6495(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_6_ >> 28;
	}

	public static final void method6496(byte i) {
		if (-1 != client.anInt11116 * -1160807977 && -836108237 * client.anInt11103 != -1) {
			int i_7_ = (277780567 * client.anInt11121 + (((client.anInt11056 * 1963025197 - client.anInt11121 * 277780567) * (client.anInt11120 * 1714712881)) >> 16));
			client.anInt11120 += i_7_ * 1706772433;
			if (client.anInt11120 * 1714712881 >= 65535) {
				client.anInt11120 = -501893073;
				if (!client.aBool11124)
					client.aBool11123 = true;
				else
					client.aBool11123 = false;
				client.aBool11124 = true;
			} else {
				client.aBool11123 = false;
				client.aBool11124 = false;
			}
			float f = (float) (1714712881 * client.anInt11120) / 65535.0F;
			float[] fs = new float[3];
			int i_8_ = client.anInt11026 * 121777722;
			for (int i_9_ = 0; i_9_ < 3; i_9_++) {
				int i_10_ = ((client.anIntArrayArrayArray11115[client.anInt11116 * -1160807977][i_8_][i_9_]) * 3);
				int i_11_ = 3 * (client.anIntArrayArrayArray11115[client.anInt11116 * -1160807977][i_8_ + 1][i_9_]);
				int i_12_ = 3 * ((client.anIntArrayArrayArray11115[client.anInt11116 * -1160807977][i_8_ + 2][i_9_]) - ((client.anIntArrayArrayArray11115[client.anInt11116 * -1160807977][i_8_ + 3][i_9_]) - (client.anIntArrayArrayArray11115[-1160807977 * client.anInt11116][i_8_ + 2][i_9_])));
				int i_13_ = (client.anIntArrayArrayArray11115[-1160807977 * client.anInt11116][i_8_][i_9_]);
				int i_14_ = i_11_ - i_10_;
				int i_15_ = i_10_ - i_11_ * 2 + i_12_;
				int i_16_ = i_11_ + ((client.anIntArrayArrayArray11115[-1160807977 * client.anInt11116][i_8_ + 2][i_9_]) - i_13_) - i_12_;
				fs[i_9_] = (f * ((float) i_14_ + (f * (float) i_16_ + (float) i_15_) * f) + (float) i_13_);
			}
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			Class77.anInt858 = ((int) fs[0] - 292859392 * class592.localX) * -568385483;
			Class285.anInt3085 = -1059489463 * (int) fs[1];
			Class497.anInt5563 = -1449377339 * ((int) fs[2] - 597568000 * class592.localY);
			float[] fs_17_ = new float[3];
			int i_18_ = client.anInt11292 * -825033166;
			for (int i_19_ = 0; i_19_ < 3; i_19_++) {
				int i_20_ = 3 * (client.anIntArrayArrayArray11115[-836108237 * client.anInt11103][i_18_][i_19_]);
				int i_21_ = ((client.anIntArrayArrayArray11115[client.anInt11103 * -836108237][i_18_ + 1][i_19_]) * 3);
				int i_22_ = 3 * ((client.anIntArrayArrayArray11115[client.anInt11103 * -836108237][i_18_ + 2][i_19_]) - ((client.anIntArrayArrayArray11115[-836108237 * client.anInt11103][i_18_ + 3][i_19_]) - (client.anIntArrayArrayArray11115[-836108237 * client.anInt11103][2 + i_18_][i_19_])));
				int i_23_ = (client.anIntArrayArrayArray11115[-836108237 * client.anInt11103][i_18_][i_19_]);
				int i_24_ = i_21_ - i_20_;
				int i_25_ = i_22_ + (i_20_ - 2 * i_21_);
				int i_26_ = ((client.anIntArrayArrayArray11115[client.anInt11103 * -836108237][2 + i_18_][i_19_]) - i_23_ + i_21_ - i_22_);
				fs_17_[i_19_] = (((float) i_26_ * f + (float) i_25_) * f + (float) i_24_) * f + (float) i_23_;
			}
			float f_27_ = fs_17_[0] - fs[0];
			float f_28_ = (fs_17_[1] - fs[1]) * -1.0F;
			float f_29_ = fs_17_[2] - fs[2];
			double d = Math.sqrt((double) (f_27_ * f_27_ + f_29_ * f_29_));
			Class678.anInt8639 = ((int) (Math.atan2((double) f_28_, d) * 2607.5945876176133) & 0x3fff) * 1767382019;
			Class424.anInt4817 = ((int) (-Math.atan2((double) f_27_, (double) f_29_) * 2607.5945876176133) & 0x3fff) * -1709276499;
			TimeUtils.anInt2491 = (-1053422769 * ((client.anIntArrayArrayArray11115[-1160807977 * client.anInt11116][i_8_][3]) + ((((client.anIntArrayArrayArray11115[-1160807977 * client.anInt11116][2 + i_8_][3]) - (client.anIntArrayArrayArray11115[client.anInt11116 * -1160807977][i_8_][3])) * (client.anInt11120 * 1714712881)) >> 16)));
		}
	}

	static int method6497(byte[] is, int i, int i_30_, int i_31_) {
		int i_32_ = -1;
		for (int i_33_ = i; i_33_ < i_30_; i_33_++)
			i_32_ = i_32_ >>> 8 ^ (RSBuffer.anIntArray10660[(i_32_ ^ is[i_33_]) & 0xff]);
		i_32_ ^= 0xffffffff;
		return i_32_;
	}

	static final void method6498(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class65.method1436(class250, class242, class669, (byte) 12);
	}
}
