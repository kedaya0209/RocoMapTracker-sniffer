// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMageBookNotify(
    int npcId,
    int itemId,
    boolean hasAward,
    int action
) {
    public static ZoneMageBookNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMageBookNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneMageBookNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMageBookNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
