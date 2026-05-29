// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxLastOpenBoxReq(
    int boxId
) {
    public static ZonePetBoxLastOpenBoxReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxLastOpenBoxReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetBoxLastOpenBoxReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxLastOpenBoxReq(
            Pojos.readInt(fields, 1)
        );
    }
}
