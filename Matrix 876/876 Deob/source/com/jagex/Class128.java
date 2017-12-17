/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128 {
	int anInt1545;

	void method2246(int i) {
		OpenGL.glNewList(anInt1545 + i, 4864);
	}

	Class128(Class178_Sub1 class178_sub1, int i) {
		anInt1545 = OpenGL.glGenLists(i);
	}

	void method2247() {
		OpenGL.glEndList();
	}

	void method2248(char c) {
		OpenGL.glCallList(anInt1545 + c);
	}

	void method2249(char c) {
		OpenGL.glCallList(anInt1545 + c);
	}

	void method2250(int i) {
		OpenGL.glNewList(anInt1545 + i, 4864);
	}

	void method2251(int i) {
		OpenGL.glNewList(anInt1545 + i, 4864);
	}

	void method2252() {
		OpenGL.glEndList();
	}

	void method2253() {
		OpenGL.glEndList();
	}

	void method2254() {
		OpenGL.glEndList();
	}

	void method2255(char c) {
		OpenGL.glCallList(anInt1545 + c);
	}

	void method2256(int i) {
		OpenGL.glNewList(anInt1545 + i, 4864);
	}
}
