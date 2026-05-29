// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleRoundFlowRsp(
    int rspType,
    BattleCatchPetRsp catchPetRsp
) {
    public static BattleRoundFlowRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoundFlowRsp(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleCatchPetRsp.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static BattleRoundFlowRsp parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoundFlowRsp(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleCatchPetRsp.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
