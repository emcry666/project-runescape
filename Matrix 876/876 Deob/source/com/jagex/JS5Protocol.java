/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;

public abstract class JS5Protocol {
	public volatile int anInt5073;
	static final int anInt5074 = 500;
	JS5FileQueue lowPriorityRequests;
	static final int anInt5076 = 102400;
	RSBuffer archiveBuffer;
	static final int anInt5078 = 5;
	static final int anInt5079 = 4;
	long lastTime;
	static final int anInt5081 = 5;
	JS5FileQueue highPriorityRequests;
	int idleTime;
	public volatile int anInt5084;
	RSBuffer js5Buffer;
	byte encryptedId;
	JS5FileQueue queuedHighPriorityRequests;
	public volatile int anInt5088;
	public volatile int anInt5089;
	static final int anInt5090 = 500;
	RSBuffer buffer;
	JS5FileQueue queuedLowPriorityRequests = new JS5FileQueue();
	int sectorLength;
	JS5FileRequest request;

	JS5FileRequest removeRequest(int id, int hash, byte extraBytes, boolean isLowPriority, byte i_2_) {
		long uid = (long) hash + ((long) id << 32);
		JS5FileRequest request = new JS5FileRequest();
		request.queueId = uid * -9121445971199030645L;
		request.leftoverBytes = extraBytes;
		request.isLowPriority = isLowPriority;
		if (isLowPriority) {
			if (getLowPriorityRequestsCount((byte) 3) >= 500) {
				throw new RuntimeException();
			}
			queuedLowPriorityRequests.removeFromQueue(request, (byte) -112);
		} else {
			if (getHighPriorityRequestsCount(-2140892446) >= 500) {
				throw new RuntimeException();
			}
			queuedHighPriorityRequests.removeFromQueue(request, (byte) -93);
		}
		return request;
	}

	JS5Protocol() {
		lowPriorityRequests = new JS5FileQueue();
		queuedHighPriorityRequests = new JS5FileQueue();
		highPriorityRequests = new JS5FileQueue();
		js5Buffer = new RSBuffer(6);
		encryptedId = (byte) 0;
		anInt5084 = 0;
		anInt5088 = 0;
		anInt5089 = 1123781699;
		anInt5073 = 824923659;
		buffer = new RSBuffer(5);
		archiveBuffer = new RSBuffer(5);
		sectorLength = 0;
		request = null;
	}

	int getHighPriorityRequestsCount(int i) {
		return (queuedHighPriorityRequests.getAmount(-1794917917) + highPriorityRequests.getAmount(-384866243));
	}

	public int getLowPriorityRequestsCount(byte i) {
		return (queuedLowPriorityRequests.getAmount(1669896736) + lowPriorityRequests.getAmount(-99334586));
	}

	abstract void method7454(int i, int i_3_, int i_4_);

	public abstract boolean processOnDemand(int i);

	public abstract void method7456(Object object, boolean bool, int i);

	public abstract void finishGrabServer(int i);

	public abstract void close(int i);

	public abstract void disconnect(int i);
	
	public boolean canAddLowPriority(int i) {
		return getLowPriorityRequestsCount((byte) 63) >= 500;
	}

	public boolean canAddHighPriority(byte i) {
		return getHighPriorityRequestsCount(-2132632831) >= 500;
	}

	public abstract void initGrabServerLoggedInStatus(boolean bool, int i);

	public static Container method7486(int i) {
		if (Class310.aFrame3385 != null)
			return Class310.aFrame3385;
		if (null != Class506.aFrame5672)
			return Class506.aFrame5672;
		return Class305.anApplet3346;
	}

	static final void method7487(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class687_Sub35.method17036(class250, class242, class669, (byte) -118);
	}

	static final void method7488(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.aBool3520 ? 1 : 0;
	}
}
