// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VisibleCircle_EnterVisibleCircle(
    byte[] name,
    SpaceAct_VisibleCircle_VisibleCircle circle
) {
    public static SpaceAct_VisibleCircle_EnterVisibleCircle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleCircle_EnterVisibleCircle(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleCircle_VisibleCircle.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_VisibleCircle_EnterVisibleCircle parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleCircle_EnterVisibleCircle(
            Pojos.readBytes(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceAct_VisibleCircle_VisibleCircle.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
