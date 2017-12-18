/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class562 {
	static final int anInt7560 = 2048;
	static final int anInt7561 = 2048;
	public static final int anInt7562 = 16384;
	public static final int anInt7563 = 16384;
	public static int anInt7564;

	Class562() throws Throwable {
		throw new Error();
	}

	public static int method9458(String string, int i) {
		return Class323.aTwitchTV3452.ChatSendMessage(string);
	}

	static final void method9459(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -2079930045);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1419153773 * class250.anInt2523;
	}

	static final boolean method9460(char c, int i) {
		return '\u00a0' == c || ' ' == c || '_' == c || '-' == c;
	}

	static void method9461(Class669 class669, int i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 2] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815) - 2]), (byte) 102)).method5073(Class98_Sub1_Sub2.playerVarsProvider, class669.anIntArray8557[1357652815 * class669.anInt8558 - 1], 1266476656)) ? 1 : 0;
		class669.anInt8558 -= 2138772399;
	}

	static void method9462(byte i) {
		if (Class506.anInt5696 * -664699347 > 1)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 4, -1259085113);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 2, -1332036937);
	}

	static void method9463(int i, String string, boolean bool, byte i_1_) {
		Class330.method5821(172654681);
		Class571.method9620((byte) 16);
		Class513.method8582((byte) 95);
		Class242.method4372(i, string, bool, (byte) 0);
		Class491.aClass423_5536.method6686((byte) 35);
		Class491.aClass423_5536.method6685(client.anInterface50_11044, -9147139);
		Class491.aClass423_5536.method6693((short) 255);
		Class2.method513(Class31.aClass178_303, 1803071567);
		Class308.method5599(Class31.aClass178_303, Class523_Sub8.aClass472_10406, -343924506);
		Class522_Sub1.method15784(458763482);
		Class676_Sub1.method16781(-1240802613);
		Class165.method2655((byte) 10);
		if (client.anInt11136 * -2020118759 == 16)
			Class657.method10791(7, (byte) -108);
		else if (0 == -2020118759 * client.anInt11136)
			Class657.method10791(14, (byte) -54);
		else if (client.anInt11136 * -2020118759 == 8)
			Class657.method10791(6, (byte) -32);
		else if (-2020118759 * client.anInt11136 == 9)
			Class657.method10791(10, (byte) -114);
		else if (15 == client.anInt11136 * -2020118759 || 12 == -2020118759 * client.anInt11136)
			Class528.method8733(-1000966751);
		else if (client.anInt11136 * -2020118759 == 11)
			Class657.method10791(5, (byte) -91);
		else if (-2020118759 * client.anInt11136 == 10)
			Class112.method1953(false, -888208492);
	}

	static final void method9464(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class502.method8158((byte) 118);
		if (null != class523_sub27_sub17) {
			boolean bool = class523_sub27_sub17.method18193(i_2_ >> 28 & 0x3, i_2_ >> 14 & 0x3fff, i_2_ & 0x3fff, Class663.anIntArray8517, (short) -27849);
			if (bool)
				Class321.method5719(Class663.anIntArray8517[1], Class663.anIntArray8517[2], (byte) -83);
		}
	}

	static final void method9465(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		String string_3_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		if (client.rights * -1746920271 != 0 || ((!client.aBool11160 || client.aBool11161) && !client.aBool11164)) {
			Class116 class116 = Class537.method8941(-1517290155);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4262, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -6);
			int i_4_ = (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 59);
			Class257.method4683(class523_sub22.aClass523_Sub34_Sub2_10525, string_3_, (short) -14740);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16275(2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i_4_, 578201864);
			class116.method1974(class523_sub22, (byte) 69);
		}
	}

	static final void method9466(int i, int i_5_, int i_6_) {
		if (Class69.method1464(i, null, 1675244320))
			Class288.method5164((Class31.aClass242Array302[i].aClass250Array2457), i_5_, (byte) 0);
	}
}
