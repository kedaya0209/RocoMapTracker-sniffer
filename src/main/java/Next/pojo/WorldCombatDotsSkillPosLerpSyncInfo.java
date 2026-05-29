// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillPosLerpSyncInfo(
    int type,
    int nodeIndex,
    int skillId,
    String GUID,
    Point castPoint,
    int lerpDuration,
    float posThreshold,
    float dirThreshold,
    String lerpAnimationName
) {
    public static WorldCombatDotsSkillPosLerpSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillPosLerpSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readString(fields, 9)
        );
    }
    public static WorldCombatDotsSkillPosLerpSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillPosLerpSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readString(fields, 9)
        );
    }
}
