/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Buffer;

public class Class130 {
	Class178_Sub1 aClass178_Sub1_1553;
	Buffer aBuffer1554;

	Class130(Class178_Sub1 class178_sub1, Buffer buffer) {
		aClass178_Sub1_1553 = class178_sub1;
		aBuffer1554 = buffer;
	}

	void method2257(byte[] is, int i) {
		if (aBuffer1554 == null || aBuffer1554.method1() < i)
			aBuffer1554 = aClass178_Sub1_1553.aNativeHeap9289.method1905(i, false);
		aBuffer1554.method3(is, 0, 0, i);
	}

	Class130(Class178_Sub1 class178_sub1, byte[] is, int i) {
		aClass178_Sub1_1553 = class178_sub1;
		aBuffer1554 = aClass178_Sub1_1553.aNativeHeap9289.method1905(i, false);
		if (is != null)
			aBuffer1554.method3(is, 0, 0, i);
	}

	void method2258(byte[] is, int i) {
		if (aBuffer1554 == null || aBuffer1554.method1() < i)
			aBuffer1554 = aClass178_Sub1_1553.aNativeHeap9289.method1905(i, false);
		aBuffer1554.method3(is, 0, 0, i);
	}
}
