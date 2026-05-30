// Generated from battle_buff_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_93(
    List<BuffData_93_Skill_Energy> energyInfo,
    boolean isTriggered
) {
    public static BuffData_93 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_93(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_93_Skill_Energy::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
    public static BuffData_93 parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_93(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_93_Skill_Energy::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
}
