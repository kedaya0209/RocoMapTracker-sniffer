// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleRoleMagicInfo(
    BattleRoleMagicOpInfo magicOpInfo,
    BattleRoleMagicSkillInfo magicSkillInfo
) {
    public static BattleRoleMagicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleMagicInfo(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoleMagicOpInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleRoleMagicSkillInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static BattleRoleMagicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleMagicInfo(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoleMagicOpInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleRoleMagicSkillInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
