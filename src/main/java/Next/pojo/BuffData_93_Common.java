// Generated from battle_buff_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BuffData_93_Common(
    List<BuffData_93_Skill> data,
    List<BuffData_93_Skill> skillData,
    List<Integer> triggeredBuff
) {
    public static BuffData_93_Common parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BuffData_93_Common(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_93_Skill::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BuffData_93_Skill::parseFrom).toList(),
            Pojos.readIntList(fields, 3)
        );
    }
    public static BuffData_93_Common parseFrom(java.util.List<ProtoField> fields) {
        return new BuffData_93_Common(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BuffData_93_Skill::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BuffData_93_Skill::parseFrom).toList(),
            Pojos.readIntList(fields, 3)
        );
    }
}
