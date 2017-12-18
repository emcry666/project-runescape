/* Class326_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class326_Sub2 extends Class326 {
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10051;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10052;
	Class441 aClass441_10053 = new Class441();
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10054;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10055;
	Class265 aClass265_10056;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10057;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10058;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10059;
	Class270 aClass270_10060;
	Class270 aClass270_10061;
	Class270 aClass270_10062;
	public static Class53_Sub10 aClass53_Sub10_10063;

	boolean method15586(byte i) throws Exception_Sub3 {
		aClass265_10056 = aClass178_Sub2_3459.method15073("Particle");
		aClass523_Sub4_Sub1_10051 = aClass265_10056.method4783("WVPMatrix", -1493845941);
		aClass523_Sub4_Sub1_10052 = aClass265_10056.method4783("DiffuseSampler", -1010998413);
		aClass523_Sub4_Sub1_10055 = aClass265_10056.method4783("TexCoordMatrix", 540833042);
		aClass523_Sub4_Sub1_10054 = aClass265_10056.method4783("DistanceFogPlane", 1367888302);
		aClass523_Sub4_Sub1_10057 = aClass265_10056.method4783("DistanceFogColour", -2064682191);
		aClass523_Sub4_Sub1_10058 = aClass265_10056.method4783("DistanceFogAmount", 707246426);
		aClass523_Sub4_Sub1_10059 = aClass265_10056.method4783("DiffuseColour", 369780039);
		aClass270_10061 = aClass265_10056.method4755("NoFog", 760427037);
		aClass270_10060 = aClass265_10056.method4755("ParticleFog", 760427037);
		aClass270_10062 = aClass265_10056.method4755("BillboardFog", 760427037);
		if (!aClass270_10061.method4927())
			return false;
		if (!aClass270_10060.method4927())
			return false;
		if (!aClass270_10062.method4927())
			return false;
		return true;
	}

	public void method5742(Class441 class441) {
		aClass441_10053.method7086(class441);
		aClass441_10053.method7089(aClass178_Sub2_3459.aClass441_9575);
	}

	public void method5746(int i, boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10060 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, true, -490060380);
		aClass178_Sub2_3459.method15034(Class376.aClass376_3917, 0, 4 * i, 0, 2 * i);
	}

	public void method5743(int i, boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10060 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, true, -153854367);
		aClass178_Sub2_3459.method15034(Class376.aClass376_3917, 0, 4 * i, 0, 2 * i);
	}

	public void method5741(boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10062 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, false, -793693970);
		aClass178_Sub2_3459.method15038();
	}

	void method15587(boolean bool, boolean bool_0_, int i) {
		aClass265_10056.method4836(aClass523_Sub4_Sub1_10052, 0, anInterface37_3460, -320127462);
		aClass265_10056.method4773(aClass523_Sub4_Sub1_10051, aClass441_10053, -1289731101);
		aClass265_10056.method4772(aClass523_Sub4_Sub1_10055, aClass441_3457, 595304170);
		aClass265_10056.method4771(aClass523_Sub4_Sub1_10059, anInt3458, -1579554952);
		if (bool) {
			if (bool_0_)
				aClass265_10056.method4767(aClass523_Sub4_Sub1_10054, aClass429_3456.aFloat4847, aClass429_3456.aFloat4849, aClass429_3456.aFloat4848, aClass429_3456.aFloat4850, -2066501348);
			else
				aClass265_10056.method4764(aClass523_Sub4_Sub1_10058, Math.min(Math.max(aFloat3462, 0.0F), 1.0F), (byte) 0);
			aClass265_10056.method4766(aClass523_Sub4_Sub1_10057, aClass437_3461.aFloat4903, aClass437_3461.aFloat4904, aClass437_3461.aFloat4905, -535427312);
		}
	}

	public void method5745(Class441 class441) {
		aClass441_10053.method7086(class441);
		aClass441_10053.method7089(aClass178_Sub2_3459.aClass441_9575);
	}

	public void method5744(Class441 class441) {
		aClass441_10053.method7086(class441);
		aClass441_10053.method7089(aClass178_Sub2_3459.aClass441_9575);
	}

	public void method5748(int i, boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10060 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, true, 62968447);
		aClass178_Sub2_3459.method15034(Class376.aClass376_3917, 0, 4 * i, 0, 2 * i);
	}

	boolean method15588() throws Exception_Sub3 {
		aClass265_10056 = aClass178_Sub2_3459.method15073("Particle");
		aClass523_Sub4_Sub1_10051 = aClass265_10056.method4783("WVPMatrix", -1598839038);
		aClass523_Sub4_Sub1_10052 = aClass265_10056.method4783("DiffuseSampler", -2011551749);
		aClass523_Sub4_Sub1_10055 = aClass265_10056.method4783("TexCoordMatrix", 1317202221);
		aClass523_Sub4_Sub1_10054 = aClass265_10056.method4783("DistanceFogPlane", -1239548009);
		aClass523_Sub4_Sub1_10057 = aClass265_10056.method4783("DistanceFogColour", -1213768497);
		aClass523_Sub4_Sub1_10058 = aClass265_10056.method4783("DistanceFogAmount", -470984383);
		aClass523_Sub4_Sub1_10059 = aClass265_10056.method4783("DiffuseColour", -508903527);
		aClass270_10061 = aClass265_10056.method4755("NoFog", 760427037);
		aClass270_10060 = aClass265_10056.method4755("ParticleFog", 760427037);
		aClass270_10062 = aClass265_10056.method4755("BillboardFog", 760427037);
		if (!aClass270_10061.method4927())
			return false;
		if (!aClass270_10060.method4927())
			return false;
		if (!aClass270_10062.method4927())
			return false;
		return true;
	}

	boolean method15589() throws Exception_Sub3 {
		aClass265_10056 = aClass178_Sub2_3459.method15073("Particle");
		aClass523_Sub4_Sub1_10051 = aClass265_10056.method4783("WVPMatrix", 1241491196);
		aClass523_Sub4_Sub1_10052 = aClass265_10056.method4783("DiffuseSampler", 1186048740);
		aClass523_Sub4_Sub1_10055 = aClass265_10056.method4783("TexCoordMatrix", -274433411);
		aClass523_Sub4_Sub1_10054 = aClass265_10056.method4783("DistanceFogPlane", -615303373);
		aClass523_Sub4_Sub1_10057 = aClass265_10056.method4783("DistanceFogColour", 657614510);
		aClass523_Sub4_Sub1_10058 = aClass265_10056.method4783("DistanceFogAmount", -2046656433);
		aClass523_Sub4_Sub1_10059 = aClass265_10056.method4783("DiffuseColour", 740995716);
		aClass270_10061 = aClass265_10056.method4755("NoFog", 760427037);
		aClass270_10060 = aClass265_10056.method4755("ParticleFog", 760427037);
		aClass270_10062 = aClass265_10056.method4755("BillboardFog", 760427037);
		if (!aClass270_10061.method4927())
			return false;
		if (!aClass270_10060.method4927())
			return false;
		if (!aClass270_10062.method4927())
			return false;
		return true;
	}

	public void method5749(boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10062 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, false, -1846695173);
		aClass178_Sub2_3459.method15038();
	}

	public void method5750(boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10062 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, false, -1312117902);
		aClass178_Sub2_3459.method15038();
	}

	boolean method15590() throws Exception_Sub3 {
		aClass265_10056 = aClass178_Sub2_3459.method15073("Particle");
		aClass523_Sub4_Sub1_10051 = aClass265_10056.method4783("WVPMatrix", -1278337962);
		aClass523_Sub4_Sub1_10052 = aClass265_10056.method4783("DiffuseSampler", -15781327);
		aClass523_Sub4_Sub1_10055 = aClass265_10056.method4783("TexCoordMatrix", -1027258126);
		aClass523_Sub4_Sub1_10054 = aClass265_10056.method4783("DistanceFogPlane", -1059274006);
		aClass523_Sub4_Sub1_10057 = aClass265_10056.method4783("DistanceFogColour", -929447998);
		aClass523_Sub4_Sub1_10058 = aClass265_10056.method4783("DistanceFogAmount", -837374589);
		aClass523_Sub4_Sub1_10059 = aClass265_10056.method4783("DiffuseColour", 105519934);
		aClass270_10061 = aClass265_10056.method4755("NoFog", 760427037);
		aClass270_10060 = aClass265_10056.method4755("ParticleFog", 760427037);
		aClass270_10062 = aClass265_10056.method4755("BillboardFog", 760427037);
		if (!aClass270_10061.method4927())
			return false;
		if (!aClass270_10060.method4927())
			return false;
		if (!aClass270_10062.method4927())
			return false;
		return true;
	}

	public void method5747(int i, boolean bool) {
		aClass265_10056.method4852(bool ? aClass270_10060 : aClass270_10061);
		aClass265_10056.method4750();
		method15587(bool, true, 101849286);
		aClass178_Sub2_3459.method15034(Class376.aClass376_3917, 0, 4 * i, 0, 2 * i);
	}

	public Class326_Sub2(Class178_Sub2 class178_sub2) throws Exception_Sub3 {
		super(class178_sub2);
		method15586((byte) -118);
	}

	static void method15591(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_1_ = class523_sub34.readUnsignedByte(-294983976);
			switch (i_1_) {
			case 0:
				Class191.anInt2162 = class523_sub34.readUnsignedShort(-757946023) * -1551215649;
				Class191.anInt2163 = class523_sub34.readUnsignedShort(-577606218) * 1294983465;
				break;
			case 255:
				return;
			}
		}
	}
}
