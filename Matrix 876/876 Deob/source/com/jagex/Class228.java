/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class228 implements Interface26 {
	Class212 aClass212_2347;
	Class224 this$0;
	static int anInt2348;
	public static long aLong2349;

	Class228(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		boolean bool = class523_sub34.readUnsignedByte(1325584535) != 255;
		if (bool)
			class523_sub34.offset -= 189765723;
		aClass212_2347 = new Class212(class523_sub34, bool, true);
	}

	public void method163(Class218 class218, int i) {
		class218.method3962(aClass212_2347, -313953129);
	}

	public void method162(Class218 class218) {
		class218.method3962(aClass212_2347, -2139229003);
	}

	public void method161(Class218 class218) {
		class218.method3962(aClass212_2347, -1640950291);
	}

	public void method164(Class218 class218) {
		class218.method3962(aClass212_2347, -887041722);
	}

	public void method165(Class218 class218) {
		class218.method3962(aClass212_2347, 205208545);
	}

	static final void method4173(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class246.method4385(class250, class242, class669, -1408120271);
	}

	static final void method4174(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class642.aClass561_8334.method9432(-1690909811);
	}

	public static Class380[] method4175(int i) {
		return (new Class380[] { Class380.aClass380_3936, Class380.aClass380_3934, Class380.aClass380_3935 });
	}
}
