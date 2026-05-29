// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleCmdFailed(
    int uin,
    BattleRoundFlowReq req,
    int ret
) {
    public static BattleCmdFailed parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleCmdFailed(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static BattleCmdFailed parseFrom(java.util.List<ProtoField> fields) {
        return new BattleCmdFailed(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
