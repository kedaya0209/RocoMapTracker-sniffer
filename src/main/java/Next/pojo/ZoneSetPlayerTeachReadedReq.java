// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetPlayerTeachReadedReq(
    int teachId
) {
    public static ZoneSetPlayerTeachReadedReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerTeachReadedReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSetPlayerTeachReadedReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerTeachReadedReq(
            Pojos.readInt(fields, 1)
        );
    }
}
