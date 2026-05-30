// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VelocityOrientedRotation(
    long actorId,
    Position rotation,
    SvrAISyncCommonInfo syncCommonInfo,
    boolean enable
) {
    public static SpaceAct_VelocityOrientedRotation parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VelocityOrientedRotation(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
    public static SpaceAct_VelocityOrientedRotation parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VelocityOrientedRotation(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
}
