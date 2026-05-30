// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DamageRecord(
    int caster,
    int target,
    int damage,
    int source,
    int damType,
    int round,
    boolean isCritical,
    boolean isShield,
    int damageParam
) {
    public static DamageRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DamageRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 9)
        );
    }
    public static DamageRecord parseFrom(java.util.List<ProtoField> fields) {
        return new DamageRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 9)
        );
    }
}
