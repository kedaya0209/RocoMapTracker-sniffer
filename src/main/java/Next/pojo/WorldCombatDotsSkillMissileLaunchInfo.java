// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillMissileLaunchInfo(
    int skillId,
    String GUID,
    long launchBulletId,
    long targetId,
    float speed,
    float accelerateSpeed,
    float maxSpeed,
    float angleSpeed,
    float cancelTraceDist,
    float traceDurTime,
    boolean isKeepLandHeight,
    int landHeight,
    float curLaunchTime,
    Position targetPos,
    int missileType,
    WorldCombatDotsSkillMissileLaunchInfo_Curve curveBullet,
    WorldCombatDotsSkillMissileLaunchInfo_Trace traceBullet,
    WorldCombatDotsSkillMissileLaunchInfo_Normal normalBullet
) {
    public static WorldCombatDotsSkillMissileLaunchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillMissileLaunchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readFloat(fields, 9),
            Pojos.readFloat(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readFloat(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Curve.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Trace.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Normal.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
    public static WorldCombatDotsSkillMissileLaunchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillMissileLaunchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readFloat(fields, 9),
            Pojos.readFloat(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readFloat(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Curve.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Trace.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readMessage(fields, 23) != null ? Next.pojo.WorldCombatDotsSkillMissileLaunchInfo_Normal.parseFrom(Pojos.readMessage(fields, 23)) : null
        );
    }
}
