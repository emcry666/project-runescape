/* Class168_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class168_Sub1_Sub1_Sub2 extends Class168_Sub1_Sub1 {
	int anInt12077;
	Class178_Sub2_Sub2 aClass178_Sub2_Sub2_12078;
	int anInt12079;
	int anInt12080;
	int anInt12081;
	int anInt12082;
	static final int anInt12083 = 16;
	Interface55 anInterface55_12084;
	Interface55[] anInterface55Array12085 = new Interface55[4];

	public int method2878() {
		return anInt12080;
	}

	public boolean method14430() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public int method2874() {
		return anInt12081;
	}

	public void method14424(int i, Interface22 interface22) {
		int i_0_ = 1 << i;
		Interface55 interface55 = (Interface55) interface22;
		if (interface22 != null) {
			if (anInt12082 != 0) {
				if (anInt12080 != interface55.method1() || anInt12081 != interface55.method82())
					throw new RuntimeException();
			} else {
				anInt12081 = interface55.method82();
				anInt12080 = interface55.method1();
				method17752();
			}
			anInt12082 |= i_0_;
			anInterface55Array12085[i] = interface55;
		} else {
			anInt12082 &= i_0_ ^ 0xffffffff;
			anInterface55Array12085[i] = null;
			if (anInt12082 == 0) {
				anInt12081 = 0;
				anInt12080 = 0;
			}
		}
		if (this == aClass178_Sub2_Sub2_12078.method3039(1708055067))
			method18534(i);
		else
			anInt12077 |= i_0_;
	}

	public void method14423(Interface23 interface23) {
		Interface55 interface55 = (Interface55) interface23;
		if (interface23 != null) {
			if (anInt12082 != 0) {
				if (anInt12080 != interface55.method1() || anInt12081 != interface55.method82())
					throw new RuntimeException();
			} else {
				anInt12081 = interface55.method82();
				anInt12080 = interface55.method1();
				method17752();
			}
			anInt12082 |= 0x10;
			anInterface55_12084 = interface55;
		} else {
			anInt12082 &= ~0x10;
			anInterface55_12084 = null;
			if (anInt12082 == 0) {
				anInt12081 = 0;
				anInt12080 = 0;
			}
		}
		if (this == aClass178_Sub2_Sub2_12078.method3039(1439063384))
			method18535();
		else
			anInt12077 |= 0x10;
	}

	public boolean method14432() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	Class168_Sub1_Sub1_Sub2(Class178_Sub2_Sub2 class178_sub2_sub2) {
		super((Class178_Sub2) class178_sub2_sub2);
		aClass178_Sub2_Sub2_12078 = class178_sub2_sub2;
		int[] is = new int[1];
		if (!aClass178_Sub2_Sub2_12078.aBool9682)
			throw new RuntimeException("");
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		anInt12079 = is[0];
	}

	public boolean method14426() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method359() {
		OpenGL.glBindFramebufferEXT(36160, anInt12079);
		for (int i = 0; i < 4; i++) {
			if ((anInt12077 & 1 << i) != 0)
				method18534(i);
		}
		if ((anInt12077 & 0x10) != 0)
			method18535();
		anInt12077 = 0;
		return super.method359();
	}

	public int method2880() {
		return anInt12080;
	}

	public void method14433(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool | bool_6_) {
			int i_7_ = anInt12081;
			int i_8_ = aClass178_Sub2_Sub2_12078.method3039(1377923282).method2874();
			int i_9_ = 0;
			if (bool_6_)
				i_9_ |= 0x100;
			if (bool)
				i_9_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12079);
			OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_, i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_, i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method131() {
		if (anInt12079 != 0) {
			aClass178_Sub2_Sub2_12078.method17906(anInt12079);
			anInt12079 = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		method131();
	}

	public int method2877() {
		return anInt12080;
	}

	boolean method360() {
		OpenGL.glBindFramebufferEXT(36160, anInt12079);
		for (int i = 0; i < 4; i++) {
			if ((anInt12077 & 1 << i) != 0)
				method18534(i);
		}
		if ((anInt12077 & 0x10) != 0)
			method18535();
		anInt12077 = 0;
		return super.method359();
	}

	void method18533() {
		if (anInterface55_12084 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface55_12084.method90(36096);
	}

	public int method2879() {
		return anInt12081;
	}

	public void method14427(int i, Interface22 interface22) {
		int i_10_ = 1 << i;
		Interface55 interface55 = (Interface55) interface22;
		if (interface22 != null) {
			if (anInt12082 != 0) {
				if (anInt12080 != interface55.method1() || anInt12081 != interface55.method82())
					throw new RuntimeException();
			} else {
				anInt12081 = interface55.method82();
				anInt12080 = interface55.method1();
				method17752();
			}
			anInt12082 |= i_10_;
			anInterface55Array12085[i] = interface55;
		} else {
			anInt12082 &= i_10_ ^ 0xffffffff;
			anInterface55Array12085[i] = null;
			if (anInt12082 == 0) {
				anInt12081 = 0;
				anInt12080 = 0;
			}
		}
		if (this == aClass178_Sub2_Sub2_12078.method3039(1436184437))
			method18534(i);
		else
			anInt12077 |= i_10_;
	}

	public void method14422(int i, Interface22 interface22) {
		int i_11_ = 1 << i;
		Interface55 interface55 = (Interface55) interface22;
		if (interface22 != null) {
			if (anInt12082 != 0) {
				if (anInt12080 != interface55.method1() || anInt12081 != interface55.method82())
					throw new RuntimeException();
			} else {
				anInt12081 = interface55.method82();
				anInt12080 = interface55.method1();
				method17752();
			}
			anInt12082 |= i_11_;
			anInterface55Array12085[i] = interface55;
		} else {
			anInt12082 &= i_11_ ^ 0xffffffff;
			anInterface55Array12085[i] = null;
			if (anInt12082 == 0) {
				anInt12081 = 0;
				anInt12080 = 0;
			}
		}
		if (this == aClass178_Sub2_Sub2_12078.method3039(1670163874))
			method18534(i);
		else
			anInt12077 |= i_11_;
	}

	public void method14429(Interface23 interface23) {
		Interface55 interface55 = (Interface55) interface23;
		if (interface23 != null) {
			if (anInt12082 != 0) {
				if (anInt12080 != interface55.method1() || anInt12081 != interface55.method82())
					throw new RuntimeException();
			} else {
				anInt12081 = interface55.method82();
				anInt12080 = interface55.method1();
				method17752();
			}
			anInt12082 |= 0x10;
			anInterface55_12084 = interface55;
		} else {
			anInt12082 &= ~0x10;
			anInterface55_12084 = null;
			if (anInt12082 == 0) {
				anInt12081 = 0;
				anInt12080 = 0;
			}
		}
		if (this == aClass178_Sub2_Sub2_12078.method3039(1694876404))
			method18535();
		else
			anInt12077 |= 0x10;
	}

	void method18534(int i) {
		Interface55 interface55 = anInterface55Array12085[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method90(36064 + i);
	}

	public boolean method14431() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	void method18535() {
		if (anInterface55_12084 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface55_12084.method90(36096);
	}

	boolean method2876() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public boolean method14428() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method14425() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public int method2875() {
		return anInt12080;
	}

	public void method14434(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, boolean bool_17_) {
		if (bool | bool_17_) {
			int i_18_ = anInt12081;
			int i_19_ = aClass178_Sub2_Sub2_12078.method3039(1477667423).method2874();
			int i_20_ = 0;
			if (bool_17_)
				i_20_ |= 0x100;
			if (bool)
				i_20_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, anInt12079);
			OpenGL.glBlitFramebufferEXT(i, i_18_ - i_12_ - i_14_, i + i_13_, i_18_ - i_12_, i_15_, i_19_ - i_16_ - i_14_, i_15_ + i_13_, i_19_ - i_16_, i_20_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method73() {
		if (anInt12079 != 0) {
			aClass178_Sub2_Sub2_12078.method17906(anInt12079);
			anInt12079 = 0;
		}
	}

	boolean method2873() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method18536() throws Throwable {
		super.finalize();
		method131();
	}

	void method18537(int i) {
		Interface55 interface55 = anInterface55Array12085[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method90(36064 + i);
	}

	void method18538(int i) {
		Interface55 interface55 = anInterface55Array12085[i];
		if (interface55 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface55.method90(36064 + i);
	}

	public void method361() {
		if (anInt12079 != 0) {
			aClass178_Sub2_Sub2_12078.method17906(anInt12079);
			anInt12079 = 0;
		}
	}

	void method18539() {
		if (anInterface55_12084 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface55_12084.method90(36096);
	}

	void method18540() {
		if (anInterface55_12084 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface55_12084.method90(36096);
	}

	void method18541() {
		if (anInterface55_12084 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface55_12084.method90(36096);
	}
}
