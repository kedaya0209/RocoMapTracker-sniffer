// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetInspireReq(
    int gid
) {
    public static ZonePetInspireReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetInspireReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetInspireReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetInspireReq(
            Pojos.readInt(fields, 1)
        );
    }
}
