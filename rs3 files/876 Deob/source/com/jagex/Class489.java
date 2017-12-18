/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class489 {
	int anInt5501;
	Interface71 anInterface71_5502;
	Class488 aClass488_5503 = Class488.aClass488_5490;
	int anInt5504;
	List aList5505;
	Object anObject5506;
	Interface58 anInterface58_5507;
	float aFloat5508;
	boolean aBool5509;
	Object anObject5510;
	float aFloat5511;
	boolean aBool5512 = false;
	float aFloat5513;
	float aFloat5514;
	int anInt5515;
	int anInt5516;
	Class375 aClass375_5517;
	Class437 aClass437_5518;
	boolean aBool5519;

	public void method7954(Object object) {
		anObject5506 = object;
	}

	void method7955(short i) {
		anInterface71_5502 = null;
		aClass488_5503 = Class488.aClass488_5490;
		aBool5512 = false;
		aList5505.clear();
		anObject5506 = null;
		aClass437_5518 = null;
		anInt5501 = 2087895149;
		aBool5509 = false;
		anInt5516 = 0;
		aFloat5511 = 0.0F;
		anInterface58_5507 = null;
		aFloat5513 = 0.0F;
		aFloat5514 = 0.0F;
		anInt5515 = 0;
		aBool5519 = false;
		anObject5510 = null;
		anInt5504 = 0;
		aFloat5508 = 1.0F;
	}

	public void method7956(Interface71 interface71, int i) {
		anInterface71_5502 = interface71;
		aFloat5511 = 0.0F;
		aClass488_5503 = Class488.aClass488_5496;
	}

	public void method7957(int i) {
		if (Class488.aClass488_5495 != aClass488_5503 && Class488.aClass488_5493 != aClass488_5503)
			method7960(0, (byte) 97);
		Iterator iterator = aList5505.iterator();
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				iterator.remove();
			else
				class477.method7776((byte) -70);
		}
		method7955((short) 3852);
		aClass488_5503 = Class488.aClass488_5498;
	}

	public void method7958(byte i) {
		if (!aBool5512 && (Class488.aClass488_5497 != aClass488_5503 && aClass488_5503 != Class488.aClass488_5498 && aClass488_5503 != Class488.aClass488_5490 && Class488.aClass488_5494 != aClass488_5503) && ((aClass488_5503.anInt5499 * -1310203839 <= -1310203839 * Class488.aClass488_5496.anInt5499) || (-1310203839 * aClass488_5503.anInt5499 >= -1310203839 * Class488.aClass488_5495.anInt5499)))
			aClass488_5503 = Class488.aClass488_5491;
	}

	public float method7959(byte i) {
		return aFloat5513;
	}

	public void method7960(int i, byte i_0_) {
		if (aClass488_5503.anInt5499 * -1310203839 < Class488.aClass488_5495.anInt5499 * -1310203839) {
			if (-1310203839 * aClass488_5503.anInt5499 < -1310203839 * Class488.aClass488_5492.anInt5499) {
				aClass488_5503 = Class488.aClass488_5495;
				aBool5512 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5505.iterator();
				while (iterator.hasNext()) {
					Class477 class477 = (Class477) iterator.next();
					if (class477.method7807((byte) 4) != this)
						iterator.remove();
					else
						class477.method7781(-1045977218);
				}
				aClass488_5503 = Class488.aClass488_5495;
				aBool5512 = false;
			} else {
				aClass488_5503 = Class488.aClass488_5494;
				Iterator iterator = aList5505.iterator();
				while (iterator.hasNext()) {
					Class477 class477 = (Class477) iterator.next();
					if (class477.method7807((byte) 4) != this)
						iterator.remove();
					else
						class477.method7777(0.0F, i, 117411605);
				}
			}
		}
	}

	public void method7961(int i) {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5495;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7886((short) 16877);
		}
	}

	public float method7962(int i) {
		return aFloat5514;
	}

	public void method7963(Interface58 interface58, int i) {
		anInterface58_5507 = interface58;
	}

	public void method7964(byte i) {
		if (aClass488_5503 == Class488.aClass488_5491) {
			Class597 class597 = anInterface71_5502.method474((short) -25257);
			if (Class597.aClass597_7834 == class597)
				aClass488_5503 = Class488.aClass488_5489;
		}
		if (Class488.aClass488_5489 == aClass488_5503 && aBool5512 == true) {
			Class477 class477 = aClass375_5517.method6355(anInterface71_5502.method458(-1544999633), -113134870);
			if (null != class477) {
				boolean bool = anInterface71_5502.method477((short) 26856);
				Class493 class493 = new Class493(this);
				boolean bool_1_ = (class477.method7788(bool ? null : anInterface71_5502.method452(0, (byte) 11), bool ? class493 : null, anInt5501 * 1972942491, 1567104329 * anInt5504 > 0 ? 0.0F : aFloat5511, false, aBool5509, anInt5516 * 773579467, aFloat5508, this, (byte) 79));
				if (true == bool_1_) {
					aClass488_5503 = Class488.aClass488_5492;
					class477.method7782(anInterface58_5507, -2072483065);
					class477.method7777(aFloat5511, anInt5504 * 1567104329, -678414218);
					class477.method7780((byte) 10);
					aList5505.add(class477);
					aBool5512 = false;
				} else {
					if (class477.method7771((short) -6240) == Class479.aClass479_5457)
						aClass488_5503 = Class488.aClass488_5493;
					class477.method7776((byte) -96);
				}
			}
		}
		Iterator iterator = aList5505.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				iterator.remove();
			else {
				if (aClass488_5503 == Class488.aClass488_5494) {
					if (class477.method7778(1608886169) == 0.0F)
						class477.method7781(521927551);
					else
						bool = false;
				}
				if (class477.method7774((byte) 2) == true || class477.method7773(-1499373798) == true) {
					class477.method7776((byte) -9);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (aClass488_5503.anInt5499 * -1310203839 >= Class488.aClass488_5492.anInt5499 * -1310203839) && (-1310203839 * aClass488_5503.anInt5499 < -1310203839 * Class488.aClass488_5495.anInt5499)) {
			if (aClass488_5503 == Class488.aClass488_5494)
				aClass488_5503 = Class488.aClass488_5495;
			else
				aClass488_5503 = Class488.aClass488_5493;
		}
	}

	public void method7965() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5495;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7886((short) 18669);
		}
	}

	public void method7966(Object object, int i) {
		anObject5506 = object;
	}

	public Object method7967(byte i) {
		return anObject5506;
	}

	public void method7968(Object object, int i) {
		anObject5510 = object;
	}

	public Object method7969(int i) {
		return anObject5510;
	}

	public void method7970(Object object) {
		anObject5506 = object;
	}

	public void method7971(int i, byte i_2_) {
		anInt5501 = -2087895149 * i;
	}

	public void method7972(boolean bool, int i) {
		/* empty */
	}

	public Interface71 method7973(int i) {
		return anInterface71_5502;
	}

	public void method7974(Interface71 interface71) {
		anInterface71_5502 = interface71;
		aFloat5511 = 0.0F;
		aClass488_5503 = Class488.aClass488_5496;
	}

	public Class488 method7975() {
		return aClass488_5503;
	}

	public void method7976(Interface58 interface58) {
		anInterface58_5507 = interface58;
	}

	public int method7977(int i) {
		return 1972942491 * anInt5501;
	}

	public void method7978(float f, int i) {
		aFloat5513 = f;
	}

	public boolean method7979() {
		aBool5519 = false;
		return -545096007 * anInt5515 != 0;
	}

	public void method7980(int i, boolean bool, byte i_3_) {
		aBool5519 = bool;
		anInt5515 = i * 45885321;
	}

	public boolean method7981(int i) {
		aBool5519 = false;
		return -545096007 * anInt5515 != 0;
	}

	public void method7982(int i) {
		if (anInt5515 * -545096007 > -1 && !aBool5519)
			anInt5515 -= 45885321;
		if (-545096007 * anInt5515 == 0)
			method8032(1402240954);
	}

	public void method7983(float f, int i, int i_4_) {
		aFloat5511 = f;
		int i_5_ = 0;
		Iterator iterator = aList5505.iterator();
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				aList5505.remove(class477);
			else {
				class477.method7777(aFloat5511, i, -1019089729);
				i_5_++;
			}
		}
		if (i_5_ == 0)
			anInt5504 = 1056138489 * i;
	}

	public void method7984(boolean bool, int i, int i_6_) {
		aBool5509 = bool;
		anInt5516 = -1402539293 * i;
	}

	public Interface71 method7985() {
		return anInterface71_5502;
	}

	void method7986() {
		anInterface71_5502 = null;
		aClass488_5503 = Class488.aClass488_5490;
		aBool5512 = false;
		aList5505.clear();
		anObject5506 = null;
		aClass437_5518 = null;
		anInt5501 = 2087895149;
		aBool5509 = false;
		anInt5516 = 0;
		aFloat5511 = 0.0F;
		anInterface58_5507 = null;
		aFloat5513 = 0.0F;
		aFloat5514 = 0.0F;
		anInt5515 = 0;
		aBool5519 = false;
		anObject5510 = null;
		anInt5504 = 0;
		aFloat5508 = 1.0F;
	}

	public void method7987() {
		if (!aBool5512 && (Class488.aClass488_5497 != aClass488_5503 && aClass488_5503 != Class488.aClass488_5498 && aClass488_5503 != Class488.aClass488_5490 && Class488.aClass488_5494 != aClass488_5503) && ((aClass488_5503.anInt5499 * -1310203839 <= -1310203839 * Class488.aClass488_5496.anInt5499) || (-1310203839 * aClass488_5503.anInt5499 >= -1310203839 * Class488.aClass488_5495.anInt5499)))
			aClass488_5503 = Class488.aClass488_5491;
	}

	public void method7988(int i) {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5491;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7795(2039986507);
		}
	}

	public void method7989() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5495;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7886((short) 945);
		}
	}

	public void method7990(Interface71 interface71) {
		anInterface71_5502 = interface71;
		aFloat5511 = 0.0F;
		aClass488_5503 = Class488.aClass488_5496;
	}

	public void method7991() {
		if (Class488.aClass488_5495 != aClass488_5503 && Class488.aClass488_5493 != aClass488_5503)
			method7960(0, (byte) 97);
		Iterator iterator = aList5505.iterator();
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				iterator.remove();
			else
				class477.method7776((byte) -23);
		}
		method7955((short) 3564);
		aClass488_5503 = Class488.aClass488_5498;
	}

	public void method7992(int i) {
		anInt5501 = -2087895149 * i;
	}

	public void method7993() {
		if (!aBool5512 && (Class488.aClass488_5497 != aClass488_5503 && aClass488_5503 != Class488.aClass488_5498 && aClass488_5503 != Class488.aClass488_5490 && Class488.aClass488_5494 != aClass488_5503) && ((aClass488_5503.anInt5499 * -1310203839 <= -1310203839 * Class488.aClass488_5496.anInt5499) || (-1310203839 * aClass488_5503.anInt5499 >= -1310203839 * Class488.aClass488_5495.anInt5499)))
			aClass488_5503 = Class488.aClass488_5491;
	}

	public void method7994() {
		if (!aBool5512 && (Class488.aClass488_5497 != aClass488_5503 && aClass488_5503 != Class488.aClass488_5498 && aClass488_5503 != Class488.aClass488_5490 && Class488.aClass488_5494 != aClass488_5503) && ((aClass488_5503.anInt5499 * -1310203839 <= -1310203839 * Class488.aClass488_5496.anInt5499) || (-1310203839 * aClass488_5503.anInt5499 >= -1310203839 * Class488.aClass488_5495.anInt5499)))
			aClass488_5503 = Class488.aClass488_5491;
	}

	public void method7995() {
		if (aClass488_5503 != Class488.aClass488_5497 && Class488.aClass488_5498 != aClass488_5503 && Class488.aClass488_5490 != aClass488_5503 && Class488.aClass488_5494 != aClass488_5503) {
			if ((Class488.aClass488_5491 == aClass488_5503 || aClass488_5503 == Class488.aClass488_5489) && !aBool5512)
				aBool5512 = true;
			else if ((-1310203839 * aClass488_5503.anInt5499 < Class488.aClass488_5491.anInt5499 * -1310203839) || (-1310203839 * aClass488_5503.anInt5499 >= -1310203839 * Class488.aClass488_5495.anInt5499)) {
				aClass488_5503 = Class488.aClass488_5491;
				aBool5512 = true;
			}
		}
	}

	public void method7996() {
		if (anInt5515 * -545096007 > -1 && !aBool5519)
			anInt5515 -= 45885321;
		if (-545096007 * anInt5515 == 0)
			method8032(1473588569);
	}

	public void method7997() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5495;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7886((short) -21918);
		}
	}

	public void method7998() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5495;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7886((short) 1785);
		}
	}

	public Object method7999() {
		return anObject5506;
	}

	public void method8000() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5495;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7886((short) 18169);
		}
	}

	public void method8001() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5491;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7795(725559449);
		}
	}

	public Class489(Class375 class375) {
		anInt5504 = 0;
		aClass375_5517 = class375;
		aList5505 = new ArrayList();
	}

	public void method8002(float f, int i) {
		if (!(f < 0.0F))
			aFloat5508 = f;
	}

	public void method8003(Interface71 interface71) {
		anInterface71_5502 = interface71;
		aFloat5511 = 0.0F;
		aClass488_5503 = Class488.aClass488_5496;
	}

	public Class488 method8004(short i) {
		return aClass488_5503;
	}

	public void method8005(Interface58 interface58) {
		anInterface58_5507 = interface58;
	}

	public void method8006() {
		if (aClass488_5503 == Class488.aClass488_5491) {
			Class597 class597 = anInterface71_5502.method474((short) -30308);
			if (Class597.aClass597_7834 == class597)
				aClass488_5503 = Class488.aClass488_5489;
		}
		if (Class488.aClass488_5489 == aClass488_5503 && aBool5512 == true) {
			Class477 class477 = aClass375_5517.method6355(anInterface71_5502.method458(-2027819397), 1241935353);
			if (null != class477) {
				boolean bool = anInterface71_5502.method477((short) 29423);
				Class493 class493 = new Class493(this);
				boolean bool_7_ = (class477.method7788(bool ? null : anInterface71_5502.method452(0, (byte) 11), bool ? class493 : null, anInt5501 * 1972942491, 1567104329 * anInt5504 > 0 ? 0.0F : aFloat5511, false, aBool5509, anInt5516 * 773579467, aFloat5508, this, (byte) 23));
				if (true == bool_7_) {
					aClass488_5503 = Class488.aClass488_5492;
					class477.method7782(anInterface58_5507, -2072483065);
					class477.method7777(aFloat5511, anInt5504 * 1567104329, -1264158270);
					class477.method7780((byte) -47);
					aList5505.add(class477);
					aBool5512 = false;
				} else {
					if (class477.method7771((short) -2119) == Class479.aClass479_5457)
						aClass488_5503 = Class488.aClass488_5493;
					class477.method7776((byte) -64);
				}
			}
		}
		Iterator iterator = aList5505.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				iterator.remove();
			else {
				if (aClass488_5503 == Class488.aClass488_5494) {
					if (class477.method7778(-1307164395) == 0.0F)
						class477.method7781(542135384);
					else
						bool = false;
				}
				if (class477.method7774((byte) 2) == true || class477.method7773(-279520718) == true) {
					class477.method7776((byte) -19);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (aClass488_5503.anInt5499 * -1310203839 >= Class488.aClass488_5492.anInt5499 * -1310203839) && (-1310203839 * aClass488_5503.anInt5499 < -1310203839 * Class488.aClass488_5495.anInt5499)) {
			if (aClass488_5503 == Class488.aClass488_5494)
				aClass488_5503 = Class488.aClass488_5495;
			else
				aClass488_5503 = Class488.aClass488_5493;
		}
	}

	public void method8007() {
		if (aClass488_5503 == Class488.aClass488_5491) {
			Class597 class597 = anInterface71_5502.method474((short) -28224);
			if (Class597.aClass597_7834 == class597)
				aClass488_5503 = Class488.aClass488_5489;
		}
		if (Class488.aClass488_5489 == aClass488_5503 && aBool5512 == true) {
			Class477 class477 = aClass375_5517.method6355(anInterface71_5502.method458(-1854410476), 731631805);
			if (null != class477) {
				boolean bool = anInterface71_5502.method477((short) 21918);
				Class493 class493 = new Class493(this);
				boolean bool_8_ = (class477.method7788(bool ? null : anInterface71_5502.method452(0, (byte) 11), bool ? class493 : null, anInt5501 * 1972942491, 1567104329 * anInt5504 > 0 ? 0.0F : aFloat5511, false, aBool5509, anInt5516 * 773579467, aFloat5508, this, (byte) 25));
				if (true == bool_8_) {
					aClass488_5503 = Class488.aClass488_5492;
					class477.method7782(anInterface58_5507, -2072483065);
					class477.method7777(aFloat5511, anInt5504 * 1567104329, -772535787);
					class477.method7780((byte) -54);
					aList5505.add(class477);
					aBool5512 = false;
				} else {
					if (class477.method7771((short) 14987) == Class479.aClass479_5457)
						aClass488_5503 = Class488.aClass488_5493;
					class477.method7776((byte) -81);
				}
			}
		}
		Iterator iterator = aList5505.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				iterator.remove();
			else {
				if (aClass488_5503 == Class488.aClass488_5494) {
					if (class477.method7778(1793532579) == 0.0F)
						class477.method7781(-626852040);
					else
						bool = false;
				}
				if (class477.method7774((byte) 2) == true || class477.method7773(981927636) == true) {
					class477.method7776((byte) -39);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (aClass488_5503.anInt5499 * -1310203839 >= Class488.aClass488_5492.anInt5499 * -1310203839) && (-1310203839 * aClass488_5503.anInt5499 < -1310203839 * Class488.aClass488_5495.anInt5499)) {
			if (aClass488_5503 == Class488.aClass488_5494)
				aClass488_5503 = Class488.aClass488_5495;
			else
				aClass488_5503 = Class488.aClass488_5493;
		}
	}

	public Class488 method8008() {
		return aClass488_5503;
	}

	public Class488 method8009() {
		return aClass488_5503;
	}

	public float method8010() {
		return aFloat5514;
	}

	public void method8011(Object object) {
		anObject5506 = object;
	}

	public void method8012() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5491;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7795(2124366088);
		}
	}

	public float method8013() {
		return aFloat5513;
	}

	public void method8014(float f, int i) {
		aFloat5514 = f;
	}

	public void method8015(boolean bool, int i) {
		aBool5509 = bool;
		anInt5516 = -1402539293 * i;
	}

	public Object method8016() {
		return anObject5506;
	}

	public void method8017(Object object) {
		anObject5510 = object;
	}

	public void method8018(Object object) {
		anObject5510 = object;
	}

	public void method8019(Object object) {
		anObject5510 = object;
	}

	public void method8020(Object object) {
		anObject5510 = object;
	}

	public Object method8021() {
		return anObject5510;
	}

	public int method8022() {
		return 1972942491 * anInt5501;
	}

	public void method8023(int i) {
		anInt5501 = -2087895149 * i;
	}

	public void method8024(int i) {
		anInt5501 = -2087895149 * i;
	}

	public Interface71 method8025() {
		return anInterface71_5502;
	}

	public void method8026() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5491;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7795(671650249);
		}
	}

	public void method8027() {
		Iterator iterator = aList5505.iterator();
		aClass488_5503 = Class488.aClass488_5491;
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) == this)
				class477.method7795(1349237884);
		}
	}

	public void method8028(float f) {
		if (!(f < 0.0F))
			aFloat5508 = f;
	}

	public void method8029(Class437 class437) {
		aClass437_5518 = class437;
	}

	public Class437 method8030() {
		return aClass437_5518;
	}

	public void method8031(Class437 class437, int i) {
		aClass437_5518 = class437;
	}

	public void method8032(int i) {
		if (aClass488_5503 != Class488.aClass488_5497 && Class488.aClass488_5498 != aClass488_5503 && Class488.aClass488_5490 != aClass488_5503 && Class488.aClass488_5494 != aClass488_5503) {
			if ((Class488.aClass488_5491 == aClass488_5503 || aClass488_5503 == Class488.aClass488_5489) && !aBool5512)
				aBool5512 = true;
			else if ((-1310203839 * aClass488_5503.anInt5499 < Class488.aClass488_5491.anInt5499 * -1310203839) || (-1310203839 * aClass488_5503.anInt5499 >= -1310203839 * Class488.aClass488_5495.anInt5499)) {
				aClass488_5503 = Class488.aClass488_5491;
				aBool5512 = true;
			}
		}
	}

	public void method8033(float f) {
		aFloat5513 = f;
	}

	public void method8034(float f) {
		aFloat5513 = f;
	}

	public Class437 method8035(int i) {
		return aClass437_5518;
	}

	public void method8036() {
		if (anInt5515 * -545096007 > -1 && !aBool5519)
			anInt5515 -= 45885321;
		if (-545096007 * anInt5515 == 0)
			method8032(1166856854);
	}

	public void method8037() {
		if (anInt5515 * -545096007 > -1 && !aBool5519)
			anInt5515 -= 45885321;
		if (-545096007 * anInt5515 == 0)
			method8032(1606095148);
	}

	public void method8038() {
		if (anInt5515 * -545096007 > -1 && !aBool5519)
			anInt5515 -= 45885321;
		if (-545096007 * anInt5515 == 0)
			method8032(1861071867);
	}

	void method8039() {
		anInterface71_5502 = null;
		aClass488_5503 = Class488.aClass488_5490;
		aBool5512 = false;
		aList5505.clear();
		anObject5506 = null;
		aClass437_5518 = null;
		anInt5501 = 2087895149;
		aBool5509 = false;
		anInt5516 = 0;
		aFloat5511 = 0.0F;
		anInterface58_5507 = null;
		aFloat5513 = 0.0F;
		aFloat5514 = 0.0F;
		anInt5515 = 0;
		aBool5519 = false;
		anObject5510 = null;
		anInt5504 = 0;
		aFloat5508 = 1.0F;
	}

	public void method8040(float f, int i) {
		aFloat5511 = f;
		int i_9_ = 0;
		Iterator iterator = aList5505.iterator();
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				aList5505.remove(class477);
			else {
				class477.method7777(aFloat5511, i, -1390443964);
				i_9_++;
			}
		}
		if (i_9_ == 0)
			anInt5504 = 1056138489 * i;
	}

	public void method8041(float f, int i) {
		aFloat5511 = f;
		int i_10_ = 0;
		Iterator iterator = aList5505.iterator();
		while (iterator.hasNext()) {
			Class477 class477 = (Class477) iterator.next();
			if (class477.method7807((byte) 4) != this)
				aList5505.remove(class477);
			else {
				class477.method7777(aFloat5511, i, -1500492855);
				i_10_++;
			}
		}
		if (i_10_ == 0)
			anInt5504 = 1056138489 * i;
	}

	public void method8042(boolean bool, int i) {
		aBool5509 = bool;
		anInt5516 = -1402539293 * i;
	}

	public void method8043(boolean bool) {
		/* empty */
	}

	public void method8044(Object object) {
		anObject5506 = object;
	}

	public void method8045(float f) {
		if (!(f < 0.0F))
			aFloat5508 = f;
	}

	static final void method8046(Class669 class669, int i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_11_, (byte) 19)).equipSlot) * 296111211;
	}
}
