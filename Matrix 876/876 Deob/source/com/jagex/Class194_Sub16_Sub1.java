/* Class194_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub16_Sub1 extends Class194_Sub16 {
	int anInt11393;
	int anInt11394;
	int anInt11395;

	Class194_Sub16_Sub1(RSBuffer class523_sub34) {
		super(class523_sub34);
		int i = class523_sub34.readUnsignedInt((byte) -114);
		anInt11395 = -10807497 * (i >>> 16);
		anInt11393 = -274772717 * (i & 0xffff);
		anInt11394 = class523_sub34.readUnsignedByte(379913976) * -1046073583;
	}

	public void method3648(int i) {
		int i_0_ = anInt11395 * 2023558656 + 256;
		int i_1_ = anInt11393 * 1896494592 + 256;
		int i_2_ = anInt11394 * -1481334287;
		if (i_2_ < 3 && (client.aClass505_11019.method8243(2079762921).method7282(anInt11395 * -2093199737, -650607333 * anInt11393, -638715901)))
			i_2_++;
		Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = (new Class647_Sub1_Sub3_Sub4(client.aClass505_11019.method8241((byte) -87), anInt9938 * -1290676097, 0, anInt11394 * -1481334287, i_2_, i_0_, Class53_Sub17.method17220(i_0_, i_1_, anInt11394 * -1481334287, -151355447) - anInt9937 * -148075917, i_1_, anInt11395 * -2093199737, anInt11395 * -2093199737, anInt11393 * -650607333, anInt11393 * -650607333, anInt9939 * -241063875, false, 0));
		client.aClass14_11174.method738(new Class523_Sub27_Sub9(class647_sub1_sub3_sub4), (long) (anInt11395 * -2093199737 << 16 | anInt11393 * -650607333));
	}

	public void method3651() {
		int i = anInt11395 * 2023558656 + 256;
		int i_3_ = anInt11393 * 1896494592 + 256;
		int i_4_ = anInt11394 * -1481334287;
		if (i_4_ < 3 && (client.aClass505_11019.method8243(485887938).method7282(anInt11395 * -2093199737, -650607333 * anInt11393, -638715901)))
			i_4_++;
		Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = (new Class647_Sub1_Sub3_Sub4(client.aClass505_11019.method8241((byte) -30), anInt9938 * -1290676097, 0, anInt11394 * -1481334287, i_4_, i, Class53_Sub17.method17220(i, i_3_, anInt11394 * -1481334287, 1318078801) - anInt9937 * -148075917, i_3_, anInt11395 * -2093199737, anInt11395 * -2093199737, anInt11393 * -650607333, anInt11393 * -650607333, anInt9939 * -241063875, false, 0));
		client.aClass14_11174.method738(new Class523_Sub27_Sub9(class647_sub1_sub3_sub4), (long) (anInt11395 * -2093199737 << 16 | anInt11393 * -650607333));
	}

	public void method3656() {
		int i = anInt11395 * 2023558656 + 256;
		int i_5_ = anInt11393 * 1896494592 + 256;
		int i_6_ = anInt11394 * -1481334287;
		if (i_6_ < 3 && (client.aClass505_11019.method8243(474037021).method7282(anInt11395 * -2093199737, -650607333 * anInt11393, -638715901)))
			i_6_++;
		Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = (new Class647_Sub1_Sub3_Sub4(client.aClass505_11019.method8241((byte) -68), anInt9938 * -1290676097, 0, anInt11394 * -1481334287, i_6_, i, Class53_Sub17.method17220(i, i_5_, anInt11394 * -1481334287, -152833974) - anInt9937 * -148075917, i_5_, anInt11395 * -2093199737, anInt11395 * -2093199737, anInt11393 * -650607333, anInt11393 * -650607333, anInt9939 * -241063875, false, 0));
		client.aClass14_11174.method738(new Class523_Sub27_Sub9(class647_sub1_sub3_sub4), (long) (anInt11395 * -2093199737 << 16 | anInt11393 * -650607333));
	}

	public void method3657() {
		int i = anInt11395 * 2023558656 + 256;
		int i_7_ = anInt11393 * 1896494592 + 256;
		int i_8_ = anInt11394 * -1481334287;
		if (i_8_ < 3 && (client.aClass505_11019.method8243(402457385).method7282(anInt11395 * -2093199737, -650607333 * anInt11393, -638715901)))
			i_8_++;
		Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = (new Class647_Sub1_Sub3_Sub4(client.aClass505_11019.method8241((byte) -94), anInt9938 * -1290676097, 0, anInt11394 * -1481334287, i_8_, i, Class53_Sub17.method17220(i, i_7_, anInt11394 * -1481334287, -931466797) - anInt9937 * -148075917, i_7_, anInt11395 * -2093199737, anInt11395 * -2093199737, anInt11393 * -650607333, anInt11393 * -650607333, anInt9939 * -241063875, false, 0));
		client.aClass14_11174.method738(new Class523_Sub27_Sub9(class647_sub1_sub3_sub4), (long) (anInt11395 * -2093199737 << 16 | anInt11393 * -650607333));
	}
}
