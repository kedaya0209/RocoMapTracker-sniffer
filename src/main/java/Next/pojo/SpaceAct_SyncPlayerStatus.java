// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_SyncPlayerStatus(
    long actorId,
    long timeStamp,
    int status,
    int opCode,
    int subStatus,
    PlayerStatusCustomParams statusParam,
    List<PlayerStatusSyncInfo> syncStatusInfoList
) {
    public static SpaceAct_SyncPlayerStatus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_SyncPlayerStatus(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerStatusSyncInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_SyncPlayerStatus parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_SyncPlayerStatus(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerStatusSyncInfo::parseFrom).toList()
        );
    }
}
