// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeastCancelMatchNotify(
    int uin,
    byte[] name
) {
    public static ZoneSceneBeastCancelMatchNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeastCancelMatchNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static ZoneSceneBeastCancelMatchNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeastCancelMatchNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
