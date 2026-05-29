// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatSkillSpawnBulletInfo(
    int skillId,
    int actionIdx,
    long casterId,
    Position initPos,
    Position initDir,
    long targetId,
    Position targetPos,
    long bulletId
) {
    public static WorldCombatSkillSpawnBulletInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatSkillSpawnBulletInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 10)
        );
    }
    public static WorldCombatSkillSpawnBulletInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatSkillSpawnBulletInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 10)
        );
    }
}
