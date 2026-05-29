// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatHitInfo(
    int skillId,
    int actionIdx,
    long attackerId,
    Position hitDir,
    int impactForce,
    int blockType
) {
    public static WorldCombatHitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatHitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6, 0)
        );
    }
    public static WorldCombatHitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatHitInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6, 0)
        );
    }
}
