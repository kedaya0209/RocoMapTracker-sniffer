// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleRoleMagicOpInfo(
    int state,
    int petId,
    int playerSkillId,
    List<Integer> skillId,
    int upPetId,
    byte[] name,
    int retInfo,
    int bossPetbaseId,
    boolean needPreCalc
) {
    public static BattleRoleMagicOpInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleMagicOpInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
    public static BattleRoleMagicOpInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleMagicOpInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
}
