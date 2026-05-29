// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_AI(
    long battleAiStatus,
    long sceneAiControlFlags,
    boolean isHidden,
    int aiSeqId,
    int hudType,
    long hudTargetId,
    int animId,
    float animRate,
    boolean animIsLoop,
    ActorInfo_AIStickTo stickToInfo,
    long lookAtTargetId,
    boolean collisionCancel,
    ActorInfo_AIMoveMode moveMode,
    Position velocityOrientedRotation,
    boolean isVelocityOrientedRotation,
    int aiOverridePerformGroupId,
    WorldCombatDotsSkillShowHideInfo worldCombatDotsSkillShowHideInfo,
    List<Long> perceivePlayerObjIds,
    ActorInfo_AIMoveInfo aiMoveInfo
) {
    public static ActorInfo_AI parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AI(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.ActorInfo_AIStickTo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readLong(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.ActorInfo_AIMoveMode.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readLongList(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.ActorInfo_AIMoveInfo.parseFrom(Pojos.readMessage(fields, 19)) : null
        );
    }
    public static ActorInfo_AI parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AI(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readFloat(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.ActorInfo_AIStickTo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readLong(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.ActorInfo_AIMoveMode.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readLongList(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.ActorInfo_AIMoveInfo.parseFrom(Pojos.readMessage(fields, 19)) : null
        );
    }
}
