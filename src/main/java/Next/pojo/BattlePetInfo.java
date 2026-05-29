// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlePetInfo(
    BattleInsidePetInfo battleInsidePetInfo,
    PetData battleCommonPetInfo,
    BattleRoundFlowReq req,
    int dataLevel,
    boolean fullForDataLevel
) {
    public static BattlePetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePetInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleInsidePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static BattlePetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePetInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleInsidePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
