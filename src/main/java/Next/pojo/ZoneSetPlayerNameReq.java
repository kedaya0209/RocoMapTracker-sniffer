// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetPlayerNameReq(
    byte[] name
) {
    public static ZoneSetPlayerNameReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerNameReq(
            Pojos.readBytes(fields, 1)
        );
    }
    public static ZoneSetPlayerNameReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerNameReq(
            Pojos.readBytes(fields, 1)
        );
    }
}
