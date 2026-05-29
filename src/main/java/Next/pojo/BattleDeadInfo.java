// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleDeadInfo(
    int casterId,
    int targetId,
    int deadType
) {
    public static BattleDeadInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleDeadInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static BattleDeadInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleDeadInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
