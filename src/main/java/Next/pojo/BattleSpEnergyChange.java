// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSpEnergyChange(
    int type,
    SpEnergyElement ele,
    int src,
    int casterId,
    int targetId,
    int changeValue,
    int realChangeValue,
    int replacedDamType
) {
    public static BattleSpEnergyChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSpEnergyChange(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpEnergyElement.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8, 0)
        );
    }
    public static BattleSpEnergyChange parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSpEnergyChange(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpEnergyElement.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8, 0)
        );
    }
}
