// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapSyncInterruptNty(
    int interruptReason
) {
    public static ZoneSceneWorldMapSyncInterruptNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapSyncInterruptNty(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneWorldMapSyncInterruptNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapSyncInterruptNty(
            Pojos.readInt(fields, 1)
        );
    }
}
