/* Class655 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class655 {
	static Class375 aClass375_8420 = null;
	static Class10 aClass10_8421;
	public static Class58_Sub1 aClass58_Sub1_8422;
	public static BodyDefinitions aClass630_8423;

	public static void method10723() {
		if (null != aClass375_8420)
			aClass375_8420.method6368(-787346054);
	}

	public static void method10724(Class652 class652) {
		if (Class379.aClass379_3931 == class652.aClass379_8397)
			aClass375_8420 = new Class375_Sub1(class652);
		else if (Class379.aClass379_3930 == class652.aClass379_8397)
			aClass375_8420 = new Class375_Sub2(class652);
		else
			throw new RuntimeException();
	}

	public static void method10725(Class652 class652) {
		if (Class379.aClass379_3931 == class652.aClass379_8397)
			aClass375_8420 = new Class375_Sub1(class652);
		else if (Class379.aClass379_3930 == class652.aClass379_8397)
			aClass375_8420 = new Class375_Sub2(class652);
		else
			throw new RuntimeException();
	}

	public static boolean method10726(int i, int i_0_) {
		if (aClass375_8420 == null || aClass375_8420.method6357((byte) 36) == null)
			return false;
		if (i_0_ == i)
			return true;
		Class366 class366 = aClass375_8420.method6357((byte) 36).method6333(i, -1324879515);
		Class366 class366_1_ = aClass375_8420.method6357((byte) 36).method6333(i_0_, -1837728145);
		Class366 class366_2_ = class366;
		while_149_: do {
			do {
				if (class366_2_ == null)
					break while_149_;
				class366_2_ = class366_2_.method6319((byte) 14);
				if (class366_1_ == class366_2_)
					return true;
			} while (class366_2_ != class366);
			return false;
		} while (false);
		class366_2_ = class366_1_;
		while_150_: do {
			do {
				if (class366_2_ == null)
					break while_150_;
				class366_2_ = class366_2_.method6319((byte) 14);
				if (class366_2_ == class366)
					return true;
			} while (class366_2_ != class366_1_);
			return false;
		} while (false);
		return false;
	}

	public static void method10727() {
		if (null != aClass375_8420) {
			aClass375_8420.method6369(-1414713927);
			aClass375_8420 = null;
		}
	}

	public static Interface71 method10728(Class472 class472, int i, Interface69 interface69, boolean bool, Class209 class209) {
		if (null != aClass375_8420) {
			if (bool)
				return new Class598(class472, i, aClass375_8420, interface69);
			return new Class605(class472, i, aClass375_8420, interface69, class209);
		}
		return null;
	}

	public static void method10729() {
		if (null != aClass375_8420)
			aClass375_8420.method6368(-1356349009);
	}

	public static Interface71 method10730(Class472 class472, int i, Interface69 interface69, boolean bool, Class209 class209) {
		if (null != aClass375_8420) {
			if (bool)
				return new Class598(class472, i, aClass375_8420, interface69);
			return new Class605(class472, i, aClass375_8420, interface69, class209);
		}
		return null;
	}

	public static Class366 method10731(int i) {
		if (aClass375_8420 != null)
			return aClass375_8420.method6357((byte) 36).method6333(i, 369391954);
		return null;
	}

	public static void method10732(int i, int i_3_, float f, Interface44 interface44) {
		if (null != aClass375_8420)
			aClass375_8420.method6357((byte) 36).method6336(i, i_3_, f, interface44, -1090748824);
	}

	public static void method10733(int i, int i_4_, float f, Interface44 interface44) {
		if (null != aClass375_8420)
			aClass375_8420.method6357((byte) 36).method6336(i, i_4_, f, interface44, -1090748824);
	}

	Class655() throws Throwable {
		throw new Error();
	}

	public static Class366 method10734(int i) {
		if (aClass375_8420 != null)
			return aClass375_8420.method6357((byte) 36).method6333(i, 1473037494);
		return null;
	}

	public static Class366 method10735(int i) {
		if (aClass375_8420 != null)
			return aClass375_8420.method6357((byte) 36).method6333(i, -347972813);
		return null;
	}

	public static void method10736() {
		if (null != aClass375_8420) {
			aClass375_8420.method6369(-1703837297);
			aClass375_8420 = null;
		}
	}

	public static boolean method10737(int i, int i_5_) {
		if (aClass375_8420 == null || aClass375_8420.method6357((byte) 36) == null)
			return false;
		if (i_5_ == i)
			return true;
		Class366 class366 = aClass375_8420.method6357((byte) 36).method6333(i, 1874813547);
		Class366 class366_6_ = aClass375_8420.method6357((byte) 36).method6333(i_5_, 1218372319);
		Class366 class366_7_ = class366;
		while_151_: do {
			do {
				if (class366_7_ == null)
					break while_151_;
				class366_7_ = class366_7_.method6319((byte) 14);
				if (class366_6_ == class366_7_)
					return true;
			} while (class366_7_ != class366);
			return false;
		} while (false);
		class366_7_ = class366_6_;
		while_152_: do {
			do {
				if (class366_7_ == null)
					break while_152_;
				class366_7_ = class366_7_.method6319((byte) 14);
				if (class366_7_ == class366)
					return true;
			} while (class366_7_ != class366_6_);
			return false;
		} while (false);
		return false;
	}

	static final void method10738(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_8_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_9_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class523_Sub27_Sub15 class523_sub27_sub15 = Class194_Sub3.method15490(i_8_, i_9_, -1790133114);
		if (class523_sub27_sub15 != null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1066462451 * class523_sub27_sub15.anInt11762;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class217.method3955((class523_sub27_sub15.aLong11760 * 2598443596916794745L), (Class53_Sub20.aClass668_10979.anInt8549 * 1965832361), -1748382831);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub15.anInt11769 * -560691001;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (null != class523_sub27_sub15.aString11761 ? class523_sub27_sub15.aString11761 : "");
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class523_sub27_sub15.aString11764 != null ? class523_sub27_sub15.aString11764 : "");
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (null != class523_sub27_sub15.aString11765 ? class523_sub27_sub15.aString11765 : "");
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class523_sub27_sub15.aString11766 != null ? class523_sub27_sub15.aString11766 : "");
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub15.anInt11767 * 164921411;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (null != class523_sub27_sub15.aString11768 ? class523_sub27_sub15.aString11768 : "");
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (class523_sub27_sub15.aClass421_11759 != null ? class523_sub27_sub15.aClass421_11759.method82() : -1);
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		}
	}

	static final void method10739(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class449.aClass523_Sub33_4946.aClass687_Sub39_10605.method17063(806595627) && Class31.aClass178_303.method3032()) ? 1 : 0;
	}

	static final void method10740(Class669 class669, int i) {
		if (Class481.aClass551_5473.method9127(86, (byte) -72))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
