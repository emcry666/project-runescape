/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class396 implements Interface72 {
	public String method486(QuickChatStringType type, int[] is, long l) {
		if (type == QuickChatStringType.QC_GENERAL) {
			ClientScriptDefinitions definitions = ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(is[0], (byte) -14));
			return definitions.getStringValue((int) l, 184737274);
		}
		if (QuickChatStringType.QC_ITEM == type || QuickChatStringType.QC_ITEM_TRADE == type) {
			ItemDefinitions definitions = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition((int) l, (byte) -76);
			return definitions.itemName;
		}
		if (type == QuickChatStringType.QC_SLAYER_TASK || QuickChatStringType.aClass636_8287 == type || QuickChatStringType.QC_EXPERIENCE == type)
			return ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(is[0], (byte) -17)).getStringValue((int) l, 651835377);
		return null;
	}

	public String method485(QuickChatStringType class636, int[] is, long l) {
		if (class636 == QuickChatStringType.QC_GENERAL) {
			ClientScriptDefinitions class37 = ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(is[0], (byte) -57));
			return class37.getStringValue((int) l, -574211671);
		}
		if (QuickChatStringType.QC_ITEM == class636 || QuickChatStringType.QC_ITEM_TRADE == class636) {
			ItemDefinitions class12 = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition((int) l, (byte) 12);
			return class12.itemName;
		}
		if (class636 == QuickChatStringType.QC_SLAYER_TASK || QuickChatStringType.aClass636_8287 == class636 || QuickChatStringType.QC_EXPERIENCE == class636)
			return ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(is[0], (byte) 29)).getStringValue((int) l, 1135537516);
		return null;
	}

	static void method6512(InterfaceComponentDefinitions class250, int i, int i_0_, int i_1_) {
		if (client.aBool11000) {
			Class76 class76 = ((Class76) (-1 != 1180578917 * Class13.anInt173 ? Class60.aClass53_Sub22_766.getDefinition(1180578917 * Class13.anInt173, (byte) -90) : null));
			if (client.method17252(class250).method15970(-644609024) && 0 != (Class570.anInt7658 * 382935923 & 0x20) && (null == class76 || (class250.method4441(Class13.anInt173 * 1180578917, class76.anInt850 * -1100663923, -78557670) != -1100663923 * class76.anInt850)))
				Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(class250.aString2639).toString(), Class684.anInt8664 * 2088669163, 58, -1878986101 * class250.anInt2680, 0L, 234012635 * class250.anInt2709, -1363815505 * class250.interfaceHash, true, false, (long) (234012635 * class250.anInt2709 << 0 | (-1363815505 * class250.interfaceHash)), false, (byte) -51);
		}
		for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
			String string = Class512.method8576(class250, i_2_, (byte) 4);
			if (null != string)
				Class463.method7523(string, class250.aString2639, VarDomainType.method7634(class250, i_2_, -955248353), 1007, class250.anInt2680 * -1878986101, (long) (i_2_ + 1), 234012635 * class250.anInt2709, -1363815505 * class250.interfaceHash, true, false, (long) (class250.anInt2709 * 234012635 << 0 | (class250.interfaceHash * -1363815505)), false, (byte) 22);
		}
		String string = Class188.method3596(class250, 395321381);
		if (null != string)
			Class463.method7523(string, class250.aString2639, class250.anInt2629 * -1223189369, 25, class250.anInt2680 * -1878986101, 0L, class250.anInt2709 * 234012635, class250.interfaceHash * -1363815505, true, false, (long) (class250.anInt2709 * 234012635 << 0 | class250.interfaceHash * -1363815505), false, (byte) -45);
		for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
			String string_4_ = Class512.method8576(class250, i_3_, (byte) 4);
			if (null != string_4_)
				Class463.method7523(string_4_, class250.aString2639, VarDomainType.method7634(class250, i_3_, 1026541577), 57, class250.anInt2680 * -1878986101, (long) (i_3_ + 1), class250.anInt2709 * 234012635, -1363815505 * class250.interfaceHash, true, false, (long) (234012635 * class250.anInt2709 << 0 | (-1363815505 * class250.interfaceHash)), false, (byte) -80);
		}
		if (client.method17252(class250).method15979(-324551694)) {
			if (null != class250.aString2641)
				Class463.method7523(class250.aString2641, "", -1, 30, -1878986101 * class250.anInt2680, 0L, 234012635 * class250.anInt2709, class250.interfaceHash * -1363815505, true, false, (long) (234012635 * class250.anInt2709 << 0 | (-1363815505 * class250.interfaceHash)), false, (byte) -52);
			else
				Class463.method7523(Class39.aClass39_393.method1124(Class53_Sub20.aClass668_10979, (byte) -9), "", -1, 30, class250.anInt2680 * -1878986101, 0L, 234012635 * class250.anInt2709, -1363815505 * class250.interfaceHash, true, false, (long) (class250.anInt2709 * 234012635 << 0 | class250.interfaceHash * -1363815505), false, (byte) -19);
		}
	}

	static final void method6513(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class250.aBool2692 = false;
		Login.method15991(class250, (byte) -33);
	}

	static final void method6514(Class669 class669, byte i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_5_, -2130126128);
		Class231.method4251(class250, class669, (byte) -67);
	}

	static final void method6515(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int[] is = Class594.method9807(string, class669, (byte) 0);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2654 = Class78.method1554(string, class669, -68449792);
		class250.anIntArray2609 = is;
		class250.aBool2635 = true;
	}

	static int method6516(Class611_Sub1 class611_sub1, Class611_Sub1 class611_sub1_6_, int i, boolean bool, int i_7_, boolean bool_8_, int i_9_) {
		int i_10_ = Class389.method6477(class611_sub1, class611_sub1_6_, i, bool, 500949973);
		if (0 != i_10_) {
			if (bool)
				return -i_10_;
			return i_10_;
		}
		if (-1 == i_7_)
			return 0;
		int i_11_ = Class389.method6477(class611_sub1, class611_sub1_6_, i_7_, bool_8_, 707010279);
		if (bool_8_)
			return -i_11_;
		return i_11_;
	}
}
