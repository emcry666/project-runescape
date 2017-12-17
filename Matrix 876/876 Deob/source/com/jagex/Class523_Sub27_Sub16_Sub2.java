/* Class523_Sub27_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.ref.SoftReference;

public class Class523_Sub27_Sub16_Sub2 extends Class523_Sub27_Sub16 {
	SoftReference aSoftReference12114;

	Object method18183() {
		return aSoftReference12114.get();
	}

	Class523_Sub27_Sub16_Sub2(Interface70 interface70, Object object, int i) {
		super(interface70, i);
		aSoftReference12114 = new SoftReference(object);
	}

	boolean method18182() {
		return true;
	}

	boolean method18186() {
		return true;
	}

	Object method18185() {
		return aSoftReference12114.get();
	}

	boolean method18184() {
		return true;
	}

	Object method18181() {
		return aSoftReference12114.get();
	}
}
