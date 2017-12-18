/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class263 implements Interface29 {
	public long method167(String string, int i) {
		return Class388.method6472(string, 2142199808);
	}

	public long method169(String string) {
		return Class388.method6472(string, 2145574223);
	}

	public long method168(String string) {
		return Class388.method6472(string, 2141673843);
	}

	public long method166(String string) {
		return Class388.method6472(string, 2142840617);
	}

	public long method170(String string) {
		return Class388.method6472(string, 2146208147);
	}

	static void method4739(Class523_Sub34 class523_sub34, long l) {
		Class3 class3;
		if (null != Class43.aString583 && Class43.aString583.length() == 6) {
			if (Class43.aBool588)
				class3 = Class3.aClass3_29;
			else
				class3 = Class3.aClass3_30;
		} else if (Class220.aClass57_2331.method1367(l))
			class3 = Class3.aClass3_28;
		else
			class3 = Class3.aClass3_31;
		class523_sub34.writeByte(class3.method82(), 1590653294);
		switch (-40972529 * class3.anInt27) {
		case 3:
			class523_sub34.anInt10661 += 759062892;
			break;
		case 1:
		case 2:
			class523_sub34.method16330(Integer.parseInt(Class43.aString583), (byte) 0);
			class523_sub34.anInt10661 += 189765723;
			break;
		case 0:
			class523_sub34.writeInt(Class220.aClass57_2331.method1374(l), -1589510949);
			break;
		}
	}

	public static void method4740(byte i) {
		Class110.aShort1333 = client.aShort11143;
		Class191.aShort2167 = client.aShort11205;
		Class191.aShort2165 = client.aShort11278;
		Class618.aShort8062 = client.aShort11020;
		Class191.aBool2164 = true;
		Class191.anInt2161 = Class254.aClass217_2743.method3912(-630116747) * -403248807;
		if (-738440423 * Class191.anInt2163 != 0 && Class191.anInt2162 * -679794657 != 0) {
			client.aShort11278 = (short) 334;
			client.aShort11020 = (short) 334;
			client.aShort11205 = client.aShort11143 = (short) (Class191.anInt2163 * -124374528 / (Class191.anInt2162 * -679794657));
		}
	}

	static boolean method4741(int i, int i_0_) {
		return 57 == i || i == 58 || i == 1007 || 25 == i || 30 == i;
	}

	static final void method4742(Class669 class669, int i) {
		Class669.method13691(false, -1838550041);
	}

	static final void method4743(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub41_10626.method17091(803928474);
	}
}
