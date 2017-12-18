/* Class457 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class457 {
	Class452 this$0;
	byte[] aByteArray5072;

	byte[] method7439() {
		return aByteArray5072;
	}

	byte[] method7440(byte i) {
		return aByteArray5072;
	}

	byte[] method7441() {
		return aByteArray5072;
	}

	Class457(Class452 class452, InputStream inputstream, Class523_Sub27_Sub14_Sub3 class523_sub27_sub14_sub3, URL url) {
		this$0 = class452;
		aByteArray5072 = null;
		if (null != inputstream) {
			int i = 10240;
			Class523_Sub34 class523_sub34 = new Class523_Sub34(i, true);
			int i_0_ = 0;
			byte[] is = Class689.method13937(1024, 1357652815);
			while (i_0_ >= 0) {
				try {
					i_0_ = inputstream.read(is);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
					i_0_ = -1;
				}
				if (i_0_ > 0) {
					if (class523_sub34.anInt10661 * 2349011 + i_0_ >= class523_sub34.aByteArray10658.length) {
						int i_1_ = 10240 + class523_sub34.aByteArray10658.length;
						byte[] is_2_ = Class689.method13936(i_1_, true, 1756993336);
						System.arraycopy(class523_sub34.aByteArray10658, 0, is_2_, 0, class523_sub34.anInt10661 * 2349011);
						Class689.method13938(class523_sub34.aByteArray10658, (byte) 40);
						class523_sub34.aByteArray10658 = is_2_;
					}
					class523_sub34.readBytes(is, 0, i_0_, (short) -19549);
				}
			}
			for (int i_3_ = 0; i_3_ < class523_sub27_sub14_sub3.anInt12158 * 258637359; i_3_++)
				class523_sub34.writeByte(0, -1574563873);
			byte[] is_4_ = new byte[2349011 * class523_sub34.anInt10661];
			System.arraycopy(class523_sub34.aByteArray10658, 0, is_4_, 0, class523_sub34.anInt10661 * 2349011);
			class523_sub34.method16408(-2059309533);
			Object object = null;
			Class689.method13938(is, (byte) -70);
			Object object_5_ = null;
			aByteArray5072 = is_4_;
			try {
				inputstream.close();
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		}
		class523_sub27_sub14_sub3.aBool11748 = false;
		class452.method7304(1700599327);
	}

	static String method7442(String string, int i) {
		if (Class509.aString5723.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class509.aString5723.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class509.aString5723.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}

	static final void method7443(Class250 class250, Class242 class242, boolean bool, int i, Class669 class669, int i_6_) {
		class669.anInt8558 -= -17422498;
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_8_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456) {
			Class687_Sub1.method16687(class250.anInt2585 * -1363815505, 1718138974);
			BodyDefinitions.method10331(class250.anInt2585 * -1363815505, 825227355);
			Class98.method1780(class250.anInt2585 * -1363815505, (byte) -2);
		}
		if (i_7_ == -1) {
			class250.anInt2570 = -182688103;
			class250.anInt2571 = -903474739;
			class250.anInt2680 = 62233309;
		} else {
			class250.anInt2680 = -62233309 * i_7_;
			class250.anInt2681 = i_8_ * 544095811;
			class250.aBool2655 = bool;
			ItemDefinitions class12 = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_7_, (byte) 78);
			class250.anInt2563 = class12.anInt128 * 327723753;
			class250.anInt2577 = class12.anInt101 * -843533915;
			class250.anInt2578 = class12.anInt115 * -413062123;
			class250.anInt2523 = -2066330359 * class12.anInt118;
			class250.anInt2501 = 1883283655 * class12.anInt117;
			class250.anInt2544 = class12.anInt98 * -790324051;
			class250.anInt2587 = -1292416217 * i;
			if (class250.anInt2583 * -15523801 > 0)
				class250.anInt2544 = (-815988896 * class250.anInt2544 / (class250.anInt2583 * -15523801) * 249826099);
			else if (class250.anInt2502 * -480866135 > 0)
				class250.anInt2544 = 249826099 * (class250.anInt2544 * -815988896 / (-480866135 * class250.anInt2502));
		}
	}

	static final void method7444(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = ((null != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183) && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183.aBool8104)) ? 1 : 0;
	}

	static final void method7445(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool11164 ? 1 : 0;
	}

	public static void method7446(int i, int i_9_, int i_10_, Class602 class602, int i_11_) {
		for (Class523_Sub3 class523_sub3 = ((Class523_Sub3) Class523_Sub3.aClass708_10364.method14240(1672236153)); class523_sub3 != null; class523_sub3 = (Class523_Sub3) Class523_Sub3.aClass708_10364.method14244((byte) 3)) {
			if (i == -398455767 * class523_sub3.anInt10369 && i_9_ << 9 == -838245371 * class523_sub3.anInt10378 && class523_sub3.anInt10373 * -2105988339 == i_10_ << 9 && (class602.anInt7854 * -2005438859 == (class523_sub3.aClass602_10377.anInt7854 * -2005438859))) {
				if (class523_sub3.aClass489_10389 != null) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 115);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				class523_sub3.method8661(607052656);
				break;
			}
		}
	}

	static void method7447(Class669 class669, int i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[((1357652815 * class669.anInt8558) - 1)]), (byte) -16)).method5074(Class98_Sub1_Sub2.playerVarsProvider, (byte) -21) ? 1 : 0);
	}

	static final void method7448(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_12_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_13_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_13_, (byte) -46);
		if (class76.method1537((byte) -110))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_12_, (byte) 40)).method686(i_13_, class76.aString849, 1245420499);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_12_, (byte) 5)).method669(i_13_, class76.anInt850 * -1100663923, -1823208364));
	}
}
