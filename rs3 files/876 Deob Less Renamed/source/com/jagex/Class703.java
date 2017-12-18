/* Class703 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class703 implements Iterator {
	Class523_Sub27 aClass523_Sub27_8789;
	Class697 aClass697_8790;
	Class523_Sub27 aClass523_Sub27_8791 = null;
	static int anInt8792;

	public boolean hasNext() {
		return aClass697_8790.aClass523_Sub27_8763 != aClass523_Sub27_8789;
	}

	public Class523_Sub27 method14127() {
		method14136((short) -13698);
		return (Class523_Sub27) next();
	}

	public Object method14128() {
		Class523_Sub27 class523_sub27 = aClass523_Sub27_8789;
		if (aClass697_8790.aClass523_Sub27_8763 == class523_sub27) {
			class523_sub27 = null;
			aClass523_Sub27_8789 = null;
		} else
			aClass523_Sub27_8789 = class523_sub27.aClass523_Sub27_10551;
		aClass523_Sub27_8791 = class523_sub27;
		return class523_sub27;
	}

	public Class523_Sub27 method14129(int i) {
		method14136((short) -21558);
		return (Class523_Sub27) next();
	}

	public boolean method14130() {
		return aClass697_8790.aClass523_Sub27_8763 != aClass523_Sub27_8789;
	}

	public void remove() {
		if (aClass523_Sub27_8791 == null)
			throw new IllegalStateException();
		aClass523_Sub27_8791.method16154(-261651695);
		aClass523_Sub27_8791 = null;
	}

	public boolean method14131() {
		return aClass697_8790.aClass523_Sub27_8763 != aClass523_Sub27_8789;
	}

	public Object next() {
		Class523_Sub27 class523_sub27 = aClass523_Sub27_8789;
		if (aClass697_8790.aClass523_Sub27_8763 == class523_sub27) {
			class523_sub27 = null;
			aClass523_Sub27_8789 = null;
		} else
			aClass523_Sub27_8789 = class523_sub27.aClass523_Sub27_10551;
		aClass523_Sub27_8791 = class523_sub27;
		return class523_sub27;
	}

	public boolean method14132() {
		return aClass697_8790.aClass523_Sub27_8763 != aClass523_Sub27_8789;
	}

	public boolean method14133() {
		return aClass697_8790.aClass523_Sub27_8763 != aClass523_Sub27_8789;
	}

	public Class703(Class697 class697) {
		aClass697_8790 = class697;
		aClass523_Sub27_8789 = aClass697_8790.aClass523_Sub27_8763.aClass523_Sub27_10551;
		aClass523_Sub27_8791 = null;
	}

	public void method14134() {
		if (aClass523_Sub27_8791 == null)
			throw new IllegalStateException();
		aClass523_Sub27_8791.method16154(-261651695);
		aClass523_Sub27_8791 = null;
	}

	public void method14135() {
		if (aClass523_Sub27_8791 == null)
			throw new IllegalStateException();
		aClass523_Sub27_8791.method16154(-261651695);
		aClass523_Sub27_8791 = null;
	}

	void method14136(short i) {
		aClass523_Sub27_8789 = aClass697_8790.aClass523_Sub27_8763.aClass523_Sub27_10551;
		aClass523_Sub27_8791 = null;
	}
}
