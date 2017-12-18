/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class257 implements Interface28 {
	Class224 this$0;
	public static Class148 aClass148_2828;

	public void method163(Class218 class218, int i) {
		class218.method3964(2053624206);
	}

	public void method161(Class218 class218) {
		class218.method3964(2099528781);
	}

	public void method162(Class218 class218) {
		class218.method3964(2033665868);
	}

	Class257(Class224 class224) {
		this$0 = class224;
	}

	public void method164(Class218 class218) {
		class218.method3964(2013294565);
	}

	public void method165(Class218 class218) {
		class218.method3964(2086249697);
	}

	public static int method4683(RSBuffer class523_sub34, String string, short i) {
		int i_0_ = class523_sub34.offset * 2349011;
		byte[] is = OutgoingPacket.method6623(string, 129513965);
		class523_sub34.method16317(is.length, (short) -2002);
		class523_sub34.offset += Class260.aClass262_2837.method4724(is, 0, is.length, (class523_sub34.buffer), 2349011 * (class523_sub34.offset), (byte) 39) * 189765723;
		return 2349011 * class523_sub34.offset - i_0_;
	}

	static final void method4684(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (i_2_ == -1)
			throw new RuntimeException();
		ClientScriptDefinitions class37 = ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_2_, (byte) -63));
		if (class37.keyType.method82() != i_1_)
			throw new RuntimeException();
		if (class37.valueType.method82() != Class464.aClass464_5165.method82())
			throw new RuntimeException();
		int[] is = class37.method1091(string, (byte) 16);
		if (i_3_ < 0 || null == is || is.length <= i_3_)
			throw new RuntimeException();
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = is[i_3_];
	}

	static final void method4685(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 100;
	}

	static boolean method4686(Interface61 interface61, Class53_Sub18 class53_sub18, int i, int i_4_, byte i_5_) {
		if (interface61 == null)
			return false;
		Class602 class602 = ((Class602) class53_sub18.getDefinition(interface61.method401(-770473736), (byte) 19));
		if (class602.aBool7922 && !client.aBool11157)
			return false;
		int i_6_ = -1296551513 * class602.anInt7906;
		if (null != class602.anIntArray7912) {
			for (int i_7_ = 0; i_7_ < class602.anIntArray7912.length; i_7_++) {
				if (class602.anIntArray7912[i_7_] != -1) {
					Class602 class602_8_ = ((Class602) class53_sub18.getDefinition((class602.anIntArray7912[i_7_]), (byte) 55));
					if (class602_8_.anInt7906 * -1296551513 >= 0)
						i_6_ = class602_8_.anInt7906 * -1296551513;
				}
			}
		}
		if (i_6_ >= 0) {
			Class104.anIntArray1267[Class104.anInt1264 * -752928307] = class602.anInt7854 * -2005438859;
			Class104.anIntArray1263[Class104.anInt1264 * -752928307] = i;
			Class104.anIntArray1271[Class104.anInt1264 * -752928307] = i_4_;
			Class104.anInt1264 += -1439147259;
			return true;
		}
		return false;
	}

	static void method4687(int i) {
		Class95.anInt1163 = (-812688309 * Class655.aClass10_8421.anInt80 + Class655.aClass10_8421.anInt76 * -1664963719 + 410155710);
		Class95.anInt1167 = -1709923630 + (Class46.aClass10_672.anInt80 * 632200733 + Class46.aClass10_672.anInt76 * -899283713);
		Class95.aStringArray1165 = new String[500];
		for (int i_9_ = 0; i_9_ < Class95.aStringArray1165.length; i_9_++)
			Class95.aStringArray1165[i_9_] = "";
		Class485.method7932(Class39.aClass39_418.method1124((Class53_Sub20.aClass668_10979), (byte) -107), (byte) -17);
	}
}
