/* Class117_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub2 extends Class117 {
	Class132 aClass132_8896;
	static final String aString8897 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	Class136 aClass136_8898;
	static final String aString8899 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBool8900;
	boolean aBool8901 = false;

	boolean method2014() {
		return aBool8900;
	}

	boolean method2009() {
		return aBool8900;
	}

	Class117_Sub2(Class178_Sub1 class178_sub1, Class132 class132) {
		super(class178_sub1);
		aBool8900 = false;
		aClass132_8896 = class132;
		if (aClass132_8896.aClass126_Sub3_1566 != null && aClass178_Sub1_1434.aBool9413 && aClass178_Sub1_1434.aBool9315) {
			Class134 class134 = (Class134.method2267(aClass178_Sub1_1434, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class134 class134_0_ = (Class134.method2267(aClass178_Sub1_1434, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			aClass136_8898 = Class136.method2277(aClass178_Sub1_1434, new Class134[] { class134, class134_0_ });
			aBool8900 = aClass136_8898 != null;
		}
	}

	void method2011(boolean bool) {
		/* empty */
	}

	void method2028() {
		if (aBool8901) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8901 = false;
		}
	}

	void method2010(int i, int i_1_) {
		if (aBool8901) {
			int i_2_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_3_ = i_1_ & 0xffff;
			float f_4_ = (float) (i_1_ >> 16 & 0x3) / 8.0F;
			float f_5_ = (float) (i_1_ >> 19 & 0xf) / 16.0F;
			float f_6_ = (float) (i_1_ >> 23 & 0xf) / 16.0F;
			int i_7_ = i_1_ >> 27 & 0xf;
			int i_8_ = aClass136_8898.anInt1593;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "time"), (float) (i_2_ * aClass178_Sub1_1434.anInt9436 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "breakWaterDepth"), (float) i_3_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "breakWaterOffset"), f_4_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_8_, "waveIntensity"), f_6_, f_5_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "waveExponent"), (float) i_7_);
		}
	}

	void method2025(int i, int i_9_) {
		if (aBool8901) {
			int i_10_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_11_ = i_9_ & 0xffff;
			float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
			float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
			float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
			int i_15_ = i_9_ >> 27 & 0xf;
			int i_16_ = aClass136_8898.anInt1593;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"), (float) (i_10_ * aClass178_Sub1_1434.anInt9436 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterDepth"), (float) i_11_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterOffset"), f_12_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_, "waveIntensity"), f_14_, f_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "waveExponent"), (float) i_15_);
		}
	}

	void method2013(Class126 class126, int i) {
		if (!aBool8901) {
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	boolean method2022() {
		return aBool8900;
	}

	boolean method2016() {
		return aBool8900;
	}

	void method2017(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8900 && class126_sub1 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass178_Sub1_1434.aFloatArray9277[1])) * 2.0F;
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8896.aClass126_Sub3_1566);
			int i = aClass136_8898.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356 * f, aClass178_Sub1_1434.aFloat9357 * f, aClass178_Sub1_1434.aFloat9268 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8901 = true;
		}
	}

	void method2018(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8900 && class126_sub1 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass178_Sub1_1434.aFloatArray9277[1])) * 2.0F;
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8896.aClass126_Sub3_1566);
			int i = aClass136_8898.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356 * f, aClass178_Sub1_1434.aFloat9357 * f, aClass178_Sub1_1434.aFloat9268 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8901 = true;
		}
	}

	void method2019(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8900 && class126_sub1 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass178_Sub1_1434.aFloatArray9277[1])) * 2.0F;
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8896.aClass126_Sub3_1566);
			int i = aClass136_8898.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356 * f, aClass178_Sub1_1434.aFloat9357 * f, aClass178_Sub1_1434.aFloat9268 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8901 = true;
		}
	}

	void method2024() {
		if (aBool8901) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8901 = false;
		}
	}

	void method2008(boolean bool) {
		/* empty */
	}

	void method2015() {
		if (aBool8901) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8901 = false;
		}
	}

	void method2012() {
		if (aBool8901) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(null);
			OpenGL.glUseProgram(0);
			aBool8901 = false;
		}
	}

	void method2021(int i, int i_17_) {
		if (aBool8901) {
			int i_18_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_19_ = i_17_ & 0xffff;
			float f_20_ = (float) (i_17_ >> 16 & 0x3) / 8.0F;
			float f_21_ = (float) (i_17_ >> 19 & 0xf) / 16.0F;
			float f_22_ = (float) (i_17_ >> 23 & 0xf) / 16.0F;
			int i_23_ = i_17_ >> 27 & 0xf;
			int i_24_ = aClass136_8898.anInt1593;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "time"), (float) (i_18_ * aClass178_Sub1_1434.anInt9436 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterDepth"), (float) i_19_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterOffset"), f_20_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_24_, "waveIntensity"), f_22_, f_21_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "waveExponent"), (float) i_23_);
		}
	}

	void method2020(boolean bool) {
		/* empty */
	}

	void method2026(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aBool8900 && class126_sub1 != null) {
			float f = 1.0F + (1.0F - Math.abs(aClass178_Sub1_1434.aFloatArray9277[1])) * 2.0F;
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			aClass178_Sub1_1434.method14673(0);
			aClass178_Sub1_1434.method14711(aClass132_8896.aClass126_Sub3_1566);
			int i = aClass136_8898.anInt1593;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -aClass178_Sub1_1434.aFloatArray9277[0], -aClass178_Sub1_1434.aFloatArray9277[1], -aClass178_Sub1_1434.aFloatArray9277[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), aClass178_Sub1_1434.aFloat9356 * f, aClass178_Sub1_1434.aFloat9357 * f, aClass178_Sub1_1434.aFloat9268 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(aClass178_Sub1_1434.aFloatArray9277[1]) * 928.0F);
			aBool8901 = true;
		}
	}

	void method2027(Class126 class126, int i) {
		if (!aBool8901) {
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	void method2023(Class126 class126, int i) {
		if (!aBool8901) {
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}
}
