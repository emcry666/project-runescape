/* Class637_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;
import java.util.Queue;

public class Class637_Sub1 extends Class637 {
	Queue aQueue10817 = new LinkedList();

	void method16689(Class523_Sub39_Sub2 class523_sub39_sub2, byte i) {
		aQueue10817.add(class523_sub39_sub2);
		if (aQueue10817.size() > 10)
			aQueue10817.poll();
	}

	void method10449(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39) {
		method16693(class523_sub34, (Class523_Sub39_Sub2) class523_sub39, 665389995);
	}

	void method10472() {
		Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue10817.poll();
		if (null != class523_sub39_sub2) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4257, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(method10453(class523_sub39_sub2, 65535, 920476385), -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((class523_sub39_sub2.method18165(1969523885) << 1 | class523_sub39_sub2.method18170(1198321338) & 0x1), 1789310227);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1((class523_sub39_sub2.method16519(-1153410789) | class523_sub39_sub2.method16520((byte) 127) << 16), (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 56);
			class523_sub39_sub2.method16523((byte) -72);
		}
	}

	boolean method10452(byte i) {
		return (!aQueue10817.isEmpty() || (5505102922195369039L * aLong8305 < Class248.method4401(1516375036) - 2000L));
	}

	Class523_Sub22 method10460(int i) {
		return Class523_Sub18.method16042(OutgoingPacket.aClass408_4294, client.aClass116_11058.aClass11_1413, 1370050649);
	}

	void method16690(Class523_Sub39_Sub2 class523_sub39_sub2) {
		aQueue10817.add(class523_sub39_sub2);
		if (aQueue10817.size() > 10)
			aQueue10817.poll();
	}

	int method10454(int i) {
		return 1;
	}

	void method10457(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39, int i) {
		method16693(class523_sub34, (Class523_Sub39_Sub2) class523_sub39, 842733131);
	}

	void method16691(Class523_Sub39_Sub2 class523_sub39_sub2) {
		aQueue10817.add(class523_sub39_sub2);
		if (aQueue10817.size() > 10)
			aQueue10817.poll();
	}

	void method16692(Class523_Sub39_Sub2 class523_sub39_sub2) {
		aQueue10817.add(class523_sub39_sub2);
		if (aQueue10817.size() > 10)
			aQueue10817.poll();
	}

	void method16693(Class523_Sub34 class523_sub34, Class523_Sub39_Sub2 class523_sub39_sub2, int i) {
		class523_sub34.writeByte(class523_sub39_sub2.method18170(1198321338), -2091539927);
	}

	void method16694(Class523_Sub34 class523_sub34, Class523_Sub39_Sub2 class523_sub39_sub2) {
		class523_sub34.writeByte(class523_sub39_sub2.method18170(1198321338), -1602970658);
	}

	void method10459() {
		Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue10817.poll();
		if (null != class523_sub39_sub2) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4257, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(method10453(class523_sub39_sub2, 65535, 1255414954), -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((class523_sub39_sub2.method18165(11531415) << 1 | class523_sub39_sub2.method18170(1198321338) & 0x1), 905010707);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1((class523_sub39_sub2.method16519(878956717) | class523_sub39_sub2.method16520((byte) 127) << 16), (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 93);
			class523_sub39_sub2.method16523((byte) -49);
		}
	}

	void method10476() {
		Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue10817.poll();
		if (null != class523_sub39_sub2) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4257, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(method10453(class523_sub39_sub2, 65535, -75424387), -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((class523_sub39_sub2.method18165(2087126823) << 1 | class523_sub39_sub2.method18170(1198321338) & 0x1), -1246493036);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1((class523_sub39_sub2.method16519(-1353650652) | class523_sub39_sub2.method16520((byte) 127) << 16), (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 26);
			class523_sub39_sub2.method16523((byte) -58);
		}
	}

	Class523_Sub22 method10468() {
		return Class523_Sub18.method16042(OutgoingPacket.aClass408_4294, client.aClass116_11058.aClass11_1413, 1370050649);
	}

	void method10456(int i) {
		Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue10817.poll();
		if (null != class523_sub39_sub2) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4257, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(method10453(class523_sub39_sub2, 65535, 632011561), -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((class523_sub39_sub2.method18165(1321187598) << 1 | class523_sub39_sub2.method18170(1198321338) & 0x1), -454457425);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1((class523_sub39_sub2.method16519(-1381516362) | class523_sub39_sub2.method16520((byte) 127) << 16), (byte) 1);
			client.aClass116_11058.method1974(class523_sub22, (byte) 30);
			class523_sub39_sub2.method16523((byte) 16);
		}
	}

	boolean method10463() {
		return (!aQueue10817.isEmpty() || (5505102922195369039L * aLong8305 < Class248.method4401(1516375036) - 2000L));
	}

	boolean method10464() {
		return (!aQueue10817.isEmpty() || (5505102922195369039L * aLong8305 < Class248.method4401(1516375036) - 2000L));
	}

	boolean method10458() {
		return (!aQueue10817.isEmpty() || (5505102922195369039L * aLong8305 < Class248.method4401(1516375036) - 2000L));
	}

	boolean method10466() {
		return (!aQueue10817.isEmpty() || (5505102922195369039L * aLong8305 < Class248.method4401(1516375036) - 2000L));
	}

	Class637_Sub1() {
		/* empty */
	}

	int method10471() {
		return 1;
	}

	Class523_Sub22 method10475() {
		return Class523_Sub18.method16042(OutgoingPacket.aClass408_4294, client.aClass116_11058.aClass11_1413, 1370050649);
	}

	void method16695(Class523_Sub34 class523_sub34, Class523_Sub39_Sub2 class523_sub39_sub2) {
		class523_sub34.writeByte(class523_sub39_sub2.method18170(1198321338), -923523725);
	}

	int method10469() {
		return 1;
	}

	int method10461() {
		return 1;
	}

	boolean method10465() {
		return (!aQueue10817.isEmpty() || (5505102922195369039L * aLong8305 < Class248.method4401(1516375036) - 2000L));
	}

	int method10470() {
		return 1;
	}

	void method10467(Class523_Sub34 class523_sub34, Class523_Sub39 class523_sub39) {
		method16693(class523_sub34, (Class523_Sub39_Sub2) class523_sub39, 1445806051);
	}

	void method16696(Class523_Sub39_Sub2 class523_sub39_sub2) {
		aQueue10817.add(class523_sub39_sub2);
		if (aQueue10817.size() > 10)
			aQueue10817.poll();
	}
}
