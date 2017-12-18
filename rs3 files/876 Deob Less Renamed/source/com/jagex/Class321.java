/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class Class321 {
	Class472 aClass472_3436;
	Class472 aClass472_3437;
	Class319 aClass319_3438;
	public static Class472 aClass472_3439;
	static int anInt3440;
	public static int anInt3441;

	Class319 method5712(int i) {
		if (aClass319_3438 == null)
			aClass319_3438 = new Class319();
		return aClass319_3438;
	}

	Class319 method5713() {
		if (aClass319_3438 == null)
			aClass319_3438 = new Class319();
		return aClass319_3438;
	}

	public Interface33 method5714(Interface49 interface49, int i) {
		if (null == interface49)
			return null;
		Class394 class394 = interface49.method353(846668144);
		if (Class394.aClass394_4047 == class394)
			return new Class325((Class395) interface49);
		if (Class394.aClass394_4044 == class394)
			return new Class330(method5712(-1389987120), (Class392) interface49);
		if (Class394.aClass394_4049 == class394)
			return new Class322(aClass472_3436, (Class388) interface49);
		if (class394 == Class394.aClass394_4050)
			return new Class322_Sub1(aClass472_3436, (Class388_Sub1) interface49);
		if (Class394.aClass394_4045 == class394)
			return new Class312_Sub3(aClass472_3436, aClass472_3437, (Class384_Sub3) interface49);
		if (class394 == Class394.aClass394_4046)
			return new Class312_Sub1(aClass472_3436, aClass472_3437, (Class384_Sub1) interface49);
		if (Class394.aClass394_4051 == class394)
			return new Class312_Sub2(aClass472_3436, aClass472_3437, (Class384_Sub2) interface49);
		if (Class394.aClass394_4048 == class394)
			return new Class316(aClass472_3436, aClass472_3437, (Class381) interface49);
		if (class394 == Class394.aClass394_4052)
			return new Class317(aClass472_3436, (Class391) interface49);
		if (Class394.aClass394_4053 == class394)
			return new Class312_Sub2_Sub1(aClass472_3436, aClass472_3437, (Class384_Sub2_Sub1) interface49);
		if (class394 == Class394.aClass394_4054)
			return new Class323(aClass472_3436, aClass472_3437, (Class382) interface49);
		return null;
	}

	public Class321(Class472 class472, Class472 class472_0_) {
		aClass472_3436 = class472;
		aClass472_3437 = class472_0_;
	}

	Class319 method5715() {
		if (aClass319_3438 == null)
			aClass319_3438 = new Class319();
		return aClass319_3438;
	}

	static final void method5716(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_1_, -389014336);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class618.method10117(class250, class242, class669, -1084389583);
	}

	static final void method5717(Class669 class669, byte i) {
		String string = "";
		if (null != Class557.aClipboard7479) {
			Transferable transferable = Class557.aClipboard7479.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
	}

	static final void method5718(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub39_10605.method17062((byte) -92);
	}

	public static void method5719(int i, int i_2_, byte i_3_) {
		Class575.anInt7691 = 367905367 * (i - Class534_Sub1.anInt7168);
		Class597.anInt7835 = (i_2_ - Class534_Sub1.anInt7159) * -1099820943;
		Class534_Sub1.anInt10780 = -1195183291;
		Class534_Sub1.anInt10779 = -465264525;
		Archive.method1233((byte) -118);
	}

	public static void method5720(byte i) {
		Class523_Sub18_Sub2.aClass148_11619 = null;
		Class104.anInt1259 = 440028073;
	}
}
