/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class471 {
	int anInt5358;
	static Class471 aClass471_5359;
	public static Class471 aClass471_5360 = new Class471(0);
	static int anInt5361;

	static {
		aClass471_5359 = new Class471(1);
	}

	Class471(int i) {
		anInt5358 = -2100936039 * i;
	}

	static boolean method7636(int i) {
		return Class54.aClass62_729 != null;
	}

	static final void method7637(Class669 class669, int i) {
		int id = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions definition = Class188.getDefinitions(id, -2056961447);
		Class242 class242 = Class31.aClass242Array302[id >> 16];
		Class254.method4548(definition, class242, class669, 2054730978);
	}

	public static QuickChatStringType getQuickChatType(int id, int i_1_) {
		QuickChatStringType[] types = JS5ReferenceTable.getQuickChatTypes((byte) -99);
		for (int index = 0; index < types.length; index++) {
			if (id == -1912590719 * types[index].id)
				return types[index];
		}
		return null;
	}

	static final void method7639(Class669 class669, int i) {
		Class459.method7496((String) (class669.anObjectArray8559[((class669.anInt8560 -= 1235970069) * 240723773)]), -1055577630);
	}
}
