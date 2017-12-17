package com.rs.cache.loaders;

import java.util.concurrent.ConcurrentHashMap;

import com.alex.io.InputStream;
import com.rs.cache.Cache;

public final class VarBitDefinitions {

	private static final ConcurrentHashMap<Integer, VarBitDefinitions> varpbitDefs = new ConcurrentHashMap<Integer, VarBitDefinitions>();

	public int id;
	public int baseVar;
	public int startBit;
	public int endBit;

	public static final VarBitDefinitions getClientVarpBitDefinitions(int id) {
		VarBitDefinitions script = varpbitDefs.get(id);
		if (script != null)// open new txt document
			return script;
		byte[] data = Cache.STORE.getIndexes()[22].getFile(id >>> 1416501898, id & 0x3ff);
		script = new VarBitDefinitions();
		script.id = id;
		if (data != null)
			script.readValueLoop(new InputStream(data));
		varpbitDefs.put(id, script);
		return script;

	}

	private void readValueLoop(InputStream stream) {
		for (;;) {
			int opcode = stream.readUnsignedByte();
			if (opcode == 0)
				break;
			readValues(stream, opcode);
		}
	}

	private void readValues(InputStream stream, int opcode) {
		if (opcode == 1) {
			baseVar = stream.readUnsignedShort();
			startBit = stream.readUnsignedByte();
			endBit = stream.readUnsignedByte();
		}
	}

	private VarBitDefinitions() {

	}
}
