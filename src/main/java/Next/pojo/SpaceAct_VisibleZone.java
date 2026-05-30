// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VisibleZone(
    SpaceAct_VisibleZone_EnterVisible enter,
    SpaceAct_VisibleZone_LeaveVisible leave,
    long actorId
) {
    public static SpaceAct_VisibleZone parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleZone(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SpaceAct_VisibleZone_EnterVisible.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleZone_LeaveVisible.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3)
        );
    }
    public static SpaceAct_VisibleZone parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleZone(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SpaceAct_VisibleZone_EnterVisible.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleZone_LeaveVisible.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3)
        );
    }
}
