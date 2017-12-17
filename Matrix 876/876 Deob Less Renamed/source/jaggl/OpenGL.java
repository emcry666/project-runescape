/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {
	long peer;
	private Hashtable aHashtable900;
	private Thread aThread901;
	private static Hashtable aHashtable902 = new Hashtable();
	public static final int anInt903 = 5120;
	public static final int anInt904 = 5121;
	public static final int anInt905 = 5122;
	public static final int anInt906 = 5123;
	public static final int anInt907 = 5124;
	public static final int anInt908 = 5125;
	public static final int anInt909 = 5126;
	public static final int anInt910 = 0;
	public static final int anInt911 = 1;
	public static final int anInt912 = 2;
	public static final int anInt913 = 3;
	public static final int anInt914 = 4;
	public static final int anInt915 = 5;
	public static final int anInt916 = 6;
	public static final int anInt917 = 7;
	public static final int anInt918 = 5888;
	public static final int anInt919 = 5889;
	public static final int anInt920 = 5890;
	public static final int anInt921 = 2832;
	public static final int anInt922 = 2834;
	public static final int anInt923 = 6913;
	public static final int anInt924 = 6914;
	public static final int anInt925 = 1028;
	public static final int anInt926 = 1029;
	public static final int anInt927 = 2884;
	public static final int anInt928 = 4864;
	public static final int anInt929 = 515;
	public static final int anInt930 = 516;
	public static final int anInt931 = 2929;
	public static final int anInt932 = 6402;
	public static final int anInt933 = 2896;
	public static final int anInt934 = 16384;
	public static final int anInt935 = 16385;
	public static final int anInt936 = 16386;
	public static final int anInt937 = 4615;
	public static final int anInt938 = 4616;
	public static final int anInt939 = 4617;
	public static final int anInt940 = 4608;
	public static final int anInt941 = 4609;
	public static final int anInt942 = 4611;
	public static final int anInt943 = 5634;
	public static final int anInt944 = 2899;
	public static final int anInt945 = 1032;
	public static final int anInt946 = 7425;
	public static final int anInt947 = 2903;
	public static final int anInt948 = 260;
	public static final int anInt949 = 3008;
	public static final int anInt950 = 3042;
	public static final int anInt951 = 0;
	public static final int anInt952 = 1;
	public static final int anInt953 = 768;
	public static final int anInt954 = 769;
	public static final int anInt955 = 770;
	public static final int anInt956 = 771;
	public static final int anInt957 = 774;
	public static final int anInt958 = 2912;
	public static final int anInt959 = 2917;
	public static final int anInt960 = 2914;
	public static final int anInt961 = 2918;
	public static final int anInt962 = 2915;
	public static final int anInt963 = 2916;
	public static final int anInt964 = 9729;
	public static final int anInt965 = 7681;
	public static final int anInt966 = 6406;
	public static final int anInt967 = 6409;
	public static final int anInt968 = 6410;
	public static final int anInt969 = 6144;
	public static final int anInt970 = 6407;
	public static final int anInt971 = 6408;
	public static final int anInt972 = 2982;
	public static final int anInt973 = 3156;
	public static final int anInt974 = 4353;
	public static final int anInt975 = 3089;
	public static final int anInt976 = 3348;
	public static final int anInt977 = 3349;
	public static final int anInt978 = 3352;
	public static final int anInt979 = 3353;
	public static final int anInt980 = 3354;
	public static final int anInt981 = 3355;
	public static final int anInt982 = 3317;
	public static final int anInt983 = 3314;
	public static final int anInt984 = 8960;
	public static final int anInt985 = 8704;
	public static final int anInt986 = 3552;
	public static final int anInt987 = 3553;
	public static final int anInt988 = 10242;
	public static final int anInt989 = 10243;
	public static final int anInt990 = 10240;
	public static final int anInt991 = 10241;
	public static final int anInt992 = 8705;
	public static final int anInt993 = 3168;
	public static final int anInt994 = 3169;
	public static final int anInt995 = 9472;
	public static final int anInt996 = 9984;
	public static final int anInt997 = 9987;
	public static final int anInt998 = 9217;
	public static final int anInt999 = 9473;
	public static final int anInt1000 = 9216;
	public static final int anInt1001 = 9474;
	public static final int anInt1002 = 8448;
	public static final int anInt1003 = 9728;
	public static final int anInt1004 = 10497;
	public static final int anInt1005 = 8192;
	public static final int anInt1006 = 8193;
	public static final int anInt1007 = 8194;
	public static final int anInt1008 = 8195;
	public static final int anInt1009 = 3170;
	public static final int anInt1010 = 3171;
	public static final int anInt1011 = 7936;
	public static final int anInt1012 = 7937;
	public static final int anInt1013 = 7938;
	private static final int anInt1014 = 7939;
	public static final int anInt1015 = 256;
	public static final int anInt1016 = 1024;
	public static final int anInt1017 = 2048;
	public static final int anInt1018 = 16384;
	public static final int anInt1019 = 32830;
	public static final int anInt1020 = 32834;
	public static final int anInt1021 = 32852;
	public static final int anInt1022 = 32859;
	public static final int anInt1023 = 32884;
	public static final int anInt1024 = 32885;
	public static final int anInt1025 = 32886;
	public static final int anInt1026 = 32888;
	public static final int anInt1027 = 32879;
	public static final int anInt1028 = 33639;
	public static final int anInt1029 = 32993;
	public static final int anInt1030 = 33071;
	public static final int anInt1031 = 33984;
	public static final int anInt1032 = 33985;
	public static final int anInt1033 = 34018;
	public static final int anInt1034 = 32925;
	public static final int anInt1035 = 32926;
	public static final int anInt1036 = 34065;
	public static final int anInt1037 = 34066;
	public static final int anInt1038 = 34067;
	public static final int anInt1039 = 34069;
	public static final int anInt1040 = 34070;
	public static final int anInt1041 = 34071;
	public static final int anInt1042 = 34072;
	public static final int anInt1043 = 34073;
	public static final int anInt1044 = 34074;
	public static final int anInt1045 = 34160;
	public static final int anInt1046 = 34161;
	public static final int anInt1047 = 34162;
	public static final int anInt1048 = 34176;
	public static final int anInt1049 = 34178;
	public static final int anInt1050 = 34184;
	public static final int anInt1051 = 34186;
	public static final int anInt1052 = 34192;
	public static final int anInt1053 = 34200;
	public static final int anInt1054 = 34163;
	public static final int anInt1055 = 34165;
	public static final int anInt1056 = 34023;
	public static final int anInt1057 = 34166;
	public static final int anInt1058 = 34167;
	public static final int anInt1059 = 34168;
	public static final int anInt1060 = 34479;
	public static final int anInt1061 = 33189;
	public static final int anInt1062 = 33190;
	public static final int anInt1063 = 33191;
	public static final int anInt1064 = 34895;
	public static final int anInt1065 = 35000;
	public static final int anInt1066 = 35001;
	public static final int anInt1067 = 35041;
	public static final int anInt1068 = 34466;
	public static final int anInt1069 = 34467;
	public static final int anInt1070 = 34929;
	public static final int anInt1071 = 34930;
	public static final int anInt1072 = 35632;
	public static final int anInt1073 = 35633;
	public static final int anInt1074 = 35724;
	public static final int anInt1075 = 35051;
	public static final int anInt1076 = 34336;
	public static final int anInt1077 = 34379;
	public static final int anInt1078 = 34933;
	public static final int anInt1079 = 34820;
	public static final int anInt1080 = 34962;
	public static final int anInt1081 = 34963;
	public static final int anInt1082 = 35040;
	public static final int anInt1083 = 35044;
	public static final int anInt1084 = 35713;
	public static final int anInt1085 = 35714;
	public static final int anInt1086 = 35716;
	public static final int anInt1087 = 35633;
	public static final int anInt1088 = 35632;
	public static final int anInt1089 = 34037;
	public static final int anInt1090 = 5131;
	public static final int anInt1091 = 34836;
	public static final int anInt1092 = 34837;
	public static final int anInt1093 = 34838;
	public static final int anInt1094 = 34840;
	public static final int anInt1095 = 34841;
	public static final int anInt1096 = 34842;
	public static final int anInt1097 = 34843;
	public static final int anInt1098 = 34844;
	public static final int anInt1099 = 34846;
	public static final int anInt1100 = 34847;
	public static final int anInt1101 = 33777;
	public static final int anInt1102 = 33779;
	public static final int anInt1103 = 36053;
	public static final int anInt1104 = 36064;
	public static final int anInt1105 = 36096;
	public static final int anInt1106 = 36160;
	public static final int anInt1107 = 36161;
	public static final int anInt1108 = 36008;
	public static final int anInt1109 = 36219;
	public static final int anInt1110 = 37143;
	public static final int anInt1111 = 37147;
	public static final int anInt1112 = 37149;

	public native long init(Canvas canvas, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

	public boolean method1668(String string) {
		if (null == aHashtable900) {
			aHashtable900 = new Hashtable();
			String string_5_ = glGetString(7939);
			int i = 0;
			for (;;) {
				int i_6_ = string_5_.indexOf(' ', i);
				if (-1 == i_6_)
					break;
				String string_7_ = string_5_.substring(i, i_6_).trim();
				if (string_7_.length() != 0)
					aHashtable900.put(string_7_, string_7_);
				i = i_6_ + 1;
			}
			String string_8_ = string_5_.substring(i).trim();
			if (string_8_.length() != 0)
				aHashtable900.put(string_8_, string_8_);
		}
		return aHashtable900.containsKey(string);
	}

	public synchronized boolean method1669() {
		Thread thread = Thread.currentThread();
		if (attachPeer()) {
			OpenGL opengl_9_ = (OpenGL) aHashtable902.put(thread, this);
			if (opengl_9_ != null)
				opengl_9_.aThread901 = null;
			aThread901 = thread;
			return true;
		}
		return false;
	}

	public synchronized boolean method1670() {
		if (aThread901 != Thread.currentThread())
			return false;
		detachPeer();
		aHashtable902.remove(aThread901);
		aThread901 = null;
		return true;
	}

	private native boolean attachPeer();

	private native void detachPeer();

	public native long prepareSurface(Canvas canvas);

	public native void surfaceResized(long l);

	public native void releaseSurface(Canvas canvas, long l);

	public native boolean setSurface(long l);

	public native void swapBuffers(long l);

	public native void setSwapInterval(int i);

	public native void release();

	public static native void glEnable(int i);

	public static native void glDisable(int i);

	public static native void glCullFace(int i);

	public static native void glPushAttrib(int i);

	public static native void glPopAttrib();

	public static native void glShadeModel(int i);

	public static native void glHint(int i, int i_10_);

	public static native void glFinish();

	public static native void glFlush();

	public static native void glClear(int i);

	public static native void glClearColor(float f, float f_11_, float f_12_, float f_13_);

	public static native void glClearDepth(float f);

	public static native void glDepthFunc(int i);

	public static native void glDepthMask(boolean bool);

	public static native void glDepthRange(float f, float f_14_);

	public static native void glAlphaFunc(int i, float f);

	public static native void glColorMask(boolean bool, boolean bool_15_, boolean bool_16_, boolean bool_17_);

	public static native void glReadBuffer(int i);

	public static native void glDrawBuffer(int i);

	public static native void glDrawBuffersARB(int i, int[] is, int i_18_);

	public static native void glMatrixMode(int i);

	public static native void glPushMatrix();

	public static native void glPopMatrix();

	public static native void glLoadIdentity();

	public static native void glOrtho(double d, double d_19_, double d_20_, double d_21_, double d_22_, double d_23_);

	public static native void glFrustum(double d, double d_24_, double d_25_, double d_26_, double d_27_, double d_28_);

	public static native void glTranslatef(float f, float f_29_, float f_30_);

	public static native void glRotatef(float f, float f_31_, float f_32_, float f_33_);

	public static native void glScalef(float f, float f_34_, float f_35_);

	public static native void glLoadMatrixf(float[] fs, int i);

	public static native void glMultMatrixf(float[] fs, int i);

	public static native void glViewport(int i, int i_36_, int i_37_, int i_38_);

	public static native void glScissor(int i, int i_39_, int i_40_, int i_41_);

	public static native int glGenLists(int i);

	public static native void glDeleteLists(int i, int i_42_);

	public static native void glNewList(int i, int i_43_);

	public static native void glEndList();

	public static native void glCallList(int i);

	public static native void glBegin(int i);

	public static native void glVertex2i(int i, int i_44_);

	public static native void glVertex2f(float f, float f_45_);

	public static native void glVertex3f(float f, float f_46_, float f_47_);

	public static native void glNormal3f(float f, float f_48_, float f_49_);

	public static native void glColor3f(float f, float f_50_, float f_51_);

	public static native void glColor4f(float f, float f_52_, float f_53_, float f_54_);

	public static native void glColor3ub(byte i, byte i_55_, byte i_56_);

	public static native void glColor4ub(byte i, byte i_57_, byte i_58_, byte i_59_);

	public static native void glTexCoord2i(int i, int i_60_);

	public static native void glTexCoord3i(int i, int i_61_, int i_62_);

	public static native void glTexCoord2f(float f, float f_63_);

	public static native void glTexCoord3f(float f, float f_64_, float f_65_);

	public static native void glMultiTexCoord2i(int i, int i_66_, int i_67_);

	public static native void glMultiTexCoord3i(int i, int i_68_, int i_69_, int i_70_);

	public static native void glMultiTexCoord2f(int i, float f, float f_71_);

	public static native void glRasterPos2i(int i, int i_72_);

	public static native void glEnd();

	public static native void glEnableClientState(int i);

	public static native void glDisableClientState(int i);

	public static native void glClientActiveTexture(int i);

	public static native void glVertexPointer(int i, int i_73_, int i_74_, long l);

	public static native void glNormalPointer(int i, int i_75_, long l);

	public static native void glColorPointer(int i, int i_76_, int i_77_, long l);

	public static native void glTexCoordPointer(int i, int i_78_, int i_79_, long l);

	public static native void glVertexAttribPointer(int i, int i_80_, int i_81_, boolean bool, int i_82_, long l);

	public static native void glEnableVertexAttribArray(int i);

	public static native void glDisableVertexAttribArray(int i);

	public static native void glBindAttribLocation(int i, int i_83_, String string);

	public static native int glGetAttribLocation(int i, String string);

	public static native void glGenBuffersARB(int i, int[] is, int i_84_);

	public static native void glBindBufferARB(int i, int i_85_);

	public static native void glBufferDataARBa(int i, int i_86_, long l, int i_87_);

	public static native void glBufferDataARBub(int i, int i_88_, byte[] is, int i_89_, int i_90_);

	public static native void glBufferSubDataARBa(int i, int i_91_, int i_92_, long l);

	public static native void glBufferSubDataARBub(int i, int i_93_, int i_94_, byte[] is, int i_95_);

	public static native long glMapBufferARB(int i, int i_96_);

	public static native boolean glUnmapBufferARB(int i);

	public static native void glDeleteBuffersARB(int i, int[] is, int i_97_);

	public static native void glLineWidth(float f);

	public static native void glPointSize(float f);

	public static native void glPolygonMode(int i, int i_98_);

	public static native void glDrawArrays(int i, int i_99_, int i_100_);

	public static native void glDrawElements(int i, int i_101_, int i_102_, long l);

	public static native void glGenTextures(int i, int[] is, int i_103_);

	public static native void glDeleteTextures(int i, int[] is, int i_104_);

	public static native void glActiveTexture(int i);

	public static native void glBindTexture(int i, int i_105_);

	public static native void glTexEnvi(int i, int i_106_, int i_107_);

	public static native void glTexEnvf(int i, int i_108_, float f);

	public static native void glTexEnvfv(int i, int i_109_, float[] fs, int i_110_);

	public static native void glTexGeni(int i, int i_111_, int i_112_);

	public static native void glTexGenfv(int i, int i_113_, float[] fs, int i_114_);

	public static native void glTexParameterf(int i, int i_115_, float f);

	public static native void glTexParameteri(int i, int i_116_, int i_117_);

	public static native void glGetTexImagei(int i, int i_118_, int i_119_, int i_120_, int[] is, int i_121_);

	public static native void glGetTexImageub(int i, int i_122_, int i_123_, int i_124_, byte[] is, int i_125_);

	public static native float glGetTexLevelParameterfv(int i, int i_126_, int i_127_);

	public static native int glGetTexLevelParameteriv(int i, int i_128_, int i_129_);

	public static native void glGetTexImage(int i, int i_130_, int i_131_, int i_132_, byte[] is);

	public static native void glTexImage1Dub(int i, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, byte[] is, int i_139_);

	public static native void glCopyTexImage2D(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_);

	public static native void glCopyTexSubImage2D(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_);

	public static native void glTexImage2Di(int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int[] is, int i_161_);

	public static native void glTexImage2Df(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, float[] fs, int i_169_);

	public static native void glTexImage2Dub(int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, byte[] is, int i_177_);

	public static native void glTexSubImage2Di(int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int[] is, int i_185_);

	public static native void glTexSubImage2Df(int i, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, float[] fs, int i_193_);

	public static native void glTexSubImage2Dub(int i, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, byte[] is, int i_201_);

	public static native void glCopyTexSubImage3D(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_);

	public static native void glTexImage3Dub(int i, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, byte[] is, int i_218_);

	public static native void glCompressedTexImage2Dub(int i, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, byte[] is, int i_225_);

	public static native void glCopyPixels(int i, int i_226_, int i_227_, int i_228_, int i_229_);

	public static native void glReadPixelsi(int i, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, int[] is, int i_235_);

	public static native void glReadPixelsub(int i, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_, byte[] is, int i_241_);

	public static native void glDrawPixelsi(int i, int i_242_, int i_243_, int i_244_, int[] is, int i_245_);

	public static native void glDrawPixelsub(int i, int i_246_, int i_247_, int i_248_, byte[] is, int i_249_);

	public static native void glPixelZoom(float f, float f_250_);

	public static native void glPixelStorei(int i, int i_251_);

	public static native void glPixelTransferf(int i, float f);

	public static native void glColorMaterial(int i, int i_252_);

	public static native void glLightf(int i, int i_253_, float f);

	public static native void glLightfv(int i, int i_254_, float[] fs, int i_255_);

	public static native void glLightModelfv(int i, float[] fs, int i_256_);

	public static native void glMaterialfv(int i, int i_257_, float[] fs, int i_258_);

	public static native void glFogi(int i, int i_259_);

	public static native void glFogf(int i, float f);

	public static native void glFogfv(int i, float[] fs, int i_260_);

	public static native void glBlendFunc(int i, int i_261_);

	public static native void glBlendFuncSeparate(int i, int i_262_, int i_263_, int i_264_);

	public static native void glBlendColor(float f, float f_265_, float f_266_, float f_267_);

	public static native void glGenFramebuffersEXT(int i, int[] is, int i_268_);

	public static native void glDeleteFramebuffersEXT(int i, int[] is, int i_269_);

	public static native void glBindFramebufferEXT(int i, int i_270_);

	public static native void glFramebufferTexture2DEXT(int i, int i_271_, int i_272_, int i_273_, int i_274_);

	public static native void glFramebufferTexture3DEXT(int i, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_);

	public static native void glFramebufferRenderbufferEXT(int i, int i_280_, int i_281_, int i_282_);

	public static native int glCheckFramebufferStatusEXT(int i);

	public static native void glBlitFramebufferEXT(int i, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_);

	public static native void glGenerateMipmapEXT(int i);

	public static native void glGenRenderbuffersEXT(int i, int[] is, int i_292_);

	public static native void glDeleteRenderbuffersEXT(int i, int[] is, int i_293_);

	public static native void glBindRenderbufferEXT(int i, int i_294_);

	public static native void glRenderbufferStorageEXT(int i, int i_295_, int i_296_, int i_297_);

	public static native void glRenderbufferStorageMultisampleEXT(int i, int i_298_, int i_299_, int i_300_, int i_301_);

	public static native int glGenProgramARB();

	public static native void glDeleteProgramARB(int i);

	public static native void glBindProgramARB(int i, int i_302_);

	public static native void glProgramStringARB(int i, int i_303_, String string);

	public static native void glProgramRawARB(int i, int i_304_, byte[] is);

	public static native void glProgramLocalParameter4fARB(int i, int i_305_, float f, float f_306_, float f_307_, float f_308_);

	public static native void glProgramLocalParameter4fvARB(int i, int i_309_, float[] fs, int i_310_);

	public static native void glGetProgramivARB(int i, int i_311_, int[] is, int i_312_);

	public static native int glCreateProgram();

	public static native int glCreateShader(int i);

	public static native void glDeleteProgram(int i);

	public static native void glDeleteShader(int i);

	public static native void glShaderSource(int i, String string);

	public static native void glCompileShader(int i);

	public static native void glAttachShader(int i, int i_313_);

	public static native void glDetachShader(int i, int i_314_);

	public static native void glLinkProgram(int i);

	public static native void glUseProgram(int i);

	public static native int glGetUniformLocation(int i, String string);

	public static native void glUniform1i(int i, int i_315_);

	public static native void glUniform1f(int i, float f);

	public static native void glUniform2f(int i, float f, float f_316_);

	public static native void glUniform3f(int i, float f, float f_317_, float f_318_);

	public static native void glUniform4f(int i, float f, float f_319_, float f_320_, float f_321_);

	public static native void glUniform1fv(int i, int i_322_, float[] fs, int i_323_);

	public static native void glUniform2fv(int i, int i_324_, float[] fs, int i_325_);

	public static native void glUniform3fv(int i, int i_326_, float[] fs, int i_327_);

	public static native void glUniform4fv(int i, int i_328_, float[] fs, int i_329_);

	public static native void glUniformMatrix2fv(int i, int i_330_, boolean bool, float[] fs, int i_331_);

	public static native void glUniformMatrix3fv(int i, int i_332_, boolean bool, float[] fs, int i_333_);

	public static native void glUniformMatrix4fv(int i, int i_334_, boolean bool, float[] fs, int i_335_);

	public static native void glGetProgramiv(int i, int i_336_, int[] is, int i_337_);

	public static native void glGetShaderiv(int i, int i_338_, int[] is, int i_339_);

	public static native void glGetProgramInfoLog(int i, int i_340_, int[] is, int i_341_, byte[] is_342_, int i_343_);

	public static native void glGetShaderInfoLog(int i, int i_344_, int[] is, int i_345_, byte[] is_346_, int i_347_);

	public static native int glGetError();

	public static native String glGetString(int i);

	public static native void glGetFloatv(int i, float[] fs, int i_348_);

	public static native void glGetIntegerv(int i, int[] is, int i_349_);

	public static native void glStencilFunc(int i, int i_350_, int i_351_);

	public static native void glStencilOp(int i, int i_352_, int i_353_);

	public static native long glFenceSync(int i, int i_354_);

	public static native boolean glIsSync(long l);

	public static native void glDeleteSync(long l);

	public static native int glClientWaitSync(long l, int i, int i_355_);

	public static native void glWaitSync(long l, int i, int i_356_);

	public boolean method1671(String string) {
		if (null == aHashtable900) {
			aHashtable900 = new Hashtable();
			String string_357_ = glGetString(7939);
			int i = 0;
			for (;;) {
				int i_358_ = string_357_.indexOf(' ', i);
				if (-1 == i_358_)
					break;
				String string_359_ = string_357_.substring(i, i_358_).trim();
				if (string_359_.length() != 0)
					aHashtable900.put(string_359_, string_359_);
				i = i_358_ + 1;
			}
			String string_360_ = string_357_.substring(i).trim();
			if (string_360_.length() != 0)
				aHashtable900.put(string_360_, string_360_);
		}
		return aHashtable900.containsKey(string);
	}

	public boolean method1672(String string) {
		if (null == aHashtable900) {
			aHashtable900 = new Hashtable();
			String string_361_ = glGetString(7939);
			int i = 0;
			for (;;) {
				int i_362_ = string_361_.indexOf(' ', i);
				if (-1 == i_362_)
					break;
				String string_363_ = string_361_.substring(i, i_362_).trim();
				if (string_363_.length() != 0)
					aHashtable900.put(string_363_, string_363_);
				i = i_362_ + 1;
			}
			String string_364_ = string_361_.substring(i).trim();
			if (string_364_.length() != 0)
				aHashtable900.put(string_364_, string_364_);
		}
		return aHashtable900.containsKey(string);
	}

	public synchronized boolean method1673() {
		Thread thread = Thread.currentThread();
		if (attachPeer()) {
			OpenGL opengl_365_ = (OpenGL) aHashtable902.put(thread, this);
			if (opengl_365_ != null)
				opengl_365_.aThread901 = null;
			aThread901 = thread;
			return true;
		}
		return false;
	}

	public synchronized boolean method1674() {
		Thread thread = Thread.currentThread();
		if (attachPeer()) {
			OpenGL opengl_366_ = (OpenGL) aHashtable902.put(thread, this);
			if (opengl_366_ != null)
				opengl_366_.aThread901 = null;
			aThread901 = thread;
			return true;
		}
		return false;
	}

	public synchronized boolean method1675() {
		if (aThread901 != Thread.currentThread())
			return false;
		detachPeer();
		aHashtable902.remove(aThread901);
		aThread901 = null;
		return true;
	}

	public synchronized boolean method1676() {
		if (aThread901 != Thread.currentThread())
			return false;
		detachPeer();
		aHashtable902.remove(aThread901);
		aThread901 = null;
		return true;
	}
}
