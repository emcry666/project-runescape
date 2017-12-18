/* Class626 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.util.Iterator;

class Class626 implements Iterator {
	int anInt8178;
	Class98_Sub1_Sub2 this$0;
	static File aFile8179;

	public boolean method10224() {
		return -1738165801 * anInt8178 < this$0.method69(-1271515092);
	}

	public void method10225() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int i = (anInt8178 += 1356124647) * -1738165801 - 1;
		Class159_Sub1 class159_sub1 = (Class159_Sub1) this$0.aClass209_11330.method3767((long) i);
		if (class159_sub1 != null)
			return class159_sub1;
		return this$0.method17717(i, 1214389697);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method10226() {
		return -1738165801 * anInt8178 < this$0.method69(-1274919941);
	}

	Class626(Class98_Sub1_Sub2 class98_sub1_sub2) {
		this$0 = class98_sub1_sub2;
	}

	public boolean method10227() {
		return -1738165801 * anInt8178 < this$0.method69(-1758471214);
	}

	public boolean hasNext() {
		return -1738165801 * anInt8178 < this$0.method69(-1536599654);
	}

	public Object method10228() {
		int i = (anInt8178 += 1356124647) * -1738165801 - 1;
		Class159_Sub1 class159_sub1 = (Class159_Sub1) this$0.aClass209_11330.method3767((long) i);
		if (class159_sub1 != null)
			return class159_sub1;
		return this$0.method17717(i, 1938201593);
	}

	public boolean method10229() {
		return -1738165801 * anInt8178 < this$0.method69(-1982128399);
	}

	public void method10230() {
		throw new UnsupportedOperationException();
	}

	static final void method10231(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4321, client.aClass116_11057.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) -2), -129875064);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -19);
		client.aClass116_11057.method1974(class523_sub22, (byte) 15);
	}

	static final void method10232(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class413.method6649(Class31.aClass178_303, -1629174313);
		Class352.method6189(i, i_0_, i_1_, i_2_, 256, 256, -1729677277);
		Class691.method13964(i, i_0_, i_1_, i_2_, 256, 256, 327180334);
		Class689.method13951(i, i_0_, i_1_, i_2_, 256, 256, (byte) 93);
		Class616.method10072(i, i_0_, i_1_, i_2_, 1033542763);
	}
}
