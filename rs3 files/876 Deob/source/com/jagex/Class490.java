/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class490 implements Interface38 {
	static final int anInt5520 = 34962;
	static int[] anIntArray5521 = new int[1];
	Class178_Sub2_Sub2 aClass178_Sub2_Sub2_5522;
	int anInt5523;
	boolean aBool5524;
	int anInt5525 = -1;
	static final int anInt5526 = 34963;
	int anInt5527;
	NativeHeapBuffer aNativeHeapBuffer5528;
	int anInt5529;

	void method8047() throws Throwable {
		method131();
		super.finalize();
	}

	void method8048() {
		if (anInt5525 < 0) {
			if (aClass178_Sub2_Sub2_5522.aBool11507) {
				OpenGL.glGenBuffersARB(1, anIntArray5521, 0);
				anInt5525 = anIntArray5521[0];
				OpenGL.glBindBufferARB(anInt5523, anInt5525);
			} else
				anInt5525 = 0;
		}
	}

	public int method38() {
		return anInt5529;
	}

	long method8049() {
		return anInt5525 == 0 ? aNativeHeapBuffer5528.method2() : 0L;
	}

	void method8050() {
		if (aClass178_Sub2_Sub2_5522.aBool11507)
			OpenGL.glBindBufferARB(anInt5523, anInt5525);
	}

	void method275(int i) {
		if (i > anInt5527) {
			method8048();
			if (anInt5525 > 0) {
				OpenGL.glBindBufferARB(anInt5523, anInt5525);
				OpenGL.glBufferDataARBub(anInt5523, i, null, 0, aBool5524 ? 35040 : 35044);
				aClass178_Sub2_Sub2_5522.anInt9648 += i - anInt5527;
			} else
				aNativeHeapBuffer5528 = aClass178_Sub2_Sub2_5522.method14950(i, false);
			anInt5527 = i;
		}
		anInt5529 = i;
	}

	public long method274(int i, int i_0_) {
		OpenGL.glBindBufferARB(anInt5523, anInt5525);
		return OpenGL.glMapBufferARB(anInt5523, 35001) + (long) i;
	}

	Class490(Class178_Sub2_Sub2 class178_sub2_sub2, int i, boolean bool) {
		aClass178_Sub2_Sub2_5522 = class178_sub2_sub2;
		anInt5523 = i;
		aBool5524 = bool;
	}

	public void method79() {
		OpenGL.glUnmapBufferARB(anInt5523);
	}

	long method8051() {
		return anInt5525 == 0 ? aNativeHeapBuffer5528.method2() : 0L;
	}

	public void finalize() throws Throwable {
		method131();
		super.finalize();
	}

	long method8052() {
		return anInt5525 == 0 ? aNativeHeapBuffer5528.method2() : 0L;
	}

	void method130() {
		if (anInt5525 > 0) {
			aClass178_Sub2_Sub2_5522.method17887(anInt5525, anInt5529);
			anInt5525 = -1;
		}
	}

	void method132() {
		if (anInt5525 > 0) {
			aClass178_Sub2_Sub2_5522.method17887(anInt5525, anInt5529);
			anInt5525 = -1;
		}
	}

	void method78() {
		if (anInt5525 > 0) {
			aClass178_Sub2_Sub2_5522.method17887(anInt5525, anInt5529);
			anInt5525 = -1;
		}
	}

	long method8053() {
		return anInt5525 == 0 ? aNativeHeapBuffer5528.method2() : 0L;
	}

	public int method88() {
		return anInt5529;
	}

	public boolean method267(int i, int i_1_, long l) {
		method8048();
		if (anInt5525 > 0) {
			OpenGL.glBindBufferARB(anInt5523, anInt5525);
			OpenGL.glBufferSubDataARBa(anInt5523, i, i_1_, l);
		} else
			aNativeHeapBuffer5528.aNativeHeap1114.copy(aNativeHeapBuffer5528.method2() + (long) i, l, i_1_);
		return true;
	}

	public boolean method268(int i, int i_2_, long l) {
		method8048();
		if (anInt5525 > 0) {
			OpenGL.glBindBufferARB(anInt5523, anInt5525);
			OpenGL.glBufferSubDataARBa(anInt5523, i, i_2_, l);
		} else
			aNativeHeapBuffer5528.aNativeHeap1114.copy(aNativeHeapBuffer5528.method2() + (long) i, l, i_2_);
		return true;
	}

	void method8054() {
		if (anInt5525 < 0) {
			if (aClass178_Sub2_Sub2_5522.aBool11507) {
				OpenGL.glGenBuffersARB(1, anIntArray5521, 0);
				anInt5525 = anIntArray5521[0];
				OpenGL.glBindBufferARB(anInt5523, anInt5525);
			} else
				anInt5525 = 0;
		}
	}

	public long method271(int i, int i_3_) {
		OpenGL.glBindBufferARB(anInt5523, anInt5525);
		return OpenGL.glMapBufferARB(anInt5523, 35001) + (long) i;
	}

	void method131() {
		if (anInt5525 > 0) {
			aClass178_Sub2_Sub2_5522.method17887(anInt5525, anInt5529);
			anInt5525 = -1;
		}
	}

	public void method272() {
		OpenGL.glUnmapBufferARB(anInt5523);
	}

	public void method266() {
		OpenGL.glUnmapBufferARB(anInt5523);
	}

	public void method273() {
		OpenGL.glUnmapBufferARB(anInt5523);
	}

	void method277(int i) {
		if (i > anInt5527) {
			method8048();
			if (anInt5525 > 0) {
				OpenGL.glBindBufferARB(anInt5523, anInt5525);
				OpenGL.glBufferDataARBub(anInt5523, i, null, 0, aBool5524 ? 35040 : 35044);
				aClass178_Sub2_Sub2_5522.anInt9648 += i - anInt5527;
			} else
				aNativeHeapBuffer5528 = aClass178_Sub2_Sub2_5522.method14950(i, false);
			anInt5527 = i;
		}
		anInt5529 = i;
	}

	public void method194() {
		OpenGL.glUnmapBufferARB(anInt5523);
	}

	public boolean method265(int i, int i_4_, long l) {
		method8048();
		if (anInt5525 > 0) {
			OpenGL.glBindBufferARB(anInt5523, anInt5525);
			OpenGL.glBufferSubDataARBa(anInt5523, i, i_4_, l);
		} else
			aNativeHeapBuffer5528.aNativeHeap1114.copy(aNativeHeapBuffer5528.method2() + (long) i, l, i_4_);
		return true;
	}

	public boolean method269(int i, int i_5_, long l) {
		method8048();
		if (anInt5525 > 0) {
			OpenGL.glBindBufferARB(anInt5523, anInt5525);
			OpenGL.glBufferSubDataARBa(anInt5523, i, i_5_, l);
		} else
			aNativeHeapBuffer5528.aNativeHeap1114.copy(aNativeHeapBuffer5528.method2() + (long) i, l, i_5_);
		return true;
	}

	public long method270(int i, int i_6_) {
		OpenGL.glBindBufferARB(anInt5523, anInt5525);
		return OpenGL.glMapBufferARB(anInt5523, 35001) + (long) i;
	}

	void method8055() {
		if (aClass178_Sub2_Sub2_5522.aBool11507)
			OpenGL.glBindBufferARB(anInt5523, anInt5525);
	}
}
