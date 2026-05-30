// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_AnimPauseOrResume(
    long actorId,
    boolean isAnimPause,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo
) {
    public static SpaceAct_AnimPauseOrResume parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AnimPauseOrResume(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static SpaceAct_AnimPauseOrResume parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AnimPauseOrResume(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
