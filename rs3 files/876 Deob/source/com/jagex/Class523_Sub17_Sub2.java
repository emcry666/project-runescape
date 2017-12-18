/* Class523_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class523_Sub17_Sub2 extends Class523_Sub17 {
	static final String aString11454 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static float aFloat11455;
	static int anInt11456;
	static final String aString11457 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11458 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
	static final String aString11459 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11460 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static float[] aFloatArray11461 = { 0.0F, 0.0F, 0.0F };
	static final String aString11462 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
	static final String aString11463 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11464 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static Class165_Sub1[] aClass165_Sub1Array11465;
	Class136[] aClass136Array11466 = null;

	void method16015() {
		if (aClass136Array11466 != null) {
			for (int i = 0; i < aClass136Array11466.length; i++)
				aClass136Array11466[i] = null;
			aClass136Array11466 = null;
		}
	}

	boolean method17867() {
		return aClass178_Sub1_10482.aBool9315;
	}

	void method16005(int i) {
		OpenGL.glUseProgram(0);
		for (int i_0_ = anInt11456; i_0_ >= 0; i_0_--) {
			aClass178_Sub1_10482.method14673(i_0_);
			aClass178_Sub1_10482.method14711(null);
		}
	}

	boolean method16009() {
		if (aClass178_Sub1_10482.aBool9315) {
			aClass136Array11466 = new Class136[3];
			if (aClass178_Sub1_10482.aBool9325) {
				aClass136Array11466[0] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[1] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[2] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass136Array11466[i] == null)
						return false;
				}
			} else {
				aClass136Array11466[0] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[1] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[2] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass136Array11466[i] == null)
						return false;
				}
			}
			return aClass136Array11466 != null;
		}
		return false;
	}

	void method16003(int i, int i_1_) {
		/* empty */
	}

	boolean method16023() {
		return aClass136Array11466 != null;
	}

	void method16004(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_2_, int i_3_, int i_4_) {
		if (anInt11456 >= 1 && anInt11456 <= 3) {
			int i_5_ = aClass136Array11466[anInt11456 - 1].anInt1593;
			OpenGL.glUseProgram(i_5_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_5_, "paramsWeightings"), aFloat11455, aFloatArray11461[0], aFloatArray11461[1], aFloatArray11461[2]);
			aClass178_Sub1_10482.method14673(0);
			aClass178_Sub1_10482.method14711(class126_sub2);
			for (int i_6_ = anInt11456 - 1; i_6_ >= 0; i_6_--) {
				if (aClass165_Sub1Array11465[i_6_] != null) {
					if (i_6_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "remap_1"), 1);
					if (i_6_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "remap_2"), 2);
					if (i_6_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "remap_3"), 3);
					aClass178_Sub1_10482.method14673(i_6_ + 1);
					Class126 class126 = aClass165_Sub1Array11465[i_6_].method14607();
					if (class126 != null)
						aClass178_Sub1_10482.method14711(class126);
				}
			}
		}
	}

	int method16028() {
		return 2;
	}

	Class170 method16012() {
		return Class170.aClass170_1822;
	}

	int method16007() {
		return 2;
	}

	boolean method16002() {
		return (aFloat11455 == 1.0F || (aFloatArray11461[0] + aFloatArray11461[1] + aFloatArray11461[2]) == 0.0F || (aClass165_Sub1Array11465[0] == null && aClass165_Sub1Array11465[1] == null && aClass165_Sub1Array11465[2] == null));
	}

	void method16022(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_7_, int i_8_, int i_9_) {
		if (anInt11456 >= 1 && anInt11456 <= 3) {
			int i_10_ = aClass136Array11466[anInt11456 - 1].anInt1593;
			OpenGL.glUseProgram(i_10_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_10_, "paramsWeightings"), aFloat11455, aFloatArray11461[0], aFloatArray11461[1], aFloatArray11461[2]);
			aClass178_Sub1_10482.method14673(0);
			aClass178_Sub1_10482.method14711(class126_sub2);
			for (int i_11_ = anInt11456 - 1; i_11_ >= 0; i_11_--) {
				if (aClass165_Sub1Array11465[i_11_] != null) {
					if (i_11_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "remap_1"), 1);
					if (i_11_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "remap_2"), 2);
					if (i_11_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "remap_3"), 3);
					aClass178_Sub1_10482.method14673(i_11_ + 1);
					Class126 class126 = aClass165_Sub1Array11465[i_11_].method14607();
					if (class126 != null)
						aClass178_Sub1_10482.method14711(class126);
				}
			}
		}
	}

	boolean method16026() {
		return aClass136Array11466 != null;
	}

	boolean method16011() {
		if (aClass178_Sub1_10482.aBool9315) {
			aClass136Array11466 = new Class136[3];
			if (aClass178_Sub1_10482.aBool9325) {
				aClass136Array11466[0] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[1] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[2] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass136Array11466[i] == null)
						return false;
				}
			} else {
				aClass136Array11466[0] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[1] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[2] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass136Array11466[i] == null)
						return false;
				}
			}
			return aClass136Array11466 != null;
		}
		return false;
	}

	void method16019(int i, int i_12_) {
		/* empty */
	}

	void method16018(int i, int i_13_) {
		/* empty */
	}

	void method16016() {
		if (aClass136Array11466 != null) {
			for (int i = 0; i < aClass136Array11466.length; i++)
				aClass136Array11466[i] = null;
			aClass136Array11466 = null;
		}
	}

	Class523_Sub17_Sub2(Class178_Sub1 class178_sub1) {
		super(class178_sub1);
	}

	boolean method16014() {
		if (aClass178_Sub1_10482.aBool9315) {
			aClass136Array11466 = new Class136[3];
			if (aClass178_Sub1_10482.aBool9325) {
				aClass136Array11466[0] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[1] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[2] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass136Array11466[i] == null)
						return false;
				}
			} else {
				aClass136Array11466[0] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[1] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				aClass136Array11466[2] = (Class136.method2277(aClass178_Sub1_10482, (new Class134[] { Class134.method2267(aClass178_Sub1_10482, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (aClass136Array11466[i] == null)
						return false;
				}
			}
			return aClass136Array11466 != null;
		}
		return false;
	}

	void method16017() {
		if (aClass136Array11466 != null) {
			for (int i = 0; i < aClass136Array11466.length; i++)
				aClass136Array11466[i] = null;
			aClass136Array11466 = null;
		}
	}

	void method16020(int i, int i_14_) {
		/* empty */
	}

	Class170 method16008() {
		return Class170.aClass170_1822;
	}

	boolean method17868() {
		return aClass178_Sub1_10482.aBool9315;
	}

	void method16025(int i) {
		OpenGL.glUseProgram(0);
		for (int i_15_ = anInt11456; i_15_ >= 0; i_15_--) {
			aClass178_Sub1_10482.method14673(i_15_);
			aClass178_Sub1_10482.method14711(null);
		}
	}

	void method15999() {
		if (aClass136Array11466 != null) {
			for (int i = 0; i < aClass136Array11466.length; i++)
				aClass136Array11466[i] = null;
			aClass136Array11466 = null;
		}
	}

	int method16029() {
		return 2;
	}

	int method16030() {
		return 2;
	}

	static {
		aFloat11455 = 1.0F;
		anInt11456 = 1;
		aClass165_Sub1Array11465 = new Class165_Sub1[] { null, null, null };
	}

	boolean method16034() {
		return (aFloat11455 == 1.0F || (aFloatArray11461[0] + aFloatArray11461[1] + aFloatArray11461[2]) == 0.0F || (aClass165_Sub1Array11465[0] == null && aClass165_Sub1Array11465[1] == null && aClass165_Sub1Array11465[2] == null));
	}

	boolean method17869() {
		return aClass178_Sub1_10482.aBool9315;
	}

	boolean method17870() {
		return aClass178_Sub1_10482.aBool9315;
	}

	void method16021(int i, Class126_Sub2 class126_sub2, Class126_Sub2 class126_sub2_16_, int i_17_, int i_18_) {
		if (anInt11456 >= 1 && anInt11456 <= 3) {
			int i_19_ = aClass136Array11466[anInt11456 - 1].anInt1593;
			OpenGL.glUseProgram(i_19_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_19_, "paramsWeightings"), aFloat11455, aFloatArray11461[0], aFloatArray11461[1], aFloatArray11461[2]);
			aClass178_Sub1_10482.method14673(0);
			aClass178_Sub1_10482.method14711(class126_sub2);
			for (int i_20_ = anInt11456 - 1; i_20_ >= 0; i_20_--) {
				if (aClass165_Sub1Array11465[i_20_] != null) {
					if (i_20_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "remap_1"), 1);
					if (i_20_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "remap_2"), 2);
					if (i_20_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "remap_3"), 3);
					aClass178_Sub1_10482.method14673(i_20_ + 1);
					Class126 class126 = aClass165_Sub1Array11465[i_20_].method14607();
					if (class126 != null)
						aClass178_Sub1_10482.method14711(class126);
				}
			}
		}
	}
}
