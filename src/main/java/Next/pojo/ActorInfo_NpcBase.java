// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcBase(
    int npcCfgId,
    long srcNpcId,
    Position relatedNpcPos,
    int srcNpcCfgId,
    int srcNpcRefCfgId,
    Position srcNpcPos,
    int dropItemNum,
    int refreshSrc,
    boolean posNeedAdjust,
    int npcContentCfgId,
    int height,
    int weight,
    int nature,
    int mutationType,
    int worldNature,
    int worldHide,
    int refreshPoint,
    boolean isServerAi,
    long createAvatarId,
    int bloodMixSkillDamType,
    String loopAction,
    int catchGuaranteeRate,
    long lastCatchTime,
    boolean win,
    boolean canBeTeleport,
    float heightScale,
    int bloodNormalSkillDamType,
    int homePlantLandId,
    GlassInfo glassInfo,
    int voice,
    int initialAffectionate,
    List<Long> createVisitingUins,
    String createAvatarName,
    int habitatId
) {
    public static ActorInfo_NpcBase parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcBase(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readString(fields, 23),
            Pojos.readInt(fields, 21),
            Pojos.readLong(fields, 22),
            Pojos.readBool(fields, 24),
            Pojos.readBool(fields, 25),
            Pojos.readFloat(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readInt(fields, 29),
            Pojos.readMessage(fields, 30) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readLongList(fields, 33),
            Pojos.readString(fields, 34),
            Pojos.readInt(fields, 35)
        );
    }
    public static ActorInfo_NpcBase parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcBase(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readString(fields, 23),
            Pojos.readInt(fields, 21),
            Pojos.readLong(fields, 22),
            Pojos.readBool(fields, 24),
            Pojos.readBool(fields, 25),
            Pojos.readFloat(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readInt(fields, 29),
            Pojos.readMessage(fields, 30) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 30)) : null,
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readLongList(fields, 33),
            Pojos.readString(fields, 34),
            Pojos.readInt(fields, 35)
        );
    }
}
