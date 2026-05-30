// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlePetHabitInfo(
    List<Integer> envBuffChange,
    List<Integer> envEnjoyTypeAdd,
    List<Integer> envEnjoyTypeSub,
    List<Integer> envHateTypeAdd,
    List<Integer> envHateTypeSub
) {
    public static BattlePetHabitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePetHabitInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static BattlePetHabitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePetHabitInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
