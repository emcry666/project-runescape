/* Class194_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub23 extends Class194 {
	int anInt9970;
	long aLong9971;

	public void method3648(int i) {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex(aLong9971 * -9179620830980934215L));
		if (class523_sub24 != null)
			class523_sub24.anInt10542 = 1598336147 * anInt9970;
		else
			Class191.aClass14_2160.method738(new Class523_Sub24(anInt9970 * 1760864501), (-9179620830980934215L * aLong9971));
	}

	public void method3657() {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex(aLong9971 * -9179620830980934215L));
		if (class523_sub24 != null)
			class523_sub24.anInt10542 = 1598336147 * anInt9970;
		else
			Class191.aClass14_2160.method738(new Class523_Sub24(anInt9970 * 1760864501), (-9179620830980934215L * aLong9971));
	}

	public void method3651() {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex(aLong9971 * -9179620830980934215L));
		if (class523_sub24 != null)
			class523_sub24.anInt10542 = 1598336147 * anInt9970;
		else
			Class191.aClass14_2160.method738(new Class523_Sub24(anInt9970 * 1760864501), (-9179620830980934215L * aLong9971));
	}

	public void method3656() {
		Class523_Sub24 class523_sub24 = ((Class523_Sub24) Class191.aClass14_2160.getFromIndex(aLong9971 * -9179620830980934215L));
		if (class523_sub24 != null)
			class523_sub24.anInt10542 = 1598336147 * anInt9970;
		else
			Class191.aClass14_2160.method738(new Class523_Sub24(anInt9970 * 1760864501), (-9179620830980934215L * aLong9971));
	}

	Class194_Sub23(RSBuffer class523_sub34, boolean bool) {
		super(class523_sub34);
		int i = class523_sub34.readUnsignedShort(-779060811);
		if (bool)
			aLong9971 = 8304771306535420041L * (0x100000000L | (long) i);
		else
			aLong9971 = (long) i * 8304771306535420041L;
		anInt9970 = class523_sub34.readUnsignedInt((byte) -121) * -1522744483;
	}
}
