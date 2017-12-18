/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class265 {
	String aString2850;
	Class270[] aClass270Array2851;
	Class269 aClass269_2852;
	static Interface29 anInterface29_2853 = new Class263();
	int anInt2854;
	int anInt2855;
	Class269 aClass269_2856;
	protected int anInt2857 = 1636378953;
	public static Class98_Sub1_Sub2 aClass98_Sub1_Sub2_2858;

	public final Class270 method4749(int i, byte i_0_) {
		return aClass270Array2851[i];
	}

	public abstract void method4750();

	public final void method4751(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4933(i, class441);
	}

	public abstract boolean method4752(Class270 class270);

	public String method4753(int i) {
		return aString2850;
	}

	abstract Class270 method4754(Class178_Sub2 class178_sub2, Class264 class264);

	public Class270 method4755(String string, int i) throws Exception_Sub3_Sub2 {
		Class270[] class270s = aClass270Array2851;
		for (int i_1_ = 0; i_1_ < class270s.length; i_1_++) {
			Class270 class270 = class270s[i_1_];
			String string_2_ = class270.method4926(1233858360);
			if (string_2_ != null && string_2_.equals(string)) {
				if (!class270.method4927())
					throw new Exception_Sub3_Sub2(string);
				return class270;
			}
		}
		throw new Exception_Sub3_Sub2(string);
	}

	public final int method4756(byte i) {
		return aClass270Array2851.length;
	}

	public final void method4757(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4940(i, class441);
	}

	public int method4758(Class270 class270, int i) {
		for (int i_3_ = 0; i_3_ < aClass270Array2851.length; i_3_++) {
			if (class270 == aClass270Array2851[i_3_])
				return i_3_;
		}
		return -1;
	}

	public Class270 method4759(int i) {
		Class270[] class270s = aClass270Array2851;
		for (int i_4_ = 0; i_4_ < class270s.length; i_4_++) {
			Class270 class270 = class270s[i_4_];
			if (class270.method4927())
				return class270;
		}
		return null;
	}

	public final Class270 method4760(short i) {
		return (anInt2857 * -267917561 >= 0 ? aClass270Array2851[anInt2857 * -267917561] : null);
	}

	public final Class270 method4761(int i) {
		return aClass270Array2851[i];
	}

	public final void method4762(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_5_, float f_6_, float f_7_) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, f, f_5_, f_6_, f_7_);
	}

	abstract Class523_Sub4_Sub1 method4763(Class272 class272);

	public final void method4764(Class523_Sub4_Sub1 class523_sub4_sub1, float f, byte i) {
		aClass270Array2851[anInt2857 * -267917561].method4949(class523_sub4_sub1, f);
	}

	public int method4765() {
		return anInt2854 * -72749163;
	}

	public final void method4766(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_8_, float f_9_, int i) {
		aClass270Array2851[anInt2857 * -267917561].method4930(class523_sub4_sub1, f, f_8_, f_9_);
	}

	public final void method4767(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_10_, float f_11_, float f_12_, int i) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, f, f_10_, f_11_, f_12_);
	}

	public final void method4768(Class523_Sub4_Sub1 class523_sub4_sub1, Class437 class437, short i) {
		aClass270Array2851[anInt2857 * -267917561].method4930(class523_sub4_sub1, class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public final void method4769(Class523_Sub4_Sub1 class523_sub4_sub1, Class429 class429, int i) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, class429.aFloat4847, class429.aFloat4849, class429.aFloat4848, class429.aFloat4850);
	}

	public final void method4770(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, byte i) {
		aClass270Array2851[anInt2857 * -267917561].method4935(class523_sub4_sub1, fs, fs.length);
	}

	public final void method4771(Class523_Sub4_Sub1 class523_sub4_sub1, int i, int i_13_) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_14_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_15_ = (float) (i & 0xff) / 255.0F;
		float f_16_ = (float) (i >> 24 & 0xff) / 255.0F;
		method4767(class523_sub4_sub1, f, f_14_, f_15_, f_16_, -317365652);
	}

	public final void method4772(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441, int i) {
		aClass270Array2851[-267917561 * anInt2857].method4941(class523_sub4_sub1, class441);
	}

	public final void method4773(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441, int i) {
		aClass270Array2851[anInt2857 * -267917561].method4961(class523_sub4_sub1, class441);
	}

	public abstract void method4774();

	public final void method4775(int i, float f, float f_17_, float f_18_, int i_19_) {
		aClass270Array2851[anInt2857 * -267917561].method4925(i, f, f_17_, f_18_);
	}

	public final void method4776(int i, float f, float f_20_, float f_21_, float f_22_, byte i_23_) {
		aClass270Array2851[-267917561 * anInt2857].method4937(i, f, f_20_, f_21_, f_22_);
	}

	public final void method4777(int i, Class437 class437, byte i_24_) {
		aClass270Array2851[anInt2857 * -267917561].method4925(i, class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public final void method4778(int i, float[] fs, int i_25_, byte i_26_) {
		aClass270Array2851[anInt2857 * -267917561].method4946(i, fs, i_25_);
	}

	public int method4779() {
		return anInt2854 * -72749163;
	}

	public final Class270 method4780() {
		return (anInt2857 * -267917561 >= 0 ? aClass270Array2851[anInt2857 * -267917561] : null);
	}

	public final Class270 method4781() {
		return (anInt2857 * -267917561 >= 0 ? aClass270Array2851[anInt2857 * -267917561] : null);
	}

	public final void method4782(int i, int i_27_, Interface43 interface43, int i_28_) {
		aClass270Array2851[anInt2857 * -267917561].method4942(i, i_27_, interface43);
	}

	public Class523_Sub4_Sub1 method4783(String string, int i) throws Exception_Sub3_Sub1 {
		Class523_Sub4_Sub1 class523_sub4_sub1 = ((Class523_Sub4_Sub1) aClass269_2852.method4910(string, (byte) -27));
		if (class523_sub4_sub1 == null)
			throw new Exception_Sub3_Sub1(string);
		return class523_sub4_sub1;
	}

	public int method4784(int i) {
		return -1624353887 * anInt2855;
	}

	public Class523_Sub4_Sub1 method4785(int i, int i_29_) {
		return (Class523_Sub4_Sub1) aClass269_2856.method4908(i, 1601869540);
	}

	public final void method4786(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_30_, float f_31_) {
		aClass270Array2851[anInt2857 * -267917561].method4930(class523_sub4_sub1, f, f_30_, f_31_);
	}

	public int method4787(byte i) {
		return anInt2854 * -72749163;
	}

	public Class523_Sub4_Sub1 method4788(int i, int i_32_) {
		return (Class523_Sub4_Sub1) aClass269_2852.method4908(i, 1918475298);
	}

	public final void method4789(int i, float f, float f_33_, float f_34_, float f_35_) {
		aClass270Array2851[-267917561 * anInt2857].method4937(i, f, f_33_, f_34_, f_35_);
	}

	public abstract void method4790();

	public final void method4791(Class523_Sub4_Sub1 class523_sub4_sub1, Class429 class429) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, class429.aFloat4847, class429.aFloat4849, class429.aFloat4848, class429.aFloat4850);
	}

	public abstract void method4792();

	public final void method4793(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		aClass270Array2851[-267917561 * anInt2857].method4951(class523_sub4_sub1, i, interface43);
	}

	public abstract boolean method4794();

	public String method4795() {
		return aString2850;
	}

	public final int method4796(int i) {
		return anInt2857 * -267917561;
	}

	public abstract void method4797();

	public String method4798() {
		return aString2850;
	}

	public String method4799() {
		return aString2850;
	}

	abstract Class270 method4800(Class178_Sub2 class178_sub2, Class264 class264);

	abstract Class270 method4801(Class178_Sub2 class178_sub2, Class264 class264);

	public String method4802() {
		return aString2850;
	}

	public final void method4803(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4933(i, class441);
	}

	public final void method4804(int i, Class437 class437) {
		aClass270Array2851[anInt2857 * -267917561].method4925(i, class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public Class270 method4805(String string) throws Exception_Sub3_Sub2 {
		Class270[] class270s = aClass270Array2851;
		for (int i = 0; i < class270s.length; i++) {
			Class270 class270 = class270s[i];
			String string_36_ = class270.method4926(990368733);
			if (string_36_ != null && string_36_.equals(string)) {
				if (!class270.method4927())
					throw new Exception_Sub3_Sub2(string);
				return class270;
			}
		}
		throw new Exception_Sub3_Sub2(string);
	}

	public Class270 method4806(String string) throws Exception_Sub3_Sub2 {
		Class270[] class270s = aClass270Array2851;
		for (int i = 0; i < class270s.length; i++) {
			Class270 class270 = class270s[i];
			String string_37_ = class270.method4926(22765154);
			if (string_37_ != null && string_37_.equals(string)) {
				if (!class270.method4927())
					throw new Exception_Sub3_Sub2(string);
				return class270;
			}
		}
		throw new Exception_Sub3_Sub2(string);
	}

	public final int method4807() {
		return aClass270Array2851.length;
	}

	void method4808() {
		/* empty */
	}

	public abstract void method4809();

	public final Class270 method4810(int i) {
		return aClass270Array2851[i];
	}

	public final int method4811() {
		return aClass270Array2851.length;
	}

	public final Class270 method4812(int i) {
		return aClass270Array2851[i];
	}

	public int method4813(Class270 class270) {
		for (int i = 0; i < aClass270Array2851.length; i++) {
			if (class270 == aClass270Array2851[i])
				return i;
		}
		return -1;
	}

	public int method4814(Class270 class270) {
		for (int i = 0; i < aClass270Array2851.length; i++) {
			if (class270 == aClass270Array2851[i])
				return i;
		}
		return -1;
	}

	public int method4815(Class270 class270) {
		for (int i = 0; i < aClass270Array2851.length; i++) {
			if (class270 == aClass270Array2851[i])
				return i;
		}
		return -1;
	}

	public Class270 method4816() {
		Class270[] class270s = aClass270Array2851;
		for (int i = 0; i < class270s.length; i++) {
			Class270 class270 = class270s[i];
			if (class270.method4927())
				return class270;
		}
		return null;
	}

	public Class270 method4817() {
		Class270[] class270s = aClass270Array2851;
		for (int i = 0; i < class270s.length; i++) {
			Class270 class270 = class270s[i];
			if (class270.method4927())
				return class270;
		}
		return null;
	}

	public Class270 method4818() {
		Class270[] class270s = aClass270Array2851;
		for (int i = 0; i < class270s.length; i++) {
			Class270 class270 = class270s[i];
			if (class270.method4927())
				return class270;
		}
		return null;
	}

	void method4819() {
		/* empty */
	}

	public final void method4820(int i, Class441 class441, int i_38_) {
		aClass270Array2851[anInt2857 * -267917561].method4939(i, class441);
	}

	abstract Class523_Sub4_Sub1 method4821(Class272 class272);

	public final int method4822() {
		return anInt2857 * -267917561;
	}

	Class265(Class178_Sub2 class178_sub2, Class279 class279) {
		aString2850 = class279.aString3039;
		anInt2854 = -1317674051 * class279.aClass272Array3040.length;
		aClass269_2852 = new Class269(-72749163 * anInt2854, anInterface29_2853);
		for (int i = 0; i < -72749163 * anInt2854; i++)
			aClass269_2852.method4907(i, class279.aClass272Array3040[i].aString2882, method4763(class279.aClass272Array3040[i]), (byte) 116);
		anInt2855 = class279.aClass272Array3038.length * 860901473;
		aClass269_2856 = new Class269(-1624353887 * anInt2855, anInterface29_2853);
		for (int i = 0; i < anInt2855 * -1624353887; i++)
			aClass269_2856.method4907(i, class279.aClass272Array3038[i].aString2882, method4763(class279.aClass272Array3038[i]), (byte) 31);
		aClass270Array2851 = new Class270[class279.aClass264Array3035.length];
		for (int i = 0; i < class279.aClass264Array3035.length; i++)
			aClass270Array2851[i] = method4754(class178_sub2, class279.aClass264Array3035[i]);
	}

	public final void method4823(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		aClass270Array2851[anInt2857 * -267917561].method4949(class523_sub4_sub1, f);
	}

	public final void method4824(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_39_) {
		aClass270Array2851[-267917561 * anInt2857].method4929(class523_sub4_sub1, f, f_39_);
	}

	public final void method4825(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_40_, float f_41_) {
		aClass270Array2851[anInt2857 * -267917561].method4930(class523_sub4_sub1, f, f_40_, f_41_);
	}

	public final void method4826(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_42_, float f_43_) {
		aClass270Array2851[anInt2857 * -267917561].method4930(class523_sub4_sub1, f, f_42_, f_43_);
	}

	public Class523_Sub4_Sub1 method4827(int i) {
		return (Class523_Sub4_Sub1) aClass269_2852.method4908(i, 2052030551);
	}

	public final void method4828(int i, int i_44_, Interface43 interface43) {
		aClass270Array2851[anInt2857 * -267917561].method4942(i, i_44_, interface43);
	}

	public final void method4829(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_45_, float f_46_, float f_47_) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, f, f_45_, f_46_, f_47_);
	}

	public final void method4830(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_48_, float f_49_, float f_50_) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, f, f_48_, f_49_, f_50_);
	}

	public final void method4831(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_51_, float f_52_, float f_53_) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, f, f_51_, f_52_, f_53_);
	}

	public final void method4832(Class523_Sub4_Sub1 class523_sub4_sub1, Class437 class437) {
		aClass270Array2851[anInt2857 * -267917561].method4930(class523_sub4_sub1, class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public final void method4833(Class523_Sub4_Sub1 class523_sub4_sub1, Class429 class429) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, class429.aFloat4847, class429.aFloat4849, class429.aFloat4848, class429.aFloat4850);
	}

	void method4834() {
		/* empty */
	}

	public final void method4835(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4940(i, class441);
	}

	public final void method4836(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43, int i_54_) {
		aClass270Array2851[-267917561 * anInt2857].method4951(class523_sub4_sub1, i, interface43);
	}

	public final void method4837(Class523_Sub4_Sub1 class523_sub4_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_55_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_56_ = (float) (i & 0xff) / 255.0F;
		float f_57_ = (float) (i >> 24 & 0xff) / 255.0F;
		method4767(class523_sub4_sub1, f, f_55_, f_56_, f_57_, -730315516);
	}

	public final void method4838(Class523_Sub4_Sub1 class523_sub4_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_58_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_59_ = (float) (i & 0xff) / 255.0F;
		float f_60_ = (float) (i >> 24 & 0xff) / 255.0F;
		method4767(class523_sub4_sub1, f, f_58_, f_59_, f_60_, -307143173);
	}

	public final void method4839(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4941(class523_sub4_sub1, class441);
	}

	public final void method4840(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4941(class523_sub4_sub1, class441);
	}

	public final void method4841(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4941(class523_sub4_sub1, class441);
	}

	public final void method4842(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4941(class523_sub4_sub1, class441);
	}

	public final void method4843(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[anInt2857 * -267917561].method4961(class523_sub4_sub1, class441);
	}

	public final void method4844(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[anInt2857 * -267917561].method4961(class523_sub4_sub1, class441);
	}

	public final void method4845(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[anInt2857 * -267917561].method4961(class523_sub4_sub1, class441);
	}

	public final void method4846(int i, Class441 class441) {
		aClass270Array2851[anInt2857 * -267917561].method4939(i, class441);
	}

	public final void method4847(int i, Class441 class441, int i_61_) {
		aClass270Array2851[-267917561 * anInt2857].method4933(i, class441);
	}

	public final void method4848(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		aClass270Array2851[-267917561 * anInt2857].method4951(class523_sub4_sub1, i, interface43);
	}

	public final void method4849(int i, float f, float f_62_, float f_63_) {
		aClass270Array2851[anInt2857 * -267917561].method4925(i, f, f_62_, f_63_);
	}

	public final void method4850(Class523_Sub4_Sub1 class523_sub4_sub1, Class429 class429) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, class429.aFloat4847, class429.aFloat4849, class429.aFloat4848, class429.aFloat4850);
	}

	public final void method4851(int i, float f, float f_64_, float f_65_, float f_66_) {
		aClass270Array2851[-267917561 * anInt2857].method4937(i, f, f_64_, f_65_, f_66_);
	}

	public abstract boolean method4852(Class270 class270);

	public final void method4853(Class523_Sub4_Sub1 class523_sub4_sub1, Class429 class429) {
		aClass270Array2851[-267917561 * anInt2857].method4931(class523_sub4_sub1, class429.aFloat4847, class429.aFloat4849, class429.aFloat4848, class429.aFloat4850);
	}

	abstract Class270 method4854(Class178_Sub2 class178_sub2, Class264 class264);

	public final int method4855() {
		return aClass270Array2851.length;
	}

	public final void method4856(int i, float[] fs, int i_67_) {
		aClass270Array2851[anInt2857 * -267917561].method4946(i, fs, i_67_);
	}

	public Class270 method4857(String string) throws Exception_Sub3_Sub2 {
		Class270[] class270s = aClass270Array2851;
		for (int i = 0; i < class270s.length; i++) {
			Class270 class270 = class270s[i];
			String string_68_ = class270.method4926(1693446628);
			if (string_68_ != null && string_68_.equals(string)) {
				if (!class270.method4927())
					throw new Exception_Sub3_Sub2(string);
				return class270;
			}
		}
		throw new Exception_Sub3_Sub2(string);
	}

	public final void method4858(int i, Class441 class441) {
		aClass270Array2851[anInt2857 * -267917561].method4939(i, class441);
	}

	public final void method4859(int i, float f, float f_69_, float f_70_, float f_71_) {
		aClass270Array2851[-267917561 * anInt2857].method4937(i, f, f_69_, f_70_, f_71_);
	}

	public final void method4860(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		aClass270Array2851[anInt2857 * -267917561].method4961(class523_sub4_sub1, class441);
	}

	public final void method4861(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4940(i, class441);
	}

	public final void method4862(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4940(i, class441);
	}

	public final void method4863(int i, float f, float f_72_, float f_73_) {
		aClass270Array2851[anInt2857 * -267917561].method4925(i, f, f_72_, f_73_);
	}

	public final void method4864(int i, Class441 class441) {
		aClass270Array2851[-267917561 * anInt2857].method4933(i, class441);
	}

	public abstract boolean method4865();

	public final void method4866(int i, int i_74_, Interface43 interface43) {
		aClass270Array2851[anInt2857 * -267917561].method4942(i, i_74_, interface43);
	}

	public final void method4867(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_75_, byte i) {
		aClass270Array2851[-267917561 * anInt2857].method4929(class523_sub4_sub1, f, f_75_);
	}

	public Class523_Sub4_Sub1 method4868(int i) {
		return (Class523_Sub4_Sub1) aClass269_2856.method4908(i, 2000370534);
	}

	public Class523_Sub4_Sub1 method4869(int i) {
		return (Class523_Sub4_Sub1) aClass269_2856.method4908(i, 1767351026);
	}

	public Class523_Sub4_Sub1 method4870(String string) {
		return ((Class523_Sub4_Sub1) aClass269_2856.method4910(string, (byte) -15));
	}

	public Class523_Sub4_Sub1 method4871(String string) {
		return ((Class523_Sub4_Sub1) aClass269_2856.method4910(string, (byte) 15));
	}

	public int method4872() {
		return anInt2854 * -72749163;
	}

	public String method4873() {
		return aString2850;
	}

	abstract Class270 method4874(Class178_Sub2 class178_sub2, Class264 class264);

	public int method4875() {
		return anInt2854 * -72749163;
	}

	public Class523_Sub4_Sub1 method4876(int i) {
		return (Class523_Sub4_Sub1) aClass269_2852.method4908(i, 1690945539);
	}

	public final void method4877(int i, Class441 class441, short i_76_) {
		aClass270Array2851[-267917561 * anInt2857].method4940(i, class441);
	}

	public Class523_Sub4_Sub1 method4878(String string, int i) {
		return ((Class523_Sub4_Sub1) aClass269_2856.method4910(string, (byte) 116));
	}

	public final void method4879(int i, Class437 class437) {
		aClass270Array2851[anInt2857 * -267917561].method4925(i, class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	static final void method4880(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class43.anInt619 * 1979365937;
	}

	static final void method4881(Class669 class669, int i) {
		NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class669.aClass647_Sub1_Sub3_Sub1_8552);
		NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
		if (class300.anIntArray3286 != null)
			class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -23);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = null != class300 ? 1 : 0;
	}

	static final void method4882(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
		int i_77_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class411.method6635(i_77_, (byte) -103);
	}

	public static Class384 method4883(RSBuffer class523_sub34, int i) {
		Class384_Sub2 class384_sub2 = (Class384_Sub2) Class555.method9190(class523_sub34, -87614152);
		int i_78_ = class523_sub34.readShort(-182711401);
		return new Class384_Sub2_Sub1(class384_sub2.aClass380_3974, class384_sub2.aClass389_3968, class384_sub2.anInt3970 * 1653743623, -1732272073 * class384_sub2.anInt3969, class384_sub2.anInt3971 * 1773515723, class384_sub2.anInt3972 * -1825534571, class384_sub2.anInt3973 * -913347581, class384_sub2.anInt3967 * -2021763229, -495047775 * class384_sub2.anInt3975, 800289073 * class384_sub2.anInt10257, 171920273 * class384_sub2.anInt10255, class384_sub2.anInt10256 * -650702109, 615521747 * class384_sub2.anInt10259, class384_sub2.anInt10258 * -849934999, class384_sub2.anInt10254 * -1624740753, i_78_);
	}

	static final void method4884(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3965(892258727);
	}

	static final void method4885(Class669 class669, byte i) {
		Class535.method8919(class669.aClass647_Sub1_Sub5_Sub1_8568, class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], true, (short) -15668);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[0];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[2];
	}
}
