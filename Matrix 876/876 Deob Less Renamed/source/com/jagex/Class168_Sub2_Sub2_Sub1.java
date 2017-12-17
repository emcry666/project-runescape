/* Class168_Sub2_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class168_Sub2_Sub2_Sub1 extends Class168_Sub2_Sub2 {
	Image anImage12056;

	public final int method15399(int i, int i_0_) {
		Graphics graphics = aCanvas11363.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12056, i, i_0_, aCanvas11363);
		return 0;
	}

	public void method73() {
		/* empty */
	}

	public int method15400() {
		return method15401(0, 0);
	}

	public int method15404() {
		return method15401(0, 0);
	}

	public void method131() {
		/* empty */
	}

	public void method361() {
		/* empty */
	}

	void method17783(int i) {
		super.method17783(835027697);
		DataBufferInt databufferint = new DataBufferInt(anIntArray11366, anIntArray11366.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(276730845 * anInt11364, 2032327007 * anInt11362)), databufferint, null);
		anImage12056 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public final int method15406(int i, int i_1_) {
		Graphics graphics = aCanvas11363.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12056, i, i_1_, aCanvas11363);
		return 0;
	}

	public final int method15407(int i, int i_2_) {
		Graphics graphics = aCanvas11363.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12056, i, i_2_, aCanvas11363);
		return 0;
	}

	public final int method15408(int i, int i_3_) {
		Graphics graphics = aCanvas11363.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12056, i, i_3_, aCanvas11363);
		return 0;
	}

	Class168_Sub2_Sub2_Sub1(Class178_Sub3 class178_sub3, Canvas canvas, int i, int i_4_) {
		super(class178_sub3, canvas, i, i_4_);
		new Rectangle();
		method17783(-674138317);
	}

	public final int method15401(int i, int i_5_) {
		Graphics graphics = aCanvas11363.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(anImage12056, i, i_5_, aCanvas11363);
		return 0;
	}
}
