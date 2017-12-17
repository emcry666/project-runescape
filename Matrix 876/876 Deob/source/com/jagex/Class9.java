/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class9 implements Interface5 {
	Class596 aClass596_66;
	boolean aBool67;
	Class472 aClass472_68;
	Class209 aClass209_69 = new Class209(50);
	Interface12 anInterface12_70;
	Class8 aClass8_71;
	Class668 aClass668_72;
	String[] aStringArray73;
	String[] aStringArray74;
	int anInt75;

	Class148 method569(Class178 class178, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class623 class623) {
		aClass8_71.anInt59 = 731017393 * class178.anInt1922;
		aClass8_71.anInt64 = 240206489 * i;
		aClass8_71.anInt58 = i_0_ * -1685350219;
		aClass8_71.anInt61 = -1045934961 * i_1_;
		aClass8_71.anInt60 = i_2_ * 1353395079;
		aClass8_71.anInt63 = i_3_ * 1939968339;
		aClass8_71.aBool62 = class623 != null;
		return (Class148) aClass596_66.method9821(aClass8_71);
	}

	Class148 method570(Class178 class178, int i, int i_4_, int i_5_, int i_6_, int i_7_, Class623 class623, int i_8_) {
		aClass8_71.anInt59 = 731017393 * class178.anInt1922;
		aClass8_71.anInt64 = 240206489 * i;
		aClass8_71.anInt58 = i_4_ * -1685350219;
		aClass8_71.anInt61 = -1045934961 * i_5_;
		aClass8_71.anInt60 = i_6_ * 1353395079;
		aClass8_71.anInt63 = i_7_ * 1939968339;
		aClass8_71.aBool62 = class623 != null;
		return (Class148) aClass596_66.method9821(aClass8_71);
	}

	Class148 method571(Class178 class178, Class178 class178_9_, int i, int i_10_, int i_11_, int i_12_, boolean bool, boolean bool_13_, int i_14_, Class164 class164, Class623 class623, Class625 class625, Interface12 interface12, int i_15_) {
		if (!bool_13_) {
			Class148 class148 = method570(class178_9_, i, i_10_, i_11_, i_12_, i_14_, class623, -850528360);
			if (null != class148)
				return class148;
		}
		ItemDefinitions class12 = (ItemDefinitions) interface12.getDefinition(i, (byte) -33);
		if (i_10_ > 1 && null != class12.stackIds) {
			int i_16_ = -1;
			for (int i_17_ = 0; i_17_ < 10; i_17_++) {
				if (i_10_ >= class12.stackAmounts[i_17_] && 0 != class12.stackAmounts[i_17_])
					i_16_ = class12.stackIds[i_17_];
			}
			if (i_16_ != -1)
				class12 = (ItemDefinitions) interface12.getDefinition(i_16_, (byte) 37);
		}
		int[] is = class12.method662(class178, class178_9_, i_10_, i_11_, i_12_, bool, i_14_, class164, class623, class625, -1136583532);
		if (is == null)
			return null;
		Class148 class148;
		if (bool_13_)
			class148 = class178.method3103(is, 0, 36, 36, 32, -1752740183);
		else
			class148 = class178_9_.method3103(is, 0, 36, 36, 32, -1872967557);
		if (!bool_13_) {
			Class8 class8 = new Class8();
			class8.anInt59 = class178_9_.anInt1922 * 731017393;
			class8.anInt64 = i * 240206489;
			class8.anInt58 = -1685350219 * i_10_;
			class8.anInt61 = -1045934961 * i_11_;
			class8.anInt60 = i_12_ * 1353395079;
			class8.anInt63 = 1939968339 * i_14_;
			class8.aBool62 = null != class623;
			aClass596_66.method9834(class148, class8);
		}
		return class148;
	}

	void method572(boolean bool, int i) {
		if (bool != aBool67) {
			aBool67 = bool;
			method588(-482500754);
		}
	}

	void method573(int i, int i_18_) {
		anInt75 = i * 1055162879;
		synchronized (aClass209_69) {
			aClass209_69.method3773(-2032980805);
		}
	}

	void method574(boolean bool) {
		if (bool != aBool67) {
			aBool67 = bool;
			method588(-880475954);
		}
	}

	void method575(int i) {
		synchronized (aClass596_66) {
			aClass596_66.method9829();
		}
	}

	void method576(int i, int i_19_) {
		synchronized (aClass209_69) {
			aClass209_69.method3772(i, (byte) -128);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9823(i);
		}
	}

	void method577(byte i) {
		synchronized (aClass209_69) {
			aClass209_69.method3776(132807484);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9827();
		}
	}

	void method578() {
		synchronized (aClass596_66) {
			aClass596_66.method9829();
		}
	}

	Class148 method579(Class178 class178, int i, int i_20_, int i_21_, int i_22_, int i_23_, Class623 class623) {
		aClass8_71.anInt59 = 731017393 * class178.anInt1922;
		aClass8_71.anInt64 = 240206489 * i;
		aClass8_71.anInt58 = i_20_ * -1685350219;
		aClass8_71.anInt61 = -1045934961 * i_21_;
		aClass8_71.anInt60 = i_22_ * 1353395079;
		aClass8_71.anInt63 = i_23_ * 1939968339;
		aClass8_71.aBool62 = class623 != null;
		return (Class148) aClass596_66.method9821(aClass8_71);
	}

	Class148 method580(Class178 class178, int i, int i_24_, int i_25_, int i_26_, int i_27_, Class623 class623) {
		aClass8_71.anInt59 = 731017393 * class178.anInt1922;
		aClass8_71.anInt64 = 240206489 * i;
		aClass8_71.anInt58 = i_24_ * -1685350219;
		aClass8_71.anInt61 = -1045934961 * i_25_;
		aClass8_71.anInt60 = i_26_ * 1353395079;
		aClass8_71.anInt63 = i_27_ * 1939968339;
		aClass8_71.aBool62 = class623 != null;
		return (Class148) aClass596_66.method9821(aClass8_71);
	}

	Class148 method581(Class178 class178, int i, int i_28_, int i_29_, int i_30_, int i_31_, Class623 class623) {
		aClass8_71.anInt59 = 731017393 * class178.anInt1922;
		aClass8_71.anInt64 = 240206489 * i;
		aClass8_71.anInt58 = i_28_ * -1685350219;
		aClass8_71.anInt61 = -1045934961 * i_29_;
		aClass8_71.anInt60 = i_30_ * 1353395079;
		aClass8_71.anInt63 = i_31_ * 1939968339;
		aClass8_71.aBool62 = class623 != null;
		return (Class148) aClass596_66.method9821(aClass8_71);
	}

	Class148 method582(Class178 class178, Class178 class178_32_, int i, int i_33_, int i_34_, int i_35_, boolean bool, boolean bool_36_, int i_37_, Class164 class164, Class623 class623, Class625 class625, Interface12 interface12) {
		if (!bool_36_) {
			Class148 class148 = method570(class178_32_, i, i_33_, i_34_, i_35_, i_37_, class623, -850528360);
			if (null != class148)
				return class148;
		}
		ItemDefinitions class12 = (ItemDefinitions) interface12.getDefinition(i, (byte) 47);
		if (i_33_ > 1 && null != class12.stackIds) {
			int i_38_ = -1;
			for (int i_39_ = 0; i_39_ < 10; i_39_++) {
				if (i_33_ >= class12.stackAmounts[i_39_] && 0 != class12.stackAmounts[i_39_])
					i_38_ = class12.stackIds[i_39_];
			}
			if (i_38_ != -1)
				class12 = (ItemDefinitions) interface12.getDefinition(i_38_, (byte) 23);
		}
		int[] is = class12.method662(class178, class178_32_, i_33_, i_34_, i_35_, bool, i_37_, class164, class623, class625, -1136583532);
		if (is == null)
			return null;
		Class148 class148;
		if (bool_36_)
			class148 = class178.method3103(is, 0, 36, 36, 32, -2049309420);
		else
			class148 = class178_32_.method3103(is, 0, 36, 36, 32, -1921892776);
		if (!bool_36_) {
			Class8 class8 = new Class8();
			class8.anInt59 = class178_32_.anInt1922 * 731017393;
			class8.anInt64 = i * 240206489;
			class8.anInt58 = -1685350219 * i_33_;
			class8.anInt61 = -1045934961 * i_34_;
			class8.anInt60 = i_35_ * 1353395079;
			class8.anInt63 = 1939968339 * i_37_;
			class8.aBool62 = null != class623;
			aClass596_66.method9834(class148, class8);
		}
		return class148;
	}

	Class148 method583(Class178 class178, Class178 class178_40_, int i, int i_41_, int i_42_, int i_43_, boolean bool, boolean bool_44_, int i_45_, Class164 class164, Class623 class623, Class625 class625, Interface12 interface12) {
		if (!bool_44_) {
			Class148 class148 = method570(class178_40_, i, i_41_, i_42_, i_43_, i_45_, class623, -850528360);
			if (null != class148)
				return class148;
		}
		ItemDefinitions class12 = (ItemDefinitions) interface12.getDefinition(i, (byte) 59);
		if (i_41_ > 1 && null != class12.stackIds) {
			int i_46_ = -1;
			for (int i_47_ = 0; i_47_ < 10; i_47_++) {
				if (i_41_ >= class12.stackAmounts[i_47_] && 0 != class12.stackAmounts[i_47_])
					i_46_ = class12.stackIds[i_47_];
			}
			if (i_46_ != -1)
				class12 = (ItemDefinitions) interface12.getDefinition(i_46_, (byte) -110);
		}
		int[] is = class12.method662(class178, class178_40_, i_41_, i_42_, i_43_, bool, i_45_, class164, class623, class625, -1136583532);
		if (is == null)
			return null;
		Class148 class148;
		if (bool_44_)
			class148 = class178.method3103(is, 0, 36, 36, 32, -2023842605);
		else
			class148 = class178_40_.method3103(is, 0, 36, 36, 32, -2084278296);
		if (!bool_44_) {
			Class8 class8 = new Class8();
			class8.anInt59 = class178_40_.anInt1922 * 731017393;
			class8.anInt64 = i * 240206489;
			class8.anInt58 = -1685350219 * i_41_;
			class8.anInt61 = -1045934961 * i_42_;
			class8.anInt60 = i_43_ * 1353395079;
			class8.anInt63 = 1939968339 * i_45_;
			class8.aBool62 = null != class623;
			aClass596_66.method9834(class148, class8);
		}
		return class148;
	}

	void method584() {
		synchronized (aClass209_69) {
			aClass209_69.method3773(-2138590602);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9829();
		}
	}

	void method585() {
		synchronized (aClass209_69) {
			aClass209_69.method3773(-2143379007);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9829();
		}
	}

	void method586(int i) {
		anInt75 = i * 1055162879;
		synchronized (aClass209_69) {
			aClass209_69.method3773(-1890415088);
		}
	}

	void method587() {
		synchronized (aClass209_69) {
			aClass209_69.method3776(1510178062);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9827();
		}
	}

	Class9(Class681 class681, Class668 class668, boolean bool, Class472 class472, Interface12 interface12) {
		aClass596_66 = new Class596(250);
		aClass8_71 = new Class8();
		aClass668_72 = class668;
		aBool67 = bool;
		aClass472_68 = class472;
		anInterface12_70 = interface12;
		if (class681 == Class681.aClass681_8646)
			aStringArray74 = new String[] { null, null, Class39.aClass39_389.method1124(aClass668_72, (byte) -46), null, null, Class39.aClass39_505.method1124(aClass668_72, (byte) -42) };
		else
			aStringArray74 = new String[] { null, null, Class39.aClass39_389.method1124(aClass668_72, (byte) -39), null, null, null };
		aStringArray73 = new String[] { null, null, null, null, Class39.aClass39_525.method1124(aClass668_72, (byte) -28) };
	}

	void method588(int i) {
		synchronized (aClass209_69) {
			aClass209_69.method3773(-1939543586);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9829();
		}
	}

	void method589() {
		synchronized (aClass596_66) {
			aClass596_66.method9829();
		}
	}

	void method590(int i) {
		synchronized (aClass209_69) {
			aClass209_69.method3772(i, (byte) -32);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9823(i);
		}
	}

	void method591(int i) {
		synchronized (aClass209_69) {
			aClass209_69.method3772(i, (byte) -102);
		}
		synchronized (aClass596_66) {
			aClass596_66.method9823(i);
		}
	}

	void method592(boolean bool) {
		if (bool != aBool67) {
			aBool67 = bool;
			method588(-787919543);
		}
	}

	public static int getArchiveCount(byte i) {
		if (1546072167 * JS5ArchiveReference.count == -1) {
			JS5ArchiveReference[] references = Class88.getArchiveReferences(-1734020679);
			for (int index = 0; index < references.length; index++) {
				JS5ArchiveReference reference = references[index];
				if (-538819837 * reference.indexId > JS5ArchiveReference.count * 1546072167)
					JS5ArchiveReference.count = 329811717 * reference.indexId;
			}
			JS5ArchiveReference.count += 1489038167;
		}
		return 1546072167 * JS5ArchiveReference.count;
	}
}
