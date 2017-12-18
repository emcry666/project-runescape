/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class224 {
	int anInt2337 = 1089881077;
	Interface27 anInterface27_2338;
	long aLong2339;
	LinkedList aLinkedList2340 = new LinkedList();

	public void method4148(Class218 class218) {
		if ((3709242242227198951L * aLong2339 != 7686009528133188889L * class218.aLong2307) || class218.method3959((byte) -9) != anInt2337 * -1960972381)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2340.iterator();
		while (iterator.hasNext()) {
			Interface28 interface28 = (Interface28) iterator.next();
			interface28.method163(class218, 1816369683);
		}
		class218.method3960((byte) 117);
	}

	public void method4149(Class218 class218) {
		if ((3709242242227198951L * aLong2339 != 7686009528133188889L * class218.aLong2307) || class218.method3959((byte) -23) != anInt2337 * -1960972381)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2340.iterator();
		while (iterator.hasNext()) {
			Interface28 interface28 = (Interface28) iterator.next();
			interface28.method163(class218, 1816369683);
		}
		class218.method3960((byte) 92);
	}

	public Class224(RSBuffer class523_sub34, Interface27 interface27) {
		anInterface27_2338 = interface27;
		aLong2339 = class523_sub34.readLong((byte) -49) * -8701565876511340585L;
		anInt2337 = class523_sub34.readUnsignedInt((byte) -110) * -1089881077;
		for (int i = class523_sub34.readUnsignedByte(1476740746); i != 0; i = class523_sub34.readUnsignedByte(-1630251922)) {
			Class244 class244 = ((Class244) Class334.method5910(Class244.method4375(2138148924), i, -1871931025));
			Interface28 interface28;
			switch (2088613417 * class244.anInt2477) {
			case 12:
				interface28 = new Class227(this, class523_sub34);
				break;
			case 2:
				interface28 = new Class228(this, class523_sub34);
				break;
			case 0:
				interface28 = new Class240(this, class523_sub34);
				break;
			case 9:
				interface28 = new Class211(this, class523_sub34);
				break;
			case 11:
				interface28 = new Class254(this, class523_sub34);
				break;
			case 13:
				interface28 = new Class223(this, class523_sub34);
				break;
			case 10:
				interface28 = new Class232(this, class523_sub34);
				break;
			case 6:
				interface28 = new Class215(this, class523_sub34);
				break;
			default:
				throw new IllegalStateException("");
			case 8:
				interface28 = new Class257(this);
				break;
			case 3:
				interface28 = new Class225(this, class523_sub34);
				break;
			case 4:
				interface28 = new Class230(this);
				break;
			case 7:
				interface28 = new Class222(this, class523_sub34);
				break;
			case 5:
				interface28 = new Class253(this, class523_sub34);
				break;
			case 1:
				interface28 = new Class226(this, class523_sub34);
			}
			aLinkedList2340.add(interface28);
		}
	}

	public void method4150(Class218 class218, int i) {
		if ((3709242242227198951L * aLong2339 != 7686009528133188889L * class218.aLong2307) || class218.method3959((byte) -102) != anInt2337 * -1960972381)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2340.iterator();
		while (iterator.hasNext()) {
			Interface28 interface28 = (Interface28) iterator.next();
			interface28.method163(class218, 1816369683);
		}
		class218.method3960((byte) 75);
	}

	static void method4151(int i) {
		if (Class569.aClass148_7626 == null || (Class569.aClass148_7626.method2504() != Class569.aTwitchWebcamFrameData7642.width) || (Class569.aClass148_7626.method2428() != Class569.aTwitchWebcamFrameData7642.height))
			Class569.aClass148_7626 = (Class31.aClass178_303.method3102(Class569.aTwitchWebcamFrameData7642.buffer, 0, Class569.aTwitchWebcamFrameData7642.width, Class569.aTwitchWebcamFrameData7642.width, Class569.aTwitchWebcamFrameData7642.height, false));
		else
			Class569.aClass148_7626.method2431(0, 0, Class569.aTwitchWebcamFrameData7642.width, Class569.aTwitchWebcamFrameData7642.height, Class569.aTwitchWebcamFrameData7642.buffer, 0, Class569.aTwitchWebcamFrameData7642.width);
	}

	public static Class612[] method4152(byte i) {
		return (new Class612[] { Class612.aClass612_8015, Class612.aClass612_8016, Class612.aClass612_8014 });
	}

	static final void method4153(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_0_ = 0;
		if (Class516.method8619(string, 1695842396))
			i_0_ = JS5Client.method15856(string, (byte) 121);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.ENTER_INTEGER_PACKET, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i_0_, -1342315205);
		client.aClass116_11058.method1974(class523_sub22, (byte) 42);
	}
}
