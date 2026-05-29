// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneSyncPlayerStatusPreCheckReq(
    PlayerStatusSyncInfo syncStatusInfo
) {
    public static ZoneSceneSyncPlayerStatusPreCheckReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSyncPlayerStatusPreCheckReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerStatusSyncInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneSyncPlayerStatusPreCheckReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSyncPlayerStatusPreCheckReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerStatusSyncInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
