/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class507 {
	Robot aRobot5700;

	public void movemouse(int i, int i_0_) {
		aRobot5700.mouseMove(i, i_0_);
	}

	public Class507() throws Exception {
		aRobot5700 = new Robot();
	}

	public void setcustomcursor(Component component, int[] is, int i, int i_1_, Point point) {
		if (is != null) {
			BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
			bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
			component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		} else
			component.setCursor(null);
	}
}
