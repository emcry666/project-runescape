/* Class333_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.LinkedList;

public class Class333_Sub1 extends Class333 {
	Color aColor9991;
	boolean aBool9992;
	FontMetrics aFontMetrics9993;
	Font aFont9994;
	Class296 this$0;

	void method5846(Graphics graphics) {
		String string;
		if (aBool9992)
			string = this$0.aString3184;
		else
			string = new StringBuilder().append(this$0.aString3179).append(" ").append(this$0.aString3184).toString();
		graphics.setFont(aFont9994);
		graphics.setColor(aColor9991);
		graphics.drawString(string, (this$0.method5275(aFontMetrics9993.stringWidth(string), 853548946) + -456592077 * anInt3510), (this$0.method5269(0, (byte) 0) + -1065871637 * anInt3509));
	}

	void method5845(Graphics graphics, int i) {
		String string;
		if (aBool9992)
			string = this$0.aString3184;
		else
			string = new StringBuilder().append(this$0.aString3179).append(" ").append(this$0.aString3184).toString();
		graphics.setFont(aFont9994);
		graphics.setColor(aColor9991);
		graphics.drawString(string, (this$0.method5275(aFontMetrics9993.stringWidth(string), 415252262) + -456592077 * anInt3510), (this$0.method5269(0, (byte) 0) + -1065871637 * anInt3509));
	}

	void method5844(Graphics graphics) {
		String string;
		if (aBool9992)
			string = this$0.aString3184;
		else
			string = new StringBuilder().append(this$0.aString3179).append(" ").append(this$0.aString3184).toString();
		graphics.setFont(aFont9994);
		graphics.setColor(aColor9991);
		graphics.drawString(string, (this$0.method5275(aFontMetrics9993.stringWidth(string), -249852794) + -456592077 * anInt3510), (this$0.method5269(0, (byte) 0) + -1065871637 * anInt3509));
	}

	Class333_Sub1(Class296 class296, boolean bool, String string, int i, int i_0_, int i_1_, int i_2_) {
		super(class296, i_1_, i_2_);
		this$0 = class296;
		aBool9992 = bool;
		aFont9994 = new Font(string, 0, i);
		aFontMetrics9993 = Class523_Sub18_Sub8.aCanvas11689.getFontMetrics(aFont9994);
		aColor9991 = new Color(i_0_);
	}

	public static int method15531(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class661.anIntArray8510 = null;
		Class463.anInt5127 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_3_ = new LinkedList();
		for (int i_4_ = 0; i_4_ < 787510181 * Class523_Sub37.aClass53_Sub8_10677.anInt721; i_4_++) {
			ItemDefinitions class12 = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_4_, (byte) -7);
			if ((!bool || class12.unnoted) && class12.certTemplateId * 1178069929 == -1 && -1 == class12.lendTemplateId * 128437773 && -1 == class12.anInt167 * -1670847967 && 0 == -1222232385 * class12.anInt149 && class12.itemName.toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 250)
					return -1;
				linkedlist.add(Integer.valueOf(i_4_));
				linkedlist_3_.add(class12.itemName);
			}
		}
		Class661.anIntArray8510 = new int[linkedlist.size()];
		int i_5_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class661.anIntArray8510[i_5_++] = integer.intValue();
		}
		String[] strings = ((String[]) linkedlist_3_.toArray(new String[Class661.anIntArray8510.length]));
		Class417.method6658(strings, Class661.anIntArray8510, -1980499061);
		return linkedlist.size();
	}
}
