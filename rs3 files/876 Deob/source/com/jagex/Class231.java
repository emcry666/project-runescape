/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class231 {
	List aList2364;
	Class217 this$0;

	boolean method4233(Class489 class489) {
		return aList2364.contains(class489);
	}

	List method4234() {
		return aList2364;
	}

	void method4235(Class489 class489, byte i) {
		aList2364.remove(class489);
	}

	List method4236(byte i) {
		return aList2364;
	}

	boolean method4237(Class489 class489, int i) {
		return aList2364.contains(class489);
	}

	void method4238(Class489 class489) {
		aList2364.add(class489);
	}

	void method4239(Class489 class489) {
		aList2364.remove(class489);
	}

	void method4240(Class489 class489) {
		aList2364.remove(class489);
	}

	void method4241(Class489 class489) {
		aList2364.remove(class489);
	}

	boolean method4242(Class489 class489) {
		return aList2364.contains(class489);
	}

	List method4243() {
		return aList2364;
	}

	List method4244() {
		return aList2364;
	}

	List method4245() {
		return aList2364;
	}

	void method4246(Class489 class489, int i) {
		aList2364.add(class489);
	}

	boolean method4247(Class489 class489) {
		return aList2364.contains(class489);
	}

	boolean method4248(Class489 class489) {
		return aList2364.contains(class489);
	}

	Class231(Class217 class217) {
		this$0 = class217;
		aList2364 = new ArrayList();
	}

	static final void method4249(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class616.method10070(class250, class242, class669, -477558586);
	}

	static final void method4250(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_0_ & 0x3fff;
	}

	static final void method4251(InterfaceComponentDefinitions class250, Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558] - 1;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		if (i_1_ < 0 || i_1_ > 9)
			throw new RuntimeException();
		Class29.method876(class250, i_1_, i_2_, class669, -1116496511);
	}
}
