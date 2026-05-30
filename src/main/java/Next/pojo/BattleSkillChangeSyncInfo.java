// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSkillChangeSyncInfo(
    int petId,
    int skillId,
    PetSkillRoundData skillData
) {
    public static BattleSkillChangeSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSkillChangeSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetSkillRoundData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static BattleSkillChangeSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSkillChangeSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetSkillRoundData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
