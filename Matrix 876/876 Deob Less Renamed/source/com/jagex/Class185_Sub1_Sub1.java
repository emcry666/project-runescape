/* Class185_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class185_Sub1_Sub1 extends Class185_Sub1 {
	Class126_Sub1 aClass126_Sub1_11348;
	Class178_Sub1 aClass178_Sub1_11349;
	static int[] anIntArray11350 = new int[4];
	static int[] anIntArray11351 = new int[4];

	Class126_Sub1 method15350() {
		return aClass126_Sub1_11348;
	}

	int method17761() {
		return aClass126_Sub1_11348.anInt8888;
	}

	Class126_Sub1 method15349() {
		return aClass126_Sub1_11348;
	}

	Class126_Sub1 method15346() {
		return aClass126_Sub1_11348;
	}

	Class126_Sub1 method15347() {
		return aClass126_Sub1_11348;
	}

	Class185_Sub1_Sub1(Class178_Sub1 class178_sub1, int i) {
		aClass178_Sub1_11349 = class178_sub1;
		aClass126_Sub1_11348 = new Class126_Sub1(class178_sub1, Class158.aClass158_1743, Class170.aClass170_1822, i);
	}

	Class126_Sub1 method15348() {
		return aClass126_Sub1_11348;
	}

	int method17762() {
		return aClass126_Sub1_11348.anInt8888;
	}

	boolean method17763(Class126_Sub1 class126_sub1, Class126_Sub1 class126_sub1_0_, float f) {
		boolean bool = true;
		Class168_Sub1_Sub3 class168_sub1_sub3 = aClass178_Sub1_11349.aClass168_Sub1_Sub3_9423;
		aClass178_Sub1_11349.method3075(anIntArray11350);
		aClass178_Sub1_11349.method3071();
		aClass178_Sub1_11349.method3069(anIntArray11351);
		aClass178_Sub1_11349.method14641();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, aClass126_Sub1_11348.anInt8888, aClass126_Sub1_11348.anInt8888);
		aClass178_Sub1_11349.method14788(false);
		aClass178_Sub1_11349.method14682(false);
		aClass178_Sub1_11349.method14684(false);
		aClass178_Sub1_11349.method14620(false);
		aClass178_Sub1_11349.method14670(-2);
		aClass178_Sub1_11349.method14673(1);
		aClass178_Sub1_11349.method14857(0.0F, 0.0F, 0.0F, f);
		aClass178_Sub1_11349.method14676(34165, 34165);
		aClass178_Sub1_11349.method14711(class126_sub1_0_);
		aClass178_Sub1_11349.method14673(0);
		aClass178_Sub1_11349.method14785(1);
		aClass178_Sub1_11349.method14711(class126_sub1);
		aClass178_Sub1_11349.method3353(class168_sub1_sub3, 1115756134);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class168_sub1_sub3.method14424(0, aClass126_Sub1_11348.method14339(i_1_, 0));
			class168_sub1_sub3.method17790(0);
			if (class168_sub1_sub3.method14426()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class168_sub1_sub3.method14424(0, null);
		aClass178_Sub1_11349.method3047(class168_sub1_sub3, (short) -1901);
		aClass178_Sub1_11349.method14673(1);
		aClass178_Sub1_11349.method14711(null);
		aClass178_Sub1_11349.method14676(8448, 8448);
		aClass178_Sub1_11349.method14673(0);
		aClass178_Sub1_11349.method14711(null);
		aClass178_Sub1_11349.method3378(anIntArray11350[0], anIntArray11350[1], anIntArray11350[2], anIntArray11350[3]);
		aClass178_Sub1_11349.method3208(anIntArray11351[0], anIntArray11351[1], anIntArray11351[2], anIntArray11351[3]);
		if (bool && !aClass178_Sub1_11349.aBool9391)
			aClass126_Sub1_11348.method2120();
		return bool;
	}

	int method17764() {
		return aClass126_Sub1_11348.anInt8888;
	}

	boolean method17765(Class126_Sub1 class126_sub1, Class126_Sub1 class126_sub1_2_, float f) {
		boolean bool = true;
		Class168_Sub1_Sub3 class168_sub1_sub3 = aClass178_Sub1_11349.aClass168_Sub1_Sub3_9423;
		aClass178_Sub1_11349.method3075(anIntArray11350);
		aClass178_Sub1_11349.method3071();
		aClass178_Sub1_11349.method3069(anIntArray11351);
		aClass178_Sub1_11349.method14641();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, aClass126_Sub1_11348.anInt8888, aClass126_Sub1_11348.anInt8888);
		aClass178_Sub1_11349.method14788(false);
		aClass178_Sub1_11349.method14682(false);
		aClass178_Sub1_11349.method14684(false);
		aClass178_Sub1_11349.method14620(false);
		aClass178_Sub1_11349.method14670(-2);
		aClass178_Sub1_11349.method14673(1);
		aClass178_Sub1_11349.method14857(0.0F, 0.0F, 0.0F, f);
		aClass178_Sub1_11349.method14676(34165, 34165);
		aClass178_Sub1_11349.method14711(class126_sub1_2_);
		aClass178_Sub1_11349.method14673(0);
		aClass178_Sub1_11349.method14785(1);
		aClass178_Sub1_11349.method14711(class126_sub1);
		aClass178_Sub1_11349.method3353(class168_sub1_sub3, -398148161);
		for (int i = 0; i < 6; i++) {
			int i_3_ = 34069 + i;
			class168_sub1_sub3.method14424(0, aClass126_Sub1_11348.method14339(i_3_, 0));
			class168_sub1_sub3.method17790(0);
			if (class168_sub1_sub3.method14426()) {
				OpenGL.glBegin(7);
				switch (i_3_) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class168_sub1_sub3.method14424(0, null);
		aClass178_Sub1_11349.method3047(class168_sub1_sub3, (short) -27721);
		aClass178_Sub1_11349.method14673(1);
		aClass178_Sub1_11349.method14711(null);
		aClass178_Sub1_11349.method14676(8448, 8448);
		aClass178_Sub1_11349.method14673(0);
		aClass178_Sub1_11349.method14711(null);
		aClass178_Sub1_11349.method3378(anIntArray11350[0], anIntArray11350[1], anIntArray11350[2], anIntArray11350[3]);
		aClass178_Sub1_11349.method3208(anIntArray11351[0], anIntArray11351[1], anIntArray11351[2], anIntArray11351[3]);
		if (bool && !aClass178_Sub1_11349.aBool9391)
			aClass126_Sub1_11348.method2120();
		return bool;
	}

	boolean method17766(Class126_Sub1 class126_sub1, Class126_Sub1 class126_sub1_4_, float f) {
		boolean bool = true;
		Class168_Sub1_Sub3 class168_sub1_sub3 = aClass178_Sub1_11349.aClass168_Sub1_Sub3_9423;
		aClass178_Sub1_11349.method3075(anIntArray11350);
		aClass178_Sub1_11349.method3071();
		aClass178_Sub1_11349.method3069(anIntArray11351);
		aClass178_Sub1_11349.method14641();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, aClass126_Sub1_11348.anInt8888, aClass126_Sub1_11348.anInt8888);
		aClass178_Sub1_11349.method14788(false);
		aClass178_Sub1_11349.method14682(false);
		aClass178_Sub1_11349.method14684(false);
		aClass178_Sub1_11349.method14620(false);
		aClass178_Sub1_11349.method14670(-2);
		aClass178_Sub1_11349.method14673(1);
		aClass178_Sub1_11349.method14857(0.0F, 0.0F, 0.0F, f);
		aClass178_Sub1_11349.method14676(34165, 34165);
		aClass178_Sub1_11349.method14711(class126_sub1_4_);
		aClass178_Sub1_11349.method14673(0);
		aClass178_Sub1_11349.method14785(1);
		aClass178_Sub1_11349.method14711(class126_sub1);
		aClass178_Sub1_11349.method3353(class168_sub1_sub3, -707856242);
		for (int i = 0; i < 6; i++) {
			int i_5_ = 34069 + i;
			class168_sub1_sub3.method14424(0, aClass126_Sub1_11348.method14339(i_5_, 0));
			class168_sub1_sub3.method17790(0);
			if (class168_sub1_sub3.method14426()) {
				OpenGL.glBegin(7);
				switch (i_5_) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class168_sub1_sub3.method14424(0, null);
		aClass178_Sub1_11349.method3047(class168_sub1_sub3, (short) -6734);
		aClass178_Sub1_11349.method14673(1);
		aClass178_Sub1_11349.method14711(null);
		aClass178_Sub1_11349.method14676(8448, 8448);
		aClass178_Sub1_11349.method14673(0);
		aClass178_Sub1_11349.method14711(null);
		aClass178_Sub1_11349.method3378(anIntArray11350[0], anIntArray11350[1], anIntArray11350[2], anIntArray11350[3]);
		aClass178_Sub1_11349.method3208(anIntArray11351[0], anIntArray11351[1], anIntArray11351[2], anIntArray11351[3]);
		if (bool && !aClass178_Sub1_11349.aBool9391)
			aClass126_Sub1_11348.method2120();
		return bool;
	}
}
