// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleCmdSyncNotify(
    int playerUin,
    BattleRoundFlowReq req
) {
    public static ZoneBattleCmdSyncNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleCmdSyncNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneBattleCmdSyncNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleCmdSyncNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
