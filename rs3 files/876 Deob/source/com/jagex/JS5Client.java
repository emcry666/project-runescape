/* Class458_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Iterator;

public class JS5Client extends JS5Protocol {
	NetworkStream stream;
	static int anInt10326;

	public boolean processOnDemand(int i) {
		if (stream != null) {
			long current = TimeUtils.getCurrentTimeMilliseconds(1516375036);
			int delta = (int) (current - lastTime * -7066998226560235899L);
			lastTime = current * 3835168026948747853L;
			if (delta > 200) {
				delta = 200;
			}
			idleTime += delta * -81723103;
			if (1237566177 * idleTime > 30000) {
				try {
					stream.closeConnection(1972604063);
				} catch (Exception exception) {
					/* empty */
				}
				stream = null;
			}
		}
		if (null == stream) {
			if (getLowPriorityRequestsCount((byte) 31) == 0 && getHighPriorityRequestsCount(-2130548103) == 0) {
				return true;
			}
			return false;
		}
		boolean sucess;
		try {
			for (JS5FileRequest request = ((JS5FileRequest) queuedLowPriorityRequests.first(-1426448868)); null != request; request = ((JS5FileRequest) queuedLowPriorityRequests.next(768418218))) {
				js5Buffer.offset = 0;
				js5Buffer.writeByte(1, -1867765680);
				js5Buffer.write5ByteInt(-8659322449062458077L * (request.queueId));
				stream.write(js5Buffer.buffer, 0, js5Buffer.buffer.length, (byte) -2);
				lowPriorityRequests.removeFromQueue(request, (byte) -49);
			}
			for (JS5FileRequest request = ((JS5FileRequest) queuedHighPriorityRequests.first(-1426448868)); null != request; request = ((JS5FileRequest) queuedHighPriorityRequests.next(768418218))) {
				js5Buffer.offset = 0;
				js5Buffer.writeByte(0, -988117908);
				js5Buffer.write5ByteInt((request.queueId) * -8659322449062458077L);
				stream.write(js5Buffer.buffer, 0, js5Buffer.buffer.length, (byte) -11);
				highPriorityRequests.removeFromQueue(request, (byte) -7);
			}
			for (int queueSize = 0; queueSize < 100; queueSize++) {
				int available = stream.readableBytes(511737428);
				if (available < 0) {
					throw new IOException();
				}
				if (available == 0) {
					break;
				}
				idleTime = 0;
				if (null == request) {
					int read = 5 - buffer.offset * 2349011;
					if (read > available)
						read = available;
					stream.read((buffer.buffer), 2349011 * (buffer.offset), read, (short) 20711);
					if (0 != encryptedId) {
						for (int index = 0; index < read; index++) {
							buffer.buffer[(2349011 * buffer.offset + index)] ^= encryptedId;
						}
					}
					buffer.offset += read * 189765723;
					if (buffer.offset * 2349011 >= 5) {
						buffer.offset = 0;
						int index = buffer.readUnsignedByte(-899672469);
						int hash = buffer.readUnsignedInt((byte) -126);
						boolean isPriority = 0 != (hash & ~0x7fffffff);
						int id = hash & 0x7fffffff;
						long uid = ((long) index << 32) + (long) id;
						if (isPriority) {
							Iterator<?> iterator = highPriorityRequests.iterator();
							while (iterator.hasNext()) {
								JS5FileRequest request = ((JS5FileRequest) iterator.next());
								if (uid == (request.queueId * -8659322449062458077L)) {
									this.request = request;
									break;
								}
							}
						} else {
							Iterator<?> iterator = lowPriorityRequests.iterator();
							while (iterator.hasNext()) {
								JS5FileRequest request = ((JS5FileRequest) iterator.next());
								if ((-8659322449062458077L * request.queueId) == uid) {
									this.request = request;
									break;
								}
							}
						}
						if (null == request) {
							throw new IOException();
						}
						sectorLength = -1352914929;
						buffer.offset = 0;
						archiveBuffer.offset = 0;
					}
				} else {
					RSBuffer buffer = (request.buffer);
					if (buffer == null) {
						int read = 5 - 2349011 * archiveBuffer.offset;
						if (read > available) {
							read = available;
						}
						stream.read((archiveBuffer.buffer), (archiveBuffer.offset) * 2349011, read, (short) 30147);
						if (encryptedId != 0) {
							for (int index = 0; index < read; index++)
								archiveBuffer.buffer[(archiveBuffer.offset * 2349011 + index)] ^= encryptedId;
						}
						archiveBuffer.offset += 189765723 * read;
						if (2349011 * archiveBuffer.offset >= 5) {
							archiveBuffer.offset = 0;
							int compressed = archiveBuffer.readUnsignedByte(1461394598);
							int uncompressed = archiveBuffer.readUnsignedInt((byte) -88);
							int length = 5;
							if (compressed != Compression.UNCOMPRESSED.method82())
								length = 9;
							buffer = request.buffer = (new RSBuffer(request.leftoverBytes + (uncompressed + length)));
							buffer.writeByte(compressed, 94309533);
							buffer.writeInt(uncompressed, -935380546);
							sectorLength += -1352914929;
						}
					} else {
						int length = (buffer.buffer.length - request.leftoverBytes);
						int read = 102400 - sectorLength * -391322965;
						if (read > length - 2349011 * buffer.offset)
							read = length - buffer.offset * 2349011;
						if (read > available)
							read = available;
						stream.read((buffer.buffer), 2349011 * (buffer.offset), read, (short) 30965);
						if (encryptedId != 0) {
							for (int index = 0; index < read; index++)
								buffer.buffer[(2349011 * buffer.offset + index)] ^= encryptedId;
						}
						buffer.offset += 189765723 * read;
						sectorLength += read * -1129576445;
						if (2349011 * buffer.offset == length) {
							request.method16154(-261651695);
							request.inProgress = false;
							request = null;
						} else if (sectorLength * -391322965 == 102400) {
							sectorLength = 0;
							request = null;
						}
					}
				}
			}
			sucess = true;
		} catch (IOException ioexception) {
			try {
				stream.closeConnection(1765527118);
			} catch (Exception exception) {
				/* empty */
			}
			stream = null;
			anInt5084 += -1392367399;
			anInt5088 = -1146404478;
			if (getLowPriorityRequestsCount((byte) 112) == 0 && getHighPriorityRequestsCount(-2096128030) == 0)
				return true;
			return false;
		}
		return sucess;
	}
	
	void initGrabServer(short i) {
		if (stream != null) {
			try {
				js5Buffer.offset = 0;
				js5Buffer.writeByte(6, 1315459058);
				js5Buffer.writeMedium(4, (byte) 0);
				js5Buffer.writeShort(0, (byte) -41);
				stream.write(js5Buffer.buffer, 0, js5Buffer.buffer.length, (byte) 4);
			} catch (IOException ioexception) {
				try {
					stream.closeConnection(1984339043);
				} catch (Exception exception) {
					/* empty */
				}
				stream = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void finishGrabServer(int i) {
		if (stream != null) {
			try {
				js5Buffer.offset = 0;
				js5Buffer.writeByte(7, 345162058);
				js5Buffer.write5ByteInt(0L);
				stream.write(js5Buffer.buffer, 0, js5Buffer.buffer.length, (byte) -17);
			} catch (IOException ioexception) {
				try {
					stream.closeConnection(1665834155);
				} catch (Exception exception) {
					/* empty */
				}
				stream = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void close(int i) {
		if (null != stream)
			stream.closeConnection(1157821531);
	}

	public void disconnect(int i) {
		if (stream != null)
			stream.drop(592980569);
	}

	void method7454(int i, int i_63_, int i_64_) {
		try {
			stream.closeConnection(1203805030);
		} catch (Exception exception) {
			/* empty */
		}
		stream = null;
		anInt5084 += -1392367399;
		anInt5088 = 1574281409;
		encryptedId = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt5089 = -1123781699 * i;
		anInt5073 = -824923659 * i_63_;
	}

	public void initGrabServerLoggedInStatus(boolean loggedIn, int i) {
		if (stream != null) {
			try {
				js5Buffer.offset = 0;
				js5Buffer.writeByte(loggedIn ? 2 : 3, 263366935);
				js5Buffer.write5ByteInt(0L);
				stream.write(js5Buffer.buffer, 0, js5Buffer.buffer.length, (byte) -13);
			} catch (IOException ioexception) {
				try {
					stream.closeConnection(1081641993);
				} catch (Exception exception) {
					/* empty */
				}
				stream = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7456(Object object, boolean loggedIn, int i) {
		if (stream != null) {
			try {
				stream.closeConnection(1178582705);
			} catch (Exception exception) {
				/* empty */
			}
			stream = null;
		}
		stream = (NetworkStream) object;
		initGrabServer((short) 8919);
		initGrabServerLoggedInStatus(loggedIn, -1307082319);
		buffer.offset = 0;
		archiveBuffer.offset = 0;
		request = null;
		for (;;) {
			JS5FileRequest request = ((JS5FileRequest) lowPriorityRequests.method14015((byte) -113));
			if (null == request)
				break;
			request.buffer = null;
			queuedLowPriorityRequests.removeFromQueue(request, (byte) -119);
		}
		for (;;) {
			JS5FileRequest request = ((JS5FileRequest) highPriorityRequests.method14015((byte) -120));
			if (request == null)
				break;
			request.buffer = null;
			queuedHighPriorityRequests.removeFromQueue(request, (byte) -41);
		}
		if (encryptedId != 0) {
			try {
				js5Buffer.offset = 0;
				js5Buffer.writeByte(4, -1589443590);
				js5Buffer.writeByte(encryptedId, -783310411);
				js5Buffer.writeInt(0, -859088471);
				stream.write(js5Buffer.buffer, 0, js5Buffer.buffer.length, (byte) -22);
			} catch (IOException ioexception) {
				try {
					stream.closeConnection(1305397587);
				} catch (Exception exception) {
					/* empty */
				}
				stream = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
		idleTime = 0;
		lastTime = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 3835168026948747853L;
	}

	public static int method15856(CharSequence charsequence, byte i) {
		return Class221.method4136(charsequence, 10, true, 652399542);
	}

	static final void method15857(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class216.method3851((byte) 29);
	}
}
