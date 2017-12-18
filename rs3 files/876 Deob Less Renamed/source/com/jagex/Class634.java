/* Class634 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class634 implements Interface75 {
	int anInt8270;
	static Class634 aClass634_8271;
	static Class634 aClass634_8272;
	public static Class634 aClass634_8273 = new Class634(0);

	public int method6() {
		return -565703651 * anInt8270;
	}

	public boolean method10399(int i) {
		return aClass634_8271 == this;
	}

	Class634(int i) {
		anInt8270 = i * -968419787;
	}

	public static Class634[] method10400(int i) {
		return (new Class634[] { aClass634_8271, aClass634_8273, aClass634_8272 });
	}

	public int method82() {
		return -565703651 * anInt8270;
	}

	static {
		aClass634_8271 = new Class634(1);
		aClass634_8272 = new Class634(2);
	}

	public boolean method10401(int i) {
		return this != aClass634_8273;
	}

	public int method101() {
		return -565703651 * anInt8270;
	}

	public static Class634[] method10402() {
		return (new Class634[] { aClass634_8271, aClass634_8273, aClass634_8272 });
	}

	public static Class634[] method10403() {
		return (new Class634[] { aClass634_8271, aClass634_8273, aClass634_8272 });
	}

	public static Class634[] method10404() {
		return (new Class634[] { aClass634_8271, aClass634_8273, aClass634_8272 });
	}

	public boolean method10405() {
		return this != aClass634_8273;
	}

	static final void method10406(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_0_, (byte) 76);
		if (i_1_ != -1100663923 * class76.anInt850)
			class250.method4505(i_0_, i_1_, -130903224);
		else
			class250.method4436(i_0_, (byte) 1);
	}

	static final void method10407(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class661.method10907(class250, class242, class669, 416915066);
	}

	static final void method10408(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		Class250 class250 = Class188.method3592(i_4_, -975581559);
		PacketsDecoder.method4266(class250, i_2_, i_3_, (byte) -63);
	}
}
