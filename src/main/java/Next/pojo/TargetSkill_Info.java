// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TargetSkill_Info(
    int targetPetId,
    int targetSkillId,
    boolean isSpecial
) {
    public static TargetSkill_Info parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TargetSkill_Info(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static TargetSkill_Info parseFrom(java.util.List<ProtoField> fields) {
        return new TargetSkill_Info(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
