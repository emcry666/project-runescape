/* Class194_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub21 extends Class194 {
	int anInt9959;
	int anInt9960;
	int anInt9961;
	int anInt9962;
	Class489 aClass489_9963;

	public void method3651() {
		if (null != aClass489_9963)
			aClass489_9963.method8032(612834904);
	}

	public void method3648(int i) {
		if (null != aClass489_9963)
			aClass489_9963.method8032(924559554);
	}

	void method3652(int i) {
		if (aClass489_9963 != null) {
			aClass489_9963.method7960(50, (byte) 109);
			Class254.aClass217_2743.method3864(aClass489_9963, (byte) 24);
			aClass489_9963 = null;
		}
	}

	Class194_Sub21(RSBuffer class523_sub34) {
		super(class523_sub34);
		anInt9960 = class523_sub34.readUnsignedShort(-843332216) * -846667555;
		anInt9959 = class523_sub34.readUnsignedByte(253006868) * 751259307;
		anInt9961 = class523_sub34.readUnsignedByte(1225980560) * 2069693127;
		anInt9962 = class523_sub34.readUnsignedByte(1695917486) * 2078549839;
		aClass489_9963 = Class254.aClass217_2743.method3877(Class189.aClass189_2143, this, 1739388789 * anInt9960, anInt9962 * 1286377391, anInt9959 * -508675069, Class198.aClass198_2195.method3672((byte) 115), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, anInt9961 * 1184440055, false, (short) -3958);
		if (aClass489_9963 != null)
			aClass489_9963.method7958((byte) 0);
	}

	public void method3656() {
		if (null != aClass489_9963)
			aClass489_9963.method8032(1753283068);
	}

	public void method3657() {
		if (null != aClass489_9963)
			aClass489_9963.method8032(1523476856);
	}

	void method3647() {
		if (aClass489_9963 != null) {
			aClass489_9963.method7960(50, (byte) 100);
			Class254.aClass217_2743.method3864(aClass489_9963, (byte) 24);
			aClass489_9963 = null;
		}
	}

	static final void method15527(Class669 class669, byte i) {
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -1103922179);
		if (-1 != -1878986101 * class250.anInt2680)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1263698325 * class250.anInt2681;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
