/* Class667 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class667 {
	int anInt8537;
	Class592 aClass592_8538;

	public Class647_Sub1_Sub5_Sub1 method13666(byte i) {
		Class523_Sub10 class523_sub10 = ((Class523_Sub10) (client.aClass14_11172.method741((long) (-608757111 * aClass592_8538.anInt7809 << 28 | aClass592_8538.localY * 1704054549 << 14 | aClass592_8538.localX * 235453015))));
		if (class523_sub10 == null)
			return null;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_0_ = (aClass592_8538.localX * 235453015 - class592.localX * 235453015);
		int i_1_ = (1704054549 * aClass592_8538.localY - class592.localY * 1704054549);
		if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass505_11019.method8292((byte) 87) && i_1_ < client.aClass505_11019.method8235(2135165892) && client.aClass505_11019.method8241((byte) -28) != null) {
			for (Class523_Sub25 class523_sub25 = (Class523_Sub25) class523_sub10.aClass708_10417.method14240(2117917187); class523_sub25 != null; class523_sub25 = (Class523_Sub25) class523_sub10.aClass708_10417.method14244((byte) 68)) {
				if (911259079 * anInt8537 == -188706487 * class523_sub25.anInt10544)
					return ((Class647_Sub1_Sub5_Sub1) (client.aClass505_11019.method8241((byte) -126).method9283(-608757111 * aClass592_8538.anInt7809, i_0_, i_1_, (byte) 66)));
			}
		}
		return null;
	}

	public Class667(Class592 class592, int i) {
		aClass592_8538 = class592;
		anInt8537 = -2132378633 * i;
	}

	static final void method13667(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class495.method8101(i_2_, 1739714782);
	}

	static final void method13668(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
	}

	static final void method13669(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class641.method10531(class250, class242, class669, -256291264);
	}

	static final void method13670(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4246, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 1, -1860721452);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 21);
		client.aClass116_11058.method1974(class523_sub22, (byte) 54);
	}
}
