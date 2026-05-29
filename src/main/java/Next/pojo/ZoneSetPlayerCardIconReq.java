// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetPlayerCardIconReq(
    int iconId
) {
    public static ZoneSetPlayerCardIconReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerCardIconReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSetPlayerCardIconReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerCardIconReq(
            Pojos.readInt(fields, 1)
        );
    }
}
