/* Class53_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class53_Sub16 extends Class53 {
	public Class53_Sub16(Class681 class681, Class668 class668, Class472 class472) {
		super(class681, class668, class472, JS5ConfigStruct.aClass656_8431, 128, new Class68(com.jagex.ClientScriptDefinitions.class));
	}

	static void method17217(int i, int i_0_, int i_1_) {
		VarBitDefinitions class309 = (VarBitDefinitions) Class539.aClass53_Sub3_7213.getDefinition(i, (byte) -69);
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(1, (long) (-80020449 * (class309.aClass159_3367.anInt1754)));
		try {
			if (Class523_Sub27_Sub7.aBool11677)
				class523_sub27_sub7.anInt11653 = (Class423.clientConfigsDomain.method94(class309.aClass159_3367, -1520566780) * -1217347391);
			class523_sub27_sub7.anInt11653 = class309.method5602((class523_sub27_sub7.anInt11653 * 1313066817), i_0_, (byte) 49) * -1217347391;
			class523_sub27_sub7.method17963(754433440);
		} catch (Exception_Sub2 exception_sub2) {
			Class305.method5553(new StringBuilder().append("").append(i).toString(), exception_sub2, (byte) 1);
		}
	}

	static final void method17218(Class669 class669, int i) {
		class669.anInt8560 -= -587057089;
		class669.anInt8558 -= -17422498;
		Class155.method2544((String) (class669.anObjectArray8559[240723773 * class669.anInt8560]), (String) (class669.anObjectArray8559[1 + 240723773 * class669.anInt8560]), (class669.anIntArray8557[class669.anInt8558 * 1357652815]), 1 == (class669.anIntArray8557[1 + 1357652815 * class669.anInt8558]), (String) (class669.anObjectArray8559[2 + class669.anInt8560 * 240723773]), (short) 27081);
	}
}
