/* Class194_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub19 extends Class194 {
	int anInt9947;
	int anInt9948;
	int anInt9949;
	int anInt9950;
	int anInt9951;
	int anInt9952;
	public static Class532 aClass532_9953;

	public void method3656() {
		Class191.aClass204Array2168[-687770195 * anInt9949].method3706(0, -1848850913);
		Class191.aClass204Array2168[1387789793 * anInt9948].method3706(1, -1845489489);
		client.anInt11116 = 0;
		client.anInt11026 = -113348465 * anInt9950;
		client.anInt11120 = 0;
		client.anInt11121 = anInt9951 * 623467563;
		client.anInt11056 = -547727571 * anInt9952;
		client.anInt11103 = -1528759557;
		client.anInt11292 = 596717771 * anInt9947;
		Class562.anInt7564 = 738761700;
		Class393.method6496((byte) -13);
		client.aBool11072 = true;
	}

	public void method3648(int i) {
		Class191.aClass204Array2168[-687770195 * anInt9949].method3706(0, -927441549);
		Class191.aClass204Array2168[1387789793 * anInt9948].method3706(1, -975661379);
		client.anInt11116 = 0;
		client.anInt11026 = -113348465 * anInt9950;
		client.anInt11120 = 0;
		client.anInt11121 = anInt9951 * 623467563;
		client.anInt11056 = -547727571 * anInt9952;
		client.anInt11103 = -1528759557;
		client.anInt11292 = 596717771 * anInt9947;
		Class562.anInt7564 = 738761700;
		Class393.method6496((byte) -39);
		client.aBool11072 = true;
	}

	public void method3651() {
		Class191.aClass204Array2168[-687770195 * anInt9949].method3706(0, -857704826);
		Class191.aClass204Array2168[1387789793 * anInt9948].method3706(1, -323202569);
		client.anInt11116 = 0;
		client.anInt11026 = -113348465 * anInt9950;
		client.anInt11120 = 0;
		client.anInt11121 = anInt9951 * 623467563;
		client.anInt11056 = -547727571 * anInt9952;
		client.anInt11103 = -1528759557;
		client.anInt11292 = 596717771 * anInt9947;
		Class562.anInt7564 = 738761700;
		Class393.method6496((byte) -16);
		client.aBool11072 = true;
	}

	Class194_Sub19(RSBuffer class523_sub34) {
		super(class523_sub34);
		anInt9949 = class523_sub34.readUnsignedShort(-1393612830) * 1237693989;
		anInt9948 = class523_sub34.readUnsignedShort(-1729498519) * -822802911;
		anInt9950 = class523_sub34.readUnsignedShort(-425042412) * -504428037;
		anInt9947 = class523_sub34.readUnsignedShort(-92548411) * 1047633755;
		anInt9951 = class523_sub34.readUnsignedShort(-901031261) * 1383300021;
		anInt9952 = class523_sub34.readUnsignedShort(-1627358904) * 719826521;
	}

	public void method3657() {
		Class191.aClass204Array2168[-687770195 * anInt9949].method3706(0, -442281080);
		Class191.aClass204Array2168[1387789793 * anInt9948].method3706(1, -1759211551);
		client.anInt11116 = 0;
		client.anInt11026 = -113348465 * anInt9950;
		client.anInt11120 = 0;
		client.anInt11121 = anInt9951 * 623467563;
		client.anInt11056 = -547727571 * anInt9952;
		client.anInt11103 = -1528759557;
		client.anInt11292 = 596717771 * anInt9947;
		Class562.anInt7564 = 738761700;
		Class393.method6496((byte) -74);
		client.aBool11072 = true;
	}

	static final int method15523(int i, int i_0_, byte i_1_) {
		int i_2_ = 57 * i_0_ + i;
		i_2_ = i_2_ << 13 ^ i_2_;
		int i_3_ = (1376312589 + (789221 + 15731 * (i_2_ * i_2_)) * i_2_ & 0x7fffffff);
		return i_3_ >> 19 & 0xff;
	}

	static void method15524(Class523_Sub22 class523_sub22, int i, int i_4_, int i_5_, int i_6_) {
		class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(i, 779694018);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_4_, (byte) 74);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_5_, (byte) 36);
	}
}
