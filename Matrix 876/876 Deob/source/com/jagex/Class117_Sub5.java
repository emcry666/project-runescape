/* Class117_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub5 extends Class117 {
	static final String aString8961 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBool8962 = false;
	static final String aString8963 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	Class136 aClass136_8964;
	boolean aBool8965 = false;
	Class132 aClass132_8966;

	void method2010(int i, int i_0_) {
		if (aBool8962) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = aClass136_8964.anInt1593;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * aClass178_Sub1_1434.anInt9436 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	void method2025(int i, int i_5_) {
		if (aBool8962) {
			int i_6_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_7_ = i_5_ & 0xffff;
			float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
			int i_9_ = aClass136_8964.anInt1593;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"), (float) (i_6_ * aClass178_Sub1_1434.anInt9436 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterDepth"), (float) i_7_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterOffset"), f_8_);
		}
	}

	void method2026(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8965 && class126_sub1 != null) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8966.aClass126_Sub3_1566);
			int i = aClass136_8964.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356, aClass178_Sub1_1434.aFloat9357, aClass178_Sub1_1434.aFloat9268, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8962 = true;
		}
	}

	void method2011(boolean bool) {
		/* empty */
	}

	void method2020(boolean bool) {
		/* empty */
	}

	boolean method2016() {
		return aBool8965;
	}

	void method2013(Class126 class126, int i) {
		if (!aBool8962) {
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	void method2012() {
		if (aBool8962) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8962 = false;
		}
	}

	boolean method2022() {
		return aBool8965;
	}

	Class117_Sub5(Class178_Sub1 class178_sub1, Class132 class132) {
		super(class178_sub1);
		aClass132_8966 = class132;
		if (aClass132_8966.aClass126_Sub3_1566 != null && aClass178_Sub1_1434.aBool9413 && aClass178_Sub1_1434.aBool9315) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1434, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class134 class134_10_ = (Class134.method2267(aClass178_Sub1_1434, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			aClass136_8964 = Class136.method2277(aClass178_Sub1_1434, new Class134[] { class134, class134_10_ });
			aBool8965 = aClass136_8964 != null;
		}
	}

	void method2017(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8965 && class126_sub1 != null) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8966.aClass126_Sub3_1566);
			int i = aClass136_8964.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356, aClass178_Sub1_1434.aFloat9357, aClass178_Sub1_1434.aFloat9268, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8962 = true;
		}
	}

	void method2018(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8965 && class126_sub1 != null) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8966.aClass126_Sub3_1566);
			int i = aClass136_8964.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356, aClass178_Sub1_1434.aFloat9357, aClass178_Sub1_1434.aFloat9268, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8962 = true;
		}
	}

	void method2019(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8965 && class126_sub1 != null) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8966.aClass126_Sub3_1566);
			int i = aClass136_8964.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356, aClass178_Sub1_1434.aFloat9357, aClass178_Sub1_1434.aFloat9268, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8962 = true;
		}
	}

	void method2023(Class126 class126, int i) {
		if (!aBool8962) {
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	void method2008(boolean bool) {
		/* empty */
	}

	void method2015() {
		if (aBool8962) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8962 = false;
		}
	}

	void method2028() {
		if (aBool8962) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8962 = false;
		}
	}

	void method2024() {
		if (aBool8962) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8962 = false;
		}
	}

	boolean method2009() {
		return aBool8965;
	}

	void method2021(int i, int i_11_) {
		if (aBool8962) {
			int i_12_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_13_ = i_11_ & 0xffff;
			float f_14_ = (float) (i_11_ >> 16 & 0x3) / 8.0F;
			int i_15_ = aClass136_8964.anInt1593;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"), (float) (i_12_ * aClass178_Sub1_1434.anInt9436 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterDepth"), (float) i_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterOffset"), f_14_);
		}
	}

	void method2027(Class126 class126, int i) {
		if (!aBool8962) {
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	boolean method2014() {
		return aBool8965;
	}
}
