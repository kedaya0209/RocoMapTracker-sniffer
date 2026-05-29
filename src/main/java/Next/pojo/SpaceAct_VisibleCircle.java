// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VisibleCircle(
    int uin,
    SpaceAct_VisibleCircle_EnterVisibleCircle enter,
    SpaceAct_VisibleCircle_LeaveVisibleCircle leave
) {
    public static SpaceAct_VisibleCircle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleCircle(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleCircle_EnterVisibleCircle.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SpaceAct_VisibleCircle_LeaveVisibleCircle.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static SpaceAct_VisibleCircle parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleCircle(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleCircle_EnterVisibleCircle.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SpaceAct_VisibleCircle_LeaveVisibleCircle.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
