/* Class523_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class523_Sub17_Sub1 extends Class523_Sub17 {
	static float aFloat11401;
	static float aFloat11402;
	static float aFloat11403;
	static final String aString11404 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
	static float aFloat11405;
	static float aFloat11406 = 1.0F;
	Class136 aClass136_11407;

	boolean method16011() {
		if (aClass178_Sub1_10482.aBool9315) {
			aClass136_11407 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass136_11407 != null;
		}
		return false;
	}

	void method16022(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_0_, int i_1_, int i_2_) {
		int i_3_ = aClass136_11407.anInt1593;
		OpenGL.glUseProgram(i_3_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3_, "paramsGamma"), aFloat11406);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_, "paramsRanges"), aFloat11402, aFloat11403, aFloat11401, aFloat11405);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(class126_sub2);
	}

	boolean method16023() {
		return aClass136_11407 != null;
	}

	boolean method16009() {
		if (aClass178_Sub1_10482.aBool9315) {
			aClass136_11407 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass136_11407 != null;
		}
		return false;
	}

	void method16003(int i, int i_4_) {
		/* empty */
	}

	boolean method16002() {
		return (aFloat11406 == 1.0F && aFloat11402 == 0.0F && aFloat11403 == 1.0F && aFloat11401 == 0.0F && aFloat11405 == 1.0F);
	}

	boolean method17806() {
		return aClass178_Sub1_10482.aBool9315;
	}

	void method16005(int i) {
		OpenGL.glUseProgram(0);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(null);
	}

	Class170 method16012() {
		return Class170.aClass170_1822;
	}

	int method16030() {
		return 1;
	}

	Class523_Sub17_Sub1(Class178_Sub1 class178_sub1) {
		super(class178_sub1);
	}

	static {
		aFloat11402 = 0.0F;
		aFloat11403 = 1.0F;
		aFloat11401 = 0.0F;
		aFloat11405 = 1.0F;
	}

	boolean method16026() {
		return aClass136_11407 != null;
	}

	boolean method17807() {
		return aClass178_Sub1_10482.aBool9315;
	}

	boolean method16014() {
		if (aClass178_Sub1_10482.aBool9315) {
			aClass136_11407 = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return aClass136_11407 != null;
		}
		return false;
	}

	boolean method17808() {
		return aClass178_Sub1_10482.aBool9315;
	}

	void method16016() {
		aClass136_11407 = null;
	}

	void method16021(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_5_, int i_6_, int i_7_) {
		int i_8_ = aClass136_11407.anInt1593;
		OpenGL.glUseProgram(i_8_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "paramsGamma"), aFloat11406);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_8_, "paramsRanges"), aFloat11402, aFloat11403, aFloat11401, aFloat11405);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(class126_sub2);
	}

	void method15999() {
		aClass136_11407 = null;
	}

	void method16019(int i, int i_9_) {
		/* empty */
	}

	void method16020(int i, int i_10_) {
		/* empty */
	}

	void method16015() {
		aClass136_11407 = null;
	}

	void method16018(int i, int i_11_) {
		/* empty */
	}

	void method16025(int i) {
		OpenGL.glUseProgram(0);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(null);
	}

	int method16028() {
		return 1;
	}

	int method16029() {
		return 1;
	}

	void method16017() {
		aClass136_11407 = null;
	}

	Class170 method16008() {
		return Class170.aClass170_1822;
	}

	void method16004(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_12_, int i_13_, int i_14_) {
		int i_15_ = aClass136_11407.anInt1593;
		OpenGL.glUseProgram(i_15_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_15_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "paramsGamma"), aFloat11406);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_15_, "paramsRanges"), aFloat11402, aFloat11403, aFloat11401, aFloat11405);
		aClass178_Sub1_10482.method14673(0);
		aClass178_Sub1_10482.method14711(class126_sub2);
	}

	int method16007() {
		return 1;
	}

	boolean method17809() {
		return aClass178_Sub1_10482.aBool9315;
	}

	boolean method17810() {
		return aClass178_Sub1_10482.aBool9315;
	}

	boolean method16034() {
		return (aFloat11406 == 1.0F && aFloat11402 == 0.0F && aFloat11403 == 1.0F && aFloat11401 == 0.0F && aFloat11405 == 1.0F);
	}
}
