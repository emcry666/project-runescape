/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class135 {
	static int[] anIntArray1583 = new int[1];
	static final int anInt1584 = 34963;
	Class178_Sub1 aClass178_Sub1_1585;
	int anInt1586;
	int anInt1587;
	static final int anInt1588 = 34962;
	int anInt1589;
	boolean aBool1590 = false;
	boolean aBool1591;

	Class135(Class178_Sub1 class178_sub1, int i, Buffer buffer, int i_0_, boolean bool) {
		aClass178_Sub1_1585 = class178_sub1;
		anInt1586 = i;
		anInt1589 = i_0_;
		aBool1591 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1583, 0);
		anInt1587 = anIntArray1583[0];
		method2270();
		OpenGL.glBufferDataARBa(i, anInt1589, buffer.method2(), aBool1591 ? 35040 : 35044);
		aClass178_Sub1_1585.anInt9293 += anInt1589;
	}

	void method2268() throws Throwable {
		if (!aBool1590) {
			aClass178_Sub1_1585.method14692(anInt1587, anInt1589);
			aBool1590 = true;
		}
		super.finalize();
	}

	Class135(Class178_Sub1 class178_sub1, int i, byte[] is, int i_1_, boolean bool) {
		aClass178_Sub1_1585 = class178_sub1;
		anInt1586 = i;
		anInt1589 = i_1_;
		aBool1591 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1583, 0);
		anInt1587 = anIntArray1583[0];
		method2270();
		OpenGL.glBufferDataARBub(i, anInt1589, is, 0, aBool1591 ? 35040 : 35044);
		aClass178_Sub1_1585.anInt9293 += anInt1589;
	}

	public void finalize() throws Throwable {
		if (!aBool1590) {
			aClass178_Sub1_1585.method14692(anInt1587, anInt1589);
			aBool1590 = true;
		}
		super.finalize();
	}

	abstract void method2269();

	abstract void method2270();

	abstract void method2271();

	void method2272(byte[] is, int i) {
		method2270();
		if (i > anInt1589) {
			OpenGL.glBufferDataARBub(anInt1586, i, is, 0, aBool1591 ? 35040 : 35044);
			aClass178_Sub1_1585.anInt9293 += i - anInt1589;
			anInt1589 = i;
		} else
			OpenGL.glBufferSubDataARBub(anInt1586, 0, i, is, 0);
	}

	void method2273(byte[] is, int i) {
		method2270();
		if (i > anInt1589) {
			OpenGL.glBufferDataARBub(anInt1586, i, is, 0, aBool1591 ? 35040 : 35044);
			aClass178_Sub1_1585.anInt9293 += i - anInt1589;
			anInt1589 = i;
		} else
			OpenGL.glBufferSubDataARBub(anInt1586, 0, i, is, 0);
	}
}
