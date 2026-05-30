// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleCmdPushbackReq(
    int reqType,
    List<BattleRoundFlowReq> req,
    boolean isConfirm,
    int wlReqId,
    int maxErrReqId,
    String featureData
) {
    public static ZoneBattleCmdPushbackReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleCmdPushbackReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleRoundFlowReq::parseFrom).toList(),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7)
        );
    }
    public static ZoneBattleCmdPushbackReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleCmdPushbackReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleRoundFlowReq::parseFrom).toList(),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7)
        );
    }
}
