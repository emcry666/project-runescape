/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class282 {
	static final int anInt3066 = 10;
	boolean aBool3067 = false;
	LinkedList aLinkedList3068 = new LinkedList();
	String aString3069;
	static Class55 aClass55_3070;

	public final String method5096(String string) {
		if (aLinkedList3068.isEmpty())
			return string;
		StringBuilder stringbuilder = new StringBuilder(string.length());
		int i = string.length();
		boolean bool = false;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			boolean bool_1_ = false;
			char c = string.charAt(i_0_);
			if (bool) {
				if ('>' == c)
					bool = false;
			} else if (c == '<')
				bool = true;
			else if (aString3069.indexOf(c) != -1) {
				for (int i_2_ = 0; i_2_ < aLinkedList3068.size(); i_2_++) {
					Class268 class268 = (Class268) aLinkedList3068.get(i_2_);
					int i_3_ = class268.aString2867.length();
					if (i_0_ <= i - i_3_ && string.substring(i_0_, i_0_ + i_3_).equals(class268.aString2867)) {
						String string_4_;
						if (661929403 * class268.anInt2865 > 0)
							string_4_ = (String.format("<sprite=%d,%d>", (new Object[] { Integer.valueOf(-545160821 * class268.anInt2866), Integer.valueOf(661929403 * (class268.anInt2865)) })));
						else
							string_4_ = String.format("<sprite=%d>", (new Object[] { Integer.valueOf(class268.anInt2866 * -545160821) }));
						stringbuilder.append(string_4_);
						bool_1_ = true;
						i_0_ += i_3_ - 1;
						break;
					}
				}
			}
			if (!bool_1_)
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public final String method5097(String string) {
		if (aLinkedList3068.isEmpty())
			return string;
		StringBuilder stringbuilder = new StringBuilder(string.length());
		int i = string.length();
		boolean bool = false;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			boolean bool_6_ = false;
			char c = string.charAt(i_5_);
			if (bool) {
				if ('>' == c)
					bool = false;
			} else if (c == '<')
				bool = true;
			else if (aString3069.indexOf(c) != -1) {
				for (int i_7_ = 0; i_7_ < aLinkedList3068.size(); i_7_++) {
					Class268 class268 = (Class268) aLinkedList3068.get(i_7_);
					int i_8_ = class268.aString2867.length();
					if (i_5_ <= i - i_8_ && string.substring(i_5_, i_5_ + i_8_).equals(class268.aString2867)) {
						String string_9_;
						if (661929403 * class268.anInt2865 > 0)
							string_9_ = (String.format("<sprite=%d,%d>", (new Object[] { Integer.valueOf(-545160821 * class268.anInt2866), Integer.valueOf(661929403 * (class268.anInt2865)) })));
						else
							string_9_ = String.format("<sprite=%d>", (new Object[] { Integer.valueOf(class268.anInt2866 * -545160821) }));
						stringbuilder.append(string_9_);
						bool_6_ = true;
						i_5_ += i_8_ - 1;
						break;
					}
				}
			}
			if (!bool_6_)
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public final void method5098(String string, int i) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string)) {
				iterator.remove();
				break;
			}
		}
	}

	public int method5099() {
		return aLinkedList3068.size();
	}

	public final void method5100() {
		aLinkedList3068.clear();
		aString3069 = "";
	}

	final Class268 method5101(String string, int i) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string))
				return class268;
		}
		return null;
	}

	public static final boolean method5102(char c) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && c != '<' || c >= '[' && c <= '_' || c >= '{');
	}

	public final void method5103(byte i) {
		aLinkedList3068.clear();
		aString3069 = "";
	}

	public final String method5104(String string, int i) {
		if (aLinkedList3068.isEmpty())
			return string;
		StringBuilder stringbuilder = new StringBuilder(string.length());
		int i_10_ = string.length();
		boolean bool = false;
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			boolean bool_12_ = false;
			char c = string.charAt(i_11_);
			if (bool) {
				if ('>' == c)
					bool = false;
			} else if (c == '<')
				bool = true;
			else if (aString3069.indexOf(c) != -1) {
				for (int i_13_ = 0; i_13_ < aLinkedList3068.size(); i_13_++) {
					Class268 class268 = (Class268) aLinkedList3068.get(i_13_);
					int i_14_ = class268.aString2867.length();
					if (i_11_ <= i_10_ - i_14_ && string.substring(i_11_, i_11_ + i_14_).equals(class268.aString2867)) {
						String string_15_;
						if (661929403 * class268.anInt2865 > 0)
							string_15_ = (String.format("<sprite=%d,%d>", (new Object[] { Integer.valueOf(-545160821 * class268.anInt2866), Integer.valueOf(661929403 * (class268.anInt2865)) })));
						else
							string_15_ = String.format("<sprite=%d>", (new Object[] { Integer.valueOf(class268.anInt2866 * -545160821) }));
						stringbuilder.append(string_15_);
						bool_12_ = true;
						i_11_ += i_14_ - 1;
						break;
					}
				}
			}
			if (!bool_12_)
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	final void method5105(int i) {
		aString3069 = "";
		for (int i_16_ = 0; i_16_ < aLinkedList3068.size(); i_16_++) {
			Class268 class268 = (Class268) aLinkedList3068.get(i_16_);
			char c = class268.aString2867.charAt(0);
			if (aString3069.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class282 class282_17_ = this;
				class282_17_.aString3069 = stringbuilder.append(class282_17_.aString3069).append(c).toString();
			}
		}
	}

	public boolean method5106() {
		return aBool3067;
	}

	public void method5107(boolean bool) {
		aBool3067 = bool;
	}

	public void method5108(boolean bool) {
		aBool3067 = bool;
	}

	final void method5109() {
		aString3069 = "";
		for (int i = 0; i < aLinkedList3068.size(); i++) {
			Class268 class268 = (Class268) aLinkedList3068.get(i);
			char c = class268.aString2867.charAt(0);
			if (aString3069.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class282 class282_18_ = this;
				class282_18_.aString3069 = stringbuilder.append(class282_18_.aString3069).append(c).toString();
			}
		}
	}

	public int method5110() {
		return aLinkedList3068.size();
	}

	public boolean method5111(int i) {
		return aBool3067;
	}

	public final boolean method5112(String string, int i, int i_19_) {
		if (!string.isEmpty() && string.length() <= 10 && Class88.method1626(string.charAt(0), -773336210)) {
			Class268 class268 = method5101(string, 2138982193);
			if (class268 != null)
				aLinkedList3068.remove(class268);
			aLinkedList3068.add(new Class268(string, i, i_19_));
			method5105(1247860966);
			return true;
		}
		return false;
	}

	final Class268 method5113(String string) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string))
				return class268;
		}
		return null;
	}

	final Class268 method5114(String string) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string))
				return class268;
		}
		return null;
	}

	final Class268 method5115(String string) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string))
				return class268;
		}
		return null;
	}

	public final void method5116(String string) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string)) {
				iterator.remove();
				break;
			}
		}
	}

	public final void method5117(String string) {
		Iterator iterator = aLinkedList3068.iterator();
		while (iterator.hasNext()) {
			Class268 class268 = (Class268) iterator.next();
			if (class268.aString2867.equals(string)) {
				iterator.remove();
				break;
			}
		}
	}

	public void method5118(boolean bool, int i) {
		aBool3067 = bool;
	}

	public final void method5119() {
		aLinkedList3068.clear();
		aString3069 = "";
	}

	public int method5120(int i) {
		return aLinkedList3068.size();
	}

	public final String method5121(String string) {
		if (aLinkedList3068.isEmpty())
			return string;
		StringBuilder stringbuilder = new StringBuilder(string.length());
		int i = string.length();
		boolean bool = false;
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			boolean bool_21_ = false;
			char c = string.charAt(i_20_);
			if (bool) {
				if ('>' == c)
					bool = false;
			} else if (c == '<')
				bool = true;
			else if (aString3069.indexOf(c) != -1) {
				for (int i_22_ = 0; i_22_ < aLinkedList3068.size(); i_22_++) {
					Class268 class268 = (Class268) aLinkedList3068.get(i_22_);
					int i_23_ = class268.aString2867.length();
					if (i_20_ <= i - i_23_ && string.substring(i_20_, i_20_ + i_23_).equals(class268.aString2867)) {
						String string_24_;
						if (661929403 * class268.anInt2865 > 0)
							string_24_ = (String.format("<sprite=%d,%d>", (new Object[] { Integer.valueOf(-545160821 * class268.anInt2866), Integer.valueOf(661929403 * (class268.anInt2865)) })));
						else
							string_24_ = String.format("<sprite=%d>", (new Object[] { Integer.valueOf(class268.anInt2866 * -545160821) }));
						stringbuilder.append(string_24_);
						bool_21_ = true;
						i_20_ += i_23_ - 1;
						break;
					}
				}
			}
			if (!bool_21_)
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	final void method5122() {
		aString3069 = "";
		for (int i = 0; i < aLinkedList3068.size(); i++) {
			Class268 class268 = (Class268) aLinkedList3068.get(i);
			char c = class268.aString2867.charAt(0);
			if (aString3069.indexOf(c) < 0) {
				StringBuilder stringbuilder = new StringBuilder();
				Class282 class282_25_ = this;
				class282_25_.aString3069 = stringbuilder.append(class282_25_.aString3069).append(c).toString();
			}
		}
	}

	public final boolean method5123(String string, int i, int i_26_, int i_27_) {
		if (!string.isEmpty() && string.length() <= 10 && Class88.method1626(string.charAt(0), -773336210)) {
			Class268 class268 = method5101(string, 2144558781);
			if (class268 != null)
				aLinkedList3068.remove(class268);
			aLinkedList3068.add(new Class268(string, i, i_26_));
			method5105(1247860966);
			return true;
		}
		return false;
	}

	static final void method5124(Class669 class669, int i) {
		class669.anInt8558 -= -104534988;
		Class524.method8685(-522212835);
		Class253.method4544(2019991621);
		Class381.anInt3952 = (class669.anIntArray8557[class669.anInt8558 * 1357652815] * 2039816225);
		Class529.anInt7121 = (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815] * -1625053565);
		Class17.anInt192 = (class669.anIntArray8557[2 + 1357652815 * class669.anInt8558] * 1361856511);
		Class392.anInt4036 = (1561087627 * class669.anIntArray8557[3 + class669.anInt8558 * 1357652815]);
		Class53.anInt724 = (class669.anIntArray8557[1357652815 * class669.anInt8558 + 4] * 107435011);
		Class184.anInt2126 = (477831893 * class669.anIntArray8557[class669.anInt8558 * 1357652815 + 5]);
		Class194_Sub13.anInt9919 = (176524759 * class669.anIntArray8557[6 + class669.anInt8558 * 1357652815]);
		Class523_Sub18_Sub11.anInt11704 = (543732765 * class669.anIntArray8557[1357652815 * class669.anInt8558 + 7]);
		Class308.anInt3364 = (929826573 * class669.anIntArray8557[class669.anInt8558 * 1357652815 + 8]);
		Class328_Sub3_Sub3.anInt11590 = (1752976307 * class669.anIntArray8557[1357652815 * class669.anInt8558 + 9]);
		Class328_Sub3_Sub3.anInt11591 = 1879555939 * (class669.anIntArray8557[10 + 1357652815 * class669.anInt8558]);
		Class687_Sub2.anInt10826 = (class669.anIntArray8557[1357652815 * class669.anInt8558 + 11] * -630187205);
		Class523_Sub8.aClass472_10406.method7650(616625835 * Class53.anInt724, -869257688);
		Class523_Sub8.aClass472_10406.method7650(Class184.anInt2126 * 1112737405, -1388146254);
		Class523_Sub8.aClass472_10406.method7650(-18041369 * Class194_Sub13.anInt9919, -382456669);
		Class523_Sub8.aClass472_10406.method7650((Class523_Sub18_Sub11.anInt11704) * -1663848907, -515934693);
		Class523_Sub8.aClass472_10406.method7650(-1743511611 * Class308.anInt3364, -1802321137);
		Class523_Sub8.aClass472_10406.method7650(1212810739 * Class687_Sub2.anInt10826, -1027644288);
		Class272.aClass472_2886.method7650(1212810739 * Class687_Sub2.anInt10826, 31089684);
		Class699.aClass148_8772 = null;
		Class419.aClass148_4724 = null;
		Class257.aClass148_2828 = null;
		Class78.aClass148_863 = null;
		Class687_Sub14.aClass148_10858 = null;
		Class418.aClass148_4696 = null;
		NetworkStream.aClass148_7480 = null;
		Class375_Sub2.aClass148_10192 = null;
		Class36.aBool353 = true;
	}

	static final void method5125(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class250.aString2607;
	}

	static final void method5126(int i) {
		for (Class523_Sub2 class523_sub2 = ((Class523_Sub2) Class523_Sub2.aClass708_10359.method14240(1607280829)); null != class523_sub2; class523_sub2 = (Class523_Sub2) Class523_Sub2.aClass708_10359.method14244((byte) 82))
			Class547.method9093(class523_sub2, false, 105569504);
		for (Class523_Sub2 class523_sub2 = ((Class523_Sub2) Class523_Sub2.aClass708_10360.method14240(2110700172)); class523_sub2 != null; class523_sub2 = (Class523_Sub2) Class523_Sub2.aClass708_10360.method14244((byte) -18))
			Class547.method9093(class523_sub2, true, 952418820);
	}
}
