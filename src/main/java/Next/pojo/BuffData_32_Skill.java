// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BuffData_32_Skill(
    int skillId,
    int val
) {
    public static BuffData_32_Skill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_32_Skill(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BuffData_32_Skill parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_32_Skill(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
