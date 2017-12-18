/* Class194_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class194_Sub16 extends Class194 {
	int anInt9937;
	int anInt9938;
	int anInt9939;

	boolean method3654() {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(-1290676097 * anInt9938, (byte) -21));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) 3));
		bool &= class205.method3719(169699403);
		return bool;
	}

	boolean method3650(int i) {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(-1290676097 * anInt9938, (byte) 13));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) -51));
		bool &= class205.method3719(169699403);
		return bool;
	}

	boolean method3653() {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(-1290676097 * anInt9938, (byte) -50));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) 25));
		bool &= class205.method3719(169699403);
		return bool;
	}

	boolean method3655() {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(-1290676097 * anInt9938, (byte) 115));
		boolean bool = class671.method13700((byte) 127);
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) -38));
		bool &= class205.method3719(169699403);
		return bool;
	}

	Class194_Sub16(Class523_Sub34 class523_sub34) {
		super(class523_sub34);
		anInt9938 = class523_sub34.readUnsignedShort(-765042565) * 45475711;
		anInt9939 = class523_sub34.readUnsignedShort(-1482548082) * -2099106027;
		anInt9937 = class523_sub34.readUnsignedByte(-1924092148) * -1656739141;
	}

	static final void method15519(Class669 class669, short i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1547955743);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1569774109 * class250.anInt2605;
	}

	static final void method15520(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class194_Sub6.method15502(class250, class242, class669, (byte) -85);
	}
}
