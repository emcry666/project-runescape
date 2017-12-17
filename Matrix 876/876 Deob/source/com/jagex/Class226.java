/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class226 implements Interface28 {
	int anInt2343;
	Class224 this$0;
	int anInt2344;

	Class226(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		int i = class523_sub34.readUnsignedShort(-1496335066);
		if (65535 != i) {
			anInt2344 = -2043520071 * i;
			anInt2343 = class523_sub34.readUnsignedInt((byte) -75) * -482094029;
		} else {
			anInt2344 = 2043520071;
			anInt2343 = 0;
		}
	}

	public void method161(Class218 class218) {
		if (-1125303671 * anInt2344 != -1) {
			try {
				class218.method4024(-245406019).method117(((VarBitDefinitions) this$0.anInterface27_2338.method151((byte) 15).getDefinition(-1125303671 * anInt2344, (byte) 4)), 1822639867 * anInt2343, -2048564764);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	public void method162(Class218 class218) {
		if (-1125303671 * anInt2344 != -1) {
			try {
				class218.method4024(-1055932027).method117(((VarBitDefinitions) this$0.anInterface27_2338.method151((byte) 71).getDefinition(-1125303671 * anInt2344, (byte) 40)), 1822639867 * anInt2343, -198325923);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	public void method164(Class218 class218) {
		if (-1125303671 * anInt2344 != -1) {
			try {
				class218.method4024(1218566030).method117(((VarBitDefinitions) this$0.anInterface27_2338.method151((byte) 16).getDefinition(-1125303671 * anInt2344, (byte) -28)), 1822639867 * anInt2343, -814114698);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	public void method163(Class218 class218, int i) {
		if (-1125303671 * anInt2344 != -1) {
			try {
				class218.method4024(519352964).method117(((VarBitDefinitions) this$0.anInterface27_2338.method151((byte) 104).getDefinition(-1125303671 * anInt2344, (byte) -10)), 1822639867 * anInt2343, -518286497);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	public void method165(Class218 class218) {
		if (-1125303671 * anInt2344 != -1) {
			try {
				class218.method4024(925019510).method117(((VarBitDefinitions) this$0.anInterface27_2338.method151((byte) 109).getDefinition(-1125303671 * anInt2344, (byte) -5)), 1822639867 * anInt2343, -1316898343);
			} catch (Exception_Sub2 exception_sub2) {
				/* empty */
			}
		}
	}

	static final void method4159(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -348693947);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class457.method7443(class250, class242, false, 2, class669, 948101669);
	}

	static final void method4160(Class669 class669, int i) {
		Class602.method9940((byte) 1);
	}

	static final void method4161(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass647_Sub1_Sub5_Sub1_8568.method16740(1417611701);
	}

	static final void method4162(Class669 class669, int i) {
		class669.anInt8562 -= 204911810;
		if (class669.aLongArray8561[class669.anInt8562 * 2056702369] < class669.aLongArray8561[2056702369 * class669.anInt8562 + 1])
			class669.anInt8579 += (class669.anIntArray8577[1180759405 * class669.anInt8579] * -1774429083);
	}

	public static String method4163(CharSequence charsequence, Class73 class73, byte i) {
		if (charsequence == null)
			return null;
		int i_1_ = 0;
		int i_2_;
		for (i_2_ = charsequence.length(); (i_1_ < i_2_ && Class562.method9460(charsequence.charAt(i_1_), -369014672)); i_1_++) {
			/* empty */
		}
		for (/**/; i_2_ > i_1_ && Class562.method9460(charsequence.charAt(i_2_ - 1), -299214118); i_2_--) {
			/* empty */
		}
		int i_3_ = i_2_ - i_1_;
		if (i_3_ < 1 || i_3_ > Class216.method3850(class73, 755610082))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_3_);
		for (int i_4_ = i_1_; i_4_ < i_2_; i_4_++) {
			char c = charsequence.charAt(i_4_);
			if (Class593.method9803(c, (byte) 41)) {
				char c_5_ = Class611.method10037(c, 959132104);
				if ('\0' != c_5_)
					stringbuilder.append(c_5_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static boolean method4164(Interface61 interface61, byte i) {
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(1265091697).getDefinition(interface61.method401(-770473736), (byte) 37));
		if (-1 == 573415481 * class602.anInt7890)
			return true;
		Class46 class46 = ((Class46) Class334.aClass53_Sub14_3544.getDefinition(573415481 * class602.anInt7890, (byte) 46));
		if (-1 == -1232695553 * class46.anInt667)
			return true;
		return class46.method1242(-1891570643);
	}

	static void method4165(Class669 class669, int i) {
		int i_6_ = Class468.method7607(1686132423);
		if (i_6_ < 0) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class292.aTwitchEventLiveStreams3159.viewerCounts[i_6_];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.channelUrls[i_6_];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (Class292.aTwitchEventLiveStreams3159.previewUrlTemplates[i_6_]);
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.streamTitles[i_6_];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (Class292.aTwitchEventLiveStreams3159.channelDisplayNames[i_6_]);
		}
	}

	public static void method4166(boolean bool, boolean bool_7_, int i) {
		if (bool) {
			Class638.anInt8309 += 1410281817;
			Class294.method5260(1275447189);
		}
		if (bool_7_) {
			Class638.anInt8308 += -636711061;
			Class269.method4918((byte) -14);
		}
	}

	static final void method4167(Class669 class669, int i) {
		Class633.method10395(-2085838258);
	}
}
