/* Class168_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Date;

public abstract class Class168_Sub2 extends Class168 {
	static Class640 aClass640_9786;

	public abstract int method15399(int i, int i_0_);

	public abstract int method15400();

	public abstract int method15401(int i, int i_1_);

	abstract void method15402(int i, int i_2_);

	Class168_Sub2() {
		/* empty */
	}

	abstract void method15403(int i, int i_3_);

	public abstract int method15404();

	abstract void method15405(int i, int i_4_);

	public abstract int method15406(int i, int i_5_);

	public abstract int method15407(int i, int i_6_);

	public abstract int method15408(int i, int i_7_);

	static void method15409(RSStream class116, InterfaceComponentDefinitions class250, int i, int i_8_, int i_9_, int i_10_) {
		if (i == 1) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4231, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, -1878986101 * class250.anInt2680, -958747349);
			class116.method1974(class523_sub22, (byte) 65);
		}
		if (i == 2) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4240, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, class250.anInt2680 * -1878986101, -958747349);
			class116.method1974(class523_sub22, (byte) 93);
		}
		if (i == 3) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4218, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, class250.anInt2680 * -1878986101, -958747349);
			class116.method1974(class523_sub22, (byte) 36);
		}
		if (i == 4) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4278, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, -1878986101 * class250.anInt2680, -958747349);
			class116.method1974(class523_sub22, (byte) 37);
		}
		if (5 == i) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4235, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, -1878986101 * class250.anInt2680, -958747349);
			class116.method1974(class523_sub22, (byte) 108);
		}
		if (6 == i) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4219, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, class250.anInt2680 * -1878986101, -958747349);
			class116.method1974(class523_sub22, (byte) 107);
		}
		if (7 == i) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4293, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, class250.anInt2680 * -1878986101, -958747349);
			class116.method1974(class523_sub22, (byte) 113);
		}
		if (i == 8) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.ACTION_BUTTON_7_PACKET, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, -1878986101 * class250.anInt2680, -958747349);
			class116.method1974(class523_sub22, (byte) 33);
		}
		if (9 == i) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4316, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, -1878986101 * class250.anInt2680, -958747349);
			class116.method1974(class523_sub22, (byte) 26);
		}
		if (10 == i) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4233, class116.aClass11_1413, 1370050649);
			Class194_Sub19.method15524(class523_sub22, i_8_, i_9_, -1878986101 * class250.anInt2680, -958747349);
			class116.method1974(class523_sub22, (byte) 123);
		}
	}

	static void method15410(long l) {
		Class91.aCalendar894.setTime(new Date(l));
	}

	static final void method15411(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class669.aClass523_Sub19_8569.aString10484;
	}
}
