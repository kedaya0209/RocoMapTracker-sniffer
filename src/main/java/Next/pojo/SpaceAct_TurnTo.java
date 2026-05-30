// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_TurnTo(
    long actorId,
    Position turnPos,
    float turnSpeed,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo,
    boolean useAnimLength,
    float animSpeedScale
) {
    public static SpaceAct_TurnTo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_TurnTo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readFloat(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readBool(fields, 6),
            Pojos.readFloat(fields, 7)
        );
    }
    public static SpaceAct_TurnTo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_TurnTo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readFloat(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readBool(fields, 6),
            Pojos.readFloat(fields, 7)
        );
    }
}
