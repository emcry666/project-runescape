/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class219 {
	List aList2320;
	static final int anInt2321 = 8;
	static Integer anInteger2322 = Integer.valueOf(-1);
	static final int anInt2323 = 40;
	List aList2324;
	public int anInt2325;
	List aList2326;
	List aList2327;

	public int method4038(int i, int i_0_) {
		if (aList2326.size() == 40)
			throw new RuntimeException("");
		if (method4041(i, (byte) -114) != -1)
			throw new RuntimeException("");
		if (i_0_ == -1)
			i_0_ = aList2326.size();
		method4055(i, i_0_, -1024494264);
		for (int i_1_ = i_0_ + 1; i_1_ < aList2326.size(); i_1_++) {
			Integer integer = (Integer) aList2320.get(i_1_);
			if (!integer.equals(anInteger2322) && integer.intValue() < i_1_)
				method4053(i_1_, i_1_ - 1, (byte) -35);
		}
		return method4041(i, (byte) -23);
	}

	public int method4039(int i) {
		return aList2324.size();
	}

	public int method4040() {
		return aList2326.size();
	}

	public int method4041(int i, byte i_2_) {
		return aList2326.indexOf(Integer.valueOf(i));
	}

	void method4042(int i, int i_3_) {
		aList2326.add(i_3_, Integer.valueOf(i));
		aList2320.add(i_3_, anInteger2322);
		ArrayList arraylist = new ArrayList();
		for (int i_4_ = 0; i_4_ < aList2324.size(); i_4_++)
			arraylist.add(null);
		aList2327.add(i_3_, arraylist);
	}

	public int method4043(int i, int i_5_) {
		return aList2324.indexOf(Integer.valueOf(i));
	}

	public int method4044(int i) {
		return aList2326.indexOf(Integer.valueOf(i));
	}

	public int method4045(int i, int i_6_) {
		return method4049(i, -1, 256961081);
	}

	public void method4046(int i, boolean bool, int i_7_) {
		aList2320.set(i, bool ? Integer.valueOf(i) : anInteger2322);
	}

	public void method4047(int i, int i_8_, int i_9_) {
		aList2320.set(i, Integer.valueOf(i_8_));
	}

	public void method4048(int i, int i_10_) {
		aList2324.add(i_10_, aList2324.remove(i));
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_10_, list.remove(i));
		}
	}

	public int method4049(int i, int i_11_, int i_12_) {
		if (aList2324.size() == 8)
			throw new RuntimeException("");
		if (method4043(i, 1087086830) != -1)
			throw new RuntimeException("");
		if (-1 == i_11_)
			i_11_ = aList2324.size();
		aList2324.add(i_11_, Integer.valueOf(i));
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_11_, null);
		}
		return i_11_;
	}

	void method4050(int i) {
		aList2326.remove(i);
		aList2320.remove(i);
		aList2327.remove(i);
	}

	public boolean method4051(int i, int i_13_) {
		return !((Integer) aList2320.get(i)).equals(anInteger2322);
	}

	public void method4052(int i, int i_14_, byte i_15_) {
		method4053(i, i_14_, (byte) 0);
		for (int i_16_ = 0; i_16_ < aList2320.size(); i_16_++) {
			Integer integer = (Integer) aList2320.get(i_16_);
			if (!integer.equals(anInteger2322)) {
				Integer integer_17_ = Integer.valueOf(i_16_);
				if (!integer.equals(integer_17_))
					aList2320.set(i_16_, integer_17_);
			}
		}
	}

	void method4053(int i, int i_18_, byte i_19_) {
		aList2326.add(i_18_, aList2326.remove(i));
		aList2320.add(i_18_, aList2320.remove(i));
		aList2327.add(i_18_, aList2327.remove(i));
	}

	public int method4054(int i, int i_20_) {
		return ((Integer) aList2324.get(i)).intValue();
	}

	void method4055(int i, int i_21_, int i_22_) {
		aList2326.add(i_21_, Integer.valueOf(i));
		aList2320.add(i_21_, anInteger2322);
		ArrayList arraylist = new ArrayList();
		for (int i_23_ = 0; i_23_ < aList2324.size(); i_23_++)
			arraylist.add(null);
		aList2327.add(i_21_, arraylist);
	}

	public void method4056(int i, int i_24_) {
		method4057(i, 1049840094);
		int i_25_ = i;
		for (int i_26_ = i; i_26_ < aList2326.size(); i_26_++) {
			if (!method4051(i_26_, 207706957)) {
				if (i_25_ != i_26_)
					method4053(i_26_, i_25_, (byte) -15);
				i_25_ = 1 + i_26_;
			}
		}
	}

	void method4057(int i, int i_27_) {
		aList2326.remove(i);
		aList2320.remove(i);
		aList2327.remove(i);
	}

	public void method4058(int i, int i_28_, int i_29_) {
		aList2324.add(i_28_, aList2324.remove(i));
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_28_, list.remove(i));
		}
	}

	public Object method4059(int i, int i_30_, int i_31_) {
		return ((List) aList2327.get(i)).get(i_30_);
	}

	public void method4060(int i, int i_32_, Object object, int i_33_) {
		((List) aList2327.get(i)).set(i_32_, object);
	}

	public int method4061(int i, int i_34_) {
		return method4080(i, -1, -2103571288);
	}

	public Class219(int i) {
		anInt2325 = -79335047 * i;
		aList2324 = new ArrayList();
		aList2326 = new ArrayList();
		aList2320 = new ArrayList();
		aList2327 = new ArrayList();
	}

	public int method4062(int i) {
		return method4080(i, -1, -2095513105);
	}

	public int method4063(int i, int i_35_) {
		return ((Integer) aList2326.get(i)).intValue();
	}

	public int method4064() {
		return aList2324.size();
	}

	public int method4065(int i) {
		return aList2326.indexOf(Integer.valueOf(i));
	}

	public int method4066(int i) {
		return ((Integer) aList2326.get(i)).intValue();
	}

	public int method4067(int i) {
		return aList2324.indexOf(Integer.valueOf(i));
	}

	public int method4068(int i) {
		return aList2324.indexOf(Integer.valueOf(i));
	}

	public void method4069(int i) {
		method4057(i, 1049840094);
		int i_36_ = i;
		for (int i_37_ = i; i_37_ < aList2326.size(); i_37_++) {
			if (!method4051(i_37_, 1436001423)) {
				if (i_36_ != i_37_)
					method4053(i_37_, i_36_, (byte) -115);
				i_36_ = 1 + i_37_;
			}
		}
	}

	public int method4070(int i) {
		return ((Integer) aList2324.get(i)).intValue();
	}

	public int method4071(int i) {
		return method4049(i, -1, 84226994);
	}

	public int method4072(int i) {
		return method4049(i, -1, -1248059378);
	}

	public void method4073(int i, boolean bool) {
		aList2320.set(i, bool ? Integer.valueOf(i) : anInteger2322);
	}

	public void method4074(int i, boolean bool) {
		aList2320.set(i, bool ? Integer.valueOf(i) : anInteger2322);
	}

	public boolean method4075(int i) {
		return !((Integer) aList2320.get(i)).equals(anInteger2322);
	}

	public int method4076(int i) {
		return aList2324.indexOf(Integer.valueOf(i));
	}

	public boolean method4077(int i) {
		return !((Integer) aList2320.get(i)).equals(anInteger2322);
	}

	public int method4078(int i, int i_38_) {
		if (aList2324.size() == 8)
			throw new RuntimeException("");
		if (method4043(i, -933062907) != -1)
			throw new RuntimeException("");
		if (-1 == i_38_)
			i_38_ = aList2324.size();
		aList2324.add(i_38_, Integer.valueOf(i));
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_38_, null);
		}
		return i_38_;
	}

	public void method4079(int i) {
		aList2324.remove(i);
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method4080(int i, int i_39_, int i_40_) {
		if (aList2326.size() == 40)
			throw new RuntimeException("");
		if (method4041(i, (byte) -69) != -1)
			throw new RuntimeException("");
		if (i_39_ == -1)
			i_39_ = aList2326.size();
		method4055(i, i_39_, -1024494264);
		for (int i_41_ = i_39_ + 1; i_41_ < aList2326.size(); i_41_++) {
			Integer integer = (Integer) aList2320.get(i_41_);
			if (!integer.equals(anInteger2322) && integer.intValue() < i_41_)
				method4053(i_41_, i_41_ - 1, (byte) -126);
		}
		return method4041(i, (byte) -124);
	}

	public void method4081(int i, int i_42_, Object object) {
		((List) aList2327.get(i)).set(i_42_, object);
	}

	public int method4082(int i) {
		return method4080(i, -1, -1540064150);
	}

	void method4083(int i, int i_43_) {
		aList2326.add(i_43_, aList2326.remove(i));
		aList2320.add(i_43_, aList2320.remove(i));
		aList2327.add(i_43_, aList2327.remove(i));
	}

	public void method4084(int i, int i_44_) {
		method4053(i, i_44_, (byte) -76);
		for (int i_45_ = 0; i_45_ < aList2320.size(); i_45_++) {
			Integer integer = (Integer) aList2320.get(i_45_);
			if (!integer.equals(anInteger2322)) {
				Integer integer_46_ = Integer.valueOf(i_45_);
				if (!integer.equals(integer_46_))
					aList2320.set(i_45_, integer_46_);
			}
		}
	}

	public void method4085(int i, int i_47_) {
		method4053(i, i_47_, (byte) -110);
		for (int i_48_ = 0; i_48_ < aList2320.size(); i_48_++) {
			Integer integer = (Integer) aList2320.get(i_48_);
			if (!integer.equals(anInteger2322)) {
				Integer integer_49_ = Integer.valueOf(i_48_);
				if (!integer.equals(integer_49_))
					aList2320.set(i_48_, integer_49_);
			}
		}
	}

	void method4086(int i, int i_50_) {
		aList2326.add(i_50_, aList2326.remove(i));
		aList2320.add(i_50_, aList2320.remove(i));
		aList2327.add(i_50_, aList2327.remove(i));
	}

	public int method4087(int i) {
		return aList2326.indexOf(Integer.valueOf(i));
	}

	void method4088(int i, int i_51_) {
		aList2326.add(i_51_, aList2326.remove(i));
		aList2320.add(i_51_, aList2320.remove(i));
		aList2327.add(i_51_, aList2327.remove(i));
	}

	public int method4089(int i, int i_52_) {
		if (aList2326.size() == 40)
			throw new RuntimeException("");
		if (method4041(i, (byte) -72) != -1)
			throw new RuntimeException("");
		if (i_52_ == -1)
			i_52_ = aList2326.size();
		method4055(i, i_52_, -1024494264);
		for (int i_53_ = i_52_ + 1; i_53_ < aList2326.size(); i_53_++) {
			Integer integer = (Integer) aList2320.get(i_53_);
			if (!integer.equals(anInteger2322) && integer.intValue() < i_53_)
				method4053(i_53_, i_53_ - 1, (byte) -83);
		}
		return method4041(i, (byte) -34);
	}

	public boolean method4090(int i) {
		return !((Integer) aList2320.get(i)).equals(anInteger2322);
	}

	public int method4091(int i, int i_54_) {
		if (aList2326.size() == 40)
			throw new RuntimeException("");
		if (method4041(i, (byte) -50) != -1)
			throw new RuntimeException("");
		if (i_54_ == -1)
			i_54_ = aList2326.size();
		method4055(i, i_54_, -1024494264);
		for (int i_55_ = i_54_ + 1; i_55_ < aList2326.size(); i_55_++) {
			Integer integer = (Integer) aList2320.get(i_55_);
			if (!integer.equals(anInteger2322) && integer.intValue() < i_55_)
				method4053(i_55_, i_55_ - 1, (byte) -95);
		}
		return method4041(i, (byte) -15);
	}

	public int method4092(int i) {
		return aList2326.size();
	}

	public void method4093(int i) {
		method4057(i, 1049840094);
		int i_56_ = i;
		for (int i_57_ = i; i_57_ < aList2326.size(); i_57_++) {
			if (!method4051(i_57_, 122115004)) {
				if (i_56_ != i_57_)
					method4053(i_57_, i_56_, (byte) -21);
				i_56_ = 1 + i_57_;
			}
		}
	}

	public void method4094(int i) {
		aList2324.remove(i);
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public void method4095(int i, int i_58_) {
		method4053(i, i_58_, (byte) -10);
		for (int i_59_ = 0; i_59_ < aList2320.size(); i_59_++) {
			Integer integer = (Integer) aList2320.get(i_59_);
			if (!integer.equals(anInteger2322)) {
				Integer integer_60_ = Integer.valueOf(i_59_);
				if (!integer.equals(integer_60_))
					aList2320.set(i_59_, integer_60_);
			}
		}
	}

	void method4096(int i) {
		aList2326.remove(i);
		aList2320.remove(i);
		aList2327.remove(i);
	}

	public void method4097(int i, byte i_61_) {
		aList2324.remove(i);
		Iterator iterator = aList2327.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public Object method4098(int i, int i_62_) {
		return ((List) aList2327.get(i)).get(i_62_);
	}

	public void method4099(int i, int i_63_, Object object) {
		((List) aList2327.get(i)).set(i_63_, object);
	}

	public void method4100(int i, int i_64_, Object object) {
		((List) aList2327.get(i)).set(i_64_, object);
	}

	public int method4101(int i) {
		return aList2326.indexOf(Integer.valueOf(i));
	}

	static final void method4102(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2680 * -1878986101;
	}

	public static void method4103(Interface74 interface74, int i) {
		if (null == Class665.anIcmpService_Sub1_8528)
			throw new IllegalStateException("");
		Class665.anIcmpService_Sub1_8528.aList10859.add(interface74);
	}
}
