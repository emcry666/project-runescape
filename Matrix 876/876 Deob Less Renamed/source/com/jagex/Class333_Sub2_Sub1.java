/* Class333_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class333_Sub2_Sub1 extends Class333_Sub2 {
	Class296 this$0;
	float aFloat11581;
	float aFloat11582;

	void method5846(Graphics graphics) {
		aFloat11582 += aFloat11581;
		if (aFloat11582 < 0.0F)
			aFloat11582 += 360.0F;
		aFloat11582 %= 360.0F;
		double d = Math.toRadians((double) aFloat11582);
		int i = anImage9999.getWidth(null);
		int i_0_ = anImage9999.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method5275(i, 2069949535) + i / 2 + -456592077 * anInt3510), (double) (this$0.method5269(i_0_, (byte) 0) + i_0_ / 2 + -1065871637 * anInt3509));
		graphics2d.translate((this$0.method5275(i, 1835021439) + -456592077 * anInt3510), (this$0.method5269(i_0_, (byte) 0) + -1065871637 * anInt3509));
		graphics2d.drawImage(anImage9999, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3183);
	}

	void method5845(Graphics graphics, int i) {
		aFloat11582 += aFloat11581;
		if (aFloat11582 < 0.0F)
			aFloat11582 += 360.0F;
		aFloat11582 %= 360.0F;
		double d = Math.toRadians((double) aFloat11582);
		int i_1_ = anImage9999.getWidth(null);
		int i_2_ = anImage9999.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method5275(i_1_, -1396781489) + i_1_ / 2 + -456592077 * anInt3510), (double) (this$0.method5269(i_2_, (byte) 0) + i_2_ / 2 + -1065871637 * anInt3509));
		graphics2d.translate((this$0.method5275(i_1_, -374369830) + -456592077 * anInt3510), (this$0.method5269(i_2_, (byte) 0) + -1065871637 * anInt3509));
		graphics2d.drawImage(anImage9999, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3183);
	}

	Class333_Sub2_Sub1(Class296 class296, Image image, int i, int i_3_, float f) {
		super(class296, image, i, i_3_);
		this$0 = class296;
		aFloat11581 = f;
		aFloat11582 = -aFloat11581;
	}

	void method5844(Graphics graphics) {
		aFloat11582 += aFloat11581;
		if (aFloat11582 < 0.0F)
			aFloat11582 += 360.0F;
		aFloat11582 %= 360.0F;
		double d = Math.toRadians((double) aFloat11582);
		int i = anImage9999.getWidth(null);
		int i_4_ = anImage9999.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method5275(i, -1135371686) + i / 2 + -456592077 * anInt3510), (double) (this$0.method5269(i_4_, (byte) 0) + i_4_ / 2 + -1065871637 * anInt3509));
		graphics2d.translate((this$0.method5275(i, 341857480) + -456592077 * anInt3510), (this$0.method5269(i_4_, (byte) 0) + -1065871637 * anInt3509));
		graphics2d.drawImage(anImage9999, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3183);
	}
}
