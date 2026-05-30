// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_6_Common(
    List<TargetSkill_Info> targetSkills
) {
    public static BuffData_6_Common parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_6_Common(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TargetSkill_Info::parseFrom).toList()
        );
    }
    public static BuffData_6_Common parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_6_Common(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TargetSkill_Info::parseFrom).toList()
        );
    }
}
