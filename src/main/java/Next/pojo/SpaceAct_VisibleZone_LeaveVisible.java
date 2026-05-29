// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VisibleZone_LeaveVisible(
    byte[] leaverName,
    boolean merge,
    SpaceAct_VisibleZone_VisiblePool pool,
    boolean recycle
) {
    public static SpaceAct_VisibleZone_LeaveVisible parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleZone_LeaveVisible(
            Pojos.readBytes(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SpaceAct_VisibleZone_VisiblePool.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
    public static SpaceAct_VisibleZone_LeaveVisible parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleZone_LeaveVisible(
            Pojos.readBytes(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SpaceAct_VisibleZone_VisiblePool.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
}
