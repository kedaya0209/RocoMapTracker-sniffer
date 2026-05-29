// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPetInfoByPageReq(
    int page,
    long version
) {
    public static ZoneGetPetInfoByPageReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetInfoByPageReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneGetPetInfoByPageReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetInfoByPageReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
