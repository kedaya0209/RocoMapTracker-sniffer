// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlePetSkillUpdateInfo(
    int petId,
    List<PetSkillRoundData> skills
) {
    public static BattlePetSkillUpdateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePetSkillUpdateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetSkillRoundData::parseFrom).toList()
        );
    }
    public static BattlePetSkillUpdateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePetSkillUpdateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetSkillRoundData::parseFrom).toList()
        );
    }
}
