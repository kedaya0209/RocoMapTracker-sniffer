// Generated from com_pet_team.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AdjustedPet(
    int gid,
    List<AdjustedPetSkill> skills
) {
    public static AdjustedPet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AdjustedPet(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.AdjustedPetSkill::parseFrom).toList()
        );
    }
    public static AdjustedPet parseFrom(java.util.List<ProtoField> fields) {
        return new AdjustedPet(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.AdjustedPetSkill::parseFrom).toList()
        );
    }
}
