/* Class168_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class168_Sub1_Sub3 extends Class168_Sub1 {
	int anInt11374;
	Class178_Sub1 aClass178_Sub1_11375;
	int anInt11376;
	int anInt11377;
	int anInt11378;
	int anInt11379;
	Interface16 anInterface16_11380;
	static final int anInt11381 = 16;
	Interface16[] anInterface16Array11382 = new Interface16[4];

	public void method14422(int i, Interface22 interface22) {
		int i_0_ = 1 << i;
		Interface16 interface16 = (Interface16) interface22;
		if (interface22 != null) {
			if ((anInt11379 | i_0_) != i_0_) {
				if (anInt11374 != interface16.method1() || anInt11378 != interface16.method82())
					throw new RuntimeException();
			} else {
				anInt11378 = interface16.method82();
				anInt11374 = interface16.method1();
				if (this == aClass178_Sub1_11375.method3039(1918663425))
					aClass178_Sub1_11375.method14624();
			}
			anInt11379 |= i_0_;
			anInterface16Array11382[i] = interface16;
		} else {
			anInt11379 &= i_0_ ^ 0xffffffff;
			anInterface16Array11382[i] = null;
			if (anInt11379 == 0) {
				anInt11378 = 0;
				anInt11374 = 0;
			}
		}
		if (this == aClass178_Sub1_11375.method3039(1726798647))
			method17794(i);
		else
			anInt11377 |= i_0_;
	}

	public int method2875() {
		return anInt11374;
	}

	public int method2874() {
		return anInt11378;
	}

	public void method14424(int i, Interface22 interface22) {
		int i_1_ = 1 << i;
		Interface16 interface16 = (Interface16) interface22;
		if (interface22 != null) {
			if ((anInt11379 | i_1_) != i_1_) {
				if (anInt11374 != interface16.method1() || anInt11378 != interface16.method82())
					throw new RuntimeException();
			} else {
				anInt11378 = interface16.method82();
				anInt11374 = interface16.method1();
				if (this == aClass178_Sub1_11375.method3039(1545847849))
					aClass178_Sub1_11375.method14624();
			}
			anInt11379 |= i_1_;
			anInterface16Array11382[i] = interface16;
		} else {
			anInt11379 &= i_1_ ^ 0xffffffff;
			anInterface16Array11382[i] = null;
			if (anInt11379 == 0) {
				anInt11378 = 0;
				anInt11374 = 0;
			}
		}
		if (this == aClass178_Sub1_11375.method3039(1528132489))
			method17794(i);
		else
			anInt11377 |= i_1_;
	}

	public void method14434(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, boolean bool_7_) {
		if (bool | bool_7_) {
			int i_8_ = anInt11378;
			int i_9_ = aClass178_Sub1_11375.method3039(1398519359).method2874();
			int i_10_ = 0;
			if (bool_7_)
				i_10_ |= 0x100;
			if (bool)
				i_10_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11376);
			OpenGL.glBlitFramebufferEXT(i, i_8_ - i_2_ - i_4_, i + i_3_, i_8_ - i_2_, i_5_, i_9_ - i_6_ - i_4_, i_5_ + i_3_, i_9_ - i_6_, i_10_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method17788(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	void method17789() {
		if (anInterface16_11380 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11380.method90(36096);
	}

	public boolean method14426() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method359() {
		OpenGL.glBindFramebufferEXT(36160, anInt11376);
		for (int i = 0; i < 4; i++) {
			if ((anInt11377 & 1 << i) != 0)
				method17794(i);
		}
		if ((anInt11377 & 0x10) != 0)
			method17789();
		anInt11377 = 0;
		aClass178_Sub1_11375.method14655();
		return true;
	}

	boolean method2873() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method17790(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	boolean method2876() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method131() {
		if (anInt11376 != 0) {
			aClass178_Sub1_11375.method14674(anInt11376);
			anInt11376 = 0;
		}
	}

	public void method14423(Interface23 interface23) {
		Interface16 interface16 = (Interface16) interface23;
		if (interface23 != null) {
			if ((anInt11379 | 0x10) != 16) {
				if (anInt11374 != interface16.method1() || anInt11378 != interface16.method82())
					throw new RuntimeException();
			} else {
				anInt11378 = interface16.method82();
				anInt11374 = interface16.method1();
				if (this == aClass178_Sub1_11375.method3039(1591171722))
					aClass178_Sub1_11375.method14624();
			}
			anInt11379 |= 0x10;
			anInterface16_11380 = interface16;
		} else {
			anInt11379 &= ~0x10;
			anInterface16_11380 = null;
			if (anInt11379 == 0) {
				anInt11378 = 0;
				anInt11374 = 0;
			}
		}
		if (this == aClass178_Sub1_11375.method3039(1826972530))
			method17789();
		else
			anInt11377 |= 0x10;
	}

	public void method14433(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, boolean bool_16_) {
		if (bool | bool_16_) {
			int i_17_ = anInt11378;
			int i_18_ = aClass178_Sub1_11375.method3039(2113396291).method2874();
			int i_19_ = 0;
			if (bool_16_)
				i_19_ |= 0x100;
			if (bool)
				i_19_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt11376);
			OpenGL.glBlitFramebufferEXT(i, i_17_ - i_11_ - i_13_, i + i_12_, i_17_ - i_11_, i_14_, i_18_ - i_15_ - i_13_, i_14_ + i_12_, i_18_ - i_15_, i_19_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public int method2878() {
		return anInt11374;
	}

	public int method2880() {
		return anInt11374;
	}

	public int method2879() {
		return anInt11378;
	}

	void method17791(int i) {
		Interface16 interface16 = anInterface16Array11382[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method90(36064 + i);
	}

	public int method2877() {
		return anInt11374;
	}

	public void method14429(Interface23 interface23) {
		Interface16 interface16 = (Interface16) interface23;
		if (interface23 != null) {
			if ((anInt11379 | 0x10) != 16) {
				if (anInt11374 != interface16.method1() || anInt11378 != interface16.method82())
					throw new RuntimeException();
			} else {
				anInt11378 = interface16.method82();
				anInt11374 = interface16.method1();
				if (this == aClass178_Sub1_11375.method3039(1901683981))
					aClass178_Sub1_11375.method14624();
			}
			anInt11379 |= 0x10;
			anInterface16_11380 = interface16;
		} else {
			anInt11379 &= ~0x10;
			anInterface16_11380 = null;
			if (anInt11379 == 0) {
				anInt11378 = 0;
				anInt11374 = 0;
			}
		}
		if (this == aClass178_Sub1_11375.method3039(1849985394))
			method17789();
		else
			anInt11377 |= 0x10;
	}

	public boolean method14430() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	Class168_Sub1_Sub3(Class178_Sub1 class178_sub1) {
		if (!class178_sub1.aBool9398)
			throw new IllegalStateException("");
		aClass178_Sub1_11375 = class178_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		anInt11376 = is[0];
	}

	public boolean method14425() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method14432() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method14427(int i, Interface22 interface22) {
		int i_20_ = 1 << i;
		Interface16 interface16 = (Interface16) interface22;
		if (interface22 != null) {
			if ((anInt11379 | i_20_) != i_20_) {
				if (anInt11374 != interface16.method1() || anInt11378 != interface16.method82())
					throw new RuntimeException();
			} else {
				anInt11378 = interface16.method82();
				anInt11374 = interface16.method1();
				if (this == aClass178_Sub1_11375.method3039(1888032140))
					aClass178_Sub1_11375.method14624();
			}
			anInt11379 |= i_20_;
			anInterface16Array11382[i] = interface16;
		} else {
			anInt11379 &= i_20_ ^ 0xffffffff;
			anInterface16Array11382[i] = null;
			if (anInt11379 == 0) {
				anInt11378 = 0;
				anInt11374 = 0;
			}
		}
		if (this == aClass178_Sub1_11375.method3039(1404134810))
			method17794(i);
		else
			anInt11377 |= i_20_;
	}

	void method17792(int i) {
		Interface16 interface16 = anInterface16Array11382[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method90(36064 + i);
	}

	boolean method360() {
		OpenGL.glBindFramebufferEXT(36160, anInt11376);
		for (int i = 0; i < 4; i++) {
			if ((anInt11377 & 1 << i) != 0)
				method17794(i);
		}
		if ((anInt11377 & 0x10) != 0)
			method17789();
		anInt11377 = 0;
		aClass178_Sub1_11375.method14655();
		return true;
	}

	public boolean method14428() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method73() {
		if (anInt11376 != 0) {
			aClass178_Sub1_11375.method14674(anInt11376);
			anInt11376 = 0;
		}
	}

	public void method361() {
		if (anInt11376 != 0) {
			aClass178_Sub1_11375.method14674(anInt11376);
			anInt11376 = 0;
		}
	}

	void method17793() throws Throwable {
		super.finalize();
		method131();
	}

	public void finalize() throws Throwable {
		super.finalize();
		method131();
	}

	void method17794(int i) {
		Interface16 interface16 = anInterface16Array11382[i];
		if (interface16 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface16.method90(36064 + i);
	}

	void method17795() {
		if (anInterface16_11380 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11380.method90(36096);
	}

	void method17796() {
		if (anInterface16_11380 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11380.method90(36096);
	}

	void method17797() {
		if (anInterface16_11380 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface16_11380.method90(36096);
	}

	void method17798(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	public boolean method14431() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}
}
