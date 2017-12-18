/* Class456 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class456 implements Runnable {
	boolean aBool5068;
	JS5FileQueue aClass697_5069 = new JS5FileQueue();
	Thread aThread5070;
	int anInt5071 = 0;

	Class523_Sub27_Sub14_Sub1 method7415(int i, byte[] is, Class545 class545, int i_0_) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = -1290719246;
		class523_sub27_sub14_sub1.queueId = (long) i * -9121445971199030645L;
		class523_sub27_sub14_sub1.aByteArray12039 = is;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -65);
		return class523_sub27_sub14_sub1;
	}

	Class523_Sub27_Sub14_Sub1 method7416(int i, Class545 class545, int i_1_) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 1502124025;
		synchronized (aClass697_5069) {
			for (Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_2_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.first(-1426448868)); null != class523_sub27_sub14_sub1_2_; class523_sub27_sub14_sub1_2_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.next(768418218))) {
				if ((class523_sub27_sub14_sub1_2_.queueId * -8659322449062458077L) == (long) i && class545 == class523_sub27_sub14_sub1_2_.aClass545_12037 && (-2069857719 * class523_sub27_sub14_sub1_2_.anInt12034 == 2)) {
					class523_sub27_sub14_sub1.aByteArray12039 = class523_sub27_sub14_sub1_2_.aByteArray12039;
					class523_sub27_sub14_sub1.inProgress = false;
					Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_3_ = class523_sub27_sub14_sub1;
					return class523_sub27_sub14_sub1_3_;
				}
			}
		}
		class523_sub27_sub14_sub1.aByteArray12039 = class545.method9047(i, (byte) -50);
		class523_sub27_sub14_sub1.inProgress = false;
		class523_sub27_sub14_sub1.isLowPriority = true;
		return class523_sub27_sub14_sub1;
	}

	public void run() {
		while (!aBool5068) {
			Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1;
			synchronized (aClass697_5069) {
				class523_sub27_sub14_sub1 = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.method14015((byte) -63));
				if (class523_sub27_sub14_sub1 != null)
					anInt5071 -= -680813071;
				else {
					try {
						aClass697_5069.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (-2069857719 * class523_sub27_sub14_sub1.anInt12034 == 2)
					class523_sub27_sub14_sub1.aClass545_12037.method9049((int) (class523_sub27_sub14_sub1.queueId * -8659322449062458077L), class523_sub27_sub14_sub1.aByteArray12039, class523_sub27_sub14_sub1.aByteArray12039.length, (byte) -1);
				else if (class523_sub27_sub14_sub1.anInt12034 * -2069857719 == 3)
					class523_sub27_sub14_sub1.aByteArray12039 = (class523_sub27_sub14_sub1.aClass545_12037.method9047((int) (class523_sub27_sub14_sub1.queueId * -8659322449062458077L), (byte) -105));
			} catch (Exception exception) {
				Class305.method5553(null, exception, (byte) 1);
			}
			class523_sub27_sub14_sub1.inProgress = false;
		}
	}

	public Class456() {
		aBool5068 = false;
		aThread5070 = new Thread(this);
		aThread5070.setDaemon(true);
		aThread5070.start();
		aThread5070.setPriority(1);
	}

	void method7417(Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1, byte i) {
		synchronized (aClass697_5069) {
			aClass697_5069.removeFromQueue(class523_sub27_sub14_sub1, (byte) -56);
			anInt5071 += -680813071;
			aClass697_5069.notifyAll();
		}
	}

	Class523_Sub27_Sub14_Sub1 method7418(int i, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 1502124025;
		synchronized (aClass697_5069) {
			for (Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_4_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.first(-1426448868)); null != class523_sub27_sub14_sub1_4_; class523_sub27_sub14_sub1_4_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.next(768418218))) {
				if ((class523_sub27_sub14_sub1_4_.queueId * -8659322449062458077L) == (long) i && class545 == class523_sub27_sub14_sub1_4_.aClass545_12037 && (-2069857719 * class523_sub27_sub14_sub1_4_.anInt12034 == 2)) {
					class523_sub27_sub14_sub1.aByteArray12039 = class523_sub27_sub14_sub1_4_.aByteArray12039;
					class523_sub27_sub14_sub1.inProgress = false;
					Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_5_ = class523_sub27_sub14_sub1;
					return class523_sub27_sub14_sub1_5_;
				}
			}
		}
		class523_sub27_sub14_sub1.aByteArray12039 = class545.method9047(i, (byte) -4);
		class523_sub27_sub14_sub1.inProgress = false;
		class523_sub27_sub14_sub1.isLowPriority = true;
		return class523_sub27_sub14_sub1;
	}

	public int method7419(byte i) {
		synchronized (aClass697_5069) {
			int i_6_ = 1780200209 * anInt5071;
			return i_6_;
		}
	}

	public void method7420(byte i) {
		aBool5068 = true;
		synchronized (aClass697_5069) {
			aClass697_5069.notifyAll();
		}
		try {
			aThread5070.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5070 = null;
	}

	public void method7421() {
		while (!aBool5068) {
			Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1;
			synchronized (aClass697_5069) {
				class523_sub27_sub14_sub1 = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.method14015((byte) -79));
				if (class523_sub27_sub14_sub1 != null)
					anInt5071 -= -680813071;
				else {
					try {
						aClass697_5069.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (-2069857719 * class523_sub27_sub14_sub1.anInt12034 == 2)
					class523_sub27_sub14_sub1.aClass545_12037.method9049((int) (class523_sub27_sub14_sub1.queueId * -8659322449062458077L), class523_sub27_sub14_sub1.aByteArray12039, class523_sub27_sub14_sub1.aByteArray12039.length, (byte) -1);
				else if (class523_sub27_sub14_sub1.anInt12034 * -2069857719 == 3)
					class523_sub27_sub14_sub1.aByteArray12039 = (class523_sub27_sub14_sub1.aClass545_12037.method9047((int) (class523_sub27_sub14_sub1.queueId * -8659322449062458077L), (byte) -125));
			} catch (Exception exception) {
				Class305.method5553(null, exception, (byte) 1);
			}
			class523_sub27_sub14_sub1.inProgress = false;
		}
	}

	public void method7422() {
		while (!aBool5068) {
			Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1;
			synchronized (aClass697_5069) {
				class523_sub27_sub14_sub1 = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.method14015((byte) -82));
				if (class523_sub27_sub14_sub1 != null)
					anInt5071 -= -680813071;
				else {
					try {
						aClass697_5069.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (-2069857719 * class523_sub27_sub14_sub1.anInt12034 == 2)
					class523_sub27_sub14_sub1.aClass545_12037.method9049((int) (class523_sub27_sub14_sub1.queueId * -8659322449062458077L), class523_sub27_sub14_sub1.aByteArray12039, class523_sub27_sub14_sub1.aByteArray12039.length, (byte) -1);
				else if (class523_sub27_sub14_sub1.anInt12034 * -2069857719 == 3)
					class523_sub27_sub14_sub1.aByteArray12039 = (class523_sub27_sub14_sub1.aClass545_12037.method9047((int) (class523_sub27_sub14_sub1.queueId * -8659322449062458077L), (byte) -62));
			} catch (Exception exception) {
				Class305.method5553(null, exception, (byte) 1);
			}
			class523_sub27_sub14_sub1.inProgress = false;
		}
	}

	Class523_Sub27_Sub14_Sub1 method7423(int i, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 1502124025;
		synchronized (aClass697_5069) {
			for (Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_7_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.first(-1426448868)); null != class523_sub27_sub14_sub1_7_; class523_sub27_sub14_sub1_7_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.next(768418218))) {
				if ((class523_sub27_sub14_sub1_7_.queueId * -8659322449062458077L) == (long) i && class545 == class523_sub27_sub14_sub1_7_.aClass545_12037 && (-2069857719 * class523_sub27_sub14_sub1_7_.anInt12034 == 2)) {
					class523_sub27_sub14_sub1.aByteArray12039 = class523_sub27_sub14_sub1_7_.aByteArray12039;
					class523_sub27_sub14_sub1.inProgress = false;
					Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_8_ = class523_sub27_sub14_sub1;
					return class523_sub27_sub14_sub1_8_;
				}
			}
		}
		class523_sub27_sub14_sub1.aByteArray12039 = class545.method9047(i, (byte) -76);
		class523_sub27_sub14_sub1.inProgress = false;
		class523_sub27_sub14_sub1.isLowPriority = true;
		return class523_sub27_sub14_sub1;
	}

	Class523_Sub27_Sub14_Sub1 method7424(int i, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 1502124025;
		synchronized (aClass697_5069) {
			for (Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_9_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.first(-1426448868)); null != class523_sub27_sub14_sub1_9_; class523_sub27_sub14_sub1_9_ = ((Class523_Sub27_Sub14_Sub1) aClass697_5069.next(768418218))) {
				if ((class523_sub27_sub14_sub1_9_.queueId * -8659322449062458077L) == (long) i && class545 == class523_sub27_sub14_sub1_9_.aClass545_12037 && (-2069857719 * class523_sub27_sub14_sub1_9_.anInt12034 == 2)) {
					class523_sub27_sub14_sub1.aByteArray12039 = class523_sub27_sub14_sub1_9_.aByteArray12039;
					class523_sub27_sub14_sub1.inProgress = false;
					Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1_10_ = class523_sub27_sub14_sub1;
					return class523_sub27_sub14_sub1_10_;
				}
			}
		}
		class523_sub27_sub14_sub1.aByteArray12039 = class545.method9047(i, (byte) -36);
		class523_sub27_sub14_sub1.inProgress = false;
		class523_sub27_sub14_sub1.isLowPriority = true;
		return class523_sub27_sub14_sub1;
	}

	void method7425(Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1) {
		synchronized (aClass697_5069) {
			aClass697_5069.removeFromQueue(class523_sub27_sub14_sub1, (byte) -80);
			anInt5071 += -680813071;
			aClass697_5069.notifyAll();
		}
	}

	Class523_Sub27_Sub14_Sub1 method7426(int i, byte[] is, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = -1290719246;
		class523_sub27_sub14_sub1.queueId = (long) i * -9121445971199030645L;
		class523_sub27_sub14_sub1.aByteArray12039 = is;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -39);
		return class523_sub27_sub14_sub1;
	}

	Class523_Sub27_Sub14_Sub1 method7427(int i, byte[] is, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = -1290719246;
		class523_sub27_sub14_sub1.queueId = (long) i * -9121445971199030645L;
		class523_sub27_sub14_sub1.aByteArray12039 = is;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -15);
		return class523_sub27_sub14_sub1;
	}

	Class523_Sub27_Sub14_Sub1 method7428(int i, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 211404779;
		class523_sub27_sub14_sub1.queueId = -9121445971199030645L * (long) i;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -20);
		return class523_sub27_sub14_sub1;
	}

	Class523_Sub27_Sub14_Sub1 method7429(int i, Class545 class545, int i_11_) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 211404779;
		class523_sub27_sub14_sub1.queueId = -9121445971199030645L * (long) i;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -67);
		return class523_sub27_sub14_sub1;
	}

	Class523_Sub27_Sub14_Sub1 method7430(int i, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 211404779;
		class523_sub27_sub14_sub1.queueId = -9121445971199030645L * (long) i;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -6);
		return class523_sub27_sub14_sub1;
	}

	void method7431(Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1) {
		synchronized (aClass697_5069) {
			aClass697_5069.removeFromQueue(class523_sub27_sub14_sub1, (byte) -63);
			anInt5071 += -680813071;
			aClass697_5069.notifyAll();
		}
	}

	void method7432(Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1) {
		synchronized (aClass697_5069) {
			aClass697_5069.removeFromQueue(class523_sub27_sub14_sub1, (byte) -108);
			anInt5071 += -680813071;
			aClass697_5069.notifyAll();
		}
	}

	Class523_Sub27_Sub14_Sub1 method7433(int i, Class545 class545) {
		Class523_Sub27_Sub14_Sub1 class523_sub27_sub14_sub1 = new Class523_Sub27_Sub14_Sub1();
		class523_sub27_sub14_sub1.anInt12034 = 211404779;
		class523_sub27_sub14_sub1.queueId = -9121445971199030645L * (long) i;
		class523_sub27_sub14_sub1.aClass545_12037 = class545;
		class523_sub27_sub14_sub1.isLowPriority = false;
		method7417(class523_sub27_sub14_sub1, (byte) -68);
		return class523_sub27_sub14_sub1;
	}

	public void method7434() {
		aBool5068 = true;
		synchronized (aClass697_5069) {
			aClass697_5069.notifyAll();
		}
		try {
			aThread5070.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5070 = null;
	}

	static final void method7435(Class669 class669, byte i) {
		class669.anInt8558 -= 2138772399;
	}

	public static Class392 method7436(RSBuffer class523_sub34, int i) {
		int i_12_ = class523_sub34.readUnsignedByte(-321951689);
		Class380 class380 = (Class228.method4175(712804753)[class523_sub34.readUnsignedByte(867839761)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(93416154)]);
		int i_13_ = class523_sub34.readShort(381432398);
		int i_14_ = class523_sub34.readShort(-1234643881);
		int i_15_ = class523_sub34.readUnsignedShort(-305208086);
		int i_16_ = class523_sub34.readUnsignedShort(-1905252736);
		int i_17_ = class523_sub34.readUnsignedInt((byte) -96);
		int i_18_ = class523_sub34.readUnsignedInt((byte) 0);
		int i_19_ = class523_sub34.readUnsignedInt((byte) -104);
		boolean bool = class523_sub34.readUnsignedByte(1597644732) == 1;
		return new Class392(i_12_, class380, class389, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, bool);
	}

	static final void method7437(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
		int i_20_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		Class254.aClass217_2743.method3863(i_20_, (byte) 41);
	}

	static final void method7438(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		InterfaceComponentDefinitions class250_21_ = Class617.method10090(class242, class250, 2025695974);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = null == class250_21_ ? -1 : class250_21_.interfaceHash * -1363815505;
	}
}
