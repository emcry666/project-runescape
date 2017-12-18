/* Class523_Sub27_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.SoftReference;

public class Class523_Sub27_Sub12_Sub2 extends Class523_Sub27_Sub12 {
	SoftReference aSoftReference12097;

	Class523_Sub27_Sub12_Sub2(Object object, int i) {
		super(i);
		aSoftReference12097 = new SoftReference(object);
	}

	Object method18134() {
		return aSoftReference12097.get();
	}

	boolean method18132(int i) {
		return true;
	}

	Object method18133() {
		return aSoftReference12097.get();
	}

	Object method18131(int i) {
		return aSoftReference12097.get();
	}

	boolean method18130() {
		return true;
	}
}
