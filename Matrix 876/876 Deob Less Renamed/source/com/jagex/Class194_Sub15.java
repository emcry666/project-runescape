/* Class194_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub15 extends Class194 {
	int anInt9932;
	int anInt9933;
	int anInt9934;
	int anInt9935;
	int anInt9936;

	public void method3657() {
		Class202.method3699(-518812431 * anInt9936, -319924423 * anInt9932, 876472499 * anInt9934, 100, 100, false, -1241690423);
		Class592.method9797(anInt9935 * 541828347, anInt9933 * -607387691, 0, (byte) 93);
		client.aBool11072 = true;
	}

	public void method3648(int i) {
		Class202.method3699(-518812431 * anInt9936, -319924423 * anInt9932, 876472499 * anInt9934, 100, 100, false, -1542037228);
		Class592.method9797(anInt9935 * 541828347, anInt9933 * -607387691, 0, (byte) 22);
		client.aBool11072 = true;
	}

	public void method3651() {
		Class202.method3699(-518812431 * anInt9936, -319924423 * anInt9932, 876472499 * anInt9934, 100, 100, false, -2011829507);
		Class592.method9797(anInt9935 * 541828347, anInt9933 * -607387691, 0, (byte) 30);
		client.aBool11072 = true;
	}

	Class194_Sub15(Class523_Sub34 class523_sub34) {
		super(class523_sub34);
		anInt9936 = class523_sub34.readUnsignedShort(-1513447404) * -84024303;
		anInt9934 = class523_sub34.readUnsignedShort(-1194223177) * -159447429;
		anInt9932 = class523_sub34.readUnsignedShort(-1127614415) * 1270834953;
		anInt9935 = class523_sub34.readUnsignedShort(-1656323355) * 96257587;
		anInt9933 = class523_sub34.readUnsignedShort(-1912822423) * 1110655357;
	}

	public void method3656() {
		Class202.method3699(-518812431 * anInt9936, -319924423 * anInt9932, 876472499 * anInt9934, 100, 100, false, -1972289100);
		Class592.method9797(anInt9935 * 541828347, anInt9933 * -607387691, 0, (byte) 14);
		client.aBool11072 = true;
	}

	public static final void method15517(int i, int i_0_) {
		if (null != Class673.aClass523_Sub19_8611 && (i >= 0 && i < (1969304563 * Class673.aClass523_Sub19_8611.anInt10486))) {
			Class338 class338 = Class673.aClass523_Sub19_8611.aClass338Array10485[i];
			if (class338.aByte3571 == -1) {
				Class116 class116 = Class537.method8941(-1016263614);
				Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4284, class116.aClass11_1413, 1370050649);
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(2 + Class6.method555(class338.aString3573, (byte) 43), 2072924993);
				class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i, (byte) -29);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16270(class338.aString3573, (byte) -52);
				class116.method1974(class523_sub22, (byte) 115);
			}
		}
	}

	static final void method15518(int i, byte i_1_) {
		int i_2_ = client.anInt11011 - client.anInt11266 * 1180243195;
		if (i_2_ >= 100) {
			Class562.anInt7564 = Class557.method9224(-1439702380) * 1258432249;
			Class59.anInt755 = 1325954419;
			Class697.anInt8764 = -763239385;
		} else {
			float f = 1.0F - ((float) ((100 - i_2_) * ((100 - i_2_) * (100 - i_2_))) / 1000000.0F);
			int i_3_;
			if (Class557.method9224(-1636123623) == 2) {
				Class523_Sub29 class523_sub29 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1484967625).method5763((byte) -45);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				Class678.anInt8639 = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5347(-2053846508) * 2607.5945876176133) & 0x3fff) * 1767382019;
				Class424.anInt4817 = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-2134396163) * -2607.5945876176133) & 0x3fff) * -1709276499;
				Class248.anInt2491 = 0;
				client.anInt11286 = (int) ((float) (1033181051 * Class91.anInt895) + (float) ((int) ((double) (77213907 * client.anInt11319) / (4.0 * (Math.tan((double) ((Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5358(-1482234491)) / 2.0F))))) - (1033181051 * (Class91.anInt895))) * f) * -1715881359;
				Class77.anInt858 = (int) ((float) (Class193.anInt2186 * -2105977633) + ((float) (class523_sub29.anInt10560 * -536626413 - class592.localX * 292859392 - Class193.anInt2186 * -2105977633) * f)) * -568385483;
				Class285.anInt3085 = (1059489463 * (int) ((float) (-1159490065 * Class525.anInt7089) + ((float) (-(400741225 * class523_sub29.anInt10559) - -1159490065 * Class525.anInt7089) * f)));
				Class497.anInt5563 = ((int) ((float) (Class28.anInt261 * -868862341) + f * (float) ((169299399 * class523_sub29.anInt10555) - class592.localY * 597568000 - Class28.anInt261 * -868862341)) * -1449377339);
				i_3_ = (-(325333285 * Class424.anInt4817) - 1508895851 * Class145_Sub1.anInt9523) & 0x3fff;
				if (i_3_ > 8192)
					i_3_ -= 16384;
				else if (i_3_ < -8192)
					i_3_ += 16384;
			} else {
				int i_4_ = (int) client.aFloat11214;
				if (1020478063 * client.anInt11199 >> 8 > i_4_)
					i_4_ = client.anInt11199 * 1020478063 >> 8;
				if (client.aBoolArray11269[4] && 128 + client.anIntArray11271[4] > i_4_)
					i_4_ = client.anIntArray11271[4] + 128;
				int i_5_ = ((client.anInt11091 * -2135173819 + (int) client.aFloat11129) & 0x3fff);
				Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
				Class597.method9847(Class21.anInt215 * 1996014845, (Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, (-860310981 * Class222.anInt2334), 1662534536) - 1912232329 * client.anInt11110), 1035887883 * Class194_Sub8.anInt9906, i_4_, i_5_, (i_4_ >> 3) * 3 + 600 << 2, i, 153871260);
				Class77.anInt858 = (-568385483 * (int) ((float) (Class193.anInt2186 * -2105977633) + ((float) (760427037 * Class77.anInt858 - Class193.anInt2186 * -2105977633) * f)));
				Class285.anInt3085 = (int) ((float) (Class525.anInt7089 * -1159490065) + f * (float) (805779207 * Class285.anInt3085 - (Class525.anInt7089 * -1159490065))) * 1059489463;
				Class497.anInt5563 = (-1449377339 * (int) ((float) (Class28.anInt261 * -868862341) + f * (float) (-1221225203 * Class497.anInt5563 - (Class28.anInt261 * -868862341))));
				Class678.anInt8639 = (1767382019 * (int) ((float) (895639765 * Class74.anInt815) + f * (float) (1555328683 * Class678.anInt8639 - (895639765 * Class74.anInt815))));
				i_3_ = (325333285 * Class424.anInt4817 - 1508895851 * Class145_Sub1.anInt9523);
				if (i_3_ > 8192)
					i_3_ -= 16384;
				else if (i_3_ < -8192)
					i_3_ += 16384;
			}
			Class424.anInt4817 = (int) ((float) (Class145_Sub1.anInt9523 * 1508895851) + f * (float) i_3_) * -1709276499;
			Class424.anInt4817 = (Class424.anInt4817 * 325333285 & 0x3fff) * -1709276499;
			client.anInt11286 = (-1715881359 * (int) ((float) (1033181051 * Class91.anInt895) + (float) (client.anInt11286 * -1438988655 - 1033181051 * Class91.anInt895) * f));
		}
	}
}
