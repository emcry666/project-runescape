/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class115 {
	public int anInt1406;
	public String aString1407;
	public String aString1408;
	public String aString1409;
	String aString1410;
	public byte aByte1411;
	public static Class53_Sub20 aClass53_Sub20_1412;

	Class115() {
		/* empty */
	}

	static final void method1968(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.aBoolArray3523[i_0_] ? 1 : 0;
	}

	static final void method1969(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub11_10621.method13890(i_1_, 1981164266);
	}

	public static void method1970(int i, String string, byte i_2_) {
		int i_3_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		boolean bool = false;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_4_]];
			if (null != class647_sub1_sub3_sub1_sub2 && (class647_sub1_sub3_sub1_sub2 != Class241.player) && null != class647_sub1_sub3_sub1_sub2.username && class647_sub1_sub3_sub1_sub2.username.equalsIgnoreCase(string)) {
				OutgoingPacket class408 = null;
				if (i == 1)
					class408 = OutgoingPacket.aClass408_4304;
				else if (i == 2)
					class408 = OutgoingPacket.aClass408_4206;
				else if (3 == i)
					class408 = OutgoingPacket.aClass408_4273;
				else if (4 == i)
					class408 = OutgoingPacket.aClass408_4221;
				else if (5 == i)
					class408 = OutgoingPacket.aClass408_4303;
				else if (i == 6)
					class408 = OutgoingPacket.aClass408_4271;
				else if (7 == i)
					class408 = OutgoingPacket.aClass408_4234;
				else if (8 == i)
					class408 = OutgoingPacket.aClass408_4258;
				else if (i == 9)
					class408 = OutgoingPacket.aClass408_4230;
				else if (i == 10)
					class408 = OutgoingPacket.aClass408_4305;
				if (null != class408) {
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(0, -159492164);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(is[i_4_], (byte) 63);
					client.aClass116_11058.method1974(class523_sub22, (byte) 53);
				}
				bool = true;
				break;
			}
		}
		if (!bool)
			Class214.method3840(4, new StringBuilder().append(Class39.aClass39_444.method1124(Class53_Sub20.aClass668_10979, (byte) -126)).append(string).toString(), 2034016392);
	}
}
