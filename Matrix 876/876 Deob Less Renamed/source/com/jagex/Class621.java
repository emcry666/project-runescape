/* Class621 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class621 {
	long aLong8074;
	boolean aBool8075;
	long aLong8076;
	int anInt8077;
	int anInt8078;
	int anInt8079;
	Class522_Sub2_Sub1_Sub1[] aClass522_Sub2_Sub1_Sub1Array8080;
	List aList8081;
	List aList8082;
	public boolean aBool8083 = false;
	boolean aBool8084;
	boolean aBool8085;
	int anInt8086;
	Class171 aClass171_8087;
	static boolean[] aBoolArray8088 = new boolean[64];
	static boolean[] aBoolArray8089 = new boolean[16];

	public void method10121() {
		aBool8075 = true;
	}

	Class621(int i, boolean bool) {
		aBool8075 = false;
		anInt8077 = 0;
		aList8082 = new LinkedList();
		anInt8078 = 0;
		aList8081 = new LinkedList();
		anInt8086 = 0;
		aBool8084 = false;
		aBool8085 = false;
		aClass171_8087 = new Class171();
		aClass522_Sub2_Sub1_Sub1Array8080 = new Class522_Sub2_Sub1_Sub1[8192];
		method10125(i, bool);
	}

	void method10122(Class178 class178, Class184[] class184s, boolean bool) {
		for (int i = 0; i < 64; i++)
			aBoolArray8088[i] = false;
		Iterator iterator = aList8082.iterator();
		while_126_: while (iterator.hasNext()) {
			Class629 class629 = (Class629) iterator.next();
			if (class184s != null) {
				for (int i = 0; i < class184s.length && i != 64; i++) {
					if (class629.aClass184_8227 == class184s[i] || (class629.aClass184_8227 == class184s[i].aClass184_2111)) {
						aBoolArray8088[i] = true;
						class629.method10317(-383251402);
						class629.aBool8217 = false;
						continue while_126_;
					}
				}
			}
			if (!bool) {
				if (class629.anInt8222 * -902959021 == 0) {
					iterator.remove();
					anInt8078--;
				} else
					class629.aBool8217 = true;
			}
		}
		if (class184s != null) {
			for (int i = 0; i < class184s.length && i != 64 && anInt8078 != 64; i++) {
				if (!aBoolArray8088[i]) {
					Class629 class629 = new Class629(class178, class184s[i], this, aLong8074);
					aList8082.add(class629);
					anInt8078++;
					aBoolArray8088[i] = true;
				}
			}
		}
	}

	public void method10123() {
		aBool8075 = true;
	}

	void method10124() {
		aBool8083 = true;
		Iterator iterator = aList8081.iterator();
		while (iterator.hasNext()) {
			Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
			if (class523_sub42.aClass385_10768.anInt3997 * -129006153 == 1)
				class523_sub42.method8661(607052656);
		}
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null) {
				aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
				aClass522_Sub2_Sub1_Sub1Array8080[i] = null;
			}
		}
		anInt8077 = 0;
		aList8082 = new LinkedList();
		anInt8078 = 0;
		aList8081 = new LinkedList();
		anInt8086 = 0;
	}

	void method10125(int i, boolean bool) {
		Class617.aList8045.add(this);
		aLong8074 = (long) i;
		aLong8076 = (long) i;
		aBool8084 = true;
		aBool8085 = bool;
	}

	public void method10126() {
		aBool8075 = true;
	}

	public void method10127(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt8079 = i;
	}

	public void method10128(long l) {
		aLong8074 = l;
	}

	public void method10129(Class178 class178, long l, Class184[] class184s, Class143[] class143s, boolean bool) {
		if (!aBool8083) {
			method10130(class178, class184s, bool);
			method10154(class143s, bool);
			aLong8074 = l;
		}
	}

	void method10130(Class178 class178, Class184[] class184s, boolean bool) {
		for (int i = 0; i < 64; i++)
			aBoolArray8088[i] = false;
		Iterator iterator = aList8082.iterator();
		while_127_: while (iterator.hasNext()) {
			Class629 class629 = (Class629) iterator.next();
			if (class184s != null) {
				for (int i = 0; i < class184s.length && i != 64; i++) {
					if (class629.aClass184_8227 == class184s[i] || (class629.aClass184_8227 == class184s[i].aClass184_2111)) {
						aBoolArray8088[i] = true;
						class629.method10317(-594539791);
						class629.aBool8217 = false;
						continue while_127_;
					}
				}
			}
			if (!bool) {
				if (class629.anInt8222 * -902959021 == 0) {
					iterator.remove();
					anInt8078--;
				} else
					class629.aBool8217 = true;
			}
		}
		if (class184s != null) {
			for (int i = 0; i < class184s.length && i != 64 && anInt8078 != 64; i++) {
				if (!aBoolArray8088[i]) {
					Class629 class629 = new Class629(class178, class184s[i], this, aLong8074);
					aList8082.add(class629);
					anInt8078++;
					aBoolArray8088[i] = true;
				}
			}
		}
	}

	public void method10131() {
		aBool8084 = true;
	}

	public Class171 method10132() {
		aClass171_8087.aClass686_1836.method13876((byte) 1);
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null && (aClass522_Sub2_Sub1_Sub1Array8080[i].aClass629_12040 != null))
				aClass171_8087.aClass686_1836.method13877(aClass522_Sub2_Sub1_Sub1Array8080[i], (byte) -19);
		}
		return aClass171_8087;
	}

	public void method10133(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		anInt8079 = i;
	}

	void method10134(Class560 class560, Class178 class178) {
		aClass171_8087.aClass686_1836.method13876((byte) 1);
		Iterator iterator = aList8082.iterator();
		while (iterator.hasNext()) {
			Class629 class629 = (Class629) iterator.next();
			class629.method10325(class560, class178, aLong8076);
		}
	}

	public Class171 method10135() {
		return aClass171_8087;
	}

	public void method10136() {
		aBool8084 = true;
	}

	public static Class621 method10137(int i, boolean bool) {
		if (Class617.anInt8046 * -1285472633 != Class617.anInt8041 * 1114478919) {
			Class621 class621 = Class617.aClass621Array8044[Class617.anInt8041 * 1114478919];
			Class617.anInt8041 = (Class617.anInt8041 * 1114478919 + 1 & (Class173.anIntArray1840[Class617.anInt8054 * -1334998773])) * -547078025;
			class621.method10125(i, bool);
			return class621;
		}
		return new Class621(i, bool);
	}

	void method10138(int i, boolean bool) {
		Class617.aList8045.add(this);
		aLong8074 = (long) i;
		aLong8076 = (long) i;
		aBool8084 = true;
		aBool8085 = bool;
	}

	public Class171 method10139() {
		return aClass171_8087;
	}

	public void method10140() {
		aBool8084 = true;
	}

	void method10141() {
		aBool8075 = false;
	}

	void method10142() {
		aBool8083 = true;
		Iterator iterator = aList8081.iterator();
		while (iterator.hasNext()) {
			Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
			if (class523_sub42.aClass385_10768.anInt3997 * -129006153 == 1)
				class523_sub42.method8661(607052656);
		}
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null) {
				aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
				aClass522_Sub2_Sub1_Sub1Array8080[i] = null;
			}
		}
		anInt8077 = 0;
		aList8082 = new LinkedList();
		anInt8078 = 0;
		aList8081 = new LinkedList();
		anInt8086 = 0;
	}

	void method10143() {
		aBool8083 = true;
		Iterator iterator = aList8081.iterator();
		while (iterator.hasNext()) {
			Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
			if (class523_sub42.aClass385_10768.anInt3997 * -129006153 == 1)
				class523_sub42.method8661(607052656);
		}
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null) {
				aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
				aClass522_Sub2_Sub1_Sub1Array8080[i] = null;
			}
		}
		anInt8077 = 0;
		aList8082 = new LinkedList();
		anInt8078 = 0;
		aList8081 = new LinkedList();
		anInt8086 = 0;
	}

	public void method10144() {
		aBool8075 = true;
	}

	void method10145(Class560 class560, Class178 class178) {
		aClass171_8087.aClass686_1836.method13876((byte) 1);
		Iterator iterator = aList8082.iterator();
		while (iterator.hasNext()) {
			Class629 class629 = (Class629) iterator.next();
			class629.method10325(class560, class178, aLong8076);
		}
	}

	void method10146(Class560 class560, Class178 class178) {
		aClass171_8087.aClass686_1836.method13876((byte) 1);
		Iterator iterator = aList8082.iterator();
		while (iterator.hasNext()) {
			Class629 class629 = (Class629) iterator.next();
			class629.method10325(class560, class178, aLong8076);
		}
	}

	void method10147() {
		aBool8075 = false;
	}

	void method10148() {
		aBool8075 = false;
	}

	public static Class621 method10149(int i, boolean bool) {
		if (Class617.anInt8046 * -1285472633 != Class617.anInt8041 * 1114478919) {
			Class621 class621 = Class617.aClass621Array8044[Class617.anInt8041 * 1114478919];
			Class617.anInt8041 = (Class617.anInt8041 * 1114478919 + 1 & (Class173.anIntArray1840[Class617.anInt8054 * -1334998773])) * -547078025;
			class621.method10125(i, bool);
			return class621;
		}
		return new Class621(i, bool);
	}

	void method10150(Class143[] class143s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray8089[i] = false;
		Iterator iterator = aList8081.iterator();
		while_128_: while (iterator.hasNext()) {
			Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
			if (class143s != null) {
				for (int i = 0; i < class143s.length; i++) {
					if (class523_sub42.aClass143_10764 == class143s[i] || (class523_sub42.aClass143_10764 == class143s[i].aClass143_1687)) {
						aBoolArray8089[i] = true;
						class523_sub42.method16576((byte) -28);
						continue while_128_;
					}
				}
			}
			if (!bool) {
				class523_sub42.method8661(607052656);
				anInt8086--;
				if (class523_sub42.method8660(1828350079)) {
					class523_sub42.method8661(607052656);
					Class617.anInt8053 -= 2079120011;
				}
			}
		}
		if (class143s != null) {
			for (int i = 0; i < class143s.length && i != 16 && anInt8086 != 16; i++) {
				if (!aBoolArray8089[i]) {
					Class523_Sub42 class523_sub42 = null;
					if (((class143s[i].method2364(Class425.anInterface45_4820, (byte) 87).anInt3997) * -129006153) == 1 && Class617.anInt8053 * -872334045 < 32) {
						class523_sub42 = new Class523_Sub42(class143s[i], this);
						Class617.aClass14_8042.method738(class523_sub42, (long) (class143s[i].anInt1686 * 1537277297));
						Class617.anInt8053 += 2079120011;
					}
					if (class523_sub42 == null)
						class523_sub42 = new Class523_Sub42(class143s[i], this);
					aList8081.add(class523_sub42);
					anInt8086++;
					aBoolArray8089[i] = true;
				}
			}
		}
	}

	public Class171 method10151() {
		aClass171_8087.aClass686_1836.method13876((byte) 1);
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null && (aClass522_Sub2_Sub1_Sub1Array8080[i].aClass629_12040 != null))
				aClass171_8087.aClass686_1836.method13877(aClass522_Sub2_Sub1_Sub1Array8080[i], (byte) 6);
		}
		return aClass171_8087;
	}

	public Class171 method10152() {
		aClass171_8087.aClass686_1836.method13876((byte) 1);
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null && (aClass522_Sub2_Sub1_Sub1Array8080[i].aClass629_12040 != null))
				aClass171_8087.aClass686_1836.method13877(aClass522_Sub2_Sub1_Sub1Array8080[i], (byte) 30);
		}
		return aClass171_8087;
	}

	void method10153() {
		aBool8083 = true;
		Iterator iterator = aList8081.iterator();
		while (iterator.hasNext()) {
			Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
			if (class523_sub42.aClass385_10768.anInt3997 * -129006153 == 1)
				class523_sub42.method8661(607052656);
		}
		for (int i = 0; i < aClass522_Sub2_Sub1_Sub1Array8080.length; i++) {
			if (aClass522_Sub2_Sub1_Sub1Array8080[i] != null) {
				aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
				aClass522_Sub2_Sub1_Sub1Array8080[i] = null;
			}
		}
		anInt8077 = 0;
		aList8082 = new LinkedList();
		anInt8078 = 0;
		aList8081 = new LinkedList();
		anInt8086 = 0;
	}

	void method10154(Class143[] class143s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray8089[i] = false;
		Iterator iterator = aList8081.iterator();
		while_129_: while (iterator.hasNext()) {
			Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
			if (class143s != null) {
				for (int i = 0; i < class143s.length; i++) {
					if (class523_sub42.aClass143_10764 == class143s[i] || (class523_sub42.aClass143_10764 == class143s[i].aClass143_1687)) {
						aBoolArray8089[i] = true;
						class523_sub42.method16576((byte) -119);
						continue while_129_;
					}
				}
			}
			if (!bool) {
				class523_sub42.method8661(607052656);
				anInt8086--;
				if (class523_sub42.method8660(1309307668)) {
					class523_sub42.method8661(607052656);
					Class617.anInt8053 -= 2079120011;
				}
			}
		}
		if (class143s != null) {
			for (int i = 0; i < class143s.length && i != 16 && anInt8086 != 16; i++) {
				if (!aBoolArray8089[i]) {
					Class523_Sub42 class523_sub42 = null;
					if (((class143s[i].method2364(Class425.anInterface45_4820, (byte) 114).anInt3997) * -129006153) == 1 && Class617.anInt8053 * -872334045 < 32) {
						class523_sub42 = new Class523_Sub42(class143s[i], this);
						Class617.aClass14_8042.method738(class523_sub42, (long) (class143s[i].anInt1686 * 1537277297));
						Class617.anInt8053 += 2079120011;
					}
					if (class523_sub42 == null)
						class523_sub42 = new Class523_Sub42(class143s[i], this);
					aList8081.add(class523_sub42);
					anInt8086++;
					aBoolArray8089[i] = true;
				}
			}
		}
	}

	public static Class621 method10155(int i, boolean bool) {
		if (Class617.anInt8046 * -1285472633 != Class617.anInt8041 * 1114478919) {
			Class621 class621 = Class617.aClass621Array8044[Class617.anInt8041 * 1114478919];
			Class617.anInt8041 = (Class617.anInt8041 * 1114478919 + 1 & (Class173.anIntArray1840[Class617.anInt8054 * -1334998773])) * -547078025;
			class621.method10125(i, bool);
			return class621;
		}
		return new Class621(i, bool);
	}

	boolean method10156(Class178 class178, long l) {
		if (aLong8074 != aLong8076)
			method10123();
		else
			method10141();
		if (l - aLong8074 > 750L) {
			method10124();
			return false;
		}
		int i = (int) (l - aLong8076);
		if (aBool8084) {
			Iterator iterator = aList8082.iterator();
			while (iterator.hasNext()) {
				Class629 class629 = (Class629) iterator.next();
				for (int i_8_ = 0; i_8_ < class629.aClass400_8215.anInt4094 * -1298099937; i_8_++)
					class629.method10318(class178, l, 1, !aBool8075, 534142755);
			}
			aBool8084 = false;
		}
		Iterator iterator = aList8082.iterator();
		while (iterator.hasNext()) {
			Class629 class629 = (Class629) iterator.next();
			class629.method10318(class178, l, i, !aBool8075, 534142755);
		}
		aLong8076 = l;
		return true;
	}

	public Class171 method10157() {
		return aClass171_8087;
	}
}
