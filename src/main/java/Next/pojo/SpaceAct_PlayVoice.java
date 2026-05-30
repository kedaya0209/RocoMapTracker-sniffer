// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlayVoice(
    long actorId,
    int voiceId,
    float voiceSpeed,
    float startPos,
    int loopCount,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo,
    boolean highPriority
) {
    public static SpaceAct_PlayVoice parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlayVoice(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readBool(fields, 10)
        );
    }
    public static SpaceAct_PlayVoice parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlayVoice(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readFloat(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readBool(fields, 10)
        );
    }
}
