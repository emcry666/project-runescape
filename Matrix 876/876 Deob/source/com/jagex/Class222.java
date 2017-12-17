/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;

public class Class222 implements Interface28 {
	Class426 aClass426_2333;
	Class224 this$0;
	public static int anInt2334;

	public void method165(Class218 class218) {
		if (aClass426_2333 != null)
			class218.method4024(-1722487076).method116(((Class159) (this$0.anInterface27_2338.method160(1215182171).getDefinition(aClass426_2333.anInt4821 * -408785679, (byte) -35))), aClass426_2333.anObject4822, -1416766664);
	}

	public void method163(Class218 class218, int i) {
		if (aClass426_2333 != null)
			class218.method4024(-2117439279).method116(((Class159) (this$0.anInterface27_2338.method160(1215182171).getDefinition(aClass426_2333.anInt4821 * -408785679, (byte) -75))), aClass426_2333.anObject4822, 804268512);
	}

	Class222(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		if (class523_sub34.readUnsignedShort(-1238394806) != 65535) {
			class523_sub34.offset -= 379531446;
			aClass426_2333 = class224.anInterface27_2338.method160(1215182171).refreshNIS(class523_sub34, 196678471);
		} else
			aClass426_2333 = null;
	}

	public void method161(Class218 class218) {
		if (aClass426_2333 != null)
			class218.method4024(482612980).method116(((Class159) (this$0.anInterface27_2338.method160(1215182171).getDefinition(aClass426_2333.anInt4821 * -408785679, (byte) 39))), aClass426_2333.anObject4822, -1283070957);
	}

	public void method162(Class218 class218) {
		if (aClass426_2333 != null)
			class218.method4024(-1764069652).method116(((Class159) (this$0.anInterface27_2338.method160(1215182171).getDefinition(aClass426_2333.anInt4821 * -408785679, (byte) 14))), aClass426_2333.anObject4822, 464879233);
	}

	public void method164(Class218 class218) {
		if (aClass426_2333 != null)
			class218.method4024(1326420592).method116(((Class159) (this$0.anInterface27_2338.method160(1215182171).getDefinition(aClass426_2333.anInt4821 * -408785679, (byte) -10))), aClass426_2333.anObject4822, -1917439411);
	}

	static byte[] method4139(File file, int i, byte i_0_) {
		byte[] is;
		try {
			byte[] is_1_ = new byte[i];
			Class170.method2888(file, is_1_, i, -604830330);
			is = is_1_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	public static int method4140(int i) {
		return Class323.aTwitchTV3452.GetViewerCount();
	}

	static final void method4141(Class669 class669, byte i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_3_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class437 class437 = Class437.method6879((float) i_2_, (float) i_2_, (float) i_2_);
		if (-1.0F == class437.aFloat4903)
			class437.aFloat4903 = Float.POSITIVE_INFINITY;
		if (-1.0F == class437.aFloat4904)
			class437.aFloat4904 = Float.POSITIVE_INFINITY;
		if (class437.aFloat4905 == -1.0F)
			class437.aFloat4905 = Float.POSITIVE_INFINITY;
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5319(class437, -1041617368);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5316((float) i_3_ / 1000.0F, 365308179);
		class437.method6949();
	}

	static final void method4142(Class669 class669, short i) {
		Class65.method1433(class669, 75233380);
	}
}
