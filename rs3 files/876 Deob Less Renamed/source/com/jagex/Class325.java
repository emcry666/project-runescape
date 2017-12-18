/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class325 implements Interface33 {
	Class395 aClass395_3455;

	public void method208(boolean bool) {
		if (bool)
			Class31.aClass178_303.method3193(0, 0, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, (aClass395_3455.anInt4057 * -668188707), 0);
	}

	public boolean method211() {
		return true;
	}

	public void method210(int i) {
		/* empty */
	}

	public boolean method209(byte i) {
		return true;
	}

	Class325(Class395 class395) {
		aClass395_3455 = class395;
	}

	public void method213(boolean bool, short i) {
		if (bool)
			Class31.aClass178_303.method3193(0, 0, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, (aClass395_3455.anInt4057 * -668188707), 0);
	}

	public void method212() {
		/* empty */
	}

	static final void method5735(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class614.method10060(class250, class242, class669, -1747863168);
	}

	static final void method5736(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -646403547);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class613.method10054(class250, class242, class669, -1448299598);
	}

	static final void method5737(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class239 class239 = ((Class239) Class287.aClass53_Sub1_3102.getDefinition(i_1_, (byte) -14));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1444609703 * class239.anInt2443;
	}

	static String method5738(int i, Class668 class668, Class625 class625, int i_2_) {
		if (i < 100000)
			return new StringBuilder().append(Class288.method5163(114388337 * class625.anInt8138, -183686774)).append(i).append(ItemDefinitions.aString171).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class288.method5163(class625.anInt8161 * -1459907571, -688943909)).append(i / 1000).append(Class39.aClass39_520.method1124(class668, (byte) -102)).append(ItemDefinitions.aString171).toString();
		return new StringBuilder().append(Class288.method5163(class625.anInt8162 * 2086406891, -327165512)).append(i / 1000000).append(Class39.aClass39_518.method1124(class668, (byte) -107)).append(ItemDefinitions.aString171).toString();
	}

	public static final void method5739(boolean bool, int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.CLOSE_INTERFACE_PACKET, client.aClass116_11058.aClass11_1413, 1370050649);
		client.aClass116_11058.method1974(class523_sub22, (byte) 98);
		for (Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255)); null != class523_sub36; class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method749(60817144))) {
			if (!class523_sub36.method8660(-264166446)) {
				class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255));
				if (class523_sub36 == null)
					break;
			}
			if (class523_sub36.anInt10667 * -1502434839 == 0)
				Class579.method9657(class523_sub36, true, bool, -1982424981);
		}
		if (null != client.aClass250_11189) {
			Class523_Sub14.method15991(client.aClass250_11189, (byte) -127);
			client.aClass250_11189 = null;
		}
	}

	static final void method5740(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method13890(i_3_, 1912523630);
	}
}
