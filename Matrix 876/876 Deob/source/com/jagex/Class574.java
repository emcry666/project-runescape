/* Class574 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class574 implements Interface68 {
	int[] anIntArray7686;

	public static Class574 method9632(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedByte(235487423);
		int[] is = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			is[i_0_] = class523_sub34.readUnsignedByte(635572166);
		return new Class574(is);
	}

	public boolean method435(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551, byte i_1_) {
		int[] is = anIntArray7686;
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
			int i_3_ = is[i_2_];
			if (!class551.method9127(i_3_, (byte) 27))
				return false;
		}
		return true;
	}

	public boolean method433(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551) {
		int[] is = anIntArray7686;
		for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
			int i_5_ = is[i_4_];
			if (!class551.method9127(i_5_, (byte) 13))
				return false;
		}
		return true;
	}

	Class574(int[] is) {
		anIntArray7686 = is;
	}

	public static Class574 method9633(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedByte(-1482505316);
		int[] is = new int[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++)
			is[i_6_] = class523_sub34.readUnsignedByte(-1630830530);
		return new Class574(is);
	}

	public boolean method434(Class523_Sub39 class523_sub39, Interface64[] interface64s, int i, Class551 class551) {
		int[] is = anIntArray7686;
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
			int i_8_ = is[i_7_];
			if (!class551.method9127(i_8_, (byte) -42))
				return false;
		}
		return true;
	}

	public static Class574 method9634(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedByte(1102937196);
		int[] is = new int[i];
		for (int i_9_ = 0; i_9_ < i; i_9_++)
			is[i_9_] = class523_sub34.readUnsignedByte(-11728522);
		return new Class574(is);
	}

	static final void method9635(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}

	static final void method9636(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 234012635 * class250.anInt2709;
	}

	static final void method9637(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class290.method5217(class250, class242, class669, -345388791);
	}

	static final void method9638(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-225193312) == 1 ? 1 : 0;
	}
}
