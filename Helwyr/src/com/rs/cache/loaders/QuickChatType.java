package com.rs.cache.loaders;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.rs.cache.Cache;
import com.rs.io.InputStream;
import com.rs.utils.Utils.ChatPhraseEncodingType;

public class QuickChatType {
	
	private static final ConcurrentHashMap<Integer, QuickChatType> quickChatTypes = new ConcurrentHashMap<>();
	
	public static final QuickChatType getQuickChatType(int id) {
		QuickChatType qcType = quickChatTypes.get(id);
		if (qcType == null) {
			qcType = new QuickChatType(id);
			byte[] data = Cache.STORE.getIndexes()[id >= 0x8000 ? 25 : 24].getFile(1, id & 0x7fff);
			if (data != null) {
				qcType.decode(new InputStream(data));
			}
			if (id >= 0x8000) {
				qcType.setGlobal();
			}
			quickChatTypes.put(id, qcType);
		}
		return qcType;
	}
	
    ChatPhraseEncodingType[] variablePartTypes;
	int[][] variablePartConfigKeys;
	String[] text;
    public int[] responses;
    public boolean aBool11355 = true;
	private int myid;
    
    QuickChatType(int id) {
    	this.myid = id;
    }
    
    void decode(InputStream buffer) {
		for (;;) {
		    int code = buffer.readUnsignedByte();
			System.out.println(code);
		    if (0 == code) {
		    	break;
		    }
		    decode(buffer, code);
		}
    }
    
    void decode(InputStream buffer, int code) {
		if (1 == code) {		
			text = Pattern.compile("<", Pattern.LITERAL).split(buffer.readString());
		} else if (code == 2) {
		    int i_2_ = buffer.readUnsignedByte();
		    responses = new int[i_2_];
		    for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    	responses[i_3_] = buffer.readUnsignedShort();
		    }
		} else if (3 == code) {
		    int typeCount = buffer.readUnsignedByte();
		    variablePartTypes = new ChatPhraseEncodingType[typeCount];
		    variablePartConfigKeys = new int[typeCount][];
		    for (int slot = 0; slot < typeCount; slot++) {
				int i_6_ = buffer.readUnsignedShort();
				ChatPhraseEncodingType type = ChatPhraseEncodingType.getByID(i_6_);
				if (null != type) {
				    variablePartTypes[slot] = type;
				    variablePartConfigKeys[slot] = new int[type.configKeyCount];
				    for (int pos = 0; pos < type.configKeyCount; pos++) {
				    	variablePartConfigKeys[slot][pos] = buffer.readUnsignedShort();
				    }
				}
		    }
		} else if (4 == code) {
		    aBool11355 = false;
		}
    }
    
    void setGlobal() {
		if (responses != null) {
			for (int pos = 0; pos < responses.length; pos++) {
				responses[pos] |= 0x8000;
			}
		}
    }
    
    public int getParamCount() {
		if (variablePartTypes == null) {
		    return 0;
		}
		return variablePartTypes.length;
    }
	
	public ChatPhraseEncodingType getParamType (int pos) {
		return variablePartTypes[pos];
	}
    
    public int getParamKey(int slot, int i_12_) {
		if (null == variablePartTypes || slot < 0
				|| slot > variablePartTypes.length) {
			return -1;
		}
		if (variablePartConfigKeys[slot] == null || i_12_ < 0
				|| i_12_ > variablePartConfigKeys[slot].length) {
			return -1;
		}
		return variablePartConfigKeys[slot][i_12_];
    }
	
	public int getId () {
		return myid;
	}
	
	public int[] unpack(InputStream buffer) {
		int[] params = new int[0];
		if (variablePartTypes != null) {
			params = new int[variablePartTypes.length];
		    for (int pos = 0; pos < variablePartTypes.length; pos++) {
				int size = variablePartTypes[pos].clientTransmitSize;
				if (size > 0) {
					//params[pos] = (int) buffer.readQuickchatParam(size);
				}
		    }
		}
		return params;
    }
	
}