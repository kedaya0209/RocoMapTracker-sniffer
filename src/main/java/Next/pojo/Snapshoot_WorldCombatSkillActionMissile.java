// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record Snapshoot_WorldCombatSkillActionMissile(
    long masterId,
    float curSpeed,
    float accelerateSpeed,
    float maxSpeed,
    float angleSpeed,
    float cancelTraceDist,
    float traceDurTime,
    boolean isKeepLandHeight,
    int landHeight,
    float curLaunchTime,
    Position targetPos,
    long targetId,
    int missileType,
    WorldCombatDotsSkillMissileLaunchInfo_Curve curveBullet,
    WorldCombatDotsSkillMissileLaunchInfo_Trace traceBullet,
    WorldCombatDotsSkillMissileLaunchInfo_Normal normalBullet
) {
    public static Snapshoot_WorldCombatSkillActionMissile parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Snapshoot_WorldCombatSkillActionMissile(
            Pojos.readLong(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readFloat(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12),
            Pojos.readInt(fields, 20),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Curve.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Trace.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Normal.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
    public static Snapshoot_WorldCombatSkillActionMissile parseFrom(java.util.List<ProtoField> fields) {
        return new Snapshoot_WorldCombatSkillActionMissile(
            Pojos.readLong(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readFloat(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12),
            Pojos.readInt(fields, 20),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Curve.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Trace.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Normal.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
}
