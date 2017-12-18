/* Class693 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class693 {
	GraphicsDevice aGraphicsDevice8742;
	DisplayMode aDisplayMode8743;

	int[] method13968() {
		DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[1 + (i << 2)] = displaymodes[i].getHeight();
			is[(i << 2) + 2] = displaymodes[i].getBitDepth();
			is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	int[] method13969(byte i) {
		DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i_0_ = 0; i_0_ < displaymodes.length; i_0_++) {
			is[i_0_ << 2] = displaymodes[i_0_].getWidth();
			is[1 + (i_0_ << 2)] = displaymodes[i_0_].getHeight();
			is[(i_0_ << 2) + 2] = displaymodes[i_0_].getBitDepth();
			is[3 + (i_0_ << 2)] = displaymodes[i_0_].getRefreshRate();
		}
		return is;
	}

	public Class693() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		aGraphicsDevice8742 = graphicsenvironment.getDefaultScreenDevice();
		if (!aGraphicsDevice8742.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_1_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_1_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_1_[i];
				if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
					aGraphicsDevice8742 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	void method13970(int i) {
		if (null != aDisplayMode8743) {
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_2_ = displaymodes;
			for (int i_3_ = 0; i_3_ < displaymodes_2_.length; i_3_++) {
				DisplayMode displaymode = displaymodes_2_[i_3_];
				if (displaymode.equals(aDisplayMode8743)) {
					aGraphicsDevice8742.setDisplayMode(aDisplayMode8743);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8742, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8743 = null;
		}
		method13971(null, 291023394);
	}

	void method13971(Frame frame, int i) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_4_ = ((Boolean) field.get(aGraphicsDevice8742)).booleanValue();
			if (bool_4_) {
				field.set(aGraphicsDevice8742, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice8742.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8742, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8742, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			throw object;
		}
	}

	void method13972() {
		if (null != aDisplayMode8743) {
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_5_ = displaymodes;
			for (int i = 0; i < displaymodes_5_.length; i++) {
				DisplayMode displaymode = displaymodes_5_[i];
				if (displaymode.equals(aDisplayMode8743)) {
					aGraphicsDevice8742.setDisplayMode(aDisplayMode8743);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8742, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8743 = null;
		}
		method13971(null, 824164341);
	}

	void method13973(Frame frame, int i, int i_6_, int i_7_, int i_8_) {
		aDisplayMode8743 = aGraphicsDevice8742.getDisplayMode();
		if (aDisplayMode8743 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method13971(frame, 543512716);
		if (i_8_ == 0) {
			int i_9_ = aDisplayMode8743.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			for (int i_10_ = 0; i_10_ < displaymodes.length; i_10_++) {
				if (displaymodes[i_10_].getWidth() == i && displaymodes[i_10_].getHeight() == i_6_ && displaymodes[i_10_].getBitDepth() == i_7_) {
					int i_11_ = displaymodes[i_10_].getRefreshRate();
					if (!bool || Math.abs(i_11_ - i_9_) < Math.abs(i_8_ - i_9_)) {
						i_8_ = i_11_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_8_ = i_9_;
		}
		aGraphicsDevice8742.setDisplayMode(new DisplayMode(i, i_6_, i_7_, i_8_));
	}

	void method13974(Frame frame, int i, int i_12_, int i_13_, int i_14_) {
		aDisplayMode8743 = aGraphicsDevice8742.getDisplayMode();
		if (aDisplayMode8743 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method13971(frame, 518240322);
		if (i_14_ == 0) {
			int i_15_ = aDisplayMode8743.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			for (int i_16_ = 0; i_16_ < displaymodes.length; i_16_++) {
				if (displaymodes[i_16_].getWidth() == i && displaymodes[i_16_].getHeight() == i_12_ && displaymodes[i_16_].getBitDepth() == i_13_) {
					int i_17_ = displaymodes[i_16_].getRefreshRate();
					if (!bool || Math.abs(i_17_ - i_15_) < Math.abs(i_14_ - i_15_)) {
						i_14_ = i_17_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_14_ = i_15_;
		}
		aGraphicsDevice8742.setDisplayMode(new DisplayMode(i, i_12_, i_13_, i_14_));
	}

	void method13975() {
		if (null != aDisplayMode8743) {
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_18_ = displaymodes;
			for (int i = 0; i < displaymodes_18_.length; i++) {
				DisplayMode displaymode = displaymodes_18_[i];
				if (displaymode.equals(aDisplayMode8743)) {
					aGraphicsDevice8742.setDisplayMode(aDisplayMode8743);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8742, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8743 = null;
		}
		method13971(null, 56434552);
	}

	void method13976(Frame frame, int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		aDisplayMode8743 = aGraphicsDevice8742.getDisplayMode();
		if (aDisplayMode8743 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method13971(frame, 508475825);
		if (i_21_ == 0) {
			int i_23_ = aDisplayMode8743.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			for (int i_24_ = 0; i_24_ < displaymodes.length; i_24_++) {
				if (displaymodes[i_24_].getWidth() == i && displaymodes[i_24_].getHeight() == i_19_ && displaymodes[i_24_].getBitDepth() == i_20_) {
					int i_25_ = displaymodes[i_24_].getRefreshRate();
					if (!bool || Math.abs(i_25_ - i_23_) < Math.abs(i_21_ - i_23_)) {
						i_21_ = i_25_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_21_ = i_23_;
		}
		aGraphicsDevice8742.setDisplayMode(new DisplayMode(i, i_19_, i_20_, i_21_));
	}

	void method13977() {
		if (null != aDisplayMode8743) {
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_26_ = displaymodes;
			for (int i = 0; i < displaymodes_26_.length; i++) {
				DisplayMode displaymode = displaymodes_26_[i];
				if (displaymode.equals(aDisplayMode8743)) {
					aGraphicsDevice8742.setDisplayMode(aDisplayMode8743);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8742, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8743 = null;
		}
		method13971(null, 118897776);
	}

	void method13978() {
		if (null != aDisplayMode8743) {
			DisplayMode[] displaymodes = aGraphicsDevice8742.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_27_ = displaymodes;
			for (int i = 0; i < displaymodes_27_.length; i++) {
				DisplayMode displaymode = displaymodes_27_[i];
				if (displaymode.equals(aDisplayMode8743)) {
					aGraphicsDevice8742.setDisplayMode(aDisplayMode8743);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(aGraphicsDevice8742, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aDisplayMode8743 = null;
		}
		method13971(null, 203718135);
	}

	void method13979(Frame frame) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_28_ = ((Boolean) field.get(aGraphicsDevice8742)).booleanValue();
			if (bool_28_) {
				field.set(aGraphicsDevice8742, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice8742.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8742, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(aGraphicsDevice8742, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			throw object;
		}
	}

	static final void method13980(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class279.method5063(class250, class242, class669, 1951983931);
	}
}
