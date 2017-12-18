/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class397 implements Interface45 {
	Class209 aClass209_4058 = new Class209(64);
	Class472 aClass472_4059;
	static boolean aBool4060;
	static Class472 aClass472_4061;

	public Class385 method342(int i) {
		Class385 class385 = (Class385) aClass209_4058.method3767((long) i);
		if (class385 != null)
			return class385;
		byte[] is = aClass472_4059.method7688(1, i, -468169810);
		class385 = new Class385();
		class385.anInt3985 = 2145353591 * i;
		if (is != null)
			class385.method6430(new RSBuffer(is), (byte) -54);
		class385.method6431((byte) 31);
		aClass209_4058.method3770(class385, (long) i);
		return class385;
	}

	public Class385 method343(int i, byte i_0_) {
		Class385 class385 = (Class385) aClass209_4058.method3767((long) i);
		if (class385 != null)
			return class385;
		byte[] is = aClass472_4059.method7688(1, i, -857488089);
		class385 = new Class385();
		class385.anInt3985 = 2145353591 * i;
		if (is != null)
			class385.method6430(new RSBuffer(is), (byte) -82);
		class385.method6431((byte) 31);
		aClass209_4058.method3770(class385, (long) i);
		return class385;
	}

	public Class397(Class472 class472) {
		aClass472_4059 = class472;
	}

	public void method6517(short i) {
		aClass209_4058.method3773(-2008885058);
	}

	public Class385 method340(int i) {
		Class385 class385 = (Class385) aClass209_4058.method3767((long) i);
		if (class385 != null)
			return class385;
		byte[] is = aClass472_4059.method7688(1, i, 1893464735);
		class385 = new Class385();
		class385.anInt3985 = 2145353591 * i;
		if (is != null)
			class385.method6430(new RSBuffer(is), (byte) -57);
		class385.method6431((byte) 31);
		aClass209_4058.method3770(class385, (long) i);
		return class385;
	}

	public Class385 method341(int i) {
		Class385 class385 = (Class385) aClass209_4058.method3767((long) i);
		if (class385 != null)
			return class385;
		byte[] is = aClass472_4059.method7688(1, i, -469042864);
		class385 = new Class385();
		class385.anInt3985 = 2145353591 * i;
		if (is != null)
			class385.method6430(new RSBuffer(is), (byte) -10);
		class385.method6431((byte) 31);
		aClass209_4058.method3770(class385, (long) i);
		return class385;
	}

	public void method6518() {
		aClass209_4058.method3773(-1864560561);
	}

	public void method6519() {
		aClass209_4058.method3773(-2140385428);
	}

	public static void method6520(byte i) {
		if ((9 == client.anInt11136 * -2020118759 || 10 == client.anInt11136 * -2020118759) && client.aClass116_11058 != null) {
			for (;;) {
				Interface66 interface66 = (Interface66) Class584.aLinkedList7714.poll();
				if (interface66 == null)
					break;
				interface66.method210(-2123282234);
			}
		}
	}

	static final void method6521(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_1_, -1083153496);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2605 * 1569774109;
	}

	static final void method6522(Class669 class669, int i) {
		Class65.method1433(class669, -1434314450);
	}

	static final void method6523(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class43.anInt614 * 57322801;
	}

	public static void method6524(String string, boolean bool, Class178 class178, Class164 class164, Class10 class10, int i) {
		boolean bool_2_ = !aBool4060 || Class144.method2379(-1565215705);
		if (bool_2_) {
			if (aBool4060 && bool_2_) {
				class10 = Class648.aClass10_8379;
				class164 = class178.method3111(class10, (Class523_Sub14_Sub3.aClass175_Sub2Array11699), true);
				int i_3_ = class10.method602(string, 250, null, 858294833);
				int i_4_ = class10.method605(string, 250, 1061510757 * class10.anInt78, null, -583854511);
				int i_5_ = Class114.aClass175_1404.method2944();
				int i_6_ = i_5_ + 4;
				i_3_ += 2 * i_6_;
				i_4_ += i_6_ * 2;
				if (i_3_ < Class114.anInt1400 * -1269256721)
					i_3_ = -1269256721 * Class114.anInt1400;
				if (i_4_ < -372163505 * Class523_Sub24.anInt10541)
					i_4_ = -372163505 * Class523_Sub24.anInt10541;
				int i_7_ = (Class114.aClass380_1402.method6400(i_3_, (1536768403 * (client.anInt11036)), (short) -3083) + 607246161 * Class197.anInt2192);
				int i_8_ = (Class391.aClass389_4021.method6473(i_4_, (-932988141 * (client.anInt11151)), 2146227393) + -848055073 * Class114.anInt1401);
				class178.method3104(Class330.aClass175_3499, false).method2464(i_7_ + Class61.aClass175_768.method2944(), i_8_ + Class61.aClass175_768.method2945(), i_3_ - Class61.aClass175_768.method2944() * 2, i_4_ - Class61.aClass175_768.method2945() * 2, 1, -1, 0);
				class178.method3104(Class61.aClass175_768, true).method2435(i_7_, i_8_);
				Class61.aClass175_768.method2956();
				class178.method3104(Class61.aClass175_768, true).method2435(i_3_ + i_7_ - i_5_, i_8_);
				Class61.aClass175_768.method2998();
				class178.method3104(Class61.aClass175_768, true).method2435(i_7_ + i_3_ - i_5_, i_8_ + i_4_ - i_5_);
				Class61.aClass175_768.method2956();
				class178.method3104(Class61.aClass175_768, true).method2435(i_7_, i_4_ + i_8_ - i_5_);
				Class61.aClass175_768.method2998();
				class178.method3104(Class114.aClass175_1404, true).method2440(i_7_, i_8_ + Class61.aClass175_768.method2945(), i_5_, i_4_ - Class61.aClass175_768.method2945() * 2);
				Class114.aClass175_1404.method2958();
				class178.method3104(Class114.aClass175_1404, true).method2440(i_7_ + Class61.aClass175_768.method2944(), i_8_, i_3_ - Class61.aClass175_768.method2944() * 2, i_5_);
				Class114.aClass175_1404.method2958();
				class178.method3104(Class114.aClass175_1404, true).method2440(i_3_ + i_7_ - i_5_, i_8_ + Class61.aClass175_768.method2945(), i_5_, i_4_ - Class61.aClass175_768.method2945() * 2);
				Class114.aClass175_1404.method2958();
				class178.method3104(Class114.aClass175_1404, true).method2440(i_7_ + Class61.aClass175_768.method2944(), i_8_ + i_4_ - i_5_, i_3_ - Class61.aClass175_768.method2944() * 2, i_5_);
				Class114.aClass175_1404.method2958();
				class164.method2628(string, i_7_ + i_6_, i_8_ + i_6_, i_3_ - i_6_ * 2, i_4_ - 2 * i_6_, (2119005097 * Class213.anInt2267 | ~0xffffff), -1, 1, 1, 0, null, null, null, 0, 0, -1100675975);
				Class504.method8225(i_7_, i_8_, i_3_, i_4_, (byte) 12);
			} else {
				int i_9_ = class10.method602(string, 250, null, 1769272415);
				int i_10_ = class10.method603(string, 250, null, 2093119579) * 13;
				int i_11_ = 4;
				int i_12_ = 6 + i_11_;
				int i_13_ = 6 + i_11_;
				class178.method3193(i_12_ - i_11_, i_13_ - i_11_, i_11_ + (i_11_ + i_9_), i_11_ + (i_10_ + i_11_), -16777216, 0);
				class178.method3083(i_12_ - i_11_, i_13_ - i_11_, i_11_ + (i_11_ + i_9_), i_10_ + i_11_ + i_11_, -1, 0);
				class164.method2628(string, i_12_, i_13_, i_9_, i_10_, -1, -1, 1, 1, 0, null, null, null, 0, 0, -2020262289);
				Class504.method8225(i_12_ - i_11_, i_13_ - i_11_, i_9_ + i_11_ + i_11_, i_11_ + i_10_ + i_11_, (byte) -20);
			}
			if (bool) {
				try {
					class178.method3206();
					class178.method3019(903679565);
				} catch (Exception_Sub4 exception_sub4) {
					/* empty */
				}
			}
		}
	}

	static final void method6525(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method6526(Class669 class669, int i) {
		NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class669.aClass647_Sub1_Sub3_Sub1_8552);
		boolean bool = false;
		NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
		if (class300.anIntArray3286 != null)
			class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -1);
		if (null != class300)
			bool = class300.aBool3287;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = bool ? 1 : 0;
	}
}
