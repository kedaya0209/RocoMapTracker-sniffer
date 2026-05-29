// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneSyncPlayerStatusReq(
    long timeStamp,
    int status,
    int opCode,
    int subStatus,
    boolean isNormalRemove,
    PlayerStatusCustomParams customStatusParam,
    List<PlayerStatusSyncInfo> syncStatusInfoList
) {
    public static ZoneSceneSyncPlayerStatusReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSyncPlayerStatusReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerStatusSyncInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneSyncPlayerStatusReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSyncPlayerStatusReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerStatusSyncInfo::parseFrom).toList()
        );
    }
}
