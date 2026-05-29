// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleCmdPopbackRsp(
    RetInfo retInfo,
    BattleSyncData syncData,
    BattleRoundFlowReq req,
    int round
) {
    public static ZoneBattleCmdPopbackRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleCmdPopbackRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleSyncData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 30)
        );
    }
    public static ZoneBattleCmdPopbackRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleCmdPopbackRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleSyncData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 30)
        );
    }
}
