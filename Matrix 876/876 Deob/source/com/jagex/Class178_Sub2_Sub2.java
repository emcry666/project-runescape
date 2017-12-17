/* Class178_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class178_Sub2_Sub2 extends Class178_Sub2 {
	int anInt11488;
	String aString11489;
	Class708 aClass708_11490;
	Class148 aClass148_11491;
	boolean aBool11492;
	Class708 aClass708_11493;
	Class708 aClass708_11494;
	Class708 aClass708_11495;
	boolean aBool11496;
	int[] anIntArray11497;
	boolean aBool11498;
	boolean aBool11499;
	boolean aBool11500;
	int anInt11501;
	Class490_Sub1[] aClass490_Sub1Array11502;
	Class490_Sub2 aClass490_Sub2_11503;
	int anInt11504;
	Class270_Sub1 aClass270_Sub1_11505;
	Class168_Sub1 aClass168_Sub1_11506;
	boolean aBool11507;
	String aString11508;
	int[] anIntArray11509;
	Class708 aClass708_11510 = new Class708();
	boolean aBool11511;
	boolean aBool11512;
	int[] anIntArray11513;
	boolean aBool11514;
	boolean aBool11515;
	boolean aBool11516;
	OpenGL anOpenGL11517;
	boolean aBool11518;
	boolean aBool11519;
	float[] aFloatArray11520;
	float[] aFloatArray11521;
	static final int anInt11522 = 3;
	Class148 aClass148_11523;
	Class708 aClass708_11524;
	long aLong11525;
	int[] anIntArray11526;
	long[] aLongArray11527;
	Class708 aClass708_11528;
	int anInt11529;
	int anInt11530;

	final synchronized void method17887(int i, int i_0_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_0_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11490.method14236(class523_sub24, 638976121);
	}

	public int method3059() {
		if (aBool11518) {
			if (aLongArray11527[anInt11488] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11527[anInt11488], 0, 0);
			if (i == 37149) {
				method3060();
				return -1;
			}
			return i != 37147 ? anIntArray11509[anInt11488] : -1;
		}
		return -1;
	}

	public boolean method14919() {
		return aBool11496;
	}

	public long method3324(int i, int i_1_) {
		return method17911(i, i_1_, null, null);
	}

	public boolean method15061(boolean bool) {
		return true;
	}

	Class178_Sub2_Sub2(OpenGL opengl, Canvas canvas, long l, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i) {
		super(class172, interface25, interface46, interface48, interface45, class472, i, 1);
		aClass708_11490 = new Class708();
		aClass708_11528 = new Class708();
		aClass708_11524 = new Class708();
		aClass708_11493 = new Class708();
		aClass708_11494 = new Class708();
		aClass708_11495 = new Class708();
		anIntArray11497 = new int[1000];
		aClass490_Sub1Array11502 = new Class490_Sub1[16];
		new MapBuffer();
		new MapBuffer();
		aFloatArray11521 = new float[4];
		aFloatArray11520 = new float[16];
		aClass148_11523 = null;
		aClass148_11491 = null;
		aClass168_Sub1_11506 = null;
		anIntArray11526 = new int[3];
		aLongArray11527 = new long[3];
		anIntArray11509 = new int[3];
		anInt11488 = 0;
		anInt11530 = 0;
		int[] is = new int[1];
		try {
			anOpenGL11517 = opengl;
			anOpenGL11517.method1669();
			aString11489 = OpenGL.glGetString(7936).toLowerCase();
			aString11508 = OpenGL.glGetString(7937).toLowerCase();
			if (aString11489.indexOf("microsoft") != -1 || aString11489.indexOf("brian paul") != -1 || aString11489.indexOf("mesa") != -1)
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class194_Sub13.method15512(string.replace('.', ' '), ' ', (byte) 46);
			if (strings.length >= 2) {
				try {
					int i_2_ = JS5Client.method15856(strings[0], (byte) 94);
					int i_3_ = JS5Client.method15856(strings[1], (byte) 76);
					anInt11504 = i_2_ * 10 + i_3_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (anInt11504 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt9680 = is[0];
			if (anInt9680 < 2)
				throw new RuntimeException("");
			anInt9524 = 8;
			aBool11507 = anOpenGL11517.method1668("GL_ARB_vertex_buffer_object");
			aBool9685 = anOpenGL11517.method1668("GL_ARB_multisample");
			aBool9528 = anOpenGL11517.method1668("GL_EXT_blend_func_separate");
			aBool11511 = anOpenGL11517.method1668("GL_ARB_texture_rectangle");
			aBool9686 = anOpenGL11517.method1668("GL_ARB_texture_cube_map");
			aBool11512 = anOpenGL11517.method1668("GL_ARB_texture_non_power_of_two");
			aBool9687 = true;
			aBool11496 = anOpenGL11517.method1668("GL_ARB_vertex_shader");
			aBool11514 = anOpenGL11517.method1668("GL_ARB_vertex_program");
			aBool11515 = anOpenGL11517.method1668("GL_ARB_fragment_shader");
			aBool11516 = anOpenGL11517.method1668("GL_ARB_fragment_program");
			aBool9682 = anOpenGL11517.method1668("GL_EXT_framebuffer_object");
			aBool9688 = aBool9682;
			aBool9566 = anOpenGL11517.method1668("GL_EXT_framebuffer_blit");
			aBool9609 = anOpenGL11517.method1668("GL_EXT_framebuffer_multisample");
			aBool11518 = (anUnsafe9538 != null && (anInt11504 >= 32 || anOpenGL11517.method1668("GL_ARB_sync")));
			anIntArray11513 = new int[anInt9680];
			if (!method14919() || !method15119()) {
				if (!anOpenGL11517.method1668("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!anOpenGL11517.method1668("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			Class509.aString5723.startsWith("mac");
			anInt11529 = Stream.method1704() ? 33639 : 5121;
			if (aString11508.indexOf("radeon") != -1 || aString11489.indexOf("intel") != -1) {
				int i_4_ = 0;
				boolean bool = aString11489.indexOf("intel") != -1;
				boolean bool_5_ = false;
				boolean bool_6_ = false;
				String[] strings_7_ = Class194_Sub13.method15512(aString11508.replace('/', ' '), ' ', (byte) -69);
				for (int i_8_ = 0; i_8_ < strings_7_.length; i_8_++) {
					String string_9_ = strings_7_[i_8_];
					try {
						if (string_9_.length() <= 0)
							continue;
						if (string_9_.charAt(0) == 'x' && string_9_.length() >= 3 && Class516.method8619(string_9_.substring(1, 3), 1695842396)) {
							string_9_ = string_9_.substring(1);
							bool_6_ = true;
						}
						if (string_9_.equals("hd")) {
							bool_5_ = true;
							continue;
						}
						if (string_9_.startsWith("hd")) {
							string_9_ = string_9_.substring(2);
							bool_5_ = true;
						}
						if (string_9_.length() < 4 || !Class516.method8619(string_9_.substring(0, 4), 1695842396))
							continue;
						i_4_ = JS5Client.method15856(string_9_.substring(0, 4), (byte) 14);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (bool) {
					if (!bool_5_)
						aBool9682 = false;
				} else {
					if (!bool_6_ && !bool_5_) {
						if (i_4_ >= 7000 && i_4_ <= 7999)
							aBool11507 = false;
						if (i_4_ >= 7000 && i_4_ <= 9250)
							aBool9687 = false;
					}
					aBool11511 &= anOpenGL11517.method1668("GL_ARB_half_float_pixel");
					aBool11492 = true;
				}
			}
			if (aBool11507) {
				try {
					int[] is_10_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_10_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			method3042(canvas, new Class168_Sub2_Sub1_Sub2(this, canvas, l), -158260339);
			method3044(canvas, -2103239139);
			method14950(32768, false);
			method14950(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3024(1746974121);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	void method14931() {
		OpenGL.glDepthFunc(515);
		method17892();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9685) {
			method15028(anInt9661 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9680 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_11_ = 16384 + i;
			OpenGL.glLightfv(i_11_, 4608, fs, 0);
			OpenGL.glLightf(i_11_, 4615, 0.0F);
			OpenGL.glLightf(i_11_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11517.setSwapInterval(0);
		super.method14931();
	}

	public Class150 method3401() {
		int i = -1;
		if (aString11489.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11489.indexOf("intel") != -1)
			i = 32902;
		else if (aString11489.indexOf("ati") != -1)
			i = 4098;
		return new Class150(i, method14920() ? "OpenGL FF" : "OpenGL", anInt11504, aString11508, 0L, method14920());
	}

	byte[] method17888(String string) {
		return method14925("gl", string);
	}

	public void method3021() {
		OpenGL.glFinish();
	}

	public void method3211(int i, int i_12_, int i_13_) {
		method3186();
		if (aClass168_Sub1_11506 == null)
			method17909(i_12_, i_13_);
		if (aClass148_11523 == null)
			aClass148_11523 = method3376(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), false);
		else
			aClass148_11523.method2433(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), 0, 0);
		method3353(aClass168_Sub1_11506, -196676775);
		method3076(1, -16777216);
		aClass148_11523.method2438(anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105);
		OpenGL.glBindBufferARB(35051, anIntArray11526[anInt11530]);
		OpenGL.glReadPixelsub(0, 0, anInt1942 * 799761325, anInt1943 * -2022726959, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method3047(aClass168_Sub1_11506, (short) -23195);
		aLongArray11527[anInt11530] = OpenGL.glFenceSync(37143, 0);
		anIntArray11509[anInt11530] = i;
		if (++anInt11530 >= 3)
			anInt11530 = 0;
		method3108();
	}

	public float method15089() {
		return 0.0F;
	}

	void method15044(int i) {
		if (!aBool11519)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public Class168_Sub1 method3248() {
		return new Class168_Sub1_Sub1_Sub2(this);
	}

	public Interface22 method3050(int i, int i_14_, Class158 class158, Class170 class170, int i_15_) {
		return new Class494(this, class158, class170, i, i_14_, i_15_);
	}

	public Interface23 method3051(int i, int i_16_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_16_);
	}

	public Interface23 method3049(int i, int i_17_, int i_18_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_17_, i_18_);
	}

	public int[] method3293(int i, int i_19_, int i_20_, int i_21_) {
		int[] is = new int[i_20_ * i_21_];
		int i_22_ = aClass168_1938.method2874();
		for (int i_23_ = 0; i_23_ < i_21_; i_23_++)
			OpenGL.glReadPixelsi(i, i_22_ - i_19_ - i_23_ - 1, i_20_, 1, 32993, anInt11529, is, i_23_ * i_20_);
		return is;
	}

	public void method3194() {
		if (aClass168_1938 != null) {
			int i = aClass168_1938.method2875();
			int i_24_ = aClass168_1938.method2874();
			if (i > 0 || i_24_ > 0) {
				int i_25_ = anInt9628;
				int i_26_ = anInt9649;
				int i_27_ = anInt9597;
				int i_28_ = anInt9598;
				method3067();
				int i_29_ = anInt9633;
				int i_30_ = anInt9590;
				int i_31_ = anInt9587;
				int i_32_ = anInt9588;
				method3071();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14935();
				method15024(false);
				method14982(false);
				method14978(false);
				method15249(false);
				method15001(null);
				method14960(1);
				method15018(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_24_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method3378(i_29_, i_31_, i_30_, i_32_);
				method3208(i_25_, i_26_, i_27_, i_28_);
			}
		}
	}

	public boolean method3309() {
		return aBool11518;
	}

	void method15294() {
		if (aBool9573 && aBool9660 && anInt9663 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public boolean method3057() {
		return true;
	}

	final Interface40 method15301(boolean bool) {
		return new Class490_Sub2(this, Class170.aClass170_1826, bool);
	}

	void method3073() {
		super.method3023();
		if (anOpenGL11517 != null) {
			anOpenGL11517.method1670();
			anOpenGL11517.release();
			anOpenGL11517 = null;
		}
	}

	public void method3061(int i, int i_33_, int i_34_) {
		method3186();
		if (aClass168_Sub1_11506 == null)
			method17909(i_33_, i_34_);
		if (aClass148_11523 == null)
			aClass148_11523 = method3376(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), false);
		else
			aClass148_11523.method2433(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), 0, 0);
		method3353(aClass168_Sub1_11506, 1734513117);
		method3076(1, -16777216);
		aClass148_11523.method2438(anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105);
		OpenGL.glBindBufferARB(35051, anIntArray11526[anInt11530]);
		OpenGL.glReadPixelsub(0, 0, anInt1942 * 799761325, anInt1943 * -2022726959, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method3047(aClass168_Sub1_11506, (short) -23228);
		aLongArray11527[anInt11530] = OpenGL.glFenceSync(37143, 0);
		anIntArray11509[anInt11530] = i;
		if (++anInt11530 >= 3)
			anInt11530 = 0;
		method3108();
	}

	public void method3060() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11527[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11527[i]);
				aLongArray11527[i] = 0L;
			}
		}
		anInt11530 = 0;
		anInt11488 = 0;
	}

	void method15139() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		int i;
		for (i = 0; i < anInt9602; i++) {
			Class523_Sub20 class523_sub20 = aClass523_Sub20Array9671[i];
			int i_35_ = class523_sub20.method16067(856453637);
			int i_36_ = 16386 + i;
			float f = class523_sub20.method16068((byte) 0) / 255.0F;
			aFloatArray11521[0] = (float) class523_sub20.method16062(2131811589);
			aFloatArray11521[1] = (float) class523_sub20.method16091(16203139);
			aFloatArray11521[2] = (float) class523_sub20.method16065(1998216939);
			aFloatArray11521[3] = 1.0F;
			OpenGL.glLightfv(i_36_, 4611, aFloatArray11521, 0);
			aFloatArray11521[0] = (float) (i_35_ >> 16 & 0xff) * f;
			aFloatArray11521[1] = (float) (i_35_ >> 8 & 0xff) * f;
			aFloatArray11521[2] = (float) (i_35_ & 0xff) * f;
			aFloatArray11521[3] = 1.0F;
			OpenGL.glLightfv(i_36_, 4609, aFloatArray11521, 0);
			OpenGL.glLightf(i_36_, 4617, (1.0F / (float) (class523_sub20.method16066(-1879460461) * class523_sub20.method16066(-1879460461))));
			OpenGL.glEnable(i_36_);
		}
		for (/**/; i < anInt9620; i++)
			OpenGL.glDisable(16386 + i);
	}

	public void method3130(int i, int i_37_, int[] is, int[] is_38_) {
		method17911(i, i_37_, is, is_38_);
	}

	public Class265 method15073(String string) {
		byte[] is = method17910(string);
		if (is == null)
			return null;
		Class279 class279 = method14926(is);
		return new Class265_Sub2(this, class279);
	}

	void method17889(int i, int i_39_) {
		method3066();
		method3161(i, i_39_, -4680197);
		if (aBool11518) {
			aClass148_11491 = method3136(i, i_39_, false, true);
			aClass168_Sub1_11506 = method3248();
			aClass168_Sub1_11506.method14424(0, aClass148_11491.method2430());
			OpenGL.glGenBuffersARB(3, anIntArray11526, 0);
			for (int i_40_ = 0; i_40_ < 3; i_40_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11526[i_40_]);
				OpenGL.glBufferDataARBa(35051, i * i_39_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass148_11491 = method3136(i, i_39_, false, true);
			aClass168_Sub1_11506 = method3248();
			aClass168_Sub1_11506.method14424(0, aClass148_11491.method2430());
		}
	}

	public void method3066() {
		if (aBool11518) {
			aClass148_11523 = null;
			if (aClass168_Sub1_11506 != null) {
				aClass168_Sub1_11506.method131();
				aClass168_Sub1_11506 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11526, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11526[i] = 0;
				if (aLongArray11527[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11527[i]);
					aLongArray11527[i] = 0L;
				}
			}
		} else {
			aClass168_Sub1_11506 = null;
			aClass148_11491 = null;
			aClass148_11523 = null;
		}
		anInt11530 = 0;
		anInt11488 = 0;
	}

	Interface37 method15332(Class158 class158, Class170 class170, int i, int i_41_) {
		return method14999(class158, class170, i, i_41_);
	}

	Interface41 method14999(Class158 class158, Class170 class170, int i, int i_42_) {
		return new Class492_Sub1(this, class158, class170, i, i_42_);
	}

	Interface37 method15083(Class158 class158, Class170 class170, int i, int i_43_) {
		return method14999(class158, class170, i, i_43_);
	}

	void method15199() {
		OpenGL.glDepthFunc(515);
		method17892();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9685) {
			method15028(anInt9661 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9680 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_44_ = 16384 + i;
			OpenGL.glLightfv(i_44_, 4608, fs, 0);
			OpenGL.glLightf(i_44_, 4615, 0.0F);
			OpenGL.glLightf(i_44_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11517.setSwapInterval(0);
		super.method14931();
	}

	void method15162() {
		if (aClass168_1938 != null) {
			int i = anInt9619 + anInt9633;
			int i_45_ = anInt9600 + aClass168_1938.method2874() - anInt9588;
			int i_46_ = anInt9590 - anInt9633;
			int i_47_ = anInt9588 - anInt9587;
			if (i_46_ < 0)
				i_46_ = 0;
			if (i_47_ < 0)
				i_47_ = 0;
			OpenGL.glScissor(i, i_45_, i_46_, i_47_);
		}
	}

	public void method14970(Class441 class441) {
		float[] fs = class441.aFloatArray4916;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method15092(Class441 class441, Class441 class441_48_, Class441 class441_49_) {
		OpenGL.glMatrixMode(5888);
		aClass441_9560.method7088(class441, class441_48_);
		OpenGL.glLoadMatrixf(aClass441_9560.aFloatArray4916, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class441_49_.aFloatArray4916, 0);
	}

	final void method15200(int i, Class361 class361, boolean bool, boolean bool_50_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method17891(class361));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_50_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_50_ ? 769 : 768);
	}

	void method14980() {
		if (aBool9526 && aBool9606)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method15304() {
		OpenGL.glDepthMask(aBool9604 && aBool9558);
	}

	void method14983() {
		if (aBool9674 && !aBool9548)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method14984() {
		aFloatArray11521[0] = aFloat9643 * aFloat9689;
		aFloatArray11521[1] = aFloat9643 * aFloat9614;
		aFloatArray11521[2] = aFloat9643 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11521, 0);
	}

	void method14985() {
		aFloatArray11521[0] = aFloat9617 * aFloat9689;
		aFloatArray11521[1] = aFloat9617 * aFloat9614;
		aFloatArray11521[2] = aFloat9617 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11521, 0);
		aFloatArray11521[0] = -aFloat9618 * aFloat9689;
		aFloatArray11521[1] = -aFloat9618 * aFloat9614;
		aFloatArray11521[2] = -aFloat9618 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11521, 0);
	}

	void method15077() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9608, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9582, 0);
	}

	public boolean method15120() {
		return aBool11496;
	}

	public boolean method15105() {
		return aBool11496;
	}

	void method14989() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		int i;
		for (i = 0; i < anInt9602; i++) {
			Class523_Sub20 class523_sub20 = aClass523_Sub20Array9671[i];
			int i_51_ = class523_sub20.method16067(856453637);
			int i_52_ = 16386 + i;
			float f = class523_sub20.method16068((byte) 0) / 255.0F;
			aFloatArray11521[0] = (float) class523_sub20.method16062(2131811589);
			aFloatArray11521[1] = (float) class523_sub20.method16091(-2038484016);
			aFloatArray11521[2] = (float) class523_sub20.method16065(1733853956);
			aFloatArray11521[3] = 1.0F;
			OpenGL.glLightfv(i_52_, 4611, aFloatArray11521, 0);
			aFloatArray11521[0] = (float) (i_51_ >> 16 & 0xff) * f;
			aFloatArray11521[1] = (float) (i_51_ >> 8 & 0xff) * f;
			aFloatArray11521[2] = (float) (i_51_ & 0xff) * f;
			aFloatArray11521[3] = 1.0F;
			OpenGL.glLightfv(i_52_, 4609, aFloatArray11521, 0);
			OpenGL.glLightf(i_52_, 4617, (1.0F / (float) (class523_sub20.method16066(-1879460461) * class523_sub20.method16066(-1879460461))));
			OpenGL.glEnable(i_52_);
		}
		for (/**/; i < anInt9620; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method14990(Class158 class158, Class170 class170) {
		return true;
	}

	public boolean method15290() {
		return aBool11515;
	}

	public Class150 method3369() {
		int i = -1;
		if (aString11489.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11489.indexOf("intel") != -1)
			i = 32902;
		else if (aString11489.indexOf("ati") != -1)
			i = 4098;
		return new Class150(i, method14920() ? "OpenGL FF" : "OpenGL", anInt11504, aString11508, 0L, method14920());
	}

	Interface37 method14996(int i, int i_53_, boolean bool, int[] is, int i_54_, int i_55_) {
		return new Class492_Sub1(this, i, i_53_, bool, is, i_54_, i_55_);
	}

	Interface37 method14995(Class158 class158, int i, int i_56_, boolean bool, float[] fs, int i_57_, int i_58_) {
		return new Class492_Sub1(this, class158, i, i_56_, bool, fs, i_57_, i_58_);
	}

	public boolean method3058() {
		return false;
	}

	Interface39 method14997(int i, boolean bool, int[][] is) {
		return new Class492_Sub2(this, i, bool, is);
	}

	final synchronized void method17890(int i, int i_59_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_59_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11490.method14236(class523_sub24, -2044708294);
	}

	void method15190() {
		if (aBool9526 && aBool9606)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	public void method15072() {
		int i = anIntArray11513[anInt9626];
		if (i != 0) {
			anIntArray11513[anInt9626] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method15070() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9665[anInt9626] != Class377.aClass377_3926)
			OpenGL.glLoadMatrixf(aClass441Array9547[anInt9626].method7134(aFloatArray11520), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method15015() {
		OpenGL.glActiveTexture(33984 + anInt9626);
	}

	void method15016() {
		OpenGL.glTexEnvi(8960, 34161, method17895(aClass374Array9630[anInt9626]));
	}

	void method14955() {
		OpenGL.glTexEnvi(8960, 34162, method17895(aClass374Array9631[anInt9626]));
	}

	final void method15005(int i, Class361 class361, boolean bool, boolean bool_60_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method17891(class361));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_60_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_60_ ? 769 : 768);
	}

	void method15198() {
		if (aBool9674 && !aBool9548)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	final Interface40 method15029(boolean bool) {
		return new Class490_Sub2(this, Class170.aClass170_1826, bool);
	}

	public Class185 method3319(Class185 class185, Class185 class185_61_, float f, Class185 class185_62_) {
		return f < 0.5F ? class185 : class185_61_;
	}

	static final int method17891(Class361 class361) {
		if (class361 == Class361.aClass361_3741)
			return 5890;
		if (class361 == Class361.aClass361_3742)
			return 34167;
		if (class361 == Class361.aClass361_3744)
			return 34168;
		if (class361 == Class361.aClass361_3740)
			return 34166;
		throw new IllegalArgumentException();
	}

	Interface37 method15231(int i, int i_63_, boolean bool, int[] is, int i_64_, int i_65_) {
		return new Class492_Sub1(this, i, i_63_, bool, is, i_64_, i_65_);
	}

	void method15021() {
		if (aBool9563)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9672 & 0xff) / 255.0F);
		if (anInt9661 > 1) {
			if (aByte9672 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method15022() {
		if (aBool9528) {
			int i = 0;
			int i_66_ = 0;
			if (anInt9653 == 0) {
				i = 0;
				i_66_ = 0;
			} else if (anInt9653 == 1) {
				i = 1;
				i_66_ = 0;
			} else if (anInt9653 == 2) {
				i = 1;
				i_66_ = 1;
			} else if (anInt9653 == 3) {
				i = 0;
				i_66_ = 1;
			}
			if (aClass363_9666 == Class363.aClass363_3752)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_66_);
			else if (aClass363_9666 == Class363.aClass363_3750)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_66_);
			else if (aClass363_9666 == Class363.aClass363_3753)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_66_);
			else if (aClass363_9666 == Class363.aClass363_3751)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_66_);
		} else if (aClass363_9666 == Class363.aClass363_3752) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass363_9666 == Class363.aClass363_3750) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass363_9666 == Class363.aClass363_3753) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	public Interface22 method3440(int i, int i_67_, Class158 class158, Class170 class170, int i_68_) {
		return new Class494(this, class158, class170, i, i_67_, i_68_);
	}

	void method17892() {
		if (anInt9673 == 1)
			OpenGL.glDisable(2884);
		else {
			OpenGL.glEnable(2884);
			if (anInt9673 == 2)
				OpenGL.glCullFace(1029);
			else if (anInt9673 == 3)
				OpenGL.glCullFace(1028);
		}
	}

	void method15220() {
		if (aBool9573 && aBool9660 && anInt9663 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	static final int method17893(Class170 class170) {
		switch (class170.anInt1830 * 1699851493) {
		case 5:
			return 5125;
		case 6:
			return 5126;
		case 4:
			return 5131;
		case 3:
			return 5124;
		case 2:
			return 5121;
		default:
			return 5121;
		case 8:
			return 5123;
		case 1:
			return 5120;
		case 0:
			return 5122;
		}
	}

	void method15028(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	final Interface36 method15030(boolean bool) {
		return new Class490_Sub1(this, bool);
	}

	Interface37 method14994(Class158 class158, int i, int i_69_, boolean bool, byte[] is, int i_70_, int i_71_) {
		return new Class492_Sub1(this, class158, i, i_69_, bool, is, i_70_, i_71_);
	}

	public final synchronized void method3164(int i) {
		try {
			method17903();
		} catch (Exception exception) {
			return;
		}
		int i_72_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11490.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11490.method14293(2019454525);
			anIntArray11497[i_72_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9648 -= class523_sub24.anInt10542 * -677457577;
			if (i_72_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_72_, anIntArray11497, 0);
				i_72_ = 0;
			}
		}
		if (i_72_ > 0) {
			OpenGL.glDeleteBuffersARB(i_72_, anIntArray11497, 0);
			i_72_ = 0;
		}
		while (!aClass708_11528.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11528.method14293(2128581652);
			anIntArray11497[i_72_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9530 -= class523_sub24.anInt10542 * -677457577;
			if (i_72_ == 1000) {
				OpenGL.glDeleteTextures(i_72_, anIntArray11497, 0);
				i_72_ = 0;
			}
		}
		if (i_72_ > 0) {
			OpenGL.glDeleteTextures(i_72_, anIntArray11497, 0);
			i_72_ = 0;
		}
		while (!aClass708_11524.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11524.method14293(2045554113);
			anIntArray11497[i_72_++] = class523_sub24.anInt10542 * -677457577;
			if (i_72_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_72_, anIntArray11497, 0);
				i_72_ = 0;
			}
		}
		if (i_72_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_72_, anIntArray11497, 0);
			i_72_ = 0;
		}
		while (!aClass708_11493.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11493.method14293(2071513783);
			anIntArray11497[i_72_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9684 -= class523_sub24.anInt10542 * -677457577;
			if (i_72_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_72_, anIntArray11497, 0);
				i_72_ = 0;
			}
		}
		if (i_72_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_72_, anIntArray11497, 0);
			boolean bool = false;
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(2072752510);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		while (!aClass708_11494.method14237((byte) 104)) {
			Class523 class523 = aClass708_11494.method14293(2072534010);
			OpenGL.glDeleteProgram((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11495.method14237((byte) 104)) {
			Class523 class523 = aClass708_11495.method14293(2084275867);
			OpenGL.glDeleteShader((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(2092288451);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		if (method3025() > 100663296 && TimeUtils.getCurrentTimeMilliseconds(1516375036) > aLong11525 + 60000L) {
			System.gc();
			aLong11525 = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		}
		super.method3428(i);
	}

	final synchronized void method17894(int i) {
		Class523 class523 = new Class523();
		class523.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11494.method14236(class523, -169796861);
	}

	void method15213(Interface40 interface40) {
		aClass490_Sub2_11503 = (Class490_Sub2) interface40;
		aClass490_Sub2_11503.method8050();
	}

	static final int method17895(Class374 class374) {
		if (class374 == Class374.aClass374_3909)
			return 7681;
		if (class374 == Class374.aClass374_3908)
			return 8448;
		if (class374 == Class374.aClass374_3912)
			return 34165;
		if (class374 == Class374.aClass374_3910)
			return 260;
		if (class374 == Class374.aClass374_3911)
			return 34023;
		throw new IllegalArgumentException();
	}

	public final void method15040(Class376 class376, int i, int i_73_) {
		int i_74_;
		int i_75_;
		if (class376 == Class376.aClass376_3919) {
			i_74_ = 1;
			i_75_ = i_73_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_74_ = 3;
			i_75_ = i_73_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_74_ = 4;
			i_75_ = i_73_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_74_ = 6;
			i_75_ = i_73_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_74_ = 5;
			i_75_ = i_73_ + 2;
		} else {
			i_74_ = 0;
			i_75_ = i_73_;
		}
		OpenGL.glDrawArrays(i_74_, i, i_75_);
	}

	void method15217() {
		if (aClass168_1938 != null)
			OpenGL.glViewport(anInt9619 + anInt9628, (anInt9600 + aClass168_1938.method2874() - anInt9649 - anInt9598), anInt9597, anInt9598);
		OpenGL.glDepthRange(aFloat9581, aFloat9605);
	}

	public final void method15034(Class376 class376, int i, int i_76_, int i_77_, int i_78_) {
		int i_79_;
		int i_80_;
		if (class376 == Class376.aClass376_3919) {
			i_79_ = 1;
			i_80_ = i_78_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_79_ = 3;
			i_80_ = i_78_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_79_ = 4;
			i_80_ = i_78_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_79_ = 6;
			i_80_ = i_78_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_79_ = 5;
			i_80_ = i_78_ + 2;
		} else {
			i_79_ = 0;
			i_80_ = i_78_;
		}
		Class170 class170 = aClass490_Sub2_11503.method276();
		OpenGL.glDrawElements(i_79_, i_80_, method17900(class170), (aClass490_Sub2_11503.method8051() + (long) (i_77_ * (class170.anInt1831 * 1602321003))));
	}

	void method17896() {
		if (anInt9673 == 1)
			OpenGL.glDisable(2884);
		else {
			OpenGL.glEnable(2884);
			if (anInt9673 == 2)
				OpenGL.glCullFace(1029);
			else if (anInt9673 == 3)
				OpenGL.glCullFace(1028);
		}
	}

	public String method3184() {
		String string = "Caps: 4:";
		String string_81_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_81_).toString();
		string = new StringBuilder().append(string).append(anInt11529).append(string_81_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_81_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11507 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11514 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11516 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11496 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11515 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11511 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool11512 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_81_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	final synchronized void method17897(int i, int i_82_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_82_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11528.method14236(class523_sub24, -2108812195);
	}

	public void method15047(Class441 class441, Class441 class441_83_, Class441 class441_84_) {
		OpenGL.glMatrixMode(5888);
		aClass441_9560.method7088(class441, class441_83_);
		OpenGL.glLoadMatrixf(aClass441_9560.aFloatArray4916, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class441_84_.aFloatArray4916, 0);
	}

	void method15203() {
		aFloatArray11521[0] = aFloat9643 * aFloat9689;
		aFloatArray11521[1] = aFloat9643 * aFloat9614;
		aFloatArray11521[2] = aFloat9643 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11521, 0);
	}

	final synchronized void method17898(long l) {
		Class523 class523 = new Class523();
		class523.aLong7065 = l * 2947252533757437993L;
		aClass708_11495.method14236(class523, 30536908);
	}

	final synchronized void method17899(int i) {
		Class523 class523 = new Class523();
		class523.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11494.method14236(class523, 884985438);
	}

	static final int method17900(Class170 class170) {
		switch (class170.anInt1830 * 1699851493) {
		case 5:
			return 5125;
		case 6:
			return 5126;
		case 4:
			return 5131;
		case 3:
			return 5124;
		case 2:
			return 5121;
		default:
			return 5121;
		case 8:
			return 5123;
		case 1:
			return 5120;
		case 0:
			return 5122;
		}
	}

	static int method17901(Class158 class158) {
		switch (class158.anInt1742 * 178485697) {
		case 8:
			return 6408;
		case 6:
			return 6406;
		default:
			throw new IllegalStateException();
		case 5:
			return 6409;
		case 9:
			return 6402;
		case 7:
			return 6410;
		case 4:
			return 6407;
		}
	}

	static int method17902(Class158 class158, Class170 class170) {
		if (class170 == Class170.aClass170_1822) {
			switch (class158.anInt1742 * 178485697) {
			case 6:
				return 6406;
			case 2:
				return 33777;
			case 4:
				return 6407;
			case 8:
				return 6408;
			case 7:
				return 6410;
			case 5:
				return 6409;
			case 0:
				return 33779;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class170 == Class170.aClass170_1826) {
			switch (class158.anInt1742 * 178485697) {
			case 8:
				return 32859;
			case 4:
				return 32852;
			default:
				throw new IllegalArgumentException();
			case 5:
				return 32834;
			case 6:
				return 32830;
			case 7:
				return 36219;
			case 9:
				return 33189;
			}
		}
		if (class170 == Class170.aClass170_1827) {
			switch (class158.anInt1742 * 178485697) {
			case 9:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class170 == Class170.aClass170_1829) {
			switch (class158.anInt1742 * 178485697) {
			case 9:
				return 33191;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class170 == Class170.aClass170_1832) {
			switch (class158.anInt1742 * 178485697) {
			case 5:
				return 34846;
			case 6:
				return 34844;
			case 7:
				return 34847;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34843;
			case 8:
				return 34842;
			}
		}
		if (class170 == Class170.aClass170_1825) {
			switch (class158.anInt1742 * 178485697) {
			case 7:
				return 34841;
			case 8:
				return 34836;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34837;
			case 6:
				return 34838;
			case 5:
				return 34840;
			}
		}
		throw new IllegalArgumentException();
	}

	void method15189() {
		if (aBool9526 && aBool9606)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method17903() {
		int i = 0;
		while (!anOpenGL11517.method1669()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class653.method10656(1000L);
		}
	}

	Class168_Sub2 method3048(Canvas canvas, int i, int i_85_) {
		return new Class168_Sub2_Sub1_Sub2(this, canvas);
	}

	void method15027() {
		aFloat9681 = aFloat9702 - (float) anInt9664;
		aFloat9683 = aFloat9681 - (float) anInt9663;
		if (aFloat9683 < aFloat9585)
			aFloat9683 = aFloat9585;
		if (aBool9647) {
			OpenGL.glFogf(2915, aFloat9683);
			OpenGL.glFogf(2916, aFloat9681);
			aFloatArray11521[0] = (float) (anInt9662 & 0xff0000) / 1.671168E7F;
			aFloatArray11521[1] = (float) (anInt9662 & 0xff00) / 65280.0F;
			aFloatArray11521[2] = (float) (anInt9662 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray11521, 0);
		}
	}

	final Interface40 method15300(boolean bool) {
		return new Class490_Sub2(this, Class170.aClass170_1826, bool);
	}

	void method3159(int i, int i_86_) throws Exception_Sub4 {
		aClass168_Sub2_1939.method15400();
		if (anInterface25_1923 != null)
			anInterface25_1923.method20(1523957337);
	}

	public void method3219() {
		OpenGL.glFinish();
	}

	public void method3283() {
		OpenGL.glFinish();
	}

	public void method3379(int i, int i_87_) {
		int i_88_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_87_ & 0xff0000) / 1.671168E7F, (float) (i_87_ & 0xff00) / 65280.0F, (float) (i_87_ & 0xff) / 255.0F, (float) (i_87_ >>> 24) / 255.0F);
			i_88_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method15249(true);
			i_88_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_88_ |= 0x400;
		OpenGL.glClear(i_88_);
	}

	public final synchronized void method3163(int i) {
		try {
			method17903();
		} catch (Exception exception) {
			return;
		}
		int i_89_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11490.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11490.method14293(2118795119);
			anIntArray11497[i_89_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9648 -= class523_sub24.anInt10542 * -677457577;
			if (i_89_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_89_, anIntArray11497, 0);
				i_89_ = 0;
			}
		}
		if (i_89_ > 0) {
			OpenGL.glDeleteBuffersARB(i_89_, anIntArray11497, 0);
			i_89_ = 0;
		}
		while (!aClass708_11528.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11528.method14293(2002680303);
			anIntArray11497[i_89_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9530 -= class523_sub24.anInt10542 * -677457577;
			if (i_89_ == 1000) {
				OpenGL.glDeleteTextures(i_89_, anIntArray11497, 0);
				i_89_ = 0;
			}
		}
		if (i_89_ > 0) {
			OpenGL.glDeleteTextures(i_89_, anIntArray11497, 0);
			i_89_ = 0;
		}
		while (!aClass708_11524.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11524.method14293(2020944357);
			anIntArray11497[i_89_++] = class523_sub24.anInt10542 * -677457577;
			if (i_89_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_89_, anIntArray11497, 0);
				i_89_ = 0;
			}
		}
		if (i_89_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_89_, anIntArray11497, 0);
			i_89_ = 0;
		}
		while (!aClass708_11493.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11493.method14293(2053420950);
			anIntArray11497[i_89_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9684 -= class523_sub24.anInt10542 * -677457577;
			if (i_89_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_89_, anIntArray11497, 0);
				i_89_ = 0;
			}
		}
		if (i_89_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_89_, anIntArray11497, 0);
			boolean bool = false;
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(2027821335);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		while (!aClass708_11494.method14237((byte) 104)) {
			Class523 class523 = aClass708_11494.method14293(2087929798);
			OpenGL.glDeleteProgram((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11495.method14237((byte) 104)) {
			Class523 class523 = aClass708_11495.method14293(2139721906);
			OpenGL.glDeleteShader((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(1943613985);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		if (method3025() > 100663296 && TimeUtils.getCurrentTimeMilliseconds(1516375036) > aLong11525 + 60000L) {
			System.gc();
			aLong11525 = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		}
		super.method3428(i);
	}

	public String method3036() {
		String string = "Caps: 4:";
		String string_90_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_90_).toString();
		string = new StringBuilder().append(string).append(anInt11529).append(string_90_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_90_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11507 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11514 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11516 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11496 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11515 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11511 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool11512 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_90_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public final synchronized void method3165(int i) {
		try {
			method17903();
		} catch (Exception exception) {
			return;
		}
		int i_91_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11490.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11490.method14293(2090259087);
			anIntArray11497[i_91_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9648 -= class523_sub24.anInt10542 * -677457577;
			if (i_91_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_91_, anIntArray11497, 0);
				i_91_ = 0;
			}
		}
		if (i_91_ > 0) {
			OpenGL.glDeleteBuffersARB(i_91_, anIntArray11497, 0);
			i_91_ = 0;
		}
		while (!aClass708_11528.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11528.method14293(2071658854);
			anIntArray11497[i_91_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9530 -= class523_sub24.anInt10542 * -677457577;
			if (i_91_ == 1000) {
				OpenGL.glDeleteTextures(i_91_, anIntArray11497, 0);
				i_91_ = 0;
			}
		}
		if (i_91_ > 0) {
			OpenGL.glDeleteTextures(i_91_, anIntArray11497, 0);
			i_91_ = 0;
		}
		while (!aClass708_11524.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11524.method14293(2022333316);
			anIntArray11497[i_91_++] = class523_sub24.anInt10542 * -677457577;
			if (i_91_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_91_, anIntArray11497, 0);
				i_91_ = 0;
			}
		}
		if (i_91_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_91_, anIntArray11497, 0);
			i_91_ = 0;
		}
		while (!aClass708_11493.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11493.method14293(1930319932);
			anIntArray11497[i_91_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9684 -= class523_sub24.anInt10542 * -677457577;
			if (i_91_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_91_, anIntArray11497, 0);
				i_91_ = 0;
			}
		}
		if (i_91_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_91_, anIntArray11497, 0);
			boolean bool = false;
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(2097257121);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		while (!aClass708_11494.method14237((byte) 104)) {
			Class523 class523 = aClass708_11494.method14293(2002749108);
			OpenGL.glDeleteProgram((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11495.method14237((byte) 104)) {
			Class523 class523 = aClass708_11495.method14293(1933978384);
			OpenGL.glDeleteShader((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(1976389551);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		if (method3025() > 100663296 && TimeUtils.getCurrentTimeMilliseconds(1516375036) > aLong11525 + 60000L) {
			System.gc();
			aLong11525 = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		}
		super.method3428(i);
	}

	public void method15033(int i, Interface36 interface36) {
		aClass490_Sub1Array11502[i] = (Class490_Sub1) interface36;
	}

	public String method3234() {
		String string = "Caps: 4:";
		String string_92_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_92_).toString();
		string = new StringBuilder().append(string).append(anInt11529).append(string_92_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_92_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11507 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11514 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11516 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11496 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11515 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11511 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11512 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	void method15076() {
		OpenGL.glDepthFunc(515);
		method17892();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9685) {
			method15028(anInt9661 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9680 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_93_ = 16384 + i;
			OpenGL.glLightfv(i_93_, 4608, fs, 0);
			OpenGL.glLightf(i_93_, 4615, 0.0F);
			OpenGL.glLightf(i_93_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11517.setSwapInterval(0);
		super.method14931();
	}

	void method15153() {
		if (aClass168_1938 != null)
			OpenGL.glViewport(anInt9619 + anInt9628, (anInt9600 + aClass168_1938.method2874() - anInt9649 - anInt9598), anInt9597, anInt9598);
		OpenGL.glDepthRange(aFloat9581, aFloat9605);
	}

	public void method3188(boolean bool) {
		/* empty */
	}

	void method3221(int i, int i_94_) throws Exception_Sub4 {
		aClass168_Sub2_1939.method15400();
		if (anInterface25_1923 != null)
			anInterface25_1923.method20(1757531008);
	}

	public void method3176(boolean bool) {
		/* empty */
	}

	public void method3191(boolean bool) {
		/* empty */
	}

	Class168_Sub2 method3243(Canvas canvas, int i, int i_95_) {
		return new Class168_Sub2_Sub1_Sub2(this, canvas);
	}

	public void method15126(int i, Interface36 interface36) {
		aClass490_Sub1Array11502[i] = (Class490_Sub1) interface36;
	}

	void method15000(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public void method3195() {
		if (aClass168_1938 != null) {
			int i = aClass168_1938.method2875();
			int i_96_ = aClass168_1938.method2874();
			if (i > 0 || i_96_ > 0) {
				int i_97_ = anInt9628;
				int i_98_ = anInt9649;
				int i_99_ = anInt9597;
				int i_100_ = anInt9598;
				method3067();
				int i_101_ = anInt9633;
				int i_102_ = anInt9590;
				int i_103_ = anInt9587;
				int i_104_ = anInt9588;
				method3071();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14935();
				method15024(false);
				method14982(false);
				method14978(false);
				method15249(false);
				method15001(null);
				method14960(1);
				method15018(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_96_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method3378(i_101_, i_103_, i_102_, i_104_);
				method3208(i_97_, i_98_, i_99_, i_100_);
			}
		}
	}

	public Class168_Sub1 method3028() {
		return new Class168_Sub1_Sub1_Sub2(this);
	}

	public boolean method3202() {
		return aBool11518;
	}

	public boolean method3065() {
		if (aBool11518 && aLongArray11527[anInt11530] != 0L)
			return false;
		return true;
	}

	public boolean method3421() {
		return true;
	}

	void method15307(Interface40 interface40) {
		aClass490_Sub2_11503 = (Class490_Sub2) interface40;
		aClass490_Sub2_11503.method8050();
	}

	final synchronized void method17904(int i, int i_105_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_105_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11493.method14236(class523_sub24, -1025088816);
	}

	public boolean method3207() {
		return false;
	}

	public int method3407() {
		if (aBool11518) {
			if (aLongArray11527[anInt11488] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11527[anInt11488], 0, 0);
			if (i == 37149) {
				method3060();
				return -1;
			}
			return i != 37147 ? anIntArray11509[anInt11488] : -1;
		}
		return -1;
	}

	public int method3294() {
		if (aBool11518) {
			if (aLongArray11527[anInt11488] == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync(aLongArray11527[anInt11488], 0, 0);
			if (i == 37149) {
				method3060();
				return -1;
			}
			return i != 37147 ? anIntArray11509[anInt11488] : -1;
		}
		return -1;
	}

	final void method15041(Interface40 interface40, Class376 class376, int i, int i_106_, int i_107_, int i_108_) {
		int i_109_;
		int i_110_;
		if (class376 == Class376.aClass376_3919) {
			i_109_ = 1;
			i_110_ = i_108_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_109_ = 3;
			i_110_ = i_108_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_109_ = 4;
			i_110_ = i_108_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_109_ = 6;
			i_110_ = i_108_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_109_ = 5;
			i_110_ = i_108_ + 2;
		} else {
			i_109_ = 0;
			i_110_ = i_108_;
		}
		Class170 class170 = interface40.method276();
		Class490_Sub2 class490_sub2 = (Class490_Sub2) interface40;
		class490_sub2.method8050();
		OpenGL.glDrawElements(i_109_, i_110_, method17900(class170), (class490_sub2.method8051() + (long) (i_107_ * (class170.anInt1831 * 1602321003))));
	}

	public void method3466(int i, int i_111_, int i_112_) {
		method3186();
		if (aClass168_Sub1_11506 == null)
			method17909(i_111_, i_112_);
		if (aClass148_11523 == null)
			aClass148_11523 = method3376(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), false);
		else
			aClass148_11523.method2433(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), 0, 0);
		method3353(aClass168_Sub1_11506, -436463489);
		method3076(1, -16777216);
		aClass148_11523.method2438(anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105);
		OpenGL.glBindBufferARB(35051, anIntArray11526[anInt11530]);
		OpenGL.glReadPixelsub(0, 0, anInt1942 * 799761325, anInt1943 * -2022726959, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method3047(aClass168_Sub1_11506, (short) -5814);
		aLongArray11527[anInt11530] = OpenGL.glFenceSync(37143, 0);
		anIntArray11509[anInt11530] = i;
		if (++anInt11530 >= 3)
			anInt11530 = 0;
		method3108();
	}

	public Class185 method3134(Class185 class185, Class185 class185_113_, float f, Class185 class185_114_) {
		return f < 0.5F ? class185 : class185_113_;
	}

	public void method3185() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11527[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11527[i]);
				aLongArray11527[i] = 0L;
			}
		}
		anInt11530 = 0;
		anInt11488 = 0;
	}

	public void method3118() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11527[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray11527[i]);
				aLongArray11527[i] = 0L;
			}
		}
		anInt11530 = 0;
		anInt11488 = 0;
	}

	public long method3215(int i, int i_115_) {
		return method17911(i, i_115_, null, null);
	}

	public boolean method3252() {
		return aBool11518;
	}

	public void method3217(int i, int i_116_, int[] is, int[] is_117_) {
		method17911(i, i_116_, is, is_117_);
	}

	public void method3218() {
		if (aBool11518) {
			aClass148_11523 = null;
			if (aClass168_Sub1_11506 != null) {
				aClass168_Sub1_11506.method131();
				aClass168_Sub1_11506 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11526, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11526[i] = 0;
				if (aLongArray11527[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11527[i]);
					aLongArray11527[i] = 0L;
				}
			}
		} else {
			aClass168_Sub1_11506 = null;
			aClass148_11491 = null;
			aClass148_11523 = null;
		}
		anInt11530 = 0;
		anInt11488 = 0;
	}

	public void method3101() {
		if (aBool11518) {
			aClass148_11523 = null;
			if (aClass168_Sub1_11506 != null) {
				aClass168_Sub1_11506.method131();
				aClass168_Sub1_11506 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray11526, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray11526[i] = 0;
				if (aLongArray11527[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray11527[i]);
					aLongArray11527[i] = 0L;
				}
			}
		} else {
			aClass168_Sub1_11506 = null;
			aClass148_11491 = null;
			aClass148_11523 = null;
		}
		anInt11530 = 0;
		anInt11488 = 0;
	}

	public boolean method15119() {
		return aBool11515;
	}

	public Class185 method3305(Class185 class185, Class185 class185_118_, float f, Class185 class185_119_) {
		return f < 0.5F ? class185 : class185_118_;
	}

	public void method3063(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public Interface23 method3366(int i, int i_120_, int i_121_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_120_, i_121_);
	}

	public Class150 method3368() {
		int i = -1;
		if (aString11489.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11489.indexOf("intel") != -1)
			i = 32902;
		else if (aString11489.indexOf("ati") != -1)
			i = 4098;
		return new Class150(i, method14920() ? "OpenGL FF" : "OpenGL", anInt11504, aString11508, 0L, method14920());
	}

	void method15284(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public Class150 method3370() {
		int i = -1;
		if (aString11489.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11489.indexOf("intel") != -1)
			i = 32902;
		else if (aString11489.indexOf("ati") != -1)
			i = 4098;
		return new Class150(i, method14920() ? "OpenGL FF" : "OpenGL", anInt11504, aString11508, 0L, method14920());
	}

	public void method3251(boolean bool) {
		/* empty */
	}

	public Class150 method3372() {
		int i = -1;
		if (aString11489.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11489.indexOf("intel") != -1)
			i = 32902;
		else if (aString11489.indexOf("ati") != -1)
			i = 4098;
		return new Class150(i, method14920() ? "OpenGL FF" : "OpenGL", anInt11504, aString11508, 0L, method14920());
	}

	public int[] method3020(int i, int i_122_, int i_123_, int i_124_) {
		int[] is = new int[i_123_ * i_124_];
		int i_125_ = aClass168_1938.method2874();
		for (int i_126_ = 0; i_126_ < i_124_; i_126_++)
			OpenGL.glReadPixelsi(i, i_125_ - i_122_ - i_126_ - 1, i_123_, 1, 32993, anInt11529, is, i_126_ * i_123_);
		return is;
	}

	final void method15097() {
		aFloatArray11521[0] = (float) (anInt9632 & 0xff0000) / 1.671168E7F;
		aFloatArray11521[1] = (float) (anInt9632 & 0xff00) / 65280.0F;
		aFloatArray11521[2] = (float) (anInt9632 & 0xff) / 255.0F;
		aFloatArray11521[3] = (float) (anInt9632 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11521, 0);
	}

	public void method3334(int i, int i_127_) {
		int i_128_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_127_ & 0xff0000) / 1.671168E7F, (float) (i_127_ & 0xff00) / 65280.0F, (float) (i_127_ & 0xff) / 255.0F, (float) (i_127_ >>> 24) / 255.0F);
			i_128_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method15249(true);
			i_128_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_128_ |= 0x400;
		OpenGL.glClear(i_128_);
	}

	void method14934(Interface40 interface40) {
		aClass490_Sub2_11503 = (Class490_Sub2) interface40;
		aClass490_Sub2_11503.method8050();
	}

	public Class150 method3443() {
		int i = -1;
		if (aString11489.indexOf("nvidia") != -1)
			i = 4318;
		else if (aString11489.indexOf("intel") != -1)
			i = 32902;
		else if (aString11489.indexOf("ati") != -1)
			i = 4098;
		return new Class150(i, method14920() ? "OpenGL FF" : "OpenGL", anInt11504, aString11508, 0L, method14920());
	}

	public Class168_Sub1 method3399() {
		return new Class168_Sub1_Sub1_Sub2(this);
	}

	public void method3088(int i, int i_129_, int i_130_) {
		method3186();
		if (aClass168_Sub1_11506 == null)
			method17909(i_129_, i_130_);
		if (aClass148_11523 == null)
			aClass148_11523 = method3376(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), false);
		else
			aClass148_11523.method2433(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), 0, 0);
		method3353(aClass168_Sub1_11506, 407698255);
		method3076(1, -16777216);
		aClass148_11523.method2438(anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105);
		OpenGL.glBindBufferARB(35051, anIntArray11526[anInt11530]);
		OpenGL.glReadPixelsub(0, 0, anInt1942 * 799761325, anInt1943 * -2022726959, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method3047(aClass168_Sub1_11506, (short) -5134);
		aLongArray11527[anInt11530] = OpenGL.glFenceSync(37143, 0);
		anIntArray11509[anInt11530] = i;
		if (++anInt11530 >= 3)
			anInt11530 = 0;
		method3108();
	}

	public Interface23 method3233(int i, int i_131_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_131_);
	}

	static int method17905(Class158 class158) {
		switch (class158.anInt1742 * 178485697) {
		case 8:
			return 6408;
		case 6:
			return 6406;
		default:
			throw new IllegalStateException();
		case 5:
			return 6409;
		case 9:
			return 6402;
		case 7:
			return 6410;
		case 4:
			return 6407;
		}
	}

	public Interface23 method3403(int i, int i_132_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_132_);
	}

	public void method3472(int i, int i_133_) {
		int i_134_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_133_ & 0xff0000) / 1.671168E7F, (float) (i_133_ & 0xff00) / 65280.0F, (float) (i_133_ & 0xff) / 255.0F, (float) (i_133_ >>> 24) / 255.0F);
			i_134_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method15249(true);
			i_134_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_134_ |= 0x400;
		OpenGL.glClear(i_134_);
	}

	public Interface22 method3441(int i, int i_135_, Class158 class158, Class170 class170, int i_136_) {
		return new Class494(this, class158, class170, i, i_135_, i_136_);
	}

	void method15288() {
		if (aBool9549)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	public void method3189(boolean bool) {
		/* empty */
	}

	public void method3142() {
		if (aClass168_1938 != null) {
			int i = aClass168_1938.method2875();
			int i_137_ = aClass168_1938.method2874();
			if (i > 0 || i_137_ > 0) {
				int i_138_ = anInt9628;
				int i_139_ = anInt9649;
				int i_140_ = anInt9597;
				int i_141_ = anInt9598;
				method3067();
				int i_142_ = anInt9633;
				int i_143_ = anInt9590;
				int i_144_ = anInt9587;
				int i_145_ = anInt9588;
				method3071();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14935();
				method15024(false);
				method14982(false);
				method14978(false);
				method15249(false);
				method15001(null);
				method14960(1);
				method15018(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_137_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method3378(i_142_, i_144_, i_143_, i_145_);
				method3208(i_138_, i_139_, i_140_, i_141_);
			}
		}
	}

	public boolean method15107() {
		return aBool11515;
	}

	public boolean method15108() {
		return aBool11515;
	}

	public boolean method15109(boolean bool) {
		return true;
	}

	void method15088() {
		if (aBool9526 && aBool9606)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	public Class265 method15116(String string) {
		byte[] is = method17910(string);
		if (is == null)
			return null;
		Class279 class279 = method14926(is);
		return new Class265_Sub2(this, class279);
	}

	void method15036() {
		if (aBool9679) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public void method15112(Class441 class441, Class441 class441_146_, Class441 class441_147_) {
		OpenGL.glMatrixMode(5888);
		aClass441_9560.method7088(class441, class441_146_);
		OpenGL.glLoadMatrixf(aClass441_9560.aFloatArray4916, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class441_147_.aFloatArray4916, 0);
	}

	public void method15230(Class441 class441, Class441 class441_148_, Class441 class441_149_) {
		OpenGL.glMatrixMode(5888);
		aClass441_9560.method7088(class441, class441_148_);
		OpenGL.glLoadMatrixf(aClass441_9560.aFloatArray4916, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class441_149_.aFloatArray4916, 0);
	}

	public void method15121(Class441 class441, Class441 class441_150_, Class441 class441_151_) {
		OpenGL.glMatrixMode(5888);
		aClass441_9560.method7088(class441, class441_150_);
		OpenGL.glLoadMatrixf(aClass441_9560.aFloatArray4916, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class441_151_.aFloatArray4916, 0);
	}

	void method15124() {
		OpenGL.glDepthFunc(515);
		method17892();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9685) {
			method15028(anInt9661 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9680 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_152_ = 16384 + i;
			OpenGL.glLightfv(i_152_, 4608, fs, 0);
			OpenGL.glLightf(i_152_, 4615, 0.0F);
			OpenGL.glLightf(i_152_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11517.setSwapInterval(0);
		super.method14931();
	}

	boolean method15057(Class158 class158, Class170 class170) {
		return aBool9687;
	}

	void method14998() {
		OpenGL.glDepthFunc(515);
		method17892();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool9685) {
			method15028(anInt9661 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt9680 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_153_ = 16384 + i;
			OpenGL.glLightfv(i_153_, 4608, fs, 0);
			OpenGL.glLightf(i_153_, 4615, 0.0F);
			OpenGL.glLightf(i_153_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL11517.setSwapInterval(0);
		super.method14931();
	}

	public void method15173(Class441 class441) {
		float[] fs = class441.aFloatArray4916;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method15283(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method15154() {
		if (aClass168_1938 != null)
			OpenGL.glViewport(anInt9619 + anInt9628, (anInt9600 + aClass168_1938.method2874() - anInt9649 - anInt9598), anInt9597, anInt9598);
		OpenGL.glDepthRange(aFloat9581, aFloat9605);
	}

	public String method3182() {
		String string = "Caps: 4:";
		String string_154_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_154_).toString();
		string = new StringBuilder().append(string).append(anInt11529).append(string_154_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_154_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11507 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11514 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11516 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11496 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11515 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11511 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool11512 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_154_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	void method15155() {
		if (aClass168_1938 != null) {
			int i = anInt9619 + anInt9633;
			int i_155_ = anInt9600 + aClass168_1938.method2874() - anInt9588;
			int i_156_ = anInt9590 - anInt9633;
			int i_157_ = anInt9588 - anInt9587;
			if (i_156_ < 0)
				i_156_ = 0;
			if (i_157_ < 0)
				i_157_ = 0;
			OpenGL.glScissor(i, i_155_, i_156_, i_157_);
		}
	}

	public void method15086(Class441 class441) {
		float[] fs = class441.aFloatArray4916;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method15193() {
		OpenGL.glDepthMask(aBool9604 && aBool9558);
	}

	final synchronized void method17906(int i) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i);
		aClass708_11524.method14236(class523_sub24, -1706351114);
	}

	Interface39 method15233(int i, boolean bool, int[][] is) {
		return new Class492_Sub2(this, i, bool, is);
	}

	public boolean method3205() {
		return true;
	}

	void method15192() {
		OpenGL.glDepthMask(aBool9604 && aBool9558);
	}

	void method15309() {
		OpenGL.glDepthMask(aBool9604 && aBool9558);
	}

	static final int method17907(Class361 class361) {
		if (class361 == Class361.aClass361_3741)
			return 5890;
		if (class361 == Class361.aClass361_3742)
			return 34167;
		if (class361 == Class361.aClass361_3744)
			return 34168;
		if (class361 == Class361.aClass361_3740)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method15197() {
		if (aBool9674 && !aBool9548)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	Interface41 method15235(Class158 class158, Class170 class170, int i, int i_158_) {
		return new Class492_Sub1(this, class158, class170, i, i_158_);
	}

	void method14953() {
		if (aBool9674 && !aBool9548)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	final synchronized void method17908(int i, int i_159_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_159_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11490.method14236(class523_sub24, -352636273);
	}

	void method15211() {
		aFloatArray11521[0] = aFloat9643 * aFloat9689;
		aFloatArray11521[1] = aFloat9643 * aFloat9614;
		aFloatArray11521[2] = aFloat9643 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11521, 0);
	}

	final void method15127(int i, Class361 class361, boolean bool, boolean bool_160_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method17891(class361));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_160_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_160_ ? 769 : 768);
	}

	void method15212() {
		if (aBool9679) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method15204() {
		aFloatArray11521[0] = aFloat9617 * aFloat9689;
		aFloatArray11521[1] = aFloat9617 * aFloat9614;
		aFloatArray11521[2] = aFloat9617 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray11521, 0);
		aFloatArray11521[0] = -aFloat9618 * aFloat9689;
		aFloatArray11521[1] = -aFloat9618 * aFloat9614;
		aFloatArray11521[2] = -aFloat9618 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray11521, 0);
	}

	void method15205() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9608, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9582, 0);
	}

	void method15071() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9608, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9582, 0);
	}

	void method15206() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9608, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9582, 0);
	}

	void method15207() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9608, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9582, 0);
	}

	void method15208() {
		/* empty */
	}

	void method15209() {
		/* empty */
	}

	void method15210() {
		if (aBool9679) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method15115() {
		if (aBool9679) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public void method14943(Class345 class345) {
		Class378[] class378s = class345.aClass378Array3630;
		int i = 0;
		boolean bool = false;
		boolean bool_161_ = false;
		boolean bool_162_ = false;
		for (int i_163_ = 0; i_163_ < class378s.length; i_163_++) {
			Class378 class378 = class378s[i_163_];
			Class490_Sub1 class490_sub1 = aClass490_Sub1Array11502[i_163_];
			int i_164_ = 0;
			int i_165_ = class490_sub1.method15712();
			long l = class490_sub1.method8051();
			class490_sub1.method8050();
			for (int i_166_ = 0; i_166_ < class378.method6388(); i_166_++) {
				Class344 class344 = class378.method6395(i_166_);
				switch (class344.anInt3623) {
				case 3:
					OpenGL.glVertexPointer(3, 5126, i_165_, l + (long) i_164_);
					bool_162_ = true;
					break;
				case 10:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_165_, l + (long) i_164_);
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_165_, l + (long) i_164_);
					break;
				case 6:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_165_, l + (long) i_164_);
					break;
				case 1:
					OpenGL.glNormalPointer(5126, i_165_, l + (long) i_164_);
					bool_161_ = true;
					break;
				default:
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_165_, l + (long) i_164_);
					break;
				case 4:
					OpenGL.glColorPointer(4, 5121, i_165_, l + (long) i_164_);
					bool = true;
				}
				i_164_ += class344.anInt3626;
			}
		}
		if (aBool11500 != bool_162_) {
			if (bool_162_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11500 = bool_162_;
		}
		if (aBool11498 != bool_161_) {
			if (bool_161_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11498 = bool_161_;
		}
		if (aBool11499 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11499 = bool;
		}
		if (anInt11501 < i) {
			for (int i_167_ = anInt11501; i_167_ < i; i_167_++) {
				OpenGL.glClientActiveTexture(33984 + i_167_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11501 = i;
		} else if (anInt11501 > i) {
			for (int i_168_ = i; i_168_ < anInt11501; i_168_++) {
				OpenGL.glClientActiveTexture(33984 + i_168_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11501 = i;
		}
	}

	void method17909(int i, int i_169_) {
		method3066();
		method3161(i, i_169_, -2107487161);
		if (aBool11518) {
			aClass148_11491 = method3136(i, i_169_, false, true);
			aClass168_Sub1_11506 = method3248();
			aClass168_Sub1_11506.method14424(0, aClass148_11491.method2430());
			OpenGL.glGenBuffersARB(3, anIntArray11526, 0);
			for (int i_170_ = 0; i_170_ < 3; i_170_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11526[i_170_]);
				OpenGL.glBufferDataARBa(35051, i * i_169_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass148_11491 = method3136(i, i_169_, false, true);
			aClass168_Sub1_11506 = method3248();
			aClass168_Sub1_11506.method14424(0, aClass148_11491.method2430());
		}
	}

	void method15079() {
		if (aBool9679) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public final void method15314(Class376 class376, int i, int i_171_, int i_172_, int i_173_) {
		int i_174_;
		int i_175_;
		if (class376 == Class376.aClass376_3919) {
			i_174_ = 1;
			i_175_ = i_173_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_174_ = 3;
			i_175_ = i_173_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_174_ = 4;
			i_175_ = i_173_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_174_ = 6;
			i_175_ = i_173_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_174_ = 5;
			i_175_ = i_173_ + 2;
		} else {
			i_174_ = 0;
			i_175_ = i_173_;
		}
		Class170 class170 = aClass490_Sub2_11503.method276();
		OpenGL.glDrawElements(i_174_, i_175_, method17900(class170), (aClass490_Sub2_11503.method8051() + (long) (i_172_ * (class170.anInt1831 * 1602321003))));
	}

	void method15216() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass441_9629.aFloatArray4916, 0);
		int i;
		for (i = 0; i < anInt9602; i++) {
			Class523_Sub20 class523_sub20 = aClass523_Sub20Array9671[i];
			int i_176_ = class523_sub20.method16067(856453637);
			int i_177_ = 16386 + i;
			float f = class523_sub20.method16068((byte) 0) / 255.0F;
			aFloatArray11521[0] = (float) class523_sub20.method16062(2131811589);
			aFloatArray11521[1] = (float) class523_sub20.method16091(-2134806368);
			aFloatArray11521[2] = (float) class523_sub20.method16065(1695118508);
			aFloatArray11521[3] = 1.0F;
			OpenGL.glLightfv(i_177_, 4611, aFloatArray11521, 0);
			aFloatArray11521[0] = (float) (i_176_ >> 16 & 0xff) * f;
			aFloatArray11521[1] = (float) (i_176_ >> 8 & 0xff) * f;
			aFloatArray11521[2] = (float) (i_176_ & 0xff) * f;
			aFloatArray11521[3] = 1.0F;
			OpenGL.glLightfv(i_177_, 4609, aFloatArray11521, 0);
			OpenGL.glLightf(i_177_, 4617, (1.0F / (float) (class523_sub20.method16066(-1879460461) * class523_sub20.method16066(-1879460461))));
			OpenGL.glEnable(i_177_);
		}
		for (/**/; i < anInt9620; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method15065(Class158 class158, Class170 class170) {
		return true;
	}

	boolean method15218(Class158 class158, Class170 class170) {
		return true;
	}

	boolean method15219(Class158 class158, Class170 class170) {
		return true;
	}

	boolean method14930(Class158 class158, Class170 class170) {
		return true;
	}

	boolean method15221(Class158 class158, Class170 class170) {
		return aBool9687;
	}

	Interface37 method15183(Class158 class158, int i, int i_178_, boolean bool, byte[] is, int i_179_, int i_180_) {
		return new Class492_Sub1(this, class158, i, i_178_, bool, is, i_179_, i_180_);
	}

	Interface37 method14988(Class158 class158, int i, int i_181_, boolean bool, byte[] is, int i_182_, int i_183_) {
		return new Class492_Sub1(this, class158, i, i_181_, bool, is, i_182_, i_183_);
	}

	Interface37 method15229(Class158 class158, int i, int i_184_, boolean bool, float[] fs, int i_185_, int i_186_) {
		return new Class492_Sub1(this, class158, i, i_184_, bool, fs, i_185_, i_186_);
	}

	Interface37 method15014(int i, int i_187_, boolean bool, int[] is, int i_188_, int i_189_) {
		return new Class492_Sub1(this, i, i_187_, bool, is, i_188_, i_189_);
	}

	byte[] method17910(String string) {
		return method14925("gl", string);
	}

	Interface39 method15232(int i, boolean bool, int[][] is) {
		return new Class492_Sub2(this, i, bool, is);
	}

	void method14961() {
		if (aBool9675)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	Interface34 method15234(Class158 class158, int i, int i_190_, int i_191_, boolean bool, byte[] is) {
		return new Class492_Sub3(this, class158, i, i_190_, i_191_, bool, is);
	}

	public Class168_Sub1 method3022() {
		return new Class168_Sub1_Sub1_Sub2(this);
	}

	Interface41 method15013(Class158 class158, Class170 class170, int i, int i_192_) {
		return new Class492_Sub1(this, class158, class170, i, i_192_);
	}

	Interface41 method15237(Class158 class158, Class170 class170, int i, int i_193_) {
		return new Class492_Sub1(this, class158, class170, i, i_193_);
	}

	public void method15055() {
		int i = anIntArray11513[anInt9626];
		if (i != 0) {
			anIntArray11513[anInt9626] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	long method17911(int i, int i_194_, int[] is, int[] is_195_) {
		if (aBool11518) {
			if (aLongArray11527[anInt11488] != 0L) {
				OpenGL.glDeleteSync(aLongArray11527[anInt11488]);
				aLongArray11527[anInt11488] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray11526[anInt11488]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_196_ = 0; i_196_ < i * i_194_; i_196_++)
					is[i_196_] = anUnsafe9538.getInt(l + (long) (i_196_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11488 >= 3)
				anInt11488 = 0;
			return l;
		}
		if (aClass148_11491 == null)
			method17909(i, i_194_);
		if (aClass148_11523 == null)
			aClass148_11523 = method3376(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), false);
		else
			aClass148_11523.method2433(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), 0, 0);
		method3353(aClass168_Sub1_11506, -1732650785);
		method3076(1, -16777216);
		aClass148_11523.method2438(anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105);
		aClass148_11491.method2432(0, 0, i, i_194_, is, is_195_, 0, i);
		method3047(aClass168_Sub1_11506, (short) -5812);
		return 0L;
	}

	static final int method17912(Class374 class374) {
		if (class374 == Class374.aClass374_3909)
			return 7681;
		if (class374 == Class374.aClass374_3908)
			return 8448;
		if (class374 == Class374.aClass374_3912)
			return 34165;
		if (class374 == Class374.aClass374_3910)
			return 260;
		if (class374 == Class374.aClass374_3911)
			return 34023;
		throw new IllegalArgumentException();
	}

	final void method15251(int i, Class361 class361, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method17891(class361));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method15252(int i, Class361 class361, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method17891(class361));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method15265() {
		aFloatArray11521[0] = (float) (anInt9632 & 0xff0000) / 1.671168E7F;
		aFloatArray11521[1] = (float) (anInt9632 & 0xff00) / 65280.0F;
		aFloatArray11521[2] = (float) (anInt9632 & 0xff) / 255.0F;
		aFloatArray11521[3] = (float) (anInt9632 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray11521, 0);
	}

	void method15062() {
		aFloatArray11521[0] = aFloat9643 * aFloat9689;
		aFloatArray11521[1] = aFloat9643 * aFloat9614;
		aFloatArray11521[2] = aFloat9643 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11521, 0);
	}

	void method15266() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9665[anInt9626] != Class377.aClass377_3926)
			OpenGL.glLoadMatrixf(aClass441Array9547[anInt9626].method7134(aFloatArray11520), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method14986() {
		OpenGL.glActiveTexture(33984 + anInt9626);
	}

	void method15268() {
		OpenGL.glActiveTexture(33984 + anInt9626);
	}

	void method15269() {
		OpenGL.glTexEnvi(8960, 34161, method17895(aClass374Array9630[anInt9626]));
	}

	void method15023() {
		if (aBool9549)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method15114(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public Interface23 method3402(int i, int i_197_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_197_);
	}

	void method14945(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method15285() {
		if (aBool9563)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9672 & 0xff) / 255.0F);
		if (anInt9661 > 1) {
			if (aByte9672 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method15286() {
		if (aBool9563)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9672 & 0xff) / 255.0F);
		if (anInt9661 > 1) {
			if (aByte9672 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method15287() {
		if (aBool9563)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte9672 & 0xff) / 255.0F);
		if (anInt9661 > 1) {
			if (aByte9672 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method15191() {
		if (aBool9528) {
			int i = 0;
			int i_198_ = 0;
			if (anInt9653 == 0) {
				i = 0;
				i_198_ = 0;
			} else if (anInt9653 == 1) {
				i = 1;
				i_198_ = 0;
			} else if (anInt9653 == 2) {
				i = 1;
				i_198_ = 1;
			} else if (anInt9653 == 3) {
				i = 0;
				i_198_ = 1;
			}
			if (aClass363_9666 == Class363.aClass363_3752)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_198_);
			else if (aClass363_9666 == Class363.aClass363_3750)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_198_);
			else if (aClass363_9666 == Class363.aClass363_3753)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_198_);
			else if (aClass363_9666 == Class363.aClass363_3751)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_198_);
		} else if (aClass363_9666 == Class363.aClass363_3752) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass363_9666 == Class363.aClass363_3750) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass363_9666 == Class363.aClass363_3753) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	public Interface23 method3365(int i, int i_199_, int i_200_) {
		return new Class494(this, Class158.aClass158_1750, Class170.aClass170_1827, i, i_199_, i_200_);
	}

	void method15289() {
		if (aBool9549)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method15052() {
		aFloat9681 = aFloat9702 - (float) anInt9664;
		aFloat9683 = aFloat9681 - (float) anInt9663;
		if (aFloat9683 < aFloat9585)
			aFloat9683 = aFloat9585;
		if (aBool9647) {
			OpenGL.glFogf(2915, aFloat9683);
			OpenGL.glFogf(2916, aFloat9681);
			aFloatArray11521[0] = (float) (anInt9662 & 0xff0000) / 1.671168E7F;
			aFloatArray11521[1] = (float) (anInt9662 & 0xff00) / 65280.0F;
			aFloatArray11521[2] = (float) (anInt9662 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray11521, 0);
		}
	}

	Interface34 method15087(Class158 class158, int i, int i_201_, int i_202_, boolean bool, byte[] is) {
		return new Class492_Sub3(this, class158, i, i_201_, i_202_, bool, is);
	}

	void method15295() {
		if (aBool9573 && aBool9660 && anInt9663 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method15296() {
		if (aBool9573 && aBool9660 && anInt9663 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method15081() {
		if (aBool9573 && aBool9660 && anInt9663 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method15297(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method15298(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method15299(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	public boolean method3056() {
		if (aBool11518 && aLongArray11527[anInt11530] != 0L)
			return false;
		return true;
	}

	public final void method15310(Class376 class376, int i, int i_203_) {
		int i_204_;
		int i_205_;
		if (class376 == Class376.aClass376_3919) {
			i_204_ = 1;
			i_205_ = i_203_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_204_ = 3;
			i_205_ = i_203_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_204_ = 4;
			i_205_ = i_203_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_204_ = 6;
			i_205_ = i_203_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_204_ = 5;
			i_205_ = i_203_ + 2;
		} else {
			i_204_ = 0;
			i_205_ = i_203_;
		}
		OpenGL.glDrawArrays(i_204_, i, i_205_);
	}

	final Interface36 method15302(boolean bool) {
		return new Class490_Sub1(this, bool);
	}

	Class345 method15303(Class378[] class378s) {
		return new Class345_Sub1(class378s);
	}

	Class345 method15194(Class378[] class378s) {
		return new Class345_Sub1(class378s);
	}

	Class345 method15305(Class378[] class378s) {
		return new Class345_Sub1(class378s);
	}

	void method15276() {
		if (aBool9679) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method14987() {
		/* empty */
	}

	void method15256(Interface40 interface40) {
		aClass490_Sub2_11503 = (Class490_Sub2) interface40;
		aClass490_Sub2_11503.method8050();
	}

	public Class265 method15084(String string) {
		byte[] is = method17910(string);
		if (is == null)
			return null;
		Class279 class279 = method14926(is);
		return new Class265_Sub2(this, class279);
	}

	public void method3054() {
		if (aClass168_1938 != null) {
			int i = aClass168_1938.method2875();
			int i_206_ = aClass168_1938.method2874();
			if (i > 0 || i_206_ > 0) {
				int i_207_ = anInt9628;
				int i_208_ = anInt9649;
				int i_209_ = anInt9597;
				int i_210_ = anInt9598;
				method3067();
				int i_211_ = anInt9633;
				int i_212_ = anInt9590;
				int i_213_ = anInt9587;
				int i_214_ = anInt9588;
				method3071();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14935();
				method15024(false);
				method14982(false);
				method14978(false);
				method15249(false);
				method15001(null);
				method14960(1);
				method15018(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_206_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method3378(i_211_, i_213_, i_212_, i_214_);
				method3208(i_207_, i_208_, i_209_, i_210_);
			}
		}
	}

	final void method15007(int i, Class361 class361, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method17891(class361));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method15311(Interface40 interface40, Class376 class376, int i, int i_215_, int i_216_, int i_217_) {
		int i_218_;
		int i_219_;
		if (class376 == Class376.aClass376_3919) {
			i_218_ = 1;
			i_219_ = i_217_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_218_ = 3;
			i_219_ = i_217_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_218_ = 4;
			i_219_ = i_217_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_218_ = 6;
			i_219_ = i_217_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_218_ = 5;
			i_219_ = i_217_ + 2;
		} else {
			i_218_ = 0;
			i_219_ = i_217_;
		}
		Class170 class170 = interface40.method276();
		Class490_Sub2 class490_sub2 = (Class490_Sub2) interface40;
		class490_sub2.method8050();
		OpenGL.glDrawElements(i_218_, i_219_, method17900(class170), (class490_sub2.method8051() + (long) (i_216_ * (class170.anInt1831 * 1602321003))));
	}

	final void method15312(Interface40 interface40, Class376 class376, int i, int i_220_, int i_221_, int i_222_) {
		int i_223_;
		int i_224_;
		if (class376 == Class376.aClass376_3919) {
			i_223_ = 1;
			i_224_ = i_222_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_223_ = 3;
			i_224_ = i_222_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_223_ = 4;
			i_224_ = i_222_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_223_ = 6;
			i_224_ = i_222_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_223_ = 5;
			i_224_ = i_222_ + 2;
		} else {
			i_223_ = 0;
			i_224_ = i_222_;
		}
		Class170 class170 = interface40.method276();
		Class490_Sub2 class490_sub2 = (Class490_Sub2) interface40;
		class490_sub2.method8050();
		OpenGL.glDrawElements(i_223_, i_224_, method17900(class170), (class490_sub2.method8051() + (long) (i_221_ * (class170.anInt1831 * 1602321003))));
	}

	final void method15329(Interface40 interface40, Class376 class376, int i, int i_225_, int i_226_, int i_227_) {
		int i_228_;
		int i_229_;
		if (class376 == Class376.aClass376_3919) {
			i_228_ = 1;
			i_229_ = i_227_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_228_ = 3;
			i_229_ = i_227_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_228_ = 4;
			i_229_ = i_227_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_228_ = 6;
			i_229_ = i_227_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_228_ = 5;
			i_229_ = i_227_ + 2;
		} else {
			i_228_ = 0;
			i_229_ = i_227_;
		}
		Class170 class170 = interface40.method276();
		Class490_Sub2 class490_sub2 = (Class490_Sub2) interface40;
		class490_sub2.method8050();
		OpenGL.glDrawElements(i_228_, i_229_, method17900(class170), (class490_sub2.method8051() + (long) (i_226_ * (class170.anInt1831 * 1602321003))));
	}

	public final synchronized void method3428(int i) {
		try {
			method17903();
		} catch (Exception exception) {
			return;
		}
		int i_230_ = 0;
		i &= 0x7fffffff;
		while (!aClass708_11490.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11490.method14293(1930991005);
			anIntArray11497[i_230_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9648 -= class523_sub24.anInt10542 * -677457577;
			if (i_230_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_230_, anIntArray11497, 0);
				i_230_ = 0;
			}
		}
		if (i_230_ > 0) {
			OpenGL.glDeleteBuffersARB(i_230_, anIntArray11497, 0);
			i_230_ = 0;
		}
		while (!aClass708_11528.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11528.method14293(2079163932);
			anIntArray11497[i_230_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9530 -= class523_sub24.anInt10542 * -677457577;
			if (i_230_ == 1000) {
				OpenGL.glDeleteTextures(i_230_, anIntArray11497, 0);
				i_230_ = 0;
			}
		}
		if (i_230_ > 0) {
			OpenGL.glDeleteTextures(i_230_, anIntArray11497, 0);
			i_230_ = 0;
		}
		while (!aClass708_11524.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11524.method14293(2038863870);
			anIntArray11497[i_230_++] = class523_sub24.anInt10542 * -677457577;
			if (i_230_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_230_, anIntArray11497, 0);
				i_230_ = 0;
			}
		}
		if (i_230_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_230_, anIntArray11497, 0);
			i_230_ = 0;
		}
		while (!aClass708_11493.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11493.method14293(2133200790);
			anIntArray11497[i_230_++] = (int) (class523_sub24.aLong7065 * 1055205983951172633L);
			anInt9684 -= class523_sub24.anInt10542 * -677457577;
			if (i_230_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_230_, anIntArray11497, 0);
				i_230_ = 0;
			}
		}
		if (i_230_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_230_, anIntArray11497, 0);
			boolean bool = false;
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(1973270391);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		while (!aClass708_11494.method14237((byte) 104)) {
			Class523 class523 = aClass708_11494.method14293(2087055458);
			OpenGL.glDeleteProgram((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11495.method14237((byte) 104)) {
			Class523 class523 = aClass708_11495.method14293(2133697068);
			OpenGL.glDeleteShader((int) (class523.aLong7065 * 1055205983951172633L));
		}
		while (!aClass708_11510.method14237((byte) 104)) {
			Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass708_11510.method14293(2007094380);
			OpenGL.glDeleteLists((int) (class523_sub24.aLong7065 * 1055205983951172633L), class523_sub24.anInt10542 * -677457577);
		}
		if (method3025() > 100663296 && TimeUtils.getCurrentTimeMilliseconds(1516375036) > aLong11525 + 60000L) {
			System.gc();
			aLong11525 = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		}
		super.method3428(i);
	}

	public final void method15315(Class376 class376, int i, int i_231_, int i_232_, int i_233_) {
		int i_234_;
		int i_235_;
		if (class376 == Class376.aClass376_3919) {
			i_234_ = 1;
			i_235_ = i_233_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_234_ = 3;
			i_235_ = i_233_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_234_ = 4;
			i_235_ = i_233_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_234_ = 6;
			i_235_ = i_233_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_234_ = 5;
			i_235_ = i_233_ + 2;
		} else {
			i_234_ = 0;
			i_235_ = i_233_;
		}
		Class170 class170 = aClass490_Sub2_11503.method276();
		OpenGL.glDrawElements(i_234_, i_235_, method17900(class170), (aClass490_Sub2_11503.method8051() + (long) (i_232_ * (class170.anInt1831 * 1602321003))));
	}

	public final void method15316(Class376 class376, int i, int i_236_, int i_237_, int i_238_) {
		int i_239_;
		int i_240_;
		if (class376 == Class376.aClass376_3919) {
			i_239_ = 1;
			i_240_ = i_238_ * 2;
		} else if (class376 == Class376.aClass376_3915) {
			i_239_ = 3;
			i_240_ = i_238_ + 1;
		} else if (class376 == Class376.aClass376_3917) {
			i_239_ = 4;
			i_240_ = i_238_ * 3;
		} else if (class376 == Class376.aClass376_3918) {
			i_239_ = 6;
			i_240_ = i_238_ + 2;
		} else if (class376 == Class376.aClass376_3914) {
			i_239_ = 5;
			i_240_ = i_238_ + 2;
		} else {
			i_239_ = 0;
			i_240_ = i_238_;
		}
		Class170 class170 = aClass490_Sub2_11503.method276();
		OpenGL.glDrawElements(i_239_, i_240_, method17900(class170), (aClass490_Sub2_11503.method8051() + (long) (i_237_ * (class170.anInt1831 * 1602321003))));
	}

	void method15320(int i) {
		if (!aBool11519)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method15321(int i) {
		if (!aBool11519)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public float method15326() {
		return 0.0F;
	}

	void method15054() {
		if (aBool9675)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method15327() {
		if (aBool9675)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method15144() {
		if (aBool9675)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method15328() {
		if (aBool9675)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	Interface37 method15201(Class158 class158, Class170 class170, int i, int i_241_) {
		return method14999(class158, class170, i, i_241_);
	}

	Interface37 method15330(Class158 class158, Class170 class170, int i, int i_242_) {
		return method14999(class158, class170, i, i_242_);
	}

	Interface37 method15331(Class158 class158, Class170 class170, int i, int i_243_) {
		return method14999(class158, class170, i, i_243_);
	}

	public void method3157(boolean bool) {
		/* empty */
	}

	Interface37 method15333(Class158 class158, Class170 class170, int i, int i_244_) {
		return method14999(class158, class170, i, i_244_);
	}

	void method15334() {
		OpenGL.glTexEnvi(8960, 34162, method17895(aClass374Array9631[anInt9626]));
	}

	void method14947() {
		aFloatArray11521[0] = aFloat9643 * aFloat9689;
		aFloatArray11521[1] = aFloat9643 * aFloat9614;
		aFloatArray11521[2] = aFloat9643 * aFloat9704;
		aFloatArray11521[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray11521, 0);
	}

	byte[] method17913(String string) {
		return method14925("gl", string);
	}

	byte[] method17914(String string) {
		return method14925("gl", string);
	}

	long method17915(int i, int i_245_, int[] is, int[] is_246_) {
		if (aBool11518) {
			if (aLongArray11527[anInt11488] != 0L) {
				OpenGL.glDeleteSync(aLongArray11527[anInt11488]);
				aLongArray11527[anInt11488] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray11526[anInt11488]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_247_ = 0; i_247_ < i * i_245_; i_247_++)
					is[i_247_] = anUnsafe9538.getInt(l + (long) (i_247_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11488 >= 3)
				anInt11488 = 0;
			return l;
		}
		if (aClass148_11491 == null)
			method17909(i, i_245_);
		if (aClass148_11523 == null)
			aClass148_11523 = method3376(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), false);
		else
			aClass148_11523.method2433(0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), 0, 0);
		method3353(aClass168_Sub1_11506, 796754116);
		method3076(1, -16777216);
		aClass148_11523.method2438(anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105);
		aClass148_11491.method2432(0, 0, i, i_245_, is, is_246_, 0, i);
		method3047(aClass168_Sub1_11506, (short) -29776);
		return 0L;
	}

	void method17916(int i, int i_248_) {
		method3066();
		method3161(i, i_248_, -1107340969);
		if (aBool11518) {
			aClass148_11491 = method3136(i, i_248_, false, true);
			aClass168_Sub1_11506 = method3248();
			aClass168_Sub1_11506.method14424(0, aClass148_11491.method2430());
			OpenGL.glGenBuffersARB(3, anIntArray11526, 0);
			for (int i_249_ = 0; i_249_ < 3; i_249_++) {
				OpenGL.glBindBufferARB(35051, anIntArray11526[i_249_]);
				OpenGL.glBufferDataARBa(35051, i * i_248_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass148_11491 = method3136(i, i_248_, false, true);
			aClass168_Sub1_11506 = method3248();
			aClass168_Sub1_11506.method14424(0, aClass148_11491.method2430());
		}
	}

	public void method3076(int i, int i_250_) {
		int i_251_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_250_ & 0xff0000) / 1.671168E7F, (float) (i_250_ & 0xff00) / 65280.0F, (float) (i_250_ & 0xff) / 255.0F, (float) (i_250_ >>> 24) / 255.0F);
			i_251_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method15249(true);
			i_251_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_251_ |= 0x400;
		OpenGL.glClear(i_251_);
	}

	public boolean method3371() {
		return true;
	}

	static final int method17917(Class361 class361) {
		if (class361 == Class361.aClass361_3741)
			return 5890;
		if (class361 == Class361.aClass361_3742)
			return 34167;
		if (class361 == Class361.aClass361_3744)
			return 34168;
		if (class361 == Class361.aClass361_3740)
			return 34166;
		throw new IllegalArgumentException();
	}

	final synchronized void method17918(int i, int i_252_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_252_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11528.method14236(class523_sub24, 586091320);
	}

	static final int method17919(Class361 class361) {
		if (class361 == Class361.aClass361_3741)
			return 5890;
		if (class361 == Class361.aClass361_3742)
			return 34167;
		if (class361 == Class361.aClass361_3744)
			return 34168;
		if (class361 == Class361.aClass361_3740)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method17920() {
		if (anInt9673 == 1)
			OpenGL.glDisable(2884);
		else {
			OpenGL.glEnable(2884);
			if (anInt9673 == 2)
				OpenGL.glCullFace(1029);
			else if (anInt9673 == 3)
				OpenGL.glCullFace(1028);
		}
	}

	void method3158(int i, int i_253_) throws Exception_Sub4 {
		aClass168_Sub2_1939.method15400();
		if (anInterface25_1923 != null)
			anInterface25_1923.method20(1280271269);
	}

	public void method3216(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	void method14992() {
		OpenGL.glMatrixMode(5890);
		if (aClass377Array9665[anInt9626] != Class377.aClass377_3926)
			OpenGL.glLoadMatrixf(aClass441Array9547[anInt9626].method7134(aFloatArray11520), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	final synchronized void method17921(int i, int i_254_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_254_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11490.method14236(class523_sub24, 235272322);
	}

	Class345 method15031(Class378[] class378s) {
		return new Class345_Sub1(class378s);
	}

	final synchronized void method17922(int i, int i_255_) {
		Class523_Sub24 class523_sub24 = new Class523_Sub24(i_255_);
		class523_sub24.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11493.method14236(class523_sub24, 347396137);
	}

	final synchronized void method17923(int i) {
		Class523 class523 = new Class523();
		class523.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11494.method14236(class523, 443194948);
	}

	final synchronized void method17924(int i) {
		Class523 class523 = new Class523();
		class523.aLong7065 = (long) i * 2947252533757437993L;
		aClass708_11494.method14236(class523, 240870225);
	}

	void method15133() {
		if (aClass168_1938 != null)
			OpenGL.glViewport(anInt9619 + anInt9628, (anInt9600 + aClass168_1938.method2874() - anInt9649 - anInt9598), anInt9597, anInt9598);
		OpenGL.glDepthRange(aFloat9581, aFloat9605);
	}

	static final int method17925(Class170 class170) {
		switch (class170.anInt1830 * 1699851493) {
		case 5:
			return 5125;
		case 6:
			return 5126;
		case 4:
			return 5131;
		case 3:
			return 5124;
		case 2:
			return 5121;
		default:
			return 5121;
		case 8:
			return 5123;
		case 1:
			return 5120;
		case 0:
			return 5122;
		}
	}

	public void method15032(Class345 class345) {
		Class378[] class378s = class345.aClass378Array3630;
		int i = 0;
		boolean bool = false;
		boolean bool_256_ = false;
		boolean bool_257_ = false;
		for (int i_258_ = 0; i_258_ < class378s.length; i_258_++) {
			Class378 class378 = class378s[i_258_];
			Class490_Sub1 class490_sub1 = aClass490_Sub1Array11502[i_258_];
			int i_259_ = 0;
			int i_260_ = class490_sub1.method15712();
			long l = class490_sub1.method8051();
			class490_sub1.method8050();
			for (int i_261_ = 0; i_261_ < class378.method6388(); i_261_++) {
				Class344 class344 = class378.method6395(i_261_);
				switch (class344.anInt3623) {
				case 3:
					OpenGL.glVertexPointer(3, 5126, i_260_, l + (long) i_259_);
					bool_257_ = true;
					break;
				case 10:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_260_, l + (long) i_259_);
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_260_, l + (long) i_259_);
					break;
				case 6:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_260_, l + (long) i_259_);
					break;
				case 1:
					OpenGL.glNormalPointer(5126, i_260_, l + (long) i_259_);
					bool_256_ = true;
					break;
				default:
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_260_, l + (long) i_259_);
					break;
				case 4:
					OpenGL.glColorPointer(4, 5121, i_260_, l + (long) i_259_);
					bool = true;
				}
				i_259_ += class344.anInt3626;
			}
		}
		if (aBool11500 != bool_257_) {
			if (bool_257_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			aBool11500 = bool_257_;
		}
		if (aBool11498 != bool_256_) {
			if (bool_256_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			aBool11498 = bool_256_;
		}
		if (aBool11499 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			aBool11499 = bool;
		}
		if (anInt11501 < i) {
			for (int i_262_ = anInt11501; i_262_ < i; i_262_++) {
				OpenGL.glClientActiveTexture(33984 + i_262_);
				OpenGL.glEnableClientState(32888);
			}
			anInt11501 = i;
		} else if (anInt11501 > i) {
			for (int i_263_ = i; i_263_ < anInt11501; i_263_++) {
				OpenGL.glClientActiveTexture(33984 + i_263_);
				OpenGL.glDisableClientState(32888);
			}
			anInt11501 = i;
		}
	}

	static int method17926(Class158 class158) {
		switch (class158.anInt1742 * 178485697) {
		case 8:
			return 6408;
		case 6:
			return 6406;
		default:
			throw new IllegalStateException();
		case 5:
			return 6409;
		case 9:
			return 6402;
		case 7:
			return 6410;
		case 4:
			return 6407;
		}
	}

	static int method17927(Class158 class158) {
		switch (class158.anInt1742 * 178485697) {
		case 8:
			return 6408;
		case 6:
			return 6406;
		default:
			throw new IllegalStateException();
		case 5:
			return 6409;
		case 9:
			return 6402;
		case 7:
			return 6410;
		case 4:
			return 6407;
		}
	}

	void method3023() {
		super.method3023();
		if (anOpenGL11517 != null) {
			anOpenGL11517.method1670();
			anOpenGL11517.release();
			anOpenGL11517 = null;
		}
	}

	static int method17928(Class158 class158) {
		switch (class158.anInt1742 * 178485697) {
		case 8:
			return 6408;
		case 6:
			return 6406;
		default:
			throw new IllegalStateException();
		case 5:
			return 6409;
		case 9:
			return 6402;
		case 7:
			return 6410;
		case 4:
			return 6407;
		}
	}

	static int method17929(Class158 class158, Class170 class170) {
		if (class170 == Class170.aClass170_1822) {
			switch (class158.anInt1742 * 178485697) {
			case 6:
				return 6406;
			case 2:
				return 33777;
			case 4:
				return 6407;
			case 8:
				return 6408;
			case 7:
				return 6410;
			case 5:
				return 6409;
			case 0:
				return 33779;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class170 == Class170.aClass170_1826) {
			switch (class158.anInt1742 * 178485697) {
			case 8:
				return 32859;
			case 4:
				return 32852;
			default:
				throw new IllegalArgumentException();
			case 5:
				return 32834;
			case 6:
				return 32830;
			case 7:
				return 36219;
			case 9:
				return 33189;
			}
		}
		if (class170 == Class170.aClass170_1827) {
			switch (class158.anInt1742 * 178485697) {
			case 9:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class170 == Class170.aClass170_1829) {
			switch (class158.anInt1742 * 178485697) {
			case 9:
				return 33191;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class170 == Class170.aClass170_1832) {
			switch (class158.anInt1742 * 178485697) {
			case 5:
				return 34846;
			case 6:
				return 34844;
			case 7:
				return 34847;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34843;
			case 8:
				return 34842;
			}
		}
		if (class170 == Class170.aClass170_1825) {
			switch (class158.anInt1742 * 178485697) {
			case 7:
				return 34841;
			case 8:
				return 34836;
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34837;
			case 6:
				return 34838;
			case 5:
				return 34840;
			}
		}
		throw new IllegalArgumentException();
	}

	void method17930() {
		int i = 0;
		while (!anOpenGL11517.method1669()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class653.method10656(1000L);
		}
	}
}
