/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class156 {
	static final String aString1737 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
	Class178_Sub1 aClass178_Sub1_1738;
	Class136 aClass136_1739;

	boolean method2548(Class126_Sub3 class126_sub3, Class126_Sub3 class126_sub3_0_, float f) {
		if (!method2549())
			return false;
		Class168_Sub1_Sub3 class168_sub1_sub3 = aClass178_Sub1_1738.aClass168_Sub1_Sub3_9423;
		Class523_Sub27_Sub3 class523_sub27_sub3 = new Class523_Sub27_Sub3(aClass178_Sub1_1738, Class158.aClass158_1743, Class170.aClass170_1822, class126_sub3.anInt8911, class126_sub3.anInt8912);
		boolean bool = false;
		aClass178_Sub1_1738.method3353(class168_sub1_sub3, 199383519);
		class168_sub1_sub3.method14424(0, class523_sub27_sub3);
		if (class168_sub1_sub3.method14426()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, class126_sub3.anInt8911, class126_sub3.anInt8912);
			OpenGL.glUseProgram(aClass136_1739.anInt1593);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass136_1739.anInt1593), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass136_1739.anInt1593), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass136_1739.anInt1593), "sampleSize"), 1.0F / (float) class126_sub3_0_.anInt8911, 1.0F / (float) class126_sub3_0_.anInt8912);
			for (int i = 0; i < class126_sub3.anInt8913; i++) {
				float f_1_ = (float) i / (float) class126_sub3.anInt8913;
				aClass178_Sub1_1738.method14711(class126_sub3_0_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class126_sub3.method14400(0, 0, i, class126_sub3.anInt8911, class126_sub3.anInt8912, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class168_sub1_sub3.method14424(0, null);
		aClass178_Sub1_1738.method3047(class168_sub1_sub3, (short) -5442);
		return bool;
	}

	boolean method2549() {
		if (aClass178_Sub1_1738.aBool9398 && aClass178_Sub1_1738.aBool9315 && aClass136_1739 == null) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1738, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class134 != null)
				aClass136_1739 = Class136.method2277(aClass178_Sub1_1738, new Class134[] { class134 });
		}
		return aClass136_1739 != null;
	}

	boolean method2550() {
		if (aClass178_Sub1_1738.aBool9398 && aClass178_Sub1_1738.aBool9315 && aClass136_1739 == null) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1738, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class134 != null)
				aClass136_1739 = Class136.method2277(aClass178_Sub1_1738, new Class134[] { class134 });
		}
		return aClass136_1739 != null;
	}

	boolean method2551() {
		if (aClass178_Sub1_1738.aBool9398 && aClass178_Sub1_1738.aBool9315 && aClass136_1739 == null) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1738, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class134 != null)
				aClass136_1739 = Class136.method2277(aClass178_Sub1_1738, new Class134[] { class134 });
		}
		return aClass136_1739 != null;
	}

	boolean method2552() {
		if (aClass178_Sub1_1738.aBool9398 && aClass178_Sub1_1738.aBool9315 && aClass136_1739 == null) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1738, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class134 != null)
				aClass136_1739 = Class136.method2277(aClass178_Sub1_1738, new Class134[] { class134 });
		}
		return aClass136_1739 != null;
	}

	boolean method2553() {
		if (aClass178_Sub1_1738.aBool9398 && aClass178_Sub1_1738.aBool9315 && aClass136_1739 == null) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1738, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class134 != null)
				aClass136_1739 = Class136.method2277(aClass178_Sub1_1738, new Class134[] { class134 });
		}
		return aClass136_1739 != null;
	}

	Class156(Class178_Sub1 class178_sub1) {
		aClass178_Sub1_1738 = class178_sub1;
	}
}
