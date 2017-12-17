/* Class26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class26_Sub1 extends Class26 implements Interface66 {
	public void method210(int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4205, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(2027275611 * anInt249, -259319059);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(-703503131 * anInt247, -159492164);
		int i_0_ = (aBool254 ? 2 : 0) | (aBool253 ? 1 : 0);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(i_0_, -159492164);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(1224073077 * anInt250, -159492164);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(-1296030611 * anInt248, -855333424);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(2121531435 * anInt252, -159492164);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(anInt255 * 1314177019, (byte) 1);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(-380121613 * anInt251, (byte) 8);
		client.aClass116_11058.method1974(class523_sub22, (byte) 56);
	}

	Class26_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_, int i_7_) {
		super(i, i_1_, i_2_ > 65535 ? 65535 : i_2_, i_3_, i_4_ > 255 ? 255 : i_4_, i_5_, bool, bool_6_, i_7_ > 255 ? 255 : i_7_);
	}

	public void method292() {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4205, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(2027275611 * anInt249, -794073469);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(-703503131 * anInt247, -159492164);
		int i = (aBool254 ? 2 : 0) | (aBool253 ? 1 : 0);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(i, -159492164);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(1224073077 * anInt250, -159492164);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(-1296030611 * anInt248, -694891127);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(2121531435 * anInt252, -159492164);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(anInt255 * 1314177019, (byte) 1);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(-380121613 * anInt251, (byte) 14);
		client.aClass116_11058.method1974(class523_sub22, (byte) 118);
	}

	static Class523_Sub34 method16508(int i) {
		Class523_Sub34 class523_sub34 = Class608.method9988((byte) 0);
		long l;
		if (Class43.anInt572 * 426956199 != -1)
			l = (long) (426956199 * Class43.anInt572);
		else if (Class43.aLong573 * -529544860571826659L == -1L)
			l = Class388.method6472(Class43.aString603, 2143159130);
		else
			l = -529544860571826659L * Class43.aLong573;
		Class176.aLong1857 = -7143280088934120475L * l;
		Class263.method4739(class523_sub34, l);
		class523_sub34.method16270(Class43.aString594, (byte) 32);
		class523_sub34.method16441(Class43.aLong577 * 505450044301663391L);
		class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
		class523_sub34.method16311(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
		return class523_sub34;
	}
}
