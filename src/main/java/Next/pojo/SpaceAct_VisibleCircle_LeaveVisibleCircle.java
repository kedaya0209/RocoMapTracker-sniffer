// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VisibleCircle_LeaveVisibleCircle(
    byte[] name,
    SpaceAct_VisibleCircle_VisibleCircle circle
) {
    public static SpaceAct_VisibleCircle_LeaveVisibleCircle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleCircle_LeaveVisibleCircle(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleCircle_VisibleCircle.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_VisibleCircle_LeaveVisibleCircle parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleCircle_LeaveVisibleCircle(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleCircle_VisibleCircle.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
