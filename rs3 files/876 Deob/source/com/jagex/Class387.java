/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class387 {
	public int[] anIntArray4008;
	public QuickChatOptionDefinitions aClass523_Sub27_Sub18_4009;
	public int anInt4010;

	public static Class387 method6462(RSBuffer class523_sub34) {
		Class387 class387 = new Class387();
		class387.anInt4010 = class523_sub34.readUnsignedShort(-729429060) * 266937769;
		class387.aClass523_Sub27_Sub18_4009 = Class645.aClass24_8347.method839(-1038659943 * class387.anInt4010, (byte) -41);
		return class387;
	}

	public static Class387 method6463(RSBuffer class523_sub34) {
		Class387 class387 = new Class387();
		class387.anInt4010 = class523_sub34.readUnsignedShort(-85933820) * 266937769;
		class387.aClass523_Sub27_Sub18_4009 = Class645.aClass24_8347.method839(-1038659943 * class387.anInt4010, (byte) 72);
		return class387;
	}

	static final void method6464(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class633.method10398(class250, class242, class669, (byte) -15);
	}

	static final void method6465(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984);
	}

	static final void method6466(Class669 class669, byte i) {
		if ((0 != client.anInt11136 * -2020118759 && -2020118759 * client.anInt11136 != 9) || Class366.method6324(2010683534))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else if (Class6.aBool43)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else if (-6238550899556605781L * Class228.aLong2349 > TimeUtils.getCurrentTimeMilliseconds(1516375036) - 1000L)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else {
			Class6.aBool43 = true;
			RSStream class116 = Class537.method8941(-1299707313);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4209, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class595.anInt7820 * -325807041, -2120998098);
			class116.method1974(class523_sub22, (byte) 21);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		}
	}

	static final void method6467(int i) {
		Class43.aLong573 = -9083684963104943157L;
		Class43.aLong577 = 0L;
		Class43.anInt572 = 1907326441;
	}

	static Class523_Sub33 method6468(int i) {
		Class19 class19 = null;
		Class523_Sub33 class523_sub33 = new Class523_Sub33(client.aClass681_11284, 0);
		try {
			class19 = Class53_Sub2.method17146("", client.aClass681_11284.aString8645, false, 1839898966);
			byte[] is = new byte[(int) class19.method795(1018427202)];
			int i_0_;
			for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
				i_0_ = class19.method784(is, i_1_, is.length - i_1_, (byte) 16);
				if (-1 == i_0_)
					throw new IOException();
			}
			class523_sub33 = new Class523_Sub33(new RSBuffer(is), client.aClass681_11284, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class19)
				class19.method786(1782143472);
		} catch (Exception exception) {
			/* empty */
		}
		return class523_sub33;
	}
}
