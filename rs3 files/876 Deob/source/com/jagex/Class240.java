/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class240 implements Interface28 {
	int anInt2447;
	int anInt2448;
	Class224 this$0;

	public void method163(Class218 class218, int i) {
		class218.method3982(anInt2447 * 70511127, anInt2448 * -835392397, (byte) 0);
		class218.method3967(70511127 * anInt2447, (byte) 2).method4221(705330603);
	}

	public void method165(Class218 class218) {
		class218.method3982(anInt2447 * 70511127, anInt2448 * -835392397, (byte) 56);
		class218.method3967(70511127 * anInt2447, (byte) 2).method4221(529960870);
	}

	public void method162(Class218 class218) {
		class218.method3982(anInt2447 * 70511127, anInt2448 * -835392397, (byte) 56);
		class218.method3967(70511127 * anInt2447, (byte) 2).method4221(-1656886884);
	}

	public void method161(Class218 class218) {
		class218.method3982(anInt2447 * 70511127, anInt2448 * -835392397, (byte) 27);
		class218.method3967(70511127 * anInt2447, (byte) 2).method4221(323393325);
	}

	public void method164(Class218 class218) {
		class218.method3982(anInt2447 * 70511127, anInt2448 * -835392397, (byte) 39);
		class218.method3967(70511127 * anInt2447, (byte) 2).method4221(-1044218970);
	}

	Class240(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		anInt2447 = class523_sub34.readUnsignedShort(-1189805602) * -221385305;
		anInt2448 = class523_sub34.readUnsignedShort(-1656082264) * -1082025797;
	}

	static final void method4341(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class588 class588 = (Class588) Class80.aClass53_Sub17_866.getDefinition(i_0_, (byte) -28);
		if (class588.anIntArray7749 != null && class588.anIntArray7749.length > 0) {
			int i_1_ = 0;
			int i_2_ = class588.anIntArray7750[0];
			for (int i_3_ = 1; i_3_ < class588.anIntArray7749.length; i_3_++) {
				if (class588.anIntArray7750[i_3_] > i_2_) {
					i_1_ = i_3_;
					i_2_ = class588.anIntArray7750[i_3_];
				}
			}
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class588.anIntArray7749[i_1_];
		} else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class588.anInt7786 * -1932039029;
	}

	static final void method4342(Class669 class669, boolean bool, int i) {
		class669.anInt8558 -= -17422498;
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class86 class86 = Class150.method2521(i_4_, -1783708445);
		if (null == class86)
			throw new RuntimeException();
		Class291.aList3155 = class86.method1600(Integer.valueOf(i_5_), -1508790246);
		if (null != Class291.aList3155) {
			Class700.anIterator8781 = Class291.aList3155.iterator();
			if (bool)
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class291.aList3155.size();
		} else if (bool)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method4343(Class669 class669, byte i) {
		Class709.method14317(class669, class669.aClass647_Sub1_Sub3_Sub1_8552, -1993508458);
	}

	static void method4344(Class178 class178, int i, int i_6_, InterfaceComponentDefinitions class250, byte i_7_) {
		int i_8_ = 127;
		int i_9_ = 7;
		for (int i_10_ = 63; i_10_ >= 0; i_10_--) {
			int i_11_ = (i_10_ & 0x3f) << 10 | (i_9_ & 0x7) << 7 | i_8_ & 0x7f;
			Class226.method4166(false, true, 240723773);
			int i_12_ = Class638.anIntArray8306[i_11_];
			Class305.method5552(false, true, (byte) 0);
			class178.method3193(i, (-1759297857 * class250.anInt2543 * (63 - i_10_) >> 6) + i_6_, 365308179 * class250.anInt2581, (-1759297857 * class250.anInt2543 >> 6) + 1, ~0xffffff | i_12_, 0);
		}
	}
}
