/* Class333_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Graphics;
import java.awt.Image;

public class Class333_Sub2 extends Class333 {
	Class296 this$0;
	Image anImage9999;
	static int anInt10000;

	void method5846(Graphics graphics) {
		int i = (this$0.method5275(anImage9999.getWidth(null), -872006935) + anInt3510 * -456592077);
		int i_0_ = (this$0.method5269(anImage9999.getHeight(null), (byte) 0) + -1065871637 * anInt3509);
		graphics.drawImage(anImage9999, i, i_0_, null);
	}

	void method5845(Graphics graphics, int i) {
		int i_1_ = (this$0.method5275(anImage9999.getWidth(null), 1029329872) + anInt3510 * -456592077);
		int i_2_ = (this$0.method5269(anImage9999.getHeight(null), (byte) 0) + -1065871637 * anInt3509);
		graphics.drawImage(anImage9999, i_1_, i_2_, null);
	}

	void method5844(Graphics graphics) {
		int i = (this$0.method5275(anImage9999.getWidth(null), -1474643448) + anInt3510 * -456592077);
		int i_3_ = (this$0.method5269(anImage9999.getHeight(null), (byte) 0) + -1065871637 * anInt3509);
		graphics.drawImage(anImage9999, i, i_3_, null);
	}

	Class333_Sub2(Class296 class296, Image image, int i, int i_4_) {
		super(class296, i, i_4_);
		this$0 = class296;
		anImage9999 = image;
	}

	public static final void method15546(int i) {
		if (!client.aBool11107) {
			client.aFloat11106 += (12.0F - client.aFloat11106) / 2.0F;
			client.aBool11111 = true;
			client.aBool11107 = true;
		}
	}
}
