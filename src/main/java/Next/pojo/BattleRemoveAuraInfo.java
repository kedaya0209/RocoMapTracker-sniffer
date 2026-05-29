// Generated from com_pet_skill.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleRemoveAuraInfo(
    List<Integer> removeAuraEffect,
    int petBaseId
) {
    public static BattleRemoveAuraInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRemoveAuraInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BattleRemoveAuraInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRemoveAuraInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
