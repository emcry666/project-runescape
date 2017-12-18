/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;

public class Class354 {
	Interface41 anInterface41_3673;
	Class170 aClass170_3674;
	Class168_Sub1 aClass168_Sub1_3675;
	Interface41 anInterface41_3676;
	Interface41 anInterface41_3677;
	Interface36 anInterface36_3678;
	Interface22 anInterface22_3679;
	Class168_Sub1 aClass168_Sub1_3680;
	Interface22 anInterface22_3681;
	Interface22 anInterface22_3682;
	int anInt3683;
	Class178_Sub2 aClass178_Sub2_3684;
	int anInt3685;
	int anInt3686;
	Interface23 anInterface23_3687;
	int anInt3688 = 0;
	Interface22 anInterface22_3689;
	boolean aBool3690;
	Vector aVector3691 = new Vector();
	Interface23 anInterface23_3692;
	Class345 aClass345_3693;
	int anInt3694 = 0;
	int anInt3695 = 0;

	boolean method6203() {
		int i = aVector3691.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			if (!((Class350) aVector3691.elementAt(i_0_)).method6124())
				return false;
		}
		return true;
	}

	boolean method6204() {
		int i = aVector3691.size();
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			if (!((Class350) aVector3691.elementAt(i_1_)).method6124())
				return false;
		}
		return true;
	}

	void method6205() {
		aClass178_Sub2_3684.method15033(0, anInterface36_3678);
		aClass178_Sub2_3684.method15032(aClass345_3693);
		aClass178_Sub2_3684.method15040(Class376.aClass376_3917, 0, 1);
	}

	void method6206() {
		method6226();
		switch (anInt3694) {
		case 2:
			aClass170_3674 = Class170.aClass170_1825;
			break;
		case 0:
			aClass170_3674 = Class170.aClass170_1822;
			break;
		default:
			throw new RuntimeException();
		case 1:
			aClass170_3674 = Class170.aClass170_1832;
		}
		aClass168_Sub1_3675 = aClass178_Sub2_3684.method3248();
		if (aClass178_Sub2_3684.anInt9661 > 1 && aClass178_Sub2_3684.aBool9566 && aClass178_Sub2_3684.aBool9609) {
			aClass168_Sub1_3680 = aClass178_Sub2_3684.method3248();
			anInterface22_3682 = aClass178_Sub2_3684.method3050(anInt3685, anInt3686, Class158.aClass158_1743, aClass170_3674, (aClass178_Sub2_3684.anInt9661));
			anInterface23_3687 = aClass178_Sub2_3684.method3049(anInt3685, anInt3686, (aClass178_Sub2_3684.anInt9661));
		}
		anInterface41_3676 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3689 = anInterface41_3676.method279(0);
		anInterface41_3677 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3679 = anInterface41_3677.method279(0);
		anInterface41_3673 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3681 = anInterface41_3673.method279(0);
		anInterface23_3692 = aClass178_Sub2_3684.method3051(anInterface41_3673.method1(), anInterface41_3673.method82());
		int i = aVector3691.size();
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_2_);
			class350.method6116(anInt3685, anInt3686);
		}
	}

	void method6207() {
		method6226();
		switch (anInt3694) {
		case 2:
			aClass170_3674 = Class170.aClass170_1825;
			break;
		case 0:
			aClass170_3674 = Class170.aClass170_1822;
			break;
		default:
			throw new RuntimeException();
		case 1:
			aClass170_3674 = Class170.aClass170_1832;
		}
		aClass168_Sub1_3675 = aClass178_Sub2_3684.method3248();
		if (aClass178_Sub2_3684.anInt9661 > 1 && aClass178_Sub2_3684.aBool9566 && aClass178_Sub2_3684.aBool9609) {
			aClass168_Sub1_3680 = aClass178_Sub2_3684.method3248();
			anInterface22_3682 = aClass178_Sub2_3684.method3050(anInt3685, anInt3686, Class158.aClass158_1743, aClass170_3674, (aClass178_Sub2_3684.anInt9661));
			anInterface23_3687 = aClass178_Sub2_3684.method3049(anInt3685, anInt3686, (aClass178_Sub2_3684.anInt9661));
		}
		anInterface41_3676 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3689 = anInterface41_3676.method279(0);
		anInterface41_3677 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3679 = anInterface41_3677.method279(0);
		anInterface41_3673 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3681 = anInterface41_3673.method279(0);
		anInterface23_3692 = aClass178_Sub2_3684.method3051(anInterface41_3673.method1(), anInterface41_3673.method82());
		int i = aVector3691.size();
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_3_);
			class350.method6116(anInt3685, anInt3686);
		}
	}

	boolean method6208(Vector vector, int i, Class350 class350) {
		if (class350.method6113() || class350.method6142()) {
			vector.insertElementAt(class350, i);
			class350.method6116(anInt3685, anInt3686);
			int i_4_ = class350.method6121();
			if (i_4_ > anInt3694)
				anInt3694 = i_4_;
			class350.aBool3641 = true;
			return true;
		}
		return false;
	}

	void method6209(Class350 class350) {
		class350.method6115();
		class350.aBool3641 = false;
		aVector3691.removeElement(class350);
	}

	Class350 method6210(int i) {
		return (Class350) aVector3691.elementAt(i);
	}

	Class354(Class178_Sub2 class178_sub2, int i, int i_5_) {
		aClass178_Sub2_3684 = class178_sub2;
		aClass170_3674 = Class170.aClass170_1822;
		anInt3685 = i;
		anInt3686 = i_5_;
	}

	boolean method6211(int i, int i_6_, int i_7_, int i_8_) {
		if (aVector3691.isEmpty() || method6203())
			return true;
		if (anInt3685 != i_7_ || anInt3686 != i_8_ || aClass178_Sub2_3684.anInt9661 != anInt3695) {
			anInt3695 = aClass178_Sub2_3684.anInt9661;
			anInt3685 = i_7_;
			anInt3686 = i_8_;
			method6214();
			method6206();
		}
		aClass168_Sub1_3675.method14424(0, anInterface22_3681);
		if (anInterface23_3692 != null)
			aClass168_Sub1_3675.method14423(anInterface23_3692);
		if (aClass168_Sub1_3680 != null) {
			aClass168_Sub1_3680.method14424(0, anInterface22_3682);
			aClass168_Sub1_3680.method14423(anInterface23_3687);
			aClass178_Sub2_3684.method3353(aClass168_Sub1_3680, -985520833);
		} else
			aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, 628667895);
		if (!aClass168_Sub1_3675.method14426()) {
			aClass178_Sub2_3684.method3047((aClass168_Sub1_3680 != null ? aClass168_Sub1_3680 : aClass168_Sub1_3675), (short) -29618);
			return false;
		}
		anInt3683 = i;
		anInt3688 = i_6_;
		aClass178_Sub2_3684.method3076(3, -16777216);
		aClass178_Sub2_3684.method14945(15);
		aClass178_Sub2_3684.method15019(0);
		aBool3690 = true;
		return true;
	}

	void method6212(int i, int i_9_) {
		if (aBool3690) {
			if (aClass168_Sub1_3680 != null) {
				aClass178_Sub2_3684.method3047(aClass168_Sub1_3680, (short) -1154);
				aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, -486078518);
				aClass168_Sub1_3680.method14433(0, 0, anInt3685, anInt3686, 0, 0, true, anInterface23_3692 != null);
			}
			method6213(i, i_9_);
			aBool3690 = false;
		}
	}

	void method6213(int i, int i_10_) {
		aClass178_Sub2_3684.method3074(true);
		aClass178_Sub2_3684.method15064();
		aClass178_Sub2_3684.method15018(0);
		aClass178_Sub2_3684.method14960(1);
		aClass178_Sub2_3684.method3071();
		aClass168_Sub1_3675.method14423(null);
		aClass178_Sub2_3684.method14958(0, 0);
		int i_11_ = aVector3691.size();
		Vector vector = aVector3691;
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			if (((Class350) aVector3691.elementAt(i_12_)).method6124()) {
				vector = new Vector();
				for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
					if (!((Class350) aVector3691.elementAt(i_13_)).method6124())
						vector.addElement(aVector3691.elementAt(i_13_));
				}
				i_11_ = vector.size();
				break;
			}
		}
		anInterface41_3673.method249();
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
			Class350 class350 = (Class350) vector.elementAt(i_14_);
			int i_15_ = class350.method6133();
			boolean bool = i_14_ == i_11_ - 1;
			boolean bool_16_ = false;
			for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
				if (i_17_ == i_15_ - 1) {
					if (bool) {
						aClass178_Sub2_3684.method3047(aClass168_Sub1_3675, (short) -5712);
						aClass178_Sub2_3684.method3378(anInt3683, anInt3688, anInt3683 + i, anInt3688 + i_10_);
					} else {
						bool_16_ = true;
						aClass168_Sub1_3675.method14424(0, anInterface22_3681);
					}
				} else
					aClass168_Sub1_3675.method14424(0, anInterface22_3679);
				Interface41 interface41 = anInterface41_3676;
				if (i_17_ == 0)
					interface41 = anInterface41_3673;
				class350.method6140(i_17_, aClass168_Sub1_3675, interface41, anInterface23_3692, anInterface41_3673, bool && i_17_ == i_15_ - 1);
				method6205();
				class350.method6145(i_17_);
				if (bool_16_)
					anInterface41_3673.method249();
				Interface41 interface41_18_ = anInterface41_3676;
				anInterface41_3676 = anInterface41_3677;
				anInterface41_3677 = interface41_18_;
				Interface22 interface22 = anInterface22_3689;
				anInterface22_3689 = anInterface22_3679;
				anInterface22_3679 = interface22;
			}
		}
		aClass178_Sub2_3684.method15018(1);
		aClass178_Sub2_3684.method14960(0);
		aClass178_Sub2_3684.method3074(false);
		aClass178_Sub2_3684.method3071();
		Object object = null;
	}

	void method6214() {
		if (aClass168_Sub1_3680 != null) {
			aClass168_Sub1_3680.method131();
			aClass168_Sub1_3680 = null;
		}
		if (anInterface22_3682 != null) {
			anInterface22_3682.method131();
			anInterface22_3682 = null;
		}
		if (anInterface23_3687 != null) {
			anInterface23_3687.method131();
			anInterface23_3687 = null;
		}
		if (aClass168_Sub1_3675 != null)
			aClass168_Sub1_3675.method131();
		if (anInterface22_3689 != null)
			anInterface22_3689.method131();
		if (anInterface22_3679 != null)
			anInterface22_3679.method131();
		if (anInterface22_3681 != null)
			anInterface22_3681.method131();
		if (anInterface41_3676 != null)
			anInterface41_3676.method131();
		if (anInterface41_3677 != null)
			anInterface41_3677.method131();
		if (anInterface41_3673 != null)
			anInterface41_3673.method131();
		if (anInterface23_3692 != null)
			anInterface23_3692.method131();
		int i = aVector3691.size();
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_19_);
			class350.method6115();
		}
	}

	void method6215() {
		aClass178_Sub2_3684.method15033(0, anInterface36_3678);
		aClass178_Sub2_3684.method15032(aClass345_3693);
		aClass178_Sub2_3684.method15040(Class376.aClass376_3917, 0, 1);
	}

	void method6216() {
		method6226();
		switch (anInt3694) {
		case 2:
			aClass170_3674 = Class170.aClass170_1825;
			break;
		case 0:
			aClass170_3674 = Class170.aClass170_1822;
			break;
		default:
			throw new RuntimeException();
		case 1:
			aClass170_3674 = Class170.aClass170_1832;
		}
		aClass168_Sub1_3675 = aClass178_Sub2_3684.method3248();
		if (aClass178_Sub2_3684.anInt9661 > 1 && aClass178_Sub2_3684.aBool9566 && aClass178_Sub2_3684.aBool9609) {
			aClass168_Sub1_3680 = aClass178_Sub2_3684.method3248();
			anInterface22_3682 = aClass178_Sub2_3684.method3050(anInt3685, anInt3686, Class158.aClass158_1743, aClass170_3674, (aClass178_Sub2_3684.anInt9661));
			anInterface23_3687 = aClass178_Sub2_3684.method3049(anInt3685, anInt3686, (aClass178_Sub2_3684.anInt9661));
		}
		anInterface41_3676 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3689 = anInterface41_3676.method279(0);
		anInterface41_3677 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3679 = anInterface41_3677.method279(0);
		anInterface41_3673 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3681 = anInterface41_3673.method279(0);
		anInterface23_3692 = aClass178_Sub2_3684.method3051(anInterface41_3673.method1(), anInterface41_3673.method82());
		int i = aVector3691.size();
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_20_);
			class350.method6116(anInt3685, anInt3686);
		}
	}

	void method6217(int i, int i_21_) {
		if (aBool3690) {
			if (aClass168_Sub1_3680 != null) {
				aClass178_Sub2_3684.method3047(aClass168_Sub1_3680, (short) -29680);
				aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, -1731185021);
				aClass168_Sub1_3680.method14433(0, 0, anInt3685, anInt3686, 0, 0, true, anInterface23_3692 != null);
			}
			method6213(i, i_21_);
			aBool3690 = false;
		}
	}

	void method6218() {
		method6226();
		switch (anInt3694) {
		case 2:
			aClass170_3674 = Class170.aClass170_1825;
			break;
		case 0:
			aClass170_3674 = Class170.aClass170_1822;
			break;
		default:
			throw new RuntimeException();
		case 1:
			aClass170_3674 = Class170.aClass170_1832;
		}
		aClass168_Sub1_3675 = aClass178_Sub2_3684.method3248();
		if (aClass178_Sub2_3684.anInt9661 > 1 && aClass178_Sub2_3684.aBool9566 && aClass178_Sub2_3684.aBool9609) {
			aClass168_Sub1_3680 = aClass178_Sub2_3684.method3248();
			anInterface22_3682 = aClass178_Sub2_3684.method3050(anInt3685, anInt3686, Class158.aClass158_1743, aClass170_3674, (aClass178_Sub2_3684.anInt9661));
			anInterface23_3687 = aClass178_Sub2_3684.method3049(anInt3685, anInt3686, (aClass178_Sub2_3684.anInt9661));
		}
		anInterface41_3676 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3689 = anInterface41_3676.method279(0);
		anInterface41_3677 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3679 = anInterface41_3677.method279(0);
		anInterface41_3673 = aClass178_Sub2_3684.method14999(Class158.aClass158_1743, aClass170_3674, anInt3685, anInt3686);
		anInterface22_3681 = anInterface41_3673.method279(0);
		anInterface23_3692 = aClass178_Sub2_3684.method3051(anInterface41_3673.method1(), anInterface41_3673.method82());
		int i = aVector3691.size();
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_22_);
			class350.method6116(anInt3685, anInt3686);
		}
	}

	boolean method6219(Class350 class350) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3691.size(); i++) {
			if (!bool && class350.method6120() < method6210(i).method6120()) {
				bool = true;
				if (!method6208(vector, vector.size(), class350))
					return false;
			}
			vector.addElement(method6210(i));
		}
		if (!bool && !method6208(vector, vector.size(), class350))
			return false;
		aVector3691 = vector;
		return true;
	}

	boolean method6220(Class350 class350) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3691.size(); i++) {
			if (!bool && class350.method6120() < method6210(i).method6120()) {
				bool = true;
				if (!method6208(vector, vector.size(), class350))
					return false;
			}
			vector.addElement(method6210(i));
		}
		if (!bool && !method6208(vector, vector.size(), class350))
			return false;
		aVector3691 = vector;
		return true;
	}

	boolean method6221(Class350 class350) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3691.size(); i++) {
			if (!bool && class350.method6120() < method6210(i).method6120()) {
				bool = true;
				if (!method6208(vector, vector.size(), class350))
					return false;
			}
			vector.addElement(method6210(i));
		}
		if (!bool && !method6208(vector, vector.size(), class350))
			return false;
		aVector3691 = vector;
		return true;
	}

	boolean method6222(Vector vector, int i, Class350 class350) {
		if (class350.method6113() || class350.method6142()) {
			vector.insertElementAt(class350, i);
			class350.method6116(anInt3685, anInt3686);
			int i_23_ = class350.method6121();
			if (i_23_ > anInt3694)
				anInt3694 = i_23_;
			class350.aBool3641 = true;
			return true;
		}
		return false;
	}

	void method6223(int i, int i_24_) {
		if (aBool3690) {
			if (aClass168_Sub1_3680 != null) {
				aClass178_Sub2_3684.method3047(aClass168_Sub1_3680, (short) -20360);
				aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, -947004720);
				aClass168_Sub1_3680.method14433(0, 0, anInt3685, anInt3686, 0, 0, true, anInterface23_3692 != null);
			}
			method6213(i, i_24_);
			aBool3690 = false;
		}
	}

	Class350 method6224(int i) {
		return (Class350) aVector3691.elementAt(i);
	}

	boolean method6225() {
		int i = aVector3691.size();
		for (int i_25_ = 0; i_25_ < i; i_25_++) {
			if (!((Class350) aVector3691.elementAt(i_25_)).method6124())
				return false;
		}
		return true;
	}

	void method6226() {
		if (anInterface36_3678 == null) {
			anInterface36_3678 = aClass178_Sub2_3684.method15030(false);
			anInterface36_3678.method215(12, 4);
			ByteBuffer bytebuffer = aClass178_Sub2_3684.aByteBuffer9539;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface36_3678.method265(0, bytebuffer.position(), aClass178_Sub2_3684.aLong9540);
			aClass345_3693 = (aClass178_Sub2_3684.method15031(new Class378[] { new Class378(Class344.aClass344_3627) }));
		}
	}

	boolean method6227() {
		int i = aVector3691.size();
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			if (!((Class350) aVector3691.elementAt(i_26_)).method6124())
				return false;
		}
		return true;
	}

	boolean method6228() {
		int i = aVector3691.size();
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			if (!((Class350) aVector3691.elementAt(i_27_)).method6124())
				return false;
		}
		return true;
	}

	void method6229(Class350 class350) {
		class350.method6115();
		class350.aBool3641 = false;
		aVector3691.removeElement(class350);
	}

	void method6230(int i, int i_28_) {
		if (aBool3690) {
			if (aClass168_Sub1_3680 != null) {
				aClass178_Sub2_3684.method3047(aClass168_Sub1_3680, (short) -9051);
				aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, -1115914575);
				aClass168_Sub1_3680.method14433(0, 0, anInt3685, anInt3686, 0, 0, true, anInterface23_3692 != null);
			}
			method6213(i, i_28_);
			aBool3690 = false;
		}
	}

	boolean method6231(int i, int i_29_, int i_30_, int i_31_) {
		if (aVector3691.isEmpty() || method6203())
			return true;
		if (anInt3685 != i_30_ || anInt3686 != i_31_ || aClass178_Sub2_3684.anInt9661 != anInt3695) {
			anInt3695 = aClass178_Sub2_3684.anInt9661;
			anInt3685 = i_30_;
			anInt3686 = i_31_;
			method6214();
			method6206();
		}
		aClass168_Sub1_3675.method14424(0, anInterface22_3681);
		if (anInterface23_3692 != null)
			aClass168_Sub1_3675.method14423(anInterface23_3692);
		if (aClass168_Sub1_3680 != null) {
			aClass168_Sub1_3680.method14424(0, anInterface22_3682);
			aClass168_Sub1_3680.method14423(anInterface23_3687);
			aClass178_Sub2_3684.method3353(aClass168_Sub1_3680, 1248353446);
		} else
			aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, 465476718);
		if (!aClass168_Sub1_3675.method14426()) {
			aClass178_Sub2_3684.method3047((aClass168_Sub1_3680 != null ? aClass168_Sub1_3680 : aClass168_Sub1_3675), (short) -29021);
			return false;
		}
		anInt3683 = i;
		anInt3688 = i_29_;
		aClass178_Sub2_3684.method3076(3, -16777216);
		aClass178_Sub2_3684.method14945(15);
		aClass178_Sub2_3684.method15019(0);
		aBool3690 = true;
		return true;
	}

	void method6232(int i, int i_32_) {
		if (aBool3690) {
			if (aClass168_Sub1_3680 != null) {
				aClass178_Sub2_3684.method3047(aClass168_Sub1_3680, (short) -20037);
				aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, -526839206);
				aClass168_Sub1_3680.method14433(0, 0, anInt3685, anInt3686, 0, 0, true, anInterface23_3692 != null);
			}
			method6213(i, i_32_);
			aBool3690 = false;
		}
	}

	boolean method6233(int i, int i_33_, int i_34_, int i_35_) {
		if (aVector3691.isEmpty() || method6203())
			return true;
		if (anInt3685 != i_34_ || anInt3686 != i_35_ || aClass178_Sub2_3684.anInt9661 != anInt3695) {
			anInt3695 = aClass178_Sub2_3684.anInt9661;
			anInt3685 = i_34_;
			anInt3686 = i_35_;
			method6214();
			method6206();
		}
		aClass168_Sub1_3675.method14424(0, anInterface22_3681);
		if (anInterface23_3692 != null)
			aClass168_Sub1_3675.method14423(anInterface23_3692);
		if (aClass168_Sub1_3680 != null) {
			aClass168_Sub1_3680.method14424(0, anInterface22_3682);
			aClass168_Sub1_3680.method14423(anInterface23_3687);
			aClass178_Sub2_3684.method3353(aClass168_Sub1_3680, -278456329);
		} else
			aClass178_Sub2_3684.method3353(aClass168_Sub1_3675, -878248443);
		if (!aClass168_Sub1_3675.method14426()) {
			aClass178_Sub2_3684.method3047((aClass168_Sub1_3680 != null ? aClass168_Sub1_3680 : aClass168_Sub1_3675), (short) -17740);
			return false;
		}
		anInt3683 = i;
		anInt3688 = i_33_;
		aClass178_Sub2_3684.method3076(3, -16777216);
		aClass178_Sub2_3684.method14945(15);
		aClass178_Sub2_3684.method15019(0);
		aBool3690 = true;
		return true;
	}

	boolean method6234(Class350 class350) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3691.size(); i++) {
			if (!bool && class350.method6120() < method6210(i).method6120()) {
				bool = true;
				if (!method6208(vector, vector.size(), class350))
					return false;
			}
			vector.addElement(method6210(i));
		}
		if (!bool && !method6208(vector, vector.size(), class350))
			return false;
		aVector3691 = vector;
		return true;
	}

	void method6235(int i, int i_36_) {
		aClass178_Sub2_3684.method3074(true);
		aClass178_Sub2_3684.method15064();
		aClass178_Sub2_3684.method15018(0);
		aClass178_Sub2_3684.method14960(1);
		aClass178_Sub2_3684.method3071();
		aClass168_Sub1_3675.method14423(null);
		aClass178_Sub2_3684.method14958(0, 0);
		int i_37_ = aVector3691.size();
		Vector vector = aVector3691;
		for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
			if (((Class350) aVector3691.elementAt(i_38_)).method6124()) {
				vector = new Vector();
				for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
					if (!((Class350) aVector3691.elementAt(i_39_)).method6124())
						vector.addElement(aVector3691.elementAt(i_39_));
				}
				i_37_ = vector.size();
				break;
			}
		}
		anInterface41_3673.method249();
		for (int i_40_ = 0; i_40_ < i_37_; i_40_++) {
			Class350 class350 = (Class350) vector.elementAt(i_40_);
			int i_41_ = class350.method6133();
			boolean bool = i_40_ == i_37_ - 1;
			boolean bool_42_ = false;
			for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
				if (i_43_ == i_41_ - 1) {
					if (bool) {
						aClass178_Sub2_3684.method3047(aClass168_Sub1_3675, (short) -5807);
						aClass178_Sub2_3684.method3378(anInt3683, anInt3688, anInt3683 + i, anInt3688 + i_36_);
					} else {
						bool_42_ = true;
						aClass168_Sub1_3675.method14424(0, anInterface22_3681);
					}
				} else
					aClass168_Sub1_3675.method14424(0, anInterface22_3679);
				Interface41 interface41 = anInterface41_3676;
				if (i_43_ == 0)
					interface41 = anInterface41_3673;
				class350.method6140(i_43_, aClass168_Sub1_3675, interface41, anInterface23_3692, anInterface41_3673, bool && i_43_ == i_41_ - 1);
				method6205();
				class350.method6145(i_43_);
				if (bool_42_)
					anInterface41_3673.method249();
				Interface41 interface41_44_ = anInterface41_3676;
				anInterface41_3676 = anInterface41_3677;
				anInterface41_3677 = interface41_44_;
				Interface22 interface22 = anInterface22_3689;
				anInterface22_3689 = anInterface22_3679;
				anInterface22_3679 = interface22;
			}
		}
		aClass178_Sub2_3684.method15018(1);
		aClass178_Sub2_3684.method14960(0);
		aClass178_Sub2_3684.method3074(false);
		aClass178_Sub2_3684.method3071();
		Object object = null;
	}

	void method6236() {
		if (aClass168_Sub1_3680 != null) {
			aClass168_Sub1_3680.method131();
			aClass168_Sub1_3680 = null;
		}
		if (anInterface22_3682 != null) {
			anInterface22_3682.method131();
			anInterface22_3682 = null;
		}
		if (anInterface23_3687 != null) {
			anInterface23_3687.method131();
			anInterface23_3687 = null;
		}
		if (aClass168_Sub1_3675 != null)
			aClass168_Sub1_3675.method131();
		if (anInterface22_3689 != null)
			anInterface22_3689.method131();
		if (anInterface22_3679 != null)
			anInterface22_3679.method131();
		if (anInterface22_3681 != null)
			anInterface22_3681.method131();
		if (anInterface41_3676 != null)
			anInterface41_3676.method131();
		if (anInterface41_3677 != null)
			anInterface41_3677.method131();
		if (anInterface41_3673 != null)
			anInterface41_3673.method131();
		if (anInterface23_3692 != null)
			anInterface23_3692.method131();
		int i = aVector3691.size();
		for (int i_45_ = 0; i_45_ < i; i_45_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_45_);
			class350.method6115();
		}
	}

	void method6237() {
		if (aClass168_Sub1_3680 != null) {
			aClass168_Sub1_3680.method131();
			aClass168_Sub1_3680 = null;
		}
		if (anInterface22_3682 != null) {
			anInterface22_3682.method131();
			anInterface22_3682 = null;
		}
		if (anInterface23_3687 != null) {
			anInterface23_3687.method131();
			anInterface23_3687 = null;
		}
		if (aClass168_Sub1_3675 != null)
			aClass168_Sub1_3675.method131();
		if (anInterface22_3689 != null)
			anInterface22_3689.method131();
		if (anInterface22_3679 != null)
			anInterface22_3679.method131();
		if (anInterface22_3681 != null)
			anInterface22_3681.method131();
		if (anInterface41_3676 != null)
			anInterface41_3676.method131();
		if (anInterface41_3677 != null)
			anInterface41_3677.method131();
		if (anInterface41_3673 != null)
			anInterface41_3673.method131();
		if (anInterface23_3692 != null)
			anInterface23_3692.method131();
		int i = aVector3691.size();
		for (int i_46_ = 0; i_46_ < i; i_46_++) {
			Class350 class350 = (Class350) aVector3691.elementAt(i_46_);
			class350.method6115();
		}
	}
}
