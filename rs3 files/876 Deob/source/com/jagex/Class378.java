/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class378 {
	int anInt3928;
	long aLong3929;

	Class378(Class344 class344) {
		aLong3929 = (long) class344.anInt3621;
		anInt3928 = 1;
	}

	Class378(Class344[] class344s) {
		for (int i = 0; i < class344s.length; i++)
			method6391(class344s[i]);
	}

	public final int method6388() {
		return anInt3928;
	}

	public final Class344 method6389(int i) {
		return Class344.method5991(method6390(i));
	}

	final int method6390(int i) {
		return (int) (aLong3929 >> Class344.anInt3625 * i) & 0xf;
	}

	final void method6391(Class344 class344) {
		aLong3929 |= (long) (class344.anInt3621 << Class344.anInt3625 * anInt3928++);
	}

	final int method6392(int i) {
		return (int) (aLong3929 >> Class344.anInt3625 * i) & 0xf;
	}

	final int method6393(int i) {
		return (int) (aLong3929 >> Class344.anInt3625 * i) & 0xf;
	}

	public final Class344 method6394(int i) {
		return Class344.method5991(method6390(i));
	}

	public final Class344 method6395(int i) {
		return Class344.method5991(method6390(i));
	}

	final void method6396(Class344 class344) {
		aLong3929 |= (long) (class344.anInt3621 << Class344.anInt3625 * anInt3928++);
	}
}
