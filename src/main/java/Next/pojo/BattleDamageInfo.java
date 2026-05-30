// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleDamageInfo(
    int casterId,
    int targetId,
    int sourceId,
    List<Boolean> isCritical,
    boolean isHit,
    int restraintType,
    boolean hasShield,
    int damType,
    boolean execution
) {
    public static BattleDamageInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleDamageInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBoolList(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBool(fields, 10)
        );
    }
    public static BattleDamageInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleDamageInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBoolList(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBool(fields, 10)
        );
    }
}
