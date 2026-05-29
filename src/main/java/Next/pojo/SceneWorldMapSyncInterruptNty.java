// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneWorldMapSyncInterruptNty(
    int interruptReason
) {
    public static SceneWorldMapSyncInterruptNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneWorldMapSyncInterruptNty(
            Pojos.readInt(fields, 1)
        );
    }
    public static SceneWorldMapSyncInterruptNty parseFrom(java.util.List<ProtoField> fields) {
        return new SceneWorldMapSyncInterruptNty(
            Pojos.readInt(fields, 1)
        );
    }
}
