/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class92 {
	public Interface49[] anInterface49Array896;

	Interface49 method1661(RSBuffer class523_sub34, Class394 class394, int i) {
		if (Class394.aClass394_4047 == class394)
			return Class229.method4228(class523_sub34, -2043283301);
		if (class394 == Class394.aClass394_4045)
			return Class711.method14328(class523_sub34, (byte) 24);
		if (Class394.aClass394_4044 == class394)
			return Class456.method7436(class523_sub34, -296570432);
		if (class394 == Class394.aClass394_4050)
			return Class565.method9485(class523_sub34, -1268498415);
		if (class394 == Class394.aClass394_4049)
			return Class659.method10808(class523_sub34, 1336262726);
		if (class394 == Class394.aClass394_4046)
			return Class533.method8804(class523_sub34, (byte) 83);
		if (Class394.aClass394_4051 == class394)
			return Class555.method9190(class523_sub34, -995884990);
		if (Class394.aClass394_4048 == class394)
			return Class288.method5159(class523_sub34, (byte) 60);
		if (class394 == Class394.aClass394_4052)
			return Class384.method6426(class523_sub34, (byte) 8);
		if (class394 == Class394.aClass394_4053)
			return Class265.method4883(class523_sub34, -1313851396);
		if (Class394.aClass394_4054 == class394)
			return Class393.method6493(class523_sub34, -2097960320);
		return null;
	}

	Class92() {
		/* empty */
	}

	void method1662(RSBuffer class523_sub34, byte i) {
		anInterface49Array896 = new Interface49[class523_sub34.readUnsignedByte(1477359981)];
		Class394[] class394s = Class76.method1540(31171910);
		for (int i_0_ = 0; i_0_ < anInterface49Array896.length; i_0_++)
			anInterface49Array896[i_0_] = method1661(class523_sub34, class394s[class523_sub34.readUnsignedByte(-799865113)], -477158425);
	}

	void method1663(RSBuffer class523_sub34) {
		anInterface49Array896 = new Interface49[class523_sub34.readUnsignedByte(706825045)];
		Class394[] class394s = Class76.method1540(31171910);
		for (int i = 0; i < anInterface49Array896.length; i++)
			anInterface49Array896[i] = method1661(class523_sub34, class394s[class523_sub34.readUnsignedByte(234703886)], -477158425);
	}

	void method1664(RSBuffer class523_sub34) {
		anInterface49Array896 = new Interface49[class523_sub34.readUnsignedByte(-391821264)];
		Class394[] class394s = Class76.method1540(31171910);
		for (int i = 0; i < anInterface49Array896.length; i++)
			anInterface49Array896[i] = method1661(class523_sub34, class394s[class523_sub34.readUnsignedByte(1908599970)], -477158425);
	}

	Interface49 method1665(RSBuffer class523_sub34, Class394 class394) {
		if (Class394.aClass394_4047 == class394)
			return Class229.method4228(class523_sub34, -1763889343);
		if (class394 == Class394.aClass394_4045)
			return Class711.method14328(class523_sub34, (byte) 107);
		if (Class394.aClass394_4044 == class394)
			return Class456.method7436(class523_sub34, 1538002665);
		if (class394 == Class394.aClass394_4050)
			return Class565.method9485(class523_sub34, -1763032945);
		if (class394 == Class394.aClass394_4049)
			return Class659.method10808(class523_sub34, 1308101774);
		if (class394 == Class394.aClass394_4046)
			return Class533.method8804(class523_sub34, (byte) -66);
		if (Class394.aClass394_4051 == class394)
			return Class555.method9190(class523_sub34, -1643514548);
		if (Class394.aClass394_4048 == class394)
			return Class288.method5159(class523_sub34, (byte) 25);
		if (class394 == Class394.aClass394_4052)
			return Class384.method6426(class523_sub34, (byte) 124);
		if (class394 == Class394.aClass394_4053)
			return Class265.method4883(class523_sub34, -1313851396);
		if (Class394.aClass394_4054 == class394)
			return Class393.method6493(class523_sub34, -793274392);
		return null;
	}

	static final void method1666(Class669 class669, byte i) {
		if (Class392.aClass705_4037 == null)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1594679277 * Class392.aClass705_4037.anInt8817;
	}
}
