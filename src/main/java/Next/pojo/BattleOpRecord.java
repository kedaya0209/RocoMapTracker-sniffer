// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleOpRecord(
    SkillCastRecord skillOp,
    ChangePetRecord changePetOp,
    int type
) {
    public static BattleOpRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleOpRecord(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SkillCastRecord.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ChangePetRecord.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static BattleOpRecord parseFrom(java.util.List<ProtoField> fields) {
        return new BattleOpRecord(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SkillCastRecord.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ChangePetRecord.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0)
        );
    }
}
