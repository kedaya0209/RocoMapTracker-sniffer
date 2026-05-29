// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_VisibleZone_VisiblePlayer(
    long id,
    byte[] name,
    boolean inVisible
) {
    public static SpaceAct_VisibleZone_VisiblePlayer parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleZone_VisiblePlayer(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static SpaceAct_VisibleZone_VisiblePlayer parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleZone_VisiblePlayer(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
