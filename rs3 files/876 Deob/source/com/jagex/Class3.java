/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class3 implements Interface75 {
	public int anInt27;
	public static Class3 aClass3_28 = new Class3(0, 0);
	public static Class3 aClass3_29 = new Class3(1, 1);
	public static Class3 aClass3_30;
	public static Class3 aClass3_31 = new Class3(3, 2);
	int anInt32;
	static int[] anIntArray33;

	Class3(int i, int i_0_) {
		anInt27 = i * -1312276497;
		anInt32 = -1248848983 * i_0_;
	}

	public int method82() {
		return 879378585 * anInt32;
	}

	static {
		aClass3_30 = new Class3(2, 3);
	}

	public int method6() {
		return 879378585 * anInt32;
	}

	public int method101() {
		return 879378585 * anInt32;
	}

	static final void decodeUpdateInformation(int i, int i_1_) {
		RSBitBuffer buffer = client.aClass116_11058.updateBuffer;
		while (buffer.method18226(-1372959327 * (client.aClass116_11058.anInt1421), -2083663091) >= 15) {
			int i_2_ = buffer.readBits(15, -1037587087);
			if (32767 == i_2_)
				break;
			boolean bool = false;
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_2_));
			if (class523_sub28 == null) {
				NPC class647_sub1_sub3_sub1_sub1 = (new NPC(client.aClass505_11019.method8241((byte) -3)));
				class647_sub1_sub3_sub1_sub1.anInt11888 = -1926162379 * i_2_;
				class523_sub28 = new Class523_Sub28(class647_sub1_sub3_sub1_sub1);
				client.aClass14_11047.method738(class523_sub28, (long) i_2_);
				client.aClass523_Sub28Array11195[(client.anInt11049 += 175334877) * -1359865227 - 1] = class523_sub28;
				bool = true;
			}
			NPC class647_sub1_sub3_sub1_sub1 = (NPC) class523_sub28.anObject10554;
			client.anIntArray11051[(client.anInt11050 += -1774433747) * 920163749 - 1] = i_2_;
			class647_sub1_sub3_sub1_sub1.anInt11916 = client.anInt11054 * -1449978387;
			if (null != class647_sub1_sub3_sub1_sub1.aClass300_12175 && class647_sub1_sub3_sub1_sub1.aClass300_12175.method5492((byte) -21))
				Class297.method5306(class647_sub1_sub3_sub1_sub1, (short) -11147);
			int plane = buffer.readBits(2, -1567305279);
			int coordY = buffer.readBits(i, 1212080152);
			if (coordY > (1 << i - 1) - 1)
				coordY -= 1 << i;
			int isTeleported = buffer.readBits(1, -579622315);
			int direction = (buffer.readBits(3, 1514256489) + 4 << 11 & 0x3fff);
			class647_sub1_sub3_sub1_sub1.method18622((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(buffer.readBits(15, 590150685), (byte) 30)), -65534);
			int coordX = buffer.readBits(i, -1006487125);
			if (coordX > (1 << i - 1) - 1)
				coordX -= 1 << i;
			int needUpdate = buffer.readBits(1, 1171448647);
			if (1 == needUpdate)
				client.anIntArray11053[(client.anInt11052 += 2047749803) * 724589571 - 1] = i_2_;
			class647_sub1_sub3_sub1_sub1.method18344((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260 * 1610497933), 1677688325);
			class647_sub1_sub3_sub1_sub1.anInt11922 = 876423069 * (486429345 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3285) << 3);
			if (bool)
				class647_sub1_sub3_sub1_sub1.method18332(direction, true, 1958307138);
			class647_sub1_sub3_sub1_sub1.method18626(plane, coordX + (Class241.player.screenX[0]), (Class241.player.screenY[0]) + coordY, 1 == isTeleported, class647_sub1_sub3_sub1_sub1.method18338(2141932020), 1651531807);
			if (class647_sub1_sub3_sub1_sub1.aClass300_12175.method5492((byte) -57))
				Class451.method7292(class647_sub1_sub3_sub1_sub1.aByte10821, (class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), 0, null, class647_sub1_sub3_sub1_sub1, null, 1627365612);
			if (bool)
				class647_sub1_sub3_sub1_sub1.method18620(-1193771399);
		}
		buffer.method18232(-1605752964);
	}

	static void method519(byte i) {
		Class111.aClass209_1340.method3773(-1890261790);
	}
}
