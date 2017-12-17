package com.rs.net.decoders;
 
import java.io.IOException;
import java.util.Vector;

import com.rs.cache.Cache;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.utils.IPBanL;
 
public final class GrabPacketsDecoder extends Decoder {
       
        private Vector<Integer> requested = new Vector<Integer>();
       
        public GrabPacketsDecoder(Session connection) {
                super(connection);
        }
 
        @Override
        public final void decode(InputStream stream) {
                while (stream.getRemaining() > 0) {
                        if (!session.getChannel().isConnected() || IPBanL.isBanned(session.getIP())) {
                                if (session.getChannel().isConnected())
                                        session.getChannel().close();
                                break;
                        }
                       
                        int packetId = stream.readUnsignedByte();
                        int indexId = stream.readUnsignedByte();
                        int archiveId = stream.readInt();
                        int hash = indexId + (archiveId << 8);
                       
                        if (indexId < 0 || archiveId < 0 || requested.contains(hash)) {
                                continue;
                        }
                       
                        decode(stream, indexId, archiveId, packetId);
                        requested.add(hash);
                }
                requested.clear();
        }
       
        private final void decode(InputStream stream, int indexId, int archiveId, int priority) {
               
                if (indexId != 255) {
                        if (archiveId < 0 || indexId > Cache.STORE.getIndexes().length - 1 || Cache.STORE.getIndexes()[indexId] == null || !Cache.STORE.getIndexes()[indexId].archiveExists(archiveId))
                                return;
                } else if (archiveId != 255)
                        if (Cache.STORE.getIndexes().length <= archiveId || Cache.STORE.getIndexes()[archiveId] == null)
                                return;
               
                switch (priority) {
                        case 0:
                        case 1:
                        	try {
                        		session.getGrabPackets().sendCacheArchive(indexId, archiveId, priority == 1);
                        	} catch (IOException e) {
                        		e.printStackTrace();
                        	}
                        	break;
                        case 2:
                        case 3:
                                requested.clear();
                                break;
                        case 4:
                            session.getGrabPackets().setEncryptionValue(stream.readUnsignedByte());
                            if (stream.readUnsignedShort() != 0)
                                        session.getChannel().close();
                            break;
                        case 7:
                                session.getChannel().close();
                                break;
                }
        }
 
}