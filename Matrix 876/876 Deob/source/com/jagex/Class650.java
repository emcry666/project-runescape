/* Class650 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;
import java.util.Iterator;

public class Class650 {
	public int anInt8380;

	public Class650(int i) {
		anInt8380 = -1938569789 * i;
	}

	static final void method10623(InterfaceComponentDefinitions class250, Class669 class669, int i) {
		Class10 class10 = class250.method4427(Class491.aClass423_5536, client.anInterface50_11044, -2140388207);
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Point point = class10.method618(class250.aString2607, 365308179 * class250.anInt2581, 1021292849 * class250.anInt2608, i_0_, Class62.aClass148Array772, -1921295243);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = point.x;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = point.y;
	}

	static final void method10624(Class669 class669, byte i) {
		if (Class194_Sub6.aClass334_9900 != null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
			class669.aClass334_8571 = Class194_Sub6.aClass334_9900;
			class669.aMap8573.put(VarDomainType.CLAN_SETTING_CONFIGS, Class244.method4378(class669.aClass334_8571, -1260447139));
		} else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method10625(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class297_Sub1.anInt10002 * 537467811;
	}

	public static void method10626(Iterable iterable, RSBuffer class523_sub34, short i) {
		int i_1_ = Class567.method9518(iterable, -2088907955);
		class523_sub34.method16317(i_1_, (short) -2002);
		if (0 != i_1_) {
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
				class523_sub34.buffer[2349011 * class523_sub34.offset + i_2_] = (byte) 0;
			Iterator iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Interface75 interface75 = (Interface75) iterator.next();
				int i_3_ = interface75.method82();
				int i_4_ = i_3_ / 8;
				class523_sub34.buffer[class523_sub34.offset * 2349011 + i_4_] |= 1 << (i_3_ & 0x7);
			}
			class523_sub34.offset += i_1_ * 189765723;
		}
	}

	static final void method10627(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class239 class239 = (Class239) Class287.aClass53_Sub1_3102.getDefinition(i_5_, (byte) 38);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class239.anInt2410 * 924656729;
	}
}
