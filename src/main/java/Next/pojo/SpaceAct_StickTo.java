// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_StickTo(
    long actorId,
    long targetActorId,
    long selfSocket,
    long targetSocket,
    long stickSpeed,
    long stickAnim,
    Position rotate,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo,
    Position translate
) {
    public static SpaceAct_StickTo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_StickTo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
    public static SpaceAct_StickTo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_StickTo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
}
