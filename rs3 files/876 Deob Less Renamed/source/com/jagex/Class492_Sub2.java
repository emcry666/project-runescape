/* Class492_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class492_Sub2 extends Class492 implements Interface39 {
	static final int anInt10206 = 34069;

	public void method132() {
		super.method131();
	}

	public void method297() {
		super.method297();
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	public void method131() {
		super.method131();
	}

	public void method130() {
		super.method131();
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}

	public void method78() {
		super.method131();
	}

	public void method331() {
		super.method297();
	}

	public void method332() {
		super.method297();
	}

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	Class492_Sub2(Class178_Sub2_Sub2 class178_sub2_sub2, int i, boolean bool, int[][] is) {
		super(class178_sub2_sub2, 34067, Class158.aClass158_1743, Class170.aClass170_1822, i * i * 6, bool);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
				int i_2_ = is[i_0_][i_1_];
				is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16 | i_2_ >> 16 & 0xff);
			}
		}
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (bool) {
			for (int i_3_ = 0; i_3_ < 6; i_3_++)
				method8061(34069 + i_3_, i, i, is[i_3_]);
		} else {
			for (int i_4_ = 0; i_4_ < 6; i_4_++)
				OpenGL.glTexImage2Di(34069 + i_4_, 0, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i, i, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), aClass178_Sub2_Sub2_5541.anInt11529, is[i_4_], 0);
		}
	}
}
