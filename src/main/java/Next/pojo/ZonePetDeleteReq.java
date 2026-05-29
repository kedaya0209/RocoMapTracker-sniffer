// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetDeleteReq(
    int gid
) {
    public static ZonePetDeleteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetDeleteReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetDeleteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetDeleteReq(
            Pojos.readInt(fields, 1)
        );
    }
}
