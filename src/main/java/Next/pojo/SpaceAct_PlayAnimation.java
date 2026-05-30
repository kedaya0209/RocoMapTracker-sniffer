// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlayAnimation(
    long actorId,
    int animId,
    float playRate,
    float startPos,
    float blendInTime,
    float blendOutTime,
    int loopCount,
    long curTime,
    boolean overrideMove,
    int movementMode,
    float voiceSpeed,
    boolean mute,
    boolean pauseOnEnd,
    SvrAISyncCommonInfo syncCommonInfo,
    Position actorDir,
    boolean isRootmotion,
    boolean highPriority
) {
    public static SpaceAct_PlayAnimation parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlayAnimation(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readFloat(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readBool(fields, 17)
        );
    }
    public static SpaceAct_PlayAnimation parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlayAnimation(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readFloat(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readFloat(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readBool(fields, 17)
        );
    }
}
