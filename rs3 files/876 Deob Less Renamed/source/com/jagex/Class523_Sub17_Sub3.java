/* Class523_Sub17_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class523_Sub17_Sub3 extends Class523_Sub17 {
	int anInt11594;
	static float aFloat11595 = 0.25F;
	static float aFloat11596 = 1.0F;
	static float aFloat11597 = 1.0F;
	static final int anInt11598 = 256;
	Class136 aClass136_11599;
	Class126_Sub2[] aClass126_Sub2Array11600;
	static final String aString11601 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
	Class136 aClass136_11602;
	Class168_Sub1_Sub3 aClass168_Sub1_Sub3_11603;
	Class126_Sub2 aClass126_Sub2_11604;
	Class126_Sub2 aClass126_Sub2_11605;
	static final String aString11606 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	int anInt11607;
	int anInt11608;
	int anInt11609;
	Class168_Sub1_Sub3 aClass168_Sub1_Sub3_11610;
	static final String aString11611 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class136 aClass136_11612;
	Class136 aClass136_11613;
	static final String aString11614 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	boolean method16026() {
		return aClass168_Sub1_Sub3_11610 != null;
	}

	boolean method17947() {
		return (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410);
	}

	boolean method16002() {
		return false;
	}

	void method16005(int i) {
		OpenGL.glUseProgram(0);
		aClass178_Sub1_10482.method14673(1);
		aClass178_Sub1_10482.method14711(null);
		aClass178_Sub1_10482.method14673(0);
	}

	void method16003(int i, int i_0_) {
		anInt11607 = i;
		anInt11608 = i_0_;
		int i_1_ = Class375.method6383(anInt11607, 189765723);
		int i_2_ = Class375.method6383(anInt11608, 189765723);
		if (anInt11609 != i_1_ || anInt11594 != i_2_) {
			if (aClass126_Sub2Array11600 != null) {
				for (int i_3_ = 0; i_3_ < aClass126_Sub2Array11600.length; i_3_++)
					aClass126_Sub2Array11600[i_3_].method2113();
				aClass126_Sub2Array11600 = null;
			}
			if (i_1_ > 256 || i_2_ > 256) {
				int i_4_ = i_1_;
				int i_5_ = i_2_;
				int i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
					i_6_++;
				}
				if (aClass168_Sub1_Sub3_11603 == null)
					aClass168_Sub1_Sub3_11603 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
				aClass126_Sub2Array11600 = new Class126_Sub2[i_6_];
				i_4_ = i_1_;
				i_5_ = i_2_;
				i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					aClass126_Sub2Array11600[i_6_++] = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), i_4_, i_5_);
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
				}
			} else
				aClass168_Sub1_Sub3_11603 = null;
			anInt11609 = i_1_;
			anInt11594 = i_2_;
		}
	}

	boolean method16023() {
		return aClass168_Sub1_Sub3_11610 != null;
	}

	void method16004(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_7_, int i_8_, int i_9_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass126_Sub2Array11600 != null) {
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11603, 288333306);
			int i_10_ = Class375.method6383(anInt11607, 189765723);
			int i_11_ = Class375.method6383(anInt11608, 189765723);
			int i_12_ = 0;
			while (i_10_ > 256 || i_11_ > 256) {
				OpenGL.glViewport(0, 0, i_10_, i_11_);
				aClass168_Sub1_Sub3_11603.method14424(0, aClass126_Sub2Array11600[i_12_].method14378(0));
				if (i_12_ == 0) {
					aClass178_Sub1_10482.method14711(class126_sub2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11608 - i_8_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_9_), (float) (anInt11608 - i_8_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_9_), (float) anInt11608);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11608);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass178_Sub1_10482.method14711(aClass126_Sub2Array11600[i_12_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_10_ > 256)
					i_10_ >>= 1;
				if (i_11_ > 256)
					i_11_ >>= 1;
				i_12_++;
			}
			aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11603, (short) -24291);
			aClass178_Sub1_10482.method14711(aClass126_Sub2Array11600[i_12_ - 1]);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, -834316819);
			aClass168_Sub1_Sub3_11610.method17790(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_13_ = aClass136_11613.anInt1593;
			OpenGL.glUseProgram(i_13_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_13_, "params"), aFloat11597, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass178_Sub1_10482.method14711(class126_sub2);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, 501766203);
			aClass168_Sub1_Sub3_11610.method17790(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_14_ = aClass136_11599.anInt1593;
			OpenGL.glUseProgram(i_14_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_14_, "params"), aFloat11597, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11607, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11607, (float) anInt11608);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11608);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass168_Sub1_Sub3_11610.method17790(1);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11604);
		int i_15_ = aClass136_11602.anInt1593;
		OpenGL.glUseProgram(i_15_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_15_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_15_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass168_Sub1_Sub3_11610.method17790(0);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11605);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_15_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -6601);
		int i_16_ = aClass136_11612.anInt1593;
		OpenGL.glUseProgram(i_16_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_16_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_16_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_16_, "params"), aFloat11595, aFloat11596, 0.0F);
		aClass178_Sub1_10482.method14673(1);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11604);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(class126_sub2);
	}

	void method16015() {
		anInt11594 = -1;
		anInt11609 = -1;
		aClass168_Sub1_Sub3_11603 = null;
		aClass126_Sub2Array11600 = null;
		aClass168_Sub1_Sub3_11610 = null;
		aClass126_Sub2_11604 = null;
		aClass126_Sub2_11605 = null;
		aClass136_11599 = null;
		aClass136_11613 = null;
		aClass136_11612 = null;
		aClass136_11602 = null;
	}

	Class170 method16012() {
		return Class170.aClass170_1832;
	}

	int method16007() {
		return 0;
	}

	int method16029() {
		return 0;
	}

	boolean method16034() {
		return false;
	}

	boolean method16011() {
		if (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410) {
			aClass168_Sub1_Sub3_11610 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
			aClass126_Sub2_11604 = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), 256, 256);
			aClass126_Sub2_11604.method14363(false, false);
			aClass126_Sub2_11605 = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), 256, 256);
			aClass126_Sub2_11605.method14363(false, false);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, 363079505);
			aClass168_Sub1_Sub3_11610.method14424(0, aClass126_Sub2_11604.method14378(0));
			aClass168_Sub1_Sub3_11610.method14424(1, aClass126_Sub2_11605.method14378(0));
			aClass168_Sub1_Sub3_11610.method17790(0);
			if (!aClass168_Sub1_Sub3_11610.method14426()) {
				aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -19749);
				return false;
			}
			aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -12846);
			aClass136_11599 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass136_11613 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass136_11612 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass136_11602 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass136_11613 != null && aClass136_11599 != null && aClass136_11612 != null && aClass136_11602 != null);
		}
		return false;
	}

	void method16020(int i, int i_17_) {
		anInt11607 = i;
		anInt11608 = i_17_;
		int i_18_ = Class375.method6383(anInt11607, 189765723);
		int i_19_ = Class375.method6383(anInt11608, 189765723);
		if (anInt11609 != i_18_ || anInt11594 != i_19_) {
			if (aClass126_Sub2Array11600 != null) {
				for (int i_20_ = 0; i_20_ < aClass126_Sub2Array11600.length; i_20_++)
					aClass126_Sub2Array11600[i_20_].method2113();
				aClass126_Sub2Array11600 = null;
			}
			if (i_18_ > 256 || i_19_ > 256) {
				int i_21_ = i_18_;
				int i_22_ = i_19_;
				int i_23_ = 0;
				while (i_21_ > 256 || i_22_ > 256) {
					if (i_21_ > 256)
						i_21_ >>= 1;
					if (i_22_ > 256)
						i_22_ >>= 1;
					i_23_++;
				}
				if (aClass168_Sub1_Sub3_11603 == null)
					aClass168_Sub1_Sub3_11603 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
				aClass126_Sub2Array11600 = new Class126_Sub2[i_23_];
				i_21_ = i_18_;
				i_22_ = i_19_;
				i_23_ = 0;
				while (i_21_ > 256 || i_22_ > 256) {
					aClass126_Sub2Array11600[i_23_++] = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), i_21_, i_22_);
					if (i_21_ > 256)
						i_21_ >>= 1;
					if (i_22_ > 256)
						i_22_ >>= 1;
				}
			} else
				aClass168_Sub1_Sub3_11603 = null;
			anInt11609 = i_18_;
			anInt11594 = i_19_;
		}
	}

	void method15999() {
		anInt11594 = -1;
		anInt11609 = -1;
		aClass168_Sub1_Sub3_11603 = null;
		aClass126_Sub2Array11600 = null;
		aClass168_Sub1_Sub3_11610 = null;
		aClass126_Sub2_11604 = null;
		aClass126_Sub2_11605 = null;
		aClass136_11599 = null;
		aClass136_11613 = null;
		aClass136_11612 = null;
		aClass136_11602 = null;
	}

	void method16016() {
		anInt11594 = -1;
		anInt11609 = -1;
		aClass168_Sub1_Sub3_11603 = null;
		aClass126_Sub2Array11600 = null;
		aClass168_Sub1_Sub3_11610 = null;
		aClass126_Sub2_11604 = null;
		aClass126_Sub2_11605 = null;
		aClass136_11599 = null;
		aClass136_11613 = null;
		aClass136_11612 = null;
		aClass136_11602 = null;
	}

	void method16017() {
		anInt11594 = -1;
		anInt11609 = -1;
		aClass168_Sub1_Sub3_11603 = null;
		aClass126_Sub2Array11600 = null;
		aClass168_Sub1_Sub3_11610 = null;
		aClass126_Sub2_11604 = null;
		aClass126_Sub2_11605 = null;
		aClass136_11599 = null;
		aClass136_11613 = null;
		aClass136_11612 = null;
		aClass136_11602 = null;
	}

	void method16018(int i, int i_24_) {
		anInt11607 = i;
		anInt11608 = i_24_;
		int i_25_ = Class375.method6383(anInt11607, 189765723);
		int i_26_ = Class375.method6383(anInt11608, 189765723);
		if (anInt11609 != i_25_ || anInt11594 != i_26_) {
			if (aClass126_Sub2Array11600 != null) {
				for (int i_27_ = 0; i_27_ < aClass126_Sub2Array11600.length; i_27_++)
					aClass126_Sub2Array11600[i_27_].method2113();
				aClass126_Sub2Array11600 = null;
			}
			if (i_25_ > 256 || i_26_ > 256) {
				int i_28_ = i_25_;
				int i_29_ = i_26_;
				int i_30_ = 0;
				while (i_28_ > 256 || i_29_ > 256) {
					if (i_28_ > 256)
						i_28_ >>= 1;
					if (i_29_ > 256)
						i_29_ >>= 1;
					i_30_++;
				}
				if (aClass168_Sub1_Sub3_11603 == null)
					aClass168_Sub1_Sub3_11603 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
				aClass126_Sub2Array11600 = new Class126_Sub2[i_30_];
				i_28_ = i_25_;
				i_29_ = i_26_;
				i_30_ = 0;
				while (i_28_ > 256 || i_29_ > 256) {
					aClass126_Sub2Array11600[i_30_++] = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), i_28_, i_29_);
					if (i_28_ > 256)
						i_28_ >>= 1;
					if (i_29_ > 256)
						i_29_ >>= 1;
				}
			} else
				aClass168_Sub1_Sub3_11603 = null;
			anInt11609 = i_25_;
			anInt11594 = i_26_;
		}
	}

	void method16019(int i, int i_31_) {
		anInt11607 = i;
		anInt11608 = i_31_;
		int i_32_ = Class375.method6383(anInt11607, 189765723);
		int i_33_ = Class375.method6383(anInt11608, 189765723);
		if (anInt11609 != i_32_ || anInt11594 != i_33_) {
			if (aClass126_Sub2Array11600 != null) {
				for (int i_34_ = 0; i_34_ < aClass126_Sub2Array11600.length; i_34_++)
					aClass126_Sub2Array11600[i_34_].method2113();
				aClass126_Sub2Array11600 = null;
			}
			if (i_32_ > 256 || i_33_ > 256) {
				int i_35_ = i_32_;
				int i_36_ = i_33_;
				int i_37_ = 0;
				while (i_35_ > 256 || i_36_ > 256) {
					if (i_35_ > 256)
						i_35_ >>= 1;
					if (i_36_ > 256)
						i_36_ >>= 1;
					i_37_++;
				}
				if (aClass168_Sub1_Sub3_11603 == null)
					aClass168_Sub1_Sub3_11603 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
				aClass126_Sub2Array11600 = new Class126_Sub2[i_37_];
				i_35_ = i_32_;
				i_36_ = i_33_;
				i_37_ = 0;
				while (i_35_ > 256 || i_36_ > 256) {
					aClass126_Sub2Array11600[i_37_++] = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), i_35_, i_36_);
					if (i_35_ > 256)
						i_35_ >>= 1;
					if (i_36_ > 256)
						i_36_ >>= 1;
				}
			} else
				aClass168_Sub1_Sub3_11603 = null;
			anInt11609 = i_32_;
			anInt11594 = i_33_;
		}
	}

	Class523_Sub17_Sub3(Class178_Sub1 class178_sub1) {
		super(class178_sub1);
	}

	void method16021(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_38_, int i_39_, int i_40_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass126_Sub2Array11600 != null) {
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11603, 1655266987);
			int i_41_ = Class375.method6383(anInt11607, 189765723);
			int i_42_ = Class375.method6383(anInt11608, 189765723);
			int i_43_ = 0;
			while (i_41_ > 256 || i_42_ > 256) {
				OpenGL.glViewport(0, 0, i_41_, i_42_);
				aClass168_Sub1_Sub3_11603.method14424(0, aClass126_Sub2Array11600[i_43_].method14378(0));
				if (i_43_ == 0) {
					aClass178_Sub1_10482.method14711(class126_sub2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11608 - i_39_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_40_), (float) (anInt11608 - i_39_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_40_), (float) anInt11608);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11608);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass178_Sub1_10482.method14711(aClass126_Sub2Array11600[i_43_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_41_ > 256)
					i_41_ >>= 1;
				if (i_42_ > 256)
					i_42_ >>= 1;
				i_43_++;
			}
			aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11603, (short) -29844);
			aClass178_Sub1_10482.method14711(aClass126_Sub2Array11600[i_43_ - 1]);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, -1849796677);
			aClass168_Sub1_Sub3_11610.method17790(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_44_ = aClass136_11613.anInt1593;
			OpenGL.glUseProgram(i_44_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_44_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_44_, "params"), aFloat11597, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass178_Sub1_10482.method14711(class126_sub2);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, -1458942009);
			aClass168_Sub1_Sub3_11610.method17790(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_45_ = aClass136_11599.anInt1593;
			OpenGL.glUseProgram(i_45_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_45_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_45_, "params"), aFloat11597, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11607, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11607, (float) anInt11608);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11608);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass168_Sub1_Sub3_11610.method17790(1);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11604);
		int i_46_ = aClass136_11602.anInt1593;
		OpenGL.glUseProgram(i_46_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_46_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_46_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass168_Sub1_Sub3_11610.method17790(0);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11605);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_46_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -5185);
		int i_47_ = aClass136_11612.anInt1593;
		OpenGL.glUseProgram(i_47_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_47_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_47_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_47_, "params"), aFloat11595, aFloat11596, 0.0F);
		aClass178_Sub1_10482.method14673(1);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11604);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(class126_sub2);
	}

	boolean method16014() {
		if (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410) {
			aClass168_Sub1_Sub3_11610 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
			aClass126_Sub2_11604 = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), 256, 256);
			aClass126_Sub2_11604.method14363(false, false);
			aClass126_Sub2_11605 = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), 256, 256);
			aClass126_Sub2_11605.method14363(false, false);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, 1493970558);
			aClass168_Sub1_Sub3_11610.method14424(0, aClass126_Sub2_11604.method14378(0));
			aClass168_Sub1_Sub3_11610.method14424(1, aClass126_Sub2_11605.method14378(0));
			aClass168_Sub1_Sub3_11610.method17790(0);
			if (!aClass168_Sub1_Sub3_11610.method14426()) {
				aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -28456);
				return false;
			}
			aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -4738);
			aClass136_11599 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass136_11613 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass136_11612 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass136_11602 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass136_11613 != null && aClass136_11599 != null && aClass136_11612 != null && aClass136_11602 != null);
		}
		return false;
	}

	void method16025(int i) {
		OpenGL.glUseProgram(0);
		aClass178_Sub1_10482.method14673(1);
		aClass178_Sub1_10482.method14711(null);
		aClass178_Sub1_10482.method14673(0);
	}

	int method16028() {
		return 0;
	}

	boolean method16009() {
		if (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410) {
			aClass168_Sub1_Sub3_11610 = new Class168_Sub1_Sub3(aClass178_Sub1_10482);
			aClass126_Sub2_11604 = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), 256, 256);
			aClass126_Sub2_11604.method14363(false, false);
			aClass126_Sub2_11605 = new Class126_Sub2(aClass178_Sub1_10482, 3553, Class158.aClass158_1743, method16012(), 256, 256);
			aClass126_Sub2_11605.method14363(false, false);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, 589382338);
			aClass168_Sub1_Sub3_11610.method14424(0, aClass126_Sub2_11604.method14378(0));
			aClass168_Sub1_Sub3_11610.method14424(1, aClass126_Sub2_11605.method14378(0));
			aClass168_Sub1_Sub3_11610.method17790(0);
			if (!aClass168_Sub1_Sub3_11610.method14426()) {
				aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -18322);
				return false;
			}
			aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -29566);
			aClass136_11599 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass136_11613 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			aClass136_11612 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			aClass136_11602 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (aClass136_11613 != null && aClass136_11599 != null && aClass136_11612 != null && aClass136_11602 != null);
		}
		return false;
	}

	int method16030() {
		return 0;
	}

	Class170 method16008() {
		return Class170.aClass170_1832;
	}

	boolean method17948() {
		return (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410);
	}

	void method16022(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_48_, int i_49_, int i_50_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (aClass126_Sub2Array11600 != null) {
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11603, -655221181);
			int i_51_ = Class375.method6383(anInt11607, 189765723);
			int i_52_ = Class375.method6383(anInt11608, 189765723);
			int i_53_ = 0;
			while (i_51_ > 256 || i_52_ > 256) {
				OpenGL.glViewport(0, 0, i_51_, i_52_);
				aClass168_Sub1_Sub3_11603.method14424(0, aClass126_Sub2Array11600[i_53_].method14378(0));
				if (i_53_ == 0) {
					aClass178_Sub1_10482.method14711(class126_sub2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (anInt11608 - i_49_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_50_), (float) (anInt11608 - i_49_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_50_), (float) anInt11608);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) anInt11608);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					aClass178_Sub1_10482.method14711(aClass126_Sub2Array11600[i_53_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_51_ > 256)
					i_51_ >>= 1;
				if (i_52_ > 256)
					i_52_ >>= 1;
				i_53_++;
			}
			aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11603, (short) -4119);
			aClass178_Sub1_10482.method14711(aClass126_Sub2Array11600[i_53_ - 1]);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, -9073077);
			aClass168_Sub1_Sub3_11610.method17790(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_54_ = aClass136_11613.anInt1593;
			OpenGL.glUseProgram(i_54_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_54_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_54_, "params"), aFloat11597, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			aClass178_Sub1_10482.method14711(class126_sub2);
			aClass178_Sub1_10482.method3353(aClass168_Sub1_Sub3_11610, -1422614517);
			aClass168_Sub1_Sub3_11610.method17790(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_55_ = aClass136_11599.anInt1593;
			OpenGL.glUseProgram(i_55_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_55_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_55_, "params"), aFloat11597, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) anInt11607, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) anInt11607, (float) anInt11608);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) anInt11608);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		aClass168_Sub1_Sub3_11610.method17790(1);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11604);
		int i_56_ = aClass136_11602.anInt1593;
		OpenGL.glUseProgram(i_56_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_56_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_56_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		aClass168_Sub1_Sub3_11610.method17790(0);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11605);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_56_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		aClass178_Sub1_10482.method3047(aClass168_Sub1_Sub3_11610, (short) -22734);
		int i_57_ = aClass136_11612.anInt1593;
		OpenGL.glUseProgram(i_57_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_57_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_57_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_57_, "params"), aFloat11595, aFloat11596, 0.0F);
		aClass178_Sub1_10482.method14673(1);
		aClass178_Sub1_10482.method14711(aClass126_Sub2_11604);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(class126_sub2);
	}

	boolean method17949() {
		return (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410);
	}

	boolean method17950() {
		return (aClass178_Sub1_10482.aBool9398 && aClass178_Sub1_10482.aBool9315 && aClass178_Sub1_10482.aBool9410);
	}
}
