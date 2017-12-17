/* Class706 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class706 implements Iterator {
	Class708 aClass708_8819;
	Class523 aClass523_8820;
	Class523 aClass523_8821 = null;

	public boolean method14144() {
		return aClass708_8819.aClass523_8838 != aClass523_8820;
	}

	public void remove() {
		if (null == aClass523_8821)
			throw new IllegalStateException();
		aClass523_8821.method8661(607052656);
		aClass523_8821 = null;
	}

	void method14145(short i) {
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	public Class523 method14146(int i) {
		method14145((short) 16303);
		return (Class523) next();
	}

	public void method14147() {
		if (null == aClass523_8821)
			throw new IllegalStateException();
		aClass523_8821.method8661(607052656);
		aClass523_8821 = null;
	}

	public boolean hasNext() {
		return aClass708_8819.aClass523_8838 != aClass523_8820;
	}

	public Object next() {
		Class523 class523 = aClass523_8820;
		if (class523 == aClass708_8819.aClass523_8838) {
			class523 = null;
			aClass523_8820 = null;
		} else
			aClass523_8820 = class523.aClass523_7063;
		aClass523_8821 = class523;
		return class523;
	}

	public boolean method14148() {
		return aClass708_8819.aClass523_8838 != aClass523_8820;
	}

	public boolean method14149() {
		return aClass708_8819.aClass523_8838 != aClass523_8820;
	}

	public boolean method14150() {
		return aClass708_8819.aClass523_8838 != aClass523_8820;
	}

	public Class523 method14151() {
		method14145((short) 23924);
		return (Class523) next();
	}

	public void method14152() {
		if (null == aClass523_8821)
			throw new IllegalStateException();
		aClass523_8821.method8661(607052656);
		aClass523_8821 = null;
	}

	public Class706(Class708 class708) {
		aClass708_8819 = class708;
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	public void method14153(Class708 class708, int i) {
		aClass708_8819 = class708;
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	public void method14154(Class708 class708) {
		aClass708_8819 = class708;
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	public void method14155(Class708 class708) {
		aClass708_8819 = class708;
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	void method14156() {
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	void method14157() {
		aClass523_8820 = aClass708_8819.aClass523_8838.aClass523_7063;
		aClass523_8821 = null;
	}

	public Object method14158() {
		Class523 class523 = aClass523_8820;
		if (class523 == aClass708_8819.aClass523_8838) {
			class523 = null;
			aClass523_8820 = null;
		} else
			aClass523_8820 = class523.aClass523_7063;
		aClass523_8821 = class523;
		return class523;
	}
}
